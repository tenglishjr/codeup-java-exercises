package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input () {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userResponse = scanner.next();
        return (userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y"));
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        String userResponse = scanner.next();
        return (userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("y"));
    }

    public int getInt(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userInt = scanner.nextInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        }
        System.out.println("INVALID NUMBER");
        return getInt(min, max);
    }

    public int getInt(int min, int max, String prompt) {
        System.out.print(prompt);
        int userInt = scanner.nextInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        }
        System.out.println("INVALID NUMBER");
        return getInt(min, max, prompt);
    }

    public int getInt() {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        double userInt = scanner.nextDouble();
        if (userInt >= min && userInt <= max) {
            return userInt;
        }
        System.out.println("INVALID NUMBER");
        return getDouble(min, max);
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.print(prompt);
        double userInt = scanner.nextDouble();
        if (userInt >= min && userInt <= max) {
            return userInt;
        }
        System.out.println("INVALID NUMBER");
        return getDouble(min, max);
    }

    public double getDouble() {
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

}
