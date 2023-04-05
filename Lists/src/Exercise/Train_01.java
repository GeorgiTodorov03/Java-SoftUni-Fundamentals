import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" ")).map(Integer :: parseInt).collect(Collectors.toList());
        int maxCapacityPer1Wagon = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            List<String> command = Arrays.stream(input.split(" ")).collect(Collectors.toList());

            if (command.get(0).equals("Add")) {
                int wagon = Integer.parseInt(command.get(1));
                wagons.add(wagon);
            } else {
                for (int i = 0; i <= wagons.size() - 1; i++) {
                    int passengers = Integer.parseInt(input);

                    if (passengers + wagons.get(i) <= maxCapacityPer1Wagon) {
                        wagons.set(i, passengers + wagons.get(i));
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }

        for (int element : wagons) {
            System.out.print(element + " ");
        }
    }
}
