package org.example;
import java.util.ArrayList;

class NetflixService  {
    /*
     *The NetflixService should have an Arraylist of users, tv shows and movies.
     *The NetflixService should have a User object which represents current user.
     */
    ArrayList<User> userList;
    ArrayList<TVShow> tvShowList;
    ArrayList<Movie> movieList;
    private User user;

    public NetflixService(){
       this.userList = new ArrayList<>();
       this.tvShowList = new ArrayList<>();
       this.movieList= new ArrayList<>();
    }

    public void addTVShow(TVShow tvShow){
        // Implement add tv show logic here
        tvShowList.add(tvShow);

    }

    public void addMovie(Movie movie){
        // Implement add movie logic here
        movieList.add(movie);
    }

    public void createAccount(String username, String password) {
        // Implement create account logic here

                User user1 = new User(username , password);
                userList.add(user1);
                System.out.println("...........***...........................WELCOME New User...........***...........................");
                return;

    }

    public boolean login(String username, String password) {
        // Implement login logic here
        for (User user : userList)
        {
            if (user.getUsername().contains(username) && user.getPassword().contains(password))
            {
                return true;
            }
        }

        return false;
    }

    public void logout() {
        // Implement logout logic here
        System.out.println("Hop you're Entertaining");
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

    public ArrayList<TVShow> searchByGenre(String genre) {
        // Implement search by genre logic here
        ArrayList<TVShow> result = new ArrayList<>();
        for (TVShow tvShow : tvShowList)
        {
            if(genre.compareTo(tvShow.getGenre())== 0)
            {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "NetflixService{" +
                "userList=" + userList +
                ", tvShowList=" + tvShowList +
                ", movieList=" + movieList +
                ", user=" + user +
                '}';
    }
}

