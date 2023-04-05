import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        while (!number.equals("END")) {

            System.out.println(reversed(number));
            number = scanner.nextLine();
        }
    }

    public static String reversed(String number) {
        String reversed = "";
        String output = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            reversed += number.charAt(i);
        }

        if (reversed.equals(number)) {
            output = "true";
        } else {
            output = "false";
        }
        return output;
    }
}
