import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer :: parseInt)
                                .collect(Collectors.toList());

        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer :: parseInt)
                                .collect(Collectors.toList());


        while (firstDeck.size() != 0 && secondDeck.size() != 0) {
            int firstDeckCard = firstDeck.get(0);
            int secondDeckCard = secondDeck.get(0);
            firstDeck.remove(0);
            secondDeck.remove(0);

            if (firstDeckCard > secondDeckCard) {
                firstDeck.add(firstDeckCard);
                firstDeck.add(secondDeckCard);
            } else if (firstDeckCard < secondDeckCard) {
                secondDeck.add(secondDeckCard);
                secondDeck.add(firstDeckCard);
            }
        }

        if (firstDeck.size() == 0) {
            System.out.printf("Second player wins! Sum: %d", cardSum(secondDeck));
        } else if (secondDeck.size() == 0) {
            System.out.printf("First player wins! Sum: %d", cardSum(firstDeck));
        }

    }
    public static int cardSum (List<Integer> cards) {
        int sum = 0;
        for (int element : cards) {
            sum += element;
        }
        return sum;
    }
}
