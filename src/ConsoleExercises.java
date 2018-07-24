import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//        ================= JAVA CONSOLE I/O =================

//        == Explore the Scanner Class ==
//
//        1. Prompt a user to enter a integer and store that value in an `int` variable using the `nextInt` method.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your favorite integer: ");
        int favInt = sc.nextInt();
        System.out.println("Your favorite int is " + favInt + "\n");
//
//        What happens if you input something that is not an integer?
//        ANS: Runtime error!
//
//        2. Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
//

        System.out.print("Enter three words: ");
        String wordOne = sc.next();
        String wordTwo = sc.next();
        String wordThree = sc.next();
        System.out.printf("You entered: \n%s\n%s\n%s\n\n", wordOne, wordTwo, wordThree);

//        What happens if you enter less than 3 words?
//        ANS: Waits for you to enter the third word on a new line.

//        What happens if you enter more than 3 words?
//        ANS: Stores only the first three words in the variables you created.
//
//        3. Prompt a user to enter a sentence, then store that sentence in a `String` variable using the `.next` method, then display that sentence back to the user.

//        System.out.print("Please enter a complete sentence: ");
//        String compSentence = sc.next();
//        System.out.printf("You entered: \"%s\"", compSentence);

//
//        do you capture all of the words?
//        ANS: No.
//
//        4. Rewrite the above example using the `.nextLine` method.

        sc.nextLine();
        System.out.print("Please enter a complete sentence: ");
        String compSentence = sc.nextLine();
        System.out.printf("You entered: \"%s\"\n\n", compSentence);



//          == Calculate the perimeter and area of Codeup's classrooms ==

//        1. Prompt the user to enter values of length and width of the classroom.
//           Use the `.nextLine` method to get user input and cast the resulting string to a numeric type.
//
//                - Assume that the rooms are perfect rectangles.
//                - Assume that the user will enter valid numeric data for length and width.

        System.out.print("Enter the length of the classroom (in feet): ");
        float classLength = sc.nextFloat();
        System.out.print("Enter the width of the classroom (in feet): ");
        float classWidth = sc.nextFloat();
        System.out.print("Enter the height of the classroom (in feet): ");
        float classHeight = sc.nextFloat();
        System.out.printf("\nThe dimensions of the classroom are: %fft x %fft\n", classLength, classWidth);

//
//        2. Display the area and perimeter of that classroom.

        float classArea = classLength * classWidth;
        float classPerimeter = (2 * classLength) + (2 * classWidth);

        System.out.printf("The area of the classroom is %fsqft\nThe perimeter of the classroom is %fft\n", classArea, classPerimeter);

//        == Bonus ==

//        - Accept decimal entries  ----> DONE

//        - Calculate the volume of the rooms  ----> DONE
        double classVolume = classArea * classHeight;

        System.out.printf("The volume of the classroom is %f cubic ft\n\n", classVolume);

//        === EXTRA EXTRA BONUSES ===

//        BONUS 1
//        Prompt the user to enter a favorite quote
        sc.nextLine();
        System.out.print("Enter your favorite quote: ");
        String favQuote = sc.nextLine();
//        Output the quote
        System.out.println("\"" + favQuote + "\"\n");
//        Ask them to enter how many words are in the quote
        System.out.print("How many words are in this quote? ");
        int numWords = sc.nextInt();
//        Output the number they entered
        System.out.println("You entered " + numWords);
//
//        BONUS 2
//        Prompt the user to enter a list of top three favorite foods separated by only spaces
        System.out.println("\n\nEnter a list of your top three favorite foods (separate with spaces, NOT commas): ");
        String firstFood = sc.next();
        String secondFood = sc.next();
        String thirdFood = sc.next();

//        Use the printf() to output there three top foods with the format:
//        1) FirstFood
//        2) SecondFood
//        3) ThirdFood

        System.out.printf("Your top three favorite foods:\n1) %s\n2) %s\n3) %s\n\n", firstFood, secondFood, thirdFood);
//
//        BONUS 3
//        Prompt the user to enter a grocery list of three items
        System.out.println("Enter a grocery list of three items: ");
//        Each item should only be separated by a comma (no spaces)
//        You will need to use the .useDelimiter() method on your scanner object
        sc.useDelimiter(",");
        String itemOne = sc.next();
        String itemTwo = sc.next();
        String itemThree = sc.next();
//        Output the result as a comma-separated list using printf()
        System.out.printf("Here is your list:\n- %s\n- %s\n- %s\n\n", itemOne, itemTwo, itemThree);

    }

}
