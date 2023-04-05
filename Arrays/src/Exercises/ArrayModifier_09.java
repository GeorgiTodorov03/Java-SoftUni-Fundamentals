import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String commandFunction = commandParts[0];

            switch (commandFunction) {
                case "swap":
                    // взимам двата дадени елемента и им разменям позициите
                    int firstNumber = Integer.parseInt(commandParts[1]);
                    int firstElement = numbers[firstNumber];
                    int secondNumber = Integer.parseInt(commandParts[2]);
                    int secondElement = numbers[secondNumber];

                    numbers[firstNumber] = secondElement;
                    numbers[secondNumber] = firstElement;
                    break;
                case "multiply":
                    // взимам двата елемента на дадените позиции, умножавам ги и полученето число го слагам на първия даден индекс
                    int firstMultiply = Integer.parseInt(commandParts[1]);
                    int firstNumberM = numbers[firstMultiply];
                    int secondMultiply = Integer.parseInt(commandParts[2]);
                    int secondNumberM = numbers[secondMultiply];
                    int sum = firstNumberM * secondNumberM;
                    numbers[firstMultiply] = sum;
                    break;
                case "decrease":
                    // намалям всеки един елемент с 1
                    for (int index = 0; index <= numbers.length - 1; index++) {
                        numbers[index] -= 1;
                    }
                    break;
            }



            command = scanner.nextLine();
        }

        for (int index = 0; index <= numbers.length - 1; index++) {
            if (index != numbers.length - 1) {
                System.out.print(numbers[index] + ", ");
            } else {
                System.out.print(numbers[index]);
            }
        }
    }
}
