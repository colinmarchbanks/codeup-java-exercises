package movies;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - add new movie\n" +
                    "\n" +
                    "Enter your choice:");
            int userInput = scan.nextInt();
            if (userInput == 0) {
                System.exit(0);
            } else if (userInput == 1) {
                for (Movie movie : movies) {
                    System.out.println(movie.getName() + " " + movie.getCategory());
                }
            } else if (userInput == 2) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("animated")) {
                        System.out.println(movie.getName() + " " + movie.getCategory());
                    }
                }
            } else if (userInput == 3) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.println(movie.getName() + " " + movie.getCategory());
                    }
                }
            } else if (userInput == 4) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.println(movie.getName() + " " + movie.getCategory());
                    }
                }
            } else if (userInput == 5) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.println(movie.getName() + " " + movie.getCategory());
                    }
                }
            }else if(userInput == 6){
                scan.nextLine();
                System.out.println("Please enter the name of the movie");
                String movieName = scan.nextLine();
                System.out.println("Please enter the category of the movie");
                String movieCategory = scan.nextLine();
                Movie[] newArr = Arrays.copyOf(movies,movies.length+1);
                newArr[newArr.length-1] = new Movie(movieName,movieCategory);
                movies = newArr;
            }

            else {
                System.out.println("Please enter a valid option");
            }
        }

    }
}
