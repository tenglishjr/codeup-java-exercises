package movies;
import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        appInit();
    }

    public static void appInit() {
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
            }
        } while (userContinue);
    }
}
