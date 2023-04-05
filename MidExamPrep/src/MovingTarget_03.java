import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];

            int index = Integer.parseInt(commandLine[1]);
            int value = Integer.parseInt(commandLine[2]);


            switch (command) {
                case "Shoot":
                    if (validIndex(index,numbers)) {
                        int currentNum = numbers.get(index);
                        currentNum = currentNum - value;
                        numbers.set(index, currentNum);
                        numbers.removeIf(element -> element <= 0);
                    }
                    break;
                case "Add":
                    if (validIndex(index, numbers)) {
                        numbers.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    boolean validStrike = numbers.size() - 1 >= index + value
                            && index - value >= 0;

                    if (validStrike) {
                        int radius = value * 2 + 1;

                            for (int i = 0; i < radius; i++) {
                                numbers.remove(index - value);
                            }

                        }
                     else {
                        System.out.println("Strike missed!");
                    }
                    break;

            }

            input = scanner.nextLine();
        }

        List<String> result = new ArrayList<>();
        for (int element: numbers) {
            result.add(String.valueOf(element));
        }
        System.out.println(String.join("|", result));
    }


    public static boolean validIndex (int index, List<Integer> num) {


        return index >= 0 && index <= num.size() - 1;
    }
}
