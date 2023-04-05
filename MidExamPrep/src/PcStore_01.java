import java.util.Scanner;

public class PcStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String price = scanner.nextLine();

        double priceNoTaxes = 0;

        while (!price.equals("special") && !price.equals("regular")) {
            double currentPrice = Double.parseDouble(price);

            if (currentPrice <= 0) {
                System.out.println("Invalid price!");
                price = scanner.nextLine();
                continue;
            }

            priceNoTaxes += currentPrice;

            price = scanner.nextLine();
        }

        if (priceNoTaxes <= 0) {
            System.out.println("Invalid order!");

        } else {
            double taxes = priceNoTaxes * 0.20;
            double finalPrice = priceNoTaxes + taxes;

            if (price.equals("special")) {
                finalPrice = finalPrice * 0.90;
            }

            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", priceNoTaxes);
            System.out.printf("Taxes: %.2f$%n", taxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", finalPrice);
        }
    }
}
