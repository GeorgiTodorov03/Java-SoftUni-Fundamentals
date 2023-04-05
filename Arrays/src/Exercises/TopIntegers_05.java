import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isTop = false;

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentElement = numbers[index];

            if (index == numbers.length - 1) {
                System.out.print(currentElement + " ");
                continue;
            }

            for (int rightIndex = index + 1; rightIndex <= numbers.length - 1; rightIndex++) {

                if (currentElement > numbers[rightIndex]) {
                    isTop = true;

                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(currentElement + " ");
            }
        }
    }
}
