import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n1 = new BigInteger(scanner.nextLine());
        BigInteger n2 = new BigInteger(scanner.nextLine());

        System.out.println(n1.multiply(n2));
    }
}
