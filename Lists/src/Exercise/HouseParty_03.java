import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();

            if (command.contains("is going!")) {
                String[] commandParts = command.split(" ");
                if (guests.contains(commandParts[0])) {
                    System.out.println(commandParts[0] + " is already in the list!");
                } else {
                    guests.add(commandParts[0]);
                }
            } else {
                String[] commandParts2 = command.split(" ");
                if (!guests.contains(commandParts2[0])) {
                    System.out.println(commandParts2[0] + " is not in the list!");
                } else {
                guests.remove(commandParts2[0]);
                }
            }

        }
        for (String element : guests) {
            System.out.println(element);
        }
    }
}
