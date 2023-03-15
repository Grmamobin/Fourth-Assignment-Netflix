package org.example;

import java.util.ArrayList;

class Movie extends TVShow {
  /*
   *Movie is extended from TVShow and has extra attribute length.
   */
  private double lenght;
  public Movie(String title , String genre , double releaseYear , String duration , double rating ,
               ArrayList<String> cast , double timeMovie) {

    super(title,genre,releaseYear,duration,rating,cast);
    this.lenght = timeMovie;

  }

  public double getTimeMovie() {
    return lenght;
  }

  public void setTimeMovie(double timeMovie) {
    this.lenght = timeMovie;
  }
}