import java.util.Arrays;
import java.util.Scanner;

public class MagicNumber_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];


            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1; rightIndex++) {
                int currentNumber2 = numbers[rightIndex];

                if (currentNumber + currentNumber2 == sum) {
                    System.out.print(currentNumber + " " + currentNumber2);
                    System.out.println();
                }
            }
        }
    }
}
