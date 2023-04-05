import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cards = Arrays.stream(scanner.nextLine().split(", "))
                               .collect(Collectors.toList());

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            List<String> commandLine = Arrays.stream(scanner.nextLine().split(", "))
                                   .collect(Collectors.toList());
            String command = commandLine.get(0);

            switch (command) {
                case "Add":
                    String typeCard = commandLine.get(1);
                    if (cards.contains(typeCard)) {
                        System.out.println("Card is already in the deck");
                    } else {
                        cards.add(typeCard);
                        System.out.println("Card successfully added");

                    }
                    break;
                case "Remove At":
                    int index = Integer.parseInt(commandLine.get(1));
                        if (index > 0 && index <= cards.size() - 1) {
                            cards.remove(index);
                            System.out.println("Card successfully removed");
                        }
                        else {
                            System.out.println("Index out of range");
                        }
                        break;
                case "Remove":
                        String card = commandLine.get(1);
                        if (cards.contains(card)) {
                            cards.remove(card);
                            System.out.println("Card successfully removed");
                        } else {
                            System.out.println("Card not found");
                        }
                    break;
                case "Insert":
                    int indexInsert = Integer.parseInt(commandLine.get(1));
                    String theCard = commandLine.get(2);

                    if (validIndex(indexInsert,cards) && cards.contains(theCard)) {
                        System.out.println("Card is already added");
                    } else if (validIndex(indexInsert,cards)) {
                        cards.add(indexInsert, theCard);
                        System.out.println("Card successfully added");
                    } else {
                        System.out.println("Index out of range");
                    }
                    break;
            }
        }

        System.out.println(String.join(", ", cards));
    }

    public static boolean validIndex (int index, List<String> cards) {

        return index >= 0 && index <= cards.size() - 1;
    }
}
