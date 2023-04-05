import java.util.*;

public class StudentAcademy_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentGrades.containsKey(student)) {
                studentGrades.put(student, new ArrayList<>());
            }
            studentGrades.get(student).add(grade);
        }

        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            String student = entry.getKey();
            List<Double> grades = entry.getValue();
            double averageGrade = getAverageGrade (grades);
            if (averageGrade >= 4.50) {
                studentAverageGrade.put(student, averageGrade);
            }
        }

        for (Map.Entry<String, Double> entry : studentAverageGrade.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }

    }

    public static double getAverageGrade (List<Double> grades) {
        double sumGrades = 0;
        for (double grade : grades) {
            sumGrades += grade;
        }
        return sumGrades / grades.size();
    }
}