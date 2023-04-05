import java.util.Scanner;

public class ActivationKey_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(text);

        String command = scanner.nextLine();

        while (!command.equals("Generate")) {

            if (command.contains("Contains")) {
                String substring = command.split(">>>")[1];

                if (textBuilder.toString().contains(substring)) {
                    System.out.println(textBuilder + " contains " + substring);
                } else {
                    System.out.println("Substring not found!");
                }

            } else if (command.contains("Flip")) {
                int startIndex = Integer.parseInt(command.split(">>>")[2]);
                int endIndex = Integer.parseInt(command.split(">>>")[3]);

                if (command.contains("Upper")) {
                for (int i = startIndex; i < endIndex; i++) {
                    textBuilder.setCharAt(i, Character.toUpperCase(textBuilder.charAt(i)));
                }

                    System.out.println(textBuilder);
                } else if (command.contains("Lower")) {
                    for (int i = startIndex; i < endIndex; i++) {
                        textBuilder.setCharAt(i, Character.toLowerCase(textBuilder.charAt(i)));
                    }

                    System.out.println(textBuilder);
                }

            } else if (command.contains("Slice")) {
                int startIndex = Integer.parseInt(command.split(">>>")[1]);
                int endIndex = Integer.parseInt(command.split(">>>")[2]);

                textBuilder.delete(startIndex, endIndex);
                System.out.println(textBuilder);
            }



            command = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s", textBuilder);
    }
}
