import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer :: parseInt)
                                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            List<String> commands = Arrays.stream(input.split(" "))
                                   .collect(Collectors.toList());
            String function = commands.get(0);

            switch (function) {
                case "Add":
                    int numAdd = Integer.parseInt(commands.get(1));
                    numbers.add(numAdd);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commands.get(2));
                    int element = Integer.parseInt(commands.get(1));
                    if (isIndexValid(index, numbers.size())) {
                        numbers.add(index,element);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexRemove = Integer.parseInt(commands.get(1));
                    if (isIndexValid(indexRemove, numbers.size())) {
                        numbers.remove(indexRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    if (commands.get(1).equals("left")) {
                        int countLeft = Integer.parseInt(commands.get(2));
                        for (int times = 0; times < countLeft; times++) {
                            int firstNum = numbers.get(0);
                            numbers.add(firstNum);
                            numbers.remove(0);
                        }

                    } else {
                        int countRight = Integer.parseInt(commands.get(2));

                        for (int times = 0; times < countRight; times++) {
                            int lastNum = numbers.get(numbers.size() - 1);
                            numbers.add(0, lastNum);
                            numbers.remove(numbers.size() - 1);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }
    public static boolean isIndexValid (int index, int sizeOfList) {

        return index >= 0 && index <= sizeOfList - 1;
    }
}
