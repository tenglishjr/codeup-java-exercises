import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        startGame();
    }


//    5. Game Development 101
//
//    You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//    The specs for the game are:
//
//        Game picks a random number between 1 and 100.
//        Prompts user to guess the number
//        All user inputs are validated
//        If user's guess is less than the number, it outputs "HIGHER"
//        If user's guess is more than the number, it outputs "LOWER"
//        If a user guesses the number, the game should declare "GOOD GUESS!"

    public static void startGame() {
        Scanner sc = new Scanner(System.in);

        boolean userStillGuessing = true;
        int numOfGuesses = 1;
        int winningNum = (int) randomNumGen(1, 100);

        do {
            numOfGuesses++;
            System.out.print("In 10 guesses or less, GUESS THE NUMBER: ");
            int userGuess = sc.nextInt();
            System.out.println();

            if (numOfGuesses <= 10) {
                if (userGuess == winningNum) {
                    System.out.println("GOOD GUESS!\n\n");
                    userStillGuessing = false;
                } else if (userGuess < winningNum) {
                    System.out.println("HIGHER...\n\n");
                } else {
                    System.out.println("LOWER...\n\n");
                }
            } else {
                System.out.println("YOU LOSE! (Out of guesses)");
                userStillGuessing = false;
            }
        } while (userStillGuessing);
        System.out.println();
        System.out.println("Thanks for playing!");
        System.out.println("=================================");
        System.out.println("=================================");
    }


    public static double randomNumGen(int min, int max) {
        return Math.random() * max - (min + 1);
    }


}
