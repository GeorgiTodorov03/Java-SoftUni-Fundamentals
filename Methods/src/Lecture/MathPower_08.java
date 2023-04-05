import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Integer.parseInt(scanner.nextLine());

        double result = Math(number, power);

        DecimalFormat decimal = new DecimalFormat("0.####");
        System.out.println(decimal.format(result));
    }

    public static double Math(double n, double p) {
        double result = 1;
        for (int i = 1; i <= p; i++) {
            result = result * n;
        }
        return result;
    }
}
