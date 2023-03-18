package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    // Declaring the background color
    public static final String ANSI_RED_BACKGROUND
            = "\u001B[41m";
    public static Scanner input = new Scanner(System.in);
    public static NetflixService netflixService = new NetflixService();


    public static void main(String[] args) {

        ArrayList<String> TopCast = new ArrayList<>();
        TopCast.add("Leonardo dicaprio");
        TopCast.add("Emily Mortimer");
        TopCast.add("Mark Ruffalo");
        TopCast.add("Ben Kingsley");
        TopCast.add("Patricia Clarkson");

        ArrayList<String>Length = new ArrayList<>();
        Length.add("1 Episode");

        TVShow movie = new Movie("ShutterIsland" , "psychology" , 2010 , "2:20" , "8.5/10" ,TopCast , Length);
        NetflixService.tvShowList.add(movie); //took all movies and tvshows to ----> tvshow's arraylist
//....................................................................................................................................................
        ArrayList<String> TopCast2 = new ArrayList<>();
        TopCast2.add("Jenna Ortega");
        TopCast2.add("Hunter Doohan");
        TopCast2.add("Percy Hynes White");
        TopCast2.add("Emma Myers");
        TopCast2.add("Christina Ricci");

        ArrayList<String>Length2 = new ArrayList<>();
        Length2.add("Episode 1"); Length2.add("Episode 2");Length2.add("Episode 3");Length2.add("Episode 4");Length2.add("Episode 5");
        Length2.add("Episode 6");Length2.add("Episode 7");Length2.add("Episode 8");Length2.add("Episode 9");

        TVShow tvshow = new Movie("wednesday","Mystery",2022 ,"7:15" ,"8.1/10" ,TopCast2 ,Length2);
        NetflixService.tvShowList.add(tvshow);
//....................................................................................................................................................
        runMenu(netflixService);
    }

    public static void runMenu(NetflixService netflixService){

        System.out.println(ANSI_RED_BACKGROUND+"      NETFLIX         "+ ANSI_RESET);
        System.out.print(" 1.Sign up \n 2.log in \n 3.Exit\n");
        System.out.println("Choose your Access by selecting number =  "); int select = input.nextInt();
        if(select == 1){SignUp(netflixService);}
        if (select == 2){LogIn(netflixService);}
        if(select == 3){return;}

    }

    public static void SignUp(NetflixService netflixService) {

        System.out.print("Username :"); String username = input.next();
        System.out.print("Password :"); String password = input.next();

        if(netflixService.createAccount(username ,password)){start(netflixService , username ,password);}
        else{runMenu(netflixService);}
    }
    public static void LogIn(NetflixService netflixService ){

        System.out.print("Username :"); String username = input.next();
        System.out.print("Password :"); String password = input.next();

        if(netflixService.login(username, password)){
            System.out.println("...........***...........................WELCOME BACK...........***...........................");
            start(netflixService ,username,password);
        }
        else{runMenu(netflixService);}

    }
    public static void start(NetflixService netflixService ,String username , String password ){

        System.out.println("------------------------------------------|------------------------------------------|---------------------------------------------|-------------------------------|");
        System.out.println("1_Search Tv show/Movie by it's Title      |2_Search Tv show/Movie by it's genre      |3_Search Tv show/Movie by ReleaseYear        |4_ Watch History List          |");
        System.out.println("------------------------------------------|------------------------------------------|---------------------------------------------|-------------------------------|");
        System.out.println("5_ View Favorite Movies/Tv show           |6_Add TV Show/movie to Playlist           |7_Log out                                    |                               |");
        System.out.println("------------------------------------------|------------------------------------------|---------------------------------------------|-------------------------------|");
        int select = input.nextInt();

        switch (select){
            case 1: //find tv show/movie by title

                    String title = input.next();
                    System.out.println(netflixService.searchByTitle(title));

                    System.out.println("Do you want to watch that movie?(y/n)");
                    String ans = input.next();
                    if (ans.equals("y")) {
                        System.out.println("Can you please provide additional information about a specific film among the many available?");
                        System.out.print("genre = ");
                        String genre = input.next();
                        System.out.print("Release Year = ");
                        int year = input.nextInt();
                        System.out.print("duration = ");
                        String duration = input.next();
                        System.out.print("rating =");
                        String rate = input.next();

                        ArrayList<String> cas = new ArrayList<>();
                        cas.clear();
                        TVShow tvShow2 = new TVShow(title, genre, year, duration, rate, cas);

                        netflixService.getCurrentUser().addHistory(tvShow2);

                        netflixService.getCurrentUser().getRecommendations(genre);
                        System.out.println("Do you want to add it to your favorite list?(y/n)");
                        ans = input.next();

                        if (ans.equals("y")) {
                            netflixService.getCurrentUser().addToFavorites(tvShow2);
                            start(netflixService, username, password);
                        } else {
                            start(netflixService, username, password);
                        }
                    } else {
                        start(netflixService, username, password);
                    }

            case 2://find tv show/movie by genre
                String genre = input.next();
                System.out.println(netflixService.searchByGenre(genre));

                System.out.println("Do you want to watch that movie?(y/n)");  ans = input.next();
                if(ans.equals("y")) {
                    System.out.println("Can you please provide additional information about a specific film among the many available?");
                    System.out.print("title = ");
                     title = input.next();
                    System.out.print("Release Year = ");
                    int year = input.nextInt();
                    System.out.print("duration = ");
                    String duration = input.next();
                    System.out.print("rating =");
                    String rate = input.next();
                    ArrayList<String> cas = new ArrayList<>();
                    cas.clear();

                    TVShow tvShow2 = new TVShow(title, genre, year, duration, rate ,cas);

                    netflixService.getCurrentUser().addHistory(tvShow2);

                    netflixService.getCurrentUser().getRecommendations(genre);
                    System.out.println("Do you want to add it to your favorite list?(y/n)");
                    ans = input.next();

                    if (ans.equals("y")) {
                        netflixService.getCurrentUser().addToFavorites(tvShow2);
                        start(netflixService ,username ,password);
                    } else {
                        start(netflixService ,username ,password);
                    }
                }
                else{start(netflixService ,username ,password);}

            case 3://find tv show/movie with release year
                int year = input.nextInt();
                System.out.println(netflixService.searchByReleaseYear(year));

                System.out.println("Do you want to watch that movie?(y/n)"); ans = input.next();
                if(ans.equals("y")) {
                    System.out.println("Can you please provide additional information about a specific film among the many available?");
                    System.out.print("title = ");
                     title = input.next();
                    System.out.print("genre = ");
                    genre = input.next();
                    System.out.print("duration = ");
                    String duration = input.next();
                    System.out.print("rating =");
                    String rate = input.next();
                    ArrayList<String> cas = new ArrayList<>();
                    cas.clear();
                    TVShow tvShow2 = new TVShow(title, genre, year, duration, rate ,cas);

                    netflixService.getCurrentUser().addHistory(tvShow2);

                    netflixService.getCurrentUser().getRecommendations(genre);
                    System.out.println("Do you want to add it to your favorite list?(y/n)");
                    ans = input.next();

                    if (ans.equals("y")) {
                        netflixService.getCurrentUser().addToFavorites(tvShow2);
                        start(netflixService ,username ,password);
                    } else {
                        start(netflixService ,username ,password);
                    }
                }
                else{start(netflixService ,username ,password);}

            case 4://history of movie that you click on
                System.out.println(netflixService.getCurrentUser().watchHistoryList);
                start(netflixService,username,password);
            case 5://search by title or genera or releaseYear or all of them
                System.out.println("1_Search Favorite Movie by it's Title\n2_Search Favorite Movie by it's genre\n3_Search Favorite Movie by ReleaseYear\n4_All of them");
                System.out.print("select = "); int se = input.nextInt();
                switch (se){
                    case 1:
                         title = input.next();
                        System.out.println(netflixService.getCurrentUser().searchByTitle(title));
                        System.out.println("If you want to take out of this part press'1'"); int cl =input.nextInt();
                        if(cl == 1){start(netflixService ,username,password);}
                    case 2:
                        genre = input.next();
                        System.out.println(netflixService.getCurrentUser().searchByGenre(genre));
                        System.out.println("If you want to take out of this part press'1'"); cl =input.nextInt();
                        if(cl == 1){start(netflixService ,username,password);}
                    case 3:
                        year = input.nextInt();
                        System.out.println(netflixService.getCurrentUser().searchByReleaseYear(year));
                        System.out.println("If you want to take out of this part press'1'");  cl =input.nextInt();
                        if(cl == 1){start(netflixService ,username,password);}
                    case 4:
                        netflixService.getCurrentUser().viewFavorites();
                        System.out.println("If you want to take out of this part press'1'");  cl =input.nextInt();
                        if(cl == 1){start(netflixService ,username,password);}
                }
            case 6: //add films or movie
                System.out.print("Add new TV Show/Movie to NETFLIX app  \n");
                System.out.print("Title = ");
                title = input.next();
                System.out.print("genra = ");
                String genra = input.next();
                System.out.print("Release Year = ");
                year = input.nextInt();
                System.out.print("duration = ");
                String duration = input.next();
                System.out.print("rating =");
                String rate = input.next();
                ArrayList<String> cast = new ArrayList<>();
                String answ = "y";
                String continues;
                while(answ.equals("y")){
                    System.out.print("cast =");
                    cast.add(input.next());
                    System.out.print("Do you wanna continue?(y/n)");continues = input.next();

                    answ = continues;
                }
                answ = "y";
                ArrayList<String> length = new ArrayList<>();
                while (answ.equals("y")){
                    System.out.print("length =");
                    length.add(input.next());
                    System.out.print("Do you wanna continue?(y/n)");continues = input.next();
                    answ = continues;
                }
                TVShow tvShow = new Movie(title,genra,year,duration,rate ,cast ,length);
                netflixService.addTVShow(tvShow);System.out.println("ADD successfully");
                start(netflixService ,username,password);



            case 7://log out from ur page
                netflixService.logout();
                runMenu(netflixService);
        }

    }
}