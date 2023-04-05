import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String currentWord = input;
            String reversed = "";
            for (int i = currentWord.length() - 1; i >= 0; i--) {
                reversed += currentWord.charAt(i);
            }

            System.out.printf("%s = %s%n", currentWord, reversed);

            input = scanner.nextLine();
        }
    }
}
