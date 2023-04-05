import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandLine.get(0);

            switch (command) {
                case "Add":
                   int numberAdd = Integer.parseInt(commandLine.get(1));
                    numbers.add(numberAdd);
                    break;
                case "Remove":
                    int numberRemove = Integer.parseInt(commandLine.get(1));
                    numbers.remove(Integer.valueOf(numberRemove));
                    break;
                case "RemoveAt":
                    int indexRemove = Integer.parseInt(commandLine.get(1));
                    numbers.remove(indexRemove);
                    break;
                case "Insert":
                    int indexAdd = Integer.parseInt(commandLine.get(1));
                    int itemAdd = Integer.parseInt(commandLine.get(2));
                    numbers.add(itemAdd, indexAdd);
                    break;
            }

            input = scanner.nextLine();
        }
        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }
}
