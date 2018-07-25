import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {


//        ===== Bob, the lackadaisical teenager =====

//        Create a class Bob for the following exercise with a main method. Bob is a lackadaisical teenager. In conversation, his responses are very limited.

//        - Bob answers 'Sure.' if you ask him a question.
//        - He answers 'Whoa, chill out!' if you yell at him.
//        - He says 'Fine. Be that way!' if you address him without actually saying anything.
//        - He answers 'Whatever.' to anything else.

        Scanner sc = new Scanner(System.in);
        boolean bobTalkative = true;
        System.out.println("Name's Bob. Whaddayu want?\n");

        while (bobTalkative) {
            String statement = sc.nextLine();

            if (statement.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (statement.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (statement.endsWith("?")) {
                System.out.println("Sure.");
            } else if (statement.equalsIgnoreCase("bye")) {
                System.out.println("Bye.");
                bobTalkative = false;
            } else {
                System.out.println("Whatever.");
            }
        }

    }
}
