import java.util.*;


public class Courses_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        Map<String, List<String>> courseValidation = new LinkedHashMap<>();

        while (!data.equals("end")) {
            String[] dataArr = data.split(" : ");
            String course = dataArr[0];
            String student = dataArr[1];

            if (!courseValidation.containsKey(course)) {
                courseValidation.put(course, new ArrayList<>());
            }
            courseValidation.get(course).add(student);


            data = scanner.nextLine();
        }


        for (Map.Entry<String, List<String>> entry : courseValidation.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());

            entry.getValue().forEach(e -> System.out.printf("-- %s%n", e));
        }

    }
}
