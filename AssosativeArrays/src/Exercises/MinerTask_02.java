import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        Map<String, Integer> resourceCount = new LinkedHashMap<>();

        while (!resource.equals("stop")) {
            String value = scanner.nextLine();
            Integer currentValue = Integer.parseInt(value);

            if (!resourceCount.containsKey(resource)) {
                resourceCount.put(resource, currentValue);
            } else {
                resourceCount.put(resource, resourceCount.get(resource) + currentValue);
            }
            resource = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourceCount.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
