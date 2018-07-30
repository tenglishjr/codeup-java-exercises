package util;

public class InputTest {


    public static void main(String[] args) {

        Input input = new Input();

        System.out.print("Enter your name: ");
        System.out.println(input.getString());

        if (input.yesNo()) {
            System.out.println("You are so wise now!");
        } else {
            System.out.println("Enjoy being young!");
        }

        System.out.println("Your number is " + input.getInt(1, 10, "Let's talk Favorite Numbers!\n"));

        System.out.println("Your number is " + input.getInt("Let's talk Favorite Numbers!\n"));

        System.out.println("Your number is " + input.getDouble(1, 10, "Let's talk Favorite Numbers!\n"));

        System.out.println("Your number is " + input.getDouble("Let's talk Favorite Numbers!\n"));

    }

}
