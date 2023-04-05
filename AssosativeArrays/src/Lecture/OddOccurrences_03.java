import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<String, Integer> countWords = new LinkedHashMap<>();

        for (int i = 0; i <= words.length - 1; i++) {
            String currentWord = words[i].toLowerCase();
            Integer count = countWords.get(currentWord);
            if (countWords.containsKey(currentWord)) {
                countWords.put(currentWord, count + 1);
            } else {
                countWords.put(currentWord, 1);
            }
        }

        List<String> oddWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countWords.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                oddWords.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", oddWords));
    }
}
