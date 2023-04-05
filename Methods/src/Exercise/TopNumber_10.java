import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {


            if (divisibleBy8(number) && oddDigit(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean divisibleBy8(int n) {
        int sumDigits = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sumDigits += lastDigit;
            n = n / 10;
        }
        if (sumDigits % 8 == 0) {
            return true;
        } else {
            return false;

        }
    }

    public static boolean oddDigit(int n) {
        while (n > 0) {
            int lastDigit = n % 10;

            if (lastDigit % 2 == 1) {
                return true;
            }

            n = n / 10;
            }
        return false;
        }
    }

