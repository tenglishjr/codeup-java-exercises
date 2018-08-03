package grades;

import util.Input;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

    public static void main(String[] args) {

        Input userInput = new Input();
        HashMap<String, Student> students = new HashMap<>();
        Student john = new Student("John", "johnnygold_");
        john.addGrade(98);
        john.addGrade(97);
        john.addGrade(100);

        Student peter = new Student("Peter", "sp00derm4n");
        peter.addGrade(88);
        peter.addGrade(60);
        peter.addGrade(72);

        Student luke = new Student("Luke", "cageTh3B34st");
        luke.addGrade(91);
        luke.addGrade(81);
        luke.addGrade(95);

        Student bruce = new Student("Bruce", "ihrtm0m");
        bruce.addGrade(100);
        bruce.addGrade(100);
        bruce.addGrade(0);

        Student clark = new Student("Clark", "eyeh8greenrox");
        clark.addGrade(90);
        clark.addGrade(80);
        clark.addGrade(86);


        students.putIfAbsent(john.getUsername(), john);
        students.putIfAbsent(peter.getUsername(), peter);
        students.putIfAbsent(luke.getUsername(), luke);
        students.putIfAbsent(bruce.getUsername(), bruce);
        students.putIfAbsent(clark.getUsername(), clark);

        System.out.println("\nWelcome!\n\n");

        do {

            System.out.println("\nHere are the github usernames of our students: \n");

            for (String student : students.keySet()) {
                System.out.print(" |" + student + "| ");
            }

            String inputStudent = userInput.getSingleString("\n\nWhich student would you like to see more information on?\n\n> ");

            int i = 0;
            for (Student student : students.values()) {
                if (student.getUsername().equals(inputStudent)) {
                    System.out.println("\nName: " + student.getName() + " - Github Username: " + student.getUsername());
                    System.out.println(student.getName() + "'s Grades: " + student.getGrades());
                    System.out.printf("Current average: %.1f%%%n", student.getGradeAverage());
                    break;
                } else if (students.size() - 1 == i){
                    System.out.println("\nSorry, no student found with the Github username of \"" + inputStudent + "\".");
                    break;
                } else {
                    i++;
                }
            }


        } while (userInput.yesNo("\nWould you like to see another student?\n\n> "));

        System.out.println("\nGoodbye, and have a wonderful day!\n\n");

    }

}

