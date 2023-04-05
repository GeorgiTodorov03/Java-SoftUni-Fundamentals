import java.util.Scanner;

public class Orders_05 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String product = scanner.nextLine();
            int quantity = Integer.parseInt(scanner.nextLine());

            switch (product) {
                case "coffee":
                    addNumber(quantity);
                    break;
                case "water":
                    multiplyNumber(quantity);
                    break;
                case "coke":
                    subtractNumber(quantity);
                    break;
                case "snacks":
                    divideNumber(quantity);
                    break;

            }
        }
        public static void addNumber(int coffeeQuantity) {
            double result = coffeeQuantity * 1.50;
            System.out.printf("%.2f", result);
        }

        public static void multiplyNumber(int waterQuantity) {
            double result = waterQuantity * 1.00;
            System.out.printf("%.2f", result);
        }

        public static void subtractNumber(int cokeQuantity) {
            double result = cokeQuantity * 1.40;
            System.out.printf("%.2f", result);
        }

        public static void divideNumber(int snacksQuantity) {
            double result = snacksQuantity * 2.00;
            System.out.printf("%.2f", result);
        }
    }


