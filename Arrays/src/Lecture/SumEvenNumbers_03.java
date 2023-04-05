import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineInput = scanner.nextLine();
        int[] numbers = Arrays
                .stream(lineInput.split( " "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            int currentNum = numbers[i];
            if (currentNum % 2 == 0) {
                sum += currentNum;
            }

        }
        System.out.println(sum);
    }
}
