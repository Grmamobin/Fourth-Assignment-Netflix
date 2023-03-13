package org.example;

import java.util.ArrayList;

class TVShow {
    /*
    *The TVShow should have a title , genre, release year, duration and a rating.
     *The TVShow should have an ArrayList of the cast.
     */
    private String title;
    private String genre;
    private double releaseYear;
    private String duration;
    private double rating;
    ArrayList<String> cast;

    public TVShow(String title , String genre ,double releaseYear , String duration , double rating ){
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getReleaseYear() {
        return releaseYear;
    }


}
