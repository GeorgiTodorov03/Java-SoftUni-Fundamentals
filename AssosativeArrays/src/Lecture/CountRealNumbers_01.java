import java.util.*;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays
        .stream(scanner.nextLine().split("\\s+"))
        .mapToDouble(Double::parseDouble)
        .toArray();

        Map<Double, Integer> countNumbers = new TreeMap<>();

        for (double currentNum : numbers) {
            Integer currentValue = countNumbers.get(currentNum);
            if (countNumbers.containsKey(currentNum)) {
                countNumbers.put(currentNum, currentValue + 1);
            } else {
                countNumbers.put(currentNum, 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : countNumbers.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
