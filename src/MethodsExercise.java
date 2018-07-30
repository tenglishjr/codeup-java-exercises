import java.util.Scanner;

public class MethodsExercise {


    public static void main(String[] args) {



        // Problem 1
        System.out.println();
        System.out.println(add(6, 4));
        System.out.println(subtract(6, 4));
        System.out.println(multiply(6, 4));
        System.out.println(divide(6, 4));
        System.out.println(modulus(6, 4));

//        System.out.println(divide(6, 0));


        // Problem 2
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        System.out.println("User input: " + userInput);


        // Problem 3
//        calcFactorial();


        // Problem 4
//        rollDice();
    }

//    1. Create four separate methods. Each will perform an arithmetic operation:

//        Addition
//        Subtraction
//        Multiplication
//        Division

    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        return a / b;
    }
    public static double modulus(double a, double b) {
        return a % b;
    }

//    2. Create a method that validates that user input is in a certain range.
//
//        The method signature should look like this:
//            `public static int getInteger(int min, int max);`
//
//
//         and is used like this:
//             `System.out.print("Enter a number between 1 and 10: ");`
//             `int userInput = getInteger(1, 10);`
//
//        If the input is invalid, prompt the user again.


    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input >= min && input <= max) {
            return input;
        }
        System.out.print("Invalid number! Try again:");
        return getInteger(min, max);
    }



//    3. Calculate the factorial of a number.
//
//        Prompt the user to enter an integer from 1 to 10.
//        Display the factorial of the number entered by the user.
//        Ask if the user wants to continue.
//        Use a for loop to calculate the factorial.
//        Assume that the user will enter an integer, but verify it’s between 1 and 10.
//        Use the long type to store the factorial.
//        Continue only if the user agrees to.
//        A factorial is a number multiplied by each of the numbers before it.
//        Factorials are denoted by the exclamation point (n!).


    public static void calcFactorial() {
        Scanner sc = new Scanner(System.in);
        boolean userContinues = true;

        do {
            System.out.print("Enter a number between 1 and 10: ");
            int userInput = getInteger(1, 10);
            long factorial = 1;
            System.out.println("You entered " + userInput);

            for (int i = 1; i <= userInput; i++) {
                factorial *= i;
            }
            System.out.println(userInput + "! = " + factorial + "\n\n");

            System.out.print("Do you wish to enter another number (y/n)? ");
            String userAns = sc.next();
            if (!userAns.equalsIgnoreCase("y")) {
                userContinues = false;
            }
        } while (userContinues);
    }


//    4. Create an application that simulates dice rolling.
//
//        Ask the user to enter the number of sides for a pair of dice.
//        Prompt the user to roll the dice.
//        "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//        Use static methods to implement the method(s) that generate the random numbers.
//        Use the .random method of the java.lang.Math class to generate random numbers.


    public static void rollDice() {
        Scanner sc = new Scanner(System.in);
        boolean userContinues = true;
        System.out.println("WELCOME to \"Roll the Dice\"!");
        System.out.println("===================================================\n");
        System.out.print("Please enter the number of sides for a pair of dice: ");
        int sides = sc.nextInt();

        System.out.println("Press [ENTER] to roll the dice!");
        sc.nextLine();
        sc.nextLine();
        do {
            int diceOne = (int) randomNo(sides);
            int diceTwo = (int) randomNo(sides);

            System.out.println("You rolled a " + diceOne + " and a " + diceTwo + "!\n\n");
            System.out.print("Do you wish to roll again (y/n)? ");
            String userAns = sc.next();
            if (!userAns.equalsIgnoreCase("y")) {
                userContinues = false;
            }
        } while (userContinues);
    }

    public static double randomNo(int max) {
        return Math.random() * max + 1;
    }

}
