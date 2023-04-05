import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            List<String> commandLine = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = commandLine.get(0);

            switch (command) {
                case "Contains":
                    int contains = Integer.parseInt(commandLine.get(1));
                    if (numbers.contains(contains)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commandLine.get(1).equals("even")) {
                        List<Integer> evens = new ArrayList<>();
                        for (int element : numbers) {
                            if (element % 2 == 0) {
                                evens.add(element);
                            }
                        }
                        for (int element: evens) {
                            System.out.print(element + " ");
                        }
                        System.out.println();
                    } else {
                        List<Integer> odds = new ArrayList<>();
                        for (int element: numbers) {
                            if (element % 2 == 1) {
                                odds.add(element);
                            }
                        }
                        for (int element: odds) {
                            System.out.print(element + " ");
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    if (commandLine.get(1).equals("sum")) {
                        int sum = 0;

                        for (int element: numbers) {
                            sum += element;
                        }
                        System.out.println(sum);
                    }
                    break;
                case "Filter":
                    int numFilter = Integer.parseInt(commandLine.get(2));
                    if (commandLine.get(1).equals("<")) {
                        for (int element : numbers) {
                            if (element < numFilter) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandLine.get(1).equals(">")) {
                        for (int element : numbers) {
                            if (element > numFilter) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandLine.get(1).equals(">=")) {
                        for (int element : numbers) {
                            if (element >= numFilter) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    } else {
                        for (int element : numbers) {
                            if (element <= numFilter) {
                                System.out.print(element + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }



            input = scanner.nextLine();
        }
    }
}
