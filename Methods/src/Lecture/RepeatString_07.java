import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String symbols = scanner.nextLine();
        int repeat = Integer.parseInt(scanner.nextLine());

        repeats(symbols, repeat);
    }

    public static String repeats(String chars, int repeat) {
        for (int i = 1; i <= repeat; i++) {
            System.out.print(chars);
        }
        return chars;
    }
}
