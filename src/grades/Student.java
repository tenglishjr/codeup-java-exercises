package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private String username;
    private ArrayList<Integer> grades;

    public Student(String name, String username) {
        this.name = name;
        this.username = username;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGrades() {
        String output = "";
        for (Integer grade : grades) {
            output += (grade + "  ");
        }
        return output;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage(){
        int sum = 0;
        for (Integer grade: grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public static void main(String[] args) {

        Student tj = new Student("TJ", "tenglishjr");

        tj.addGrade(99);
        tj.addGrade(87);
        tj.addGrade(79);
        tj.addGrade(100);
        tj.addGrade(100);

        System.out.println(tj.getGradeAverage());

    }

}
