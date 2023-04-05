import java.util.Scanner;

public class ReplaceChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String res = "";

        char firstOccur = input.charAt(0);
        res += firstOccur;

        for (int i = 1; i <= input.length() - 1; i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol != firstOccur) {
                res += currentSymbol;
                firstOccur = currentSymbol;
            }
        }
        System.out.println(res);
    }
}
