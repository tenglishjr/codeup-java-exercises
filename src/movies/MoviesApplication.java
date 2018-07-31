package movies;
import util.Input;
import java.util.Scanner;

public class MoviesApplication {


    public static void main(String[] args) {
        appInit();
    }

    public static void appInit() {
        Scanner sc = new Scanner(System.in);
        Input userInput = new Input();
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
            System.out.println("6 - view all movies in the musical category\n");
//            System.out.println("7 - add new movie\n");

            int input = userInput.getInt(0, 6, "Enter your choice: ");
            System.out.println();

            switch (input) {
                case 0:
                    System.out.println("Thanks for using 'Movies List'!\n   Have a great day!");
                    userContinue = false;
                    break;
                case 1:
                    System.out.println("======================================\n");
                    for (Movie movie : MoviesArray.findAll()) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                    System.out.println("\n======================================\n");
                    break;
                case 2:
                    System.out.println("======================================\n");
                    for (Movie movie : MoviesArray.findAll()) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    System.out.println("\n======================================\n");
                    break;
                case 3:
                    System.out.println("======================================\n");
                    for (Movie movie : MoviesArray.findAll()) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    System.out.println("\n======================================\n");
                    break;
                case 4:
                    System.out.println("======================================\n");
                    for (Movie movie : MoviesArray.findAll()) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    System.out.println("\n======================================\n");
                    break;
                case 5:
                    System.out.println("======================================\n");
                    for (Movie movie : MoviesArray.findAll()) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    System.out.println("\n======================================\n");
                    break;
                case 6:
                    System.out.println("======================================\n");
                    for (Movie movie : MoviesArray.findAll()) {
                        if (movie.getCategory().equals("musical")) {
                            System.out.println(movie.getName() + " -- " + movie.getCategory());
                        }
                    }
                    System.out.println("\n======================================\n");
                    break;
//                case 7:
//                    System.out.println("======================================\n");
//                    userInput.getString("Let's add a new movie! [Press ENTER]");
//                    sc.nextLine();
//                    String movieName = userInput.getString("Enter the movie name: ");
//                    String movieCat = userInput.getString("Enter the category: ");
//                    Movie[] newMovie = {new Movie(movieName, movieCat)};
//                    addNewMovie(MoviesArray.findAll(), newMovie);
//                    System.out.println();
//                    System.out.println("The " + movieCat + " film \"" + movieName + "\" successfully added.\n");
//                    System.out.println("New Movies List:\n");
//                    for (Movie movie : MoviesArray.findAll()) {
//                        System.out.println(movie.getName() + " -- " + movie.getCategory());
//                    }
//                    System.out.println("\n======================================\n");
            }
        } while (userContinue);
    }

    public static Object[] addNewMovie (Object[] array, Object[] elements) {
        Object[] tempArray = new Object[array.length + elements.length];
        System.arraycopy(array, 0, tempArray, 0, array.length);

        for (int i = 0; i < elements.length; i++) {
            tempArray[array.length + i] = elements[i];
        }
        return tempArray;
    }
}
