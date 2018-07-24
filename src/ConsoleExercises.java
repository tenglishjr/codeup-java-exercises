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
        int classLength = sc.nextInt();
        System.out.print("Enter the width of the classroom (in feet): ");
        int classWidth = sc.nextInt();
        System.out.printf("\nThe dimensions of the classroom are: %dft x %dft\n", classLength, classWidth);

//
//        2. Display the area and perimeter of that classroom.

        int classArea = classLength * classWidth;
        int classPerimeter = (2 * classLength) + (2 * classWidth);

        System.out.printf("The area of the classroom is %dsqft\nThe perimeter of the classroom is %dft\n\n", classArea, classPerimeter);

    }

}
