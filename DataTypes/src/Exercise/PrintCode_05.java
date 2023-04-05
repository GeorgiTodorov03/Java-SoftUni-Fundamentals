import java.util.Scanner;

public class PrintCode_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        for (int code = startNumber; code <= endNumber; code++) {
            char symbol = (char) code;
            System.out.print(symbol + " ");
        }
    }
}
