package org.example;

import java.util.ArrayList;

class User {
    /*
    * The user should contain username password.
    * The user should contain an ArrayList of favorite shows and watch history.
    * FUNCTION: the user should have a function to watch a show and add it to watch history.
    *  *** NOTE: All search functions in user are for searching in favorite shows ***
    */
    private String username;
    private String password;
    ArrayList<TVShow> favoriteShowList;
    ArrayList<TVShow> watchHistoryList;
    ArrayList<User> userList;
    ArrayList<TVShow> tvShowList;
    ArrayList<Movie> movieList;

    public User(String username , String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void watchShow(TVShow tvShow){
        watchHistoryList.add(tvShow);
    }

    public void WatchHistory() {
        System.out.println("History :");
        System.out.println(watchHistoryList);
    }

    public ArrayList<TVShow> searchByTitle(String title) {
        // Implement search by title in favorite shows  logic here
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
        // Implement search by genre in favorite shows  logic here
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
        // Implement search by release year in favorite shows logic here
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
    public void addToFavorites(TVShow show) {
        // Implement add to favorites logic here
        favoriteShowList.add(show);

    }
    public void viewFavorites() {
        // Implement view favorites logic here
        System.out.print("Your favorites are :\n" + favoriteShowList);
    }
    public ArrayList<TVShow> getRecommendations() {
        // Implement get recommendations logic here
        System.out.println("Suggested : ");
        //not complete-based on genra----------->
        System.out.println("fiction movie / horror movie / drum movie / comedy / advanture");
      return null;
    }
}
