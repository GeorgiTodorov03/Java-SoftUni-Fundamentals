import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        Map<String, Integer> junkItems = new LinkedHashMap<>();

        boolean isWin = false;

        while (!isWin) {
            String input = scanner.nextLine();
            String[] inputData = input.split(" ");

            for (int index = 0; index <= inputData.length - 1; index += 2) {
                int quantity = Integer.parseInt(inputData[index]);
                String material = inputData[index + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = items.get(material);

                    items.put(material, currentQuantity + quantity);
                } else {
                    if (!junkItems.containsKey(material)) {
                        junkItems.put(material, quantity);
                    } else {
                        int current = junkItems.get(material);
                        junkItems.put(material, current + quantity);
                    }
                }
                if (items.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    items.put(material, items.get("shards") - 250);
                    isWin = true;
                    break;
                }
                else if (items.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    items.put(material, items.get("fragments") - 250);
                    isWin = true;
                    break;
                }
                else if (items.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    items.put(material, items.get("motes") - 250);
                    isWin = true;
                }
            }
        }

        items.forEach((key1, value1) -> System.out.println(key1 + ": " + value1));
        junkItems.forEach((key, value) -> System.out.println(key + ": " + value));


    }
}
