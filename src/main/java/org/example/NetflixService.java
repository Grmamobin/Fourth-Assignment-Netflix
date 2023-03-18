package org.example;
import java.util.ArrayList;

class NetflixService  {
    /*
     *The NetflixService should have an Arraylist of users, tv shows and movies.
     *The NetflixService should have a User object which represents current user.
     */
    ArrayList<User> userList = new ArrayList<>();
    static ArrayList<TVShow> tvShowList = new ArrayList<>();
    static ArrayList<Movie> movieList = new ArrayList<>();
    private User currentUser;
    public NetflixService() {
        currentUser = new User("", "");
    }
    public NetflixService(User currentUser){
        this.currentUser = currentUser;
    }
    public void addTVShow(TVShow tvShow){
        // Implement add tv show logic here
        tvShowList.add(tvShow);

    }

    public void addMovie(Movie movie){
        // Implement add movie logic here
        movieList.add(movie);
    }

    public boolean createAccount(String username, String password) {
        // Implement create account logic here

           for( User user : userList){

               if(user.getUsername().contains(username) && user.getPassword().contains(password)){
                   System.out.println("can't Sign up cause you have an account");
                   return false;
               }
               if(user.getUsername().contains(username)){
                   System.out.println("plz change your username bc it's for another user ");
                   return false;
               }

           }
                User user1 = new User(username , password);
                userList.add(user1);
                System.out.println("...........***...........................WELCOME New User...........***...........................");
               return true;

    }

    public boolean login(String username, String password) {
        // Implement login logic here
        for (User user : userList)
        {
            if (user.getUsername().contains(username) && user.getPassword().contains(password))
            {
                setCurrentUser(user);
                return true;
            }

        }

        return false;
    }

    public void logout() {
        // Implement logout logic here
        System.out.println("Hop you're Entertaining");
        this.currentUser = null;
        return;
    }

    public ArrayList<TVShow> searchByTitle(String title) {
        // Implement search by title logic here
        ArrayList<TVShow> result = new ArrayList<>();
        for (TVShow tvShow : tvShowList)
        {
            if(title.compareTo(tvShow.getTitle())== 0)
            {
                result.add(tvShow);
            }
        }
        return result;

    }

    public ArrayList<TVShow>  searchByGenre(String genre) {
        // Implement search by genre logic here
        ArrayList<TVShow> result = new ArrayList<>();
        for (TVShow tvShow : tvShowList) {
            if (genre.compareTo(tvShow.getGenre()) == 0) {
                result.add(tvShow);
            }
        }
        return result;
    }

    public ArrayList<TVShow> searchByReleaseYear(int year) {
        // Implement search by release year logic here
        ArrayList<TVShow> result = new ArrayList<>();
        for (TVShow tvShow : tvShowList)
        {  //cause this is int and can't use compare method
            if(year == tvShow.getReleaseYear())
            {
                result.add(tvShow);
            }
        }
        return result;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    @Override
    public String toString() {
        return "NetflixService{" +
                "userList=" + userList +
                ", tvShowList=" + tvShowList +
                ", movieList=" + movieList +
                '}';
    }
}

