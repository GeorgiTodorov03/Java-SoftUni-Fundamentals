import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotations ; i++) {
            String firstNumber = numbers[0];
            for (int index = 0; index < numbers.length - 1 ; index++) {
                numbers[index] = numbers[index + 1];
            }
            numbers[numbers.length - 1] = firstNumber;
        }
        for (String elements: numbers) {
            System.out.print(elements + " ");
        }
    }
}
