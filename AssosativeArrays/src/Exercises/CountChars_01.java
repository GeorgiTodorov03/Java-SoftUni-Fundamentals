import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> symbolCount = new LinkedHashMap<>();


        for (char symbol : text.toCharArray()) {

            if (symbol == ' ') {
                continue;

            }
            if (symbolCount.containsKey(symbol)) {
                Integer currentCount = symbolCount.get(symbol);
                symbolCount.put(symbol, currentCount + 1);

            } else {
                symbolCount.put(symbol, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : symbolCount.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());

        }

    }
}
