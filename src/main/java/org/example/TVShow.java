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

    public TVShow(String title , String genre , double releaseYear , String duration , double rating ,
                  ArrayList<String> cast){
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.rating = rating;
        this.cast = new ArrayList<>();
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

    public String getDuration() {
        return duration;
    }

    public double getRating() {
        return rating;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseYear(double releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setCast(ArrayList<String> cast) {
        this.cast = cast;
    }
}
