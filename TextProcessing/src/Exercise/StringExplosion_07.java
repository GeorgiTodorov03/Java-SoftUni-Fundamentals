import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);
        int totalAttack = 0;
        for (int i = 0; i <= text.length() - 1; i++) {
            char symbol = text.charAt(i);

            if (symbol == '>') {
                int attack = Integer.parseInt(text.charAt(i + 1) + "");
                totalAttack += attack;
            } else if (symbol != '>' && totalAttack > 0) {
                text.deleteCharAt(i);
                i--;
                totalAttack--;
            }
        }
        System.out.println(text);
    }
}
