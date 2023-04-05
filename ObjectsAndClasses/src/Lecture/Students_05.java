import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {

    static class Student {
        String firstName;
        String lastName;
        String age;
        String town;

        public Student (String firstName, String lastName, String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getTown() {
            return town;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Student> studentInfo = new ArrayList<>();
        while (!input.equals("end")) {
            String[] inputStudentArr = input.split(" ");

            String firstName = inputStudentArr[0];
            String lastName = inputStudentArr[1];
            String age = inputStudentArr[2];
            String town = inputStudentArr[3];

            Student currentStudent = new Student(firstName, lastName, age, town);
            studentInfo.add(currentStudent);

            input = scanner.nextLine();
        }
        String searchTown = scanner.nextLine();

        for (Student item : studentInfo) {
            if (item.getTown().equals(searchTown)) {
                System.out.printf("%s %s is %s years old%n", item.getFirstName(), item.getLastName(), item.getAge(), item.getTown());
            }
        }
    }
}
