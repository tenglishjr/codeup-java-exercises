public class StringExercise {
    public static void main(String[] args) {

//      ===== String Basics =====
//
//        For each of the following output examples, create a string variable named message that contains the desired output and print it out to the console.
//
//        Do this with only one string variable and one print statement.


//        `We don't need no education
//        We don't need no thought control`
        String message = "We don't need no education\nWe don't need no thought control";


//       `Check "this" out!, "s inside of "s!`
        message += "\nCheck \"this\" out!, \"s inside of \"s!";

//
//        `In windows, the main drive is usually C:\`
        message += "\nIn windows, the main drive is usually C:\\";

//
//        `I can do backslashes \, double backslashes \\,
//        and the amazing triple backslash \\\!`
        message += "\nI can do backslashes \\, double backslashes \\\\,\n and the amazing triple backslash \\\\\\!";
        System.out.println(message);

    }

}
