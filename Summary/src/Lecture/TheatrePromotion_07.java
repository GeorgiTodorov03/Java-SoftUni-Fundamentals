import java.util.Scanner;

public class TheatrePromotion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;
        switch (typeDay) {
            case "Weekday":
                if (0 <= age && age <= 18) {
                    price = 12;
                } if (age > 18 && age <= 64) {
                    price = 18;
            } if (age > 64 && age <= 122) {
                    price = 12;
            }
                break;
            case "Weekend":
                if (0 <= age && age <= 18) {
                    price = 15;
                } if (age > 18 && age <= 64) {
                price = 20;
            } if (age > 64 && age <= 122) {
                price = 15;
            }
                break;
            case "Holiday":
                if (0 <= age && age <= 18) {
                    price = 5;
                } if (age > 18 && age <= 64) {
                price = 12;
            } if (age > 64 && age <= 122) {
                price = 10;
            }
                break;

            default:
                System.out.println("Error!");
                break;
        }
        if (age < 0 || age > 122) {
            System.out.println("Error!");
        } else {
            System.out.printf("%d$", price);
        }

    }
}
