import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupPeople = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double pricePerNight = 0;
        double totalPrice = 0;
        switch (day) {
            case "Friday":
                switch (typeOfGroup) {
                    case "Students":
                        pricePerNight = 8.45;
                        break;
                    case "Business":
                        pricePerNight = 10.90;
                        break;
                    case "Regular":
                        pricePerNight = 15;
                        break;
                }
                break;
            case "Saturday":
                switch (typeOfGroup) {
                    case "Students":
                        pricePerNight = 9.80;
                        break;
                    case "Business":
                        pricePerNight = 15.60;
                        break;
                    case "Regular":
                        pricePerNight = 20;
                        break;
                }
                break;
            case "Sunday":
                switch (typeOfGroup) {
                    case "Students":
                        pricePerNight = 10.46;
                        break;
                    case "Business":
                        pricePerNight = 16;
                        break;
                    case "Regular":
                        pricePerNight = 22.50;
                        break;
                }
                break;
        }
        totalPrice = pricePerNight * groupPeople;

        if (typeOfGroup.equals("Students") && groupPeople >= 30) {
            totalPrice = totalPrice * 0.85;

        } else if (typeOfGroup.equals("Business") && groupPeople >= 100) {
            totalPrice = totalPrice - 10 * pricePerNight;
        } else if (typeOfGroup.equals("Regular") && groupPeople >= 10 && groupPeople <= 20) {
            totalPrice = totalPrice * 0.95;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
