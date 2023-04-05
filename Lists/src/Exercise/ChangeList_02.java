import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer :: parseInt)
                                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            List<String> command = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            if (command.get(0).equals("Delete")) {
                for (int i = 0; i < numbers.size(); i++) {
                    int numberDelete = Integer.parseInt(command.get(1));

                    if (numbers.get(i) == numberDelete) {
                        numbers.remove(i);
                        i = - 1;
                    }
                }
            } else {
                int index = Integer.parseInt(command.get(2));
                int element = Integer.parseInt(command.get(1));
                numbers.add(index, element);
            }

            input = scanner.nextLine();
        }

        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }
}
