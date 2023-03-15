package org.example;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    // Declaring the background color
    public static final String ANSI_RED_BACKGROUND
            = "\u001B[41m";
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
      /*  ArrayList<String> movieInfo = new ArrayList<>();
        movieInfo.add();
*/     ArrayList<String> TopCast = new ArrayList<>();
        TopCast.add("Leonardo dicaprio");
        TopCast.add("Emily Mortimer");
        TopCast.add("Mark Ruffalo");
        TopCast.add("Ben Kingsley");
        TopCast.add("Patricia Clarkson");

        ArrayList<String>Length = new ArrayList<>();
        Length.add("1 Episode");

        Movie movie = new Movie("Shutter Island" , "psychology" , 2010 , "2:20" , "8.5/10" ,TopCast , Length);

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
        System.out.println(movie);


        runMenu();
    }

    public static void runMenu(){
        //TODO:
        System.out.println(ANSI_RED_BACKGROUND+"      NETFLIX         "+ ANSI_RESET);
    /*    System.out.print("Username :"); String username = input.next();
        System.out.print("Password :"); String password = input.next();*/


    }
}
