package org.example;

import java.util.ArrayList;

class forSearching extends TVShow {

    public forSearching(String title , String genre , int releaseYear , String duration , String rating ,
                        ArrayList<String> cast) {

        super(title,genre,releaseYear,duration,rating,cast);

    }

    @Override
    public String toString() {
        return "Movie{title=" + getTitle() + "    genre="+getGenre()+  "   releaseYear=" + getReleaseYear()+
                "   duration="+getDuration()+"  rating="+getRating()+'}';
    }

}
