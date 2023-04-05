
import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        long fact1 = factorial(number1);
        long fact2 = factorial(number2);
        double result = fact1 * 1.0 / fact2;

        System.out.printf("%.2f",result);
        }


    public static long factorial(int number) {
        long fact = 1;
        for (int i = 1; i <= number; i++) {

            fact = fact * i;
        }
        return fact;
    }
}
