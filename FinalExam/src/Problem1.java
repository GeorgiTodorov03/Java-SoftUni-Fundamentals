import java.util.Locale;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(text);

        String command = scanner.nextLine();

        while (!command.equals("End")) {


            if (command.contains("Translate")) {
                String character = command.split(" ")[1];
                String replacement = command.split(" ")[2];


                    if (textBuilder.toString().contains(character)) {
                        String translateText = textBuilder.toString().replace(character, replacement);
                        textBuilder = new StringBuilder(translateText);
                    }
                System.out.println(textBuilder);

            } else if (command.contains("Includes")) {
                String substring = command.split(" ")[1];

                if (textBuilder.toString().contains(substring)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }


            } else if (command.contains("Start")) {
                String substring = command.split(" ")[1];

                if (textBuilder.indexOf(substring) == 0) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (command.contains("Lowercase")) {
                String lowerCaseText = textBuilder.toString().toLowerCase(Locale.ROOT);
                textBuilder = new StringBuilder(lowerCaseText);
                System.out.println(textBuilder);

            } else if (command.contains("FindIndex")) {
                String letter = command.split(" ")[1];

                System.out.println(textBuilder.lastIndexOf(letter));

            }
            else if (command.contains("Remove")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int count = Integer.parseInt(command.split(" ")[2]);

                for (int i = 0; i < count; i++) {
                    textBuilder.deleteCharAt(startIndex);
                }
                System.out.println(textBuilder);
            }




            command = scanner.nextLine();
        }
    }
}
