package org.example;

import java.util.ArrayList;

class Movie extends TVShow {
  /*
   *Movie is extended from TVShow and has extra attribute length.
   */
  private final ArrayList<String> length;

  public Movie(String title , String genre , int releaseYear , String duration , String rating , ArrayList<String> cast,ArrayList<String> length) {

    super(title,genre,releaseYear,duration,rating , cast);
    this.length = length;

  }

  public ArrayList<String> getLength() {return length;}
  @Override
  public String toString() {
    return "Movie{title=" + getTitle() + "    genre="+getGenre()+  "   releaseYear=" + getReleaseYear()+
            "   duration="+getDuration()+"  rating="+getRating()+
            "   cast="+getCast() +   "   length=" + getLength() + '}';
  }
}