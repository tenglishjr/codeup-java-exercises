package movies;
import util.Input;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    public static Input userInput = new Input();
    public static Movie[] movies = MoviesArray.findAll();
    private static Scanner sc;

    public static void printMovies(){
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

    public static void printMovies(String category){
        for (Movie movie : movies) {
            if (movie.getCategory().equals(category)) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }

    public static void addNewMovie(Scanner sc) {
        userInput.getString("Let's add a new movie! [Press ENTER]");
        sc.nextLine();
        String movieName = userInput.getString("Enter the movie name: ");
        String movieCat = userInput.getString("Enter the category: ");
        int newLastIndex = movies.length - 1;
        movies[newLastIndex] = new Movie(movieName, movieCat);
        System.out.println();
        System.out.println("The " + movieCat + " film \"" + movieName + "\" successfully added.\n");
    }

    public static void appInit() {
        Scanner sc = new Scanner(System.in);

        boolean userContinue = true;

        System.out.println();
        System.out.println("    Welcome to 'Movies List'!\n|==============================|\n");

        do {
            System.out.println("What would you like to do?\n");

            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view all movies in the animated category");
            System.out.println("3 - view all movies in the drama category");
            System.out.println("4 - view all movies in the horror category");
            System.out.println("5 - view all movies in the scifi category");
            System.out.println("6 - view all movies in the musical category");
            System.out.println("7 - add new movie\n");

            int input = userInput.getInt(0, 7, "Enter your choice: ");
            System.out.println();

            switch (input) {
                case 0:
                    System.out.println("Thanks for using 'Movies List'!\n   Have a great day!");
                    userContinue = false;
                    break;
                case 1:
                    System.out.println("======================================\n");
                    printMovies();
                    System.out.println("\n======================================\n");
                    break;
                case 2:
                    System.out.println("======================================\n");
                    printMovies("animated");
                    System.out.println("\n======================================\n");
                    break;
                case 3:
                    System.out.println("======================================\n");
                    printMovies("drama");
                    System.out.println("\n======================================\n");
                    break;
                case 4:
                    System.out.println("======================================\n");
                    printMovies("horror");
                    System.out.println("\n======================================\n");
                    break;
                case 5:
                    System.out.println("======================================\n");
                    printMovies("scifi");
                    System.out.println("\n======================================\n");
                    break;
                case 6:
                    System.out.println("======================================\n");
                    printMovies("musical");
                    System.out.println("\n======================================\n");
                    break;
                case 7:
                    System.out.println("======================================\n");
                    addNewMovie(sc);
                    System.out.println("\n======================================\n");
            }
        } while (userContinue);
    }

    public static void main(String[] args) {
        appInit();
    }
}
