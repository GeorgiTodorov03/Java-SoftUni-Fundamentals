import java.util.Scanner;

public class ZigZag_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int i = 1; i <= n; i++) {
            String numbers = scanner.nextLine();

            int firstNumber = Integer.parseInt(numbers.split(" ")[0]);
            int secondNumber = Integer.parseInt(numbers.split(" ")[1]);

            if (i % 2 == 0) {
                firstArr[i - 1] = secondNumber;
                secondArr[i - 1] = firstNumber;
            } else {
                firstArr[i - 1] = firstNumber;
                secondArr[i - 1] = secondNumber;
            }
        }

            for (int element: firstArr) {
                System.out.print(element + " ");
            }

            System.out.println();

            for (int element: secondArr) {
                System.out.print(element + " ");
            }

    }
}
