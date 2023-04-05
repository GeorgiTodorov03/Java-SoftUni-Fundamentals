import java.util.*;

public class Problem3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> dictionary = new LinkedHashMap<>();
        String[] input = scanner.nextLine().split("\\s+\\|\\s+");

        for(String wordAndDef : input) {

            String[] definitions = wordAndDef.split("\\s*:\\s*");
            dictionary.putIfAbsent(definitions[0], new ArrayList<>());

            for (int i = 1; i < definitions.length; i++) {
                dictionary.get(definitions[0]).add(definitions[i]);
            }
        }
        String[] print = scanner.nextLine().split("\\s*\\|\\s*");
        String output = scanner.nextLine();
        if ("Test".equals(output)) {

            for (String printWordDef : print) {
                if (dictionary.containsKey(printWordDef)) {
                    System.out.println(printWordDef + ":");
                    dictionary.get(printWordDef).forEach(e -> System.out.printf(" -%s%n", e));
                }
            }
        }

        if("Hand Over".equals(output)) {
            dictionary.forEach((key, value) -> System.out.printf("%s ", key));

        }

    }
}