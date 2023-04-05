import java.util.Scanner;

public class Triangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        row(n);
    }

    public static void row(int n) {
        for (int i = 1; i <= n; i++) {
            printLine(1, i);
        }
        for (int i = n - 1; i > 0; i--) {
            printLine(1, i);
        }
    }
        public static void printLine(int start, int end) {
            for (int i = start; i <= end; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

}
