import java.util.Scanner;

public class RefactorSumOddNumbers_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int odd = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(odd);
            sum = sum + odd;
            odd += 2;
        }
        System.out.printf("Sum: %d", sum);
    }
}

