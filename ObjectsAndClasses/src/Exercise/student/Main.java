package student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine()); //брой на студентите
        for (int studentCount = 1; studentCount <= n; studentCount++) {
            String personalData = scanner.nextLine();
            String firstName = personalData.split(" ")[0];
            String lastName = personalData.split(" ")[1];
            double grade = Double.parseDouble(personalData.split(" ")[2]);

            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }

        //списък с обекти от клас Student
        studentList.sort(Comparator.comparingDouble(Student :: getGrade) //ascending order по оценка
                .reversed()); //descending order по оценка

        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }
}
