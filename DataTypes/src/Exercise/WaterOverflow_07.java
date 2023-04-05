import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sumLitres = 0;
        int capacity = 255;
        for (int i = 1; i <= n; i++) {
            int litres = Integer.parseInt(scanner.nextLine());
            sumLitres += litres;
            if (sumLitres > capacity) {
                sumLitres = sumLitres - litres;
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(sumLitres);
    }
}
