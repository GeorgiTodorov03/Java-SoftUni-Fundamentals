import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Double> products = new LinkedHashMap<>();
        Map<String, Integer> listedProducts = new LinkedHashMap<>();
        while (!input.equals("buy")) {
            String[] inputData = input.split(" ");
            String product = inputData[0];
            double price = Double.parseDouble(inputData[1]);
            int quantity = Integer.parseInt(inputData[2]);

            if (!products.containsKey(product)) {
                products.put(product, price * quantity);
                listedProducts.put(product, quantity);
            } else {
                listedProducts.put(product, listedProducts.get(product) +  quantity);
                products.put(product, listedProducts.get(product) * price);
            }


            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }

    }
}
