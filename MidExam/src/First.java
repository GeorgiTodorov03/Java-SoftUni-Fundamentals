import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double waterPerDay = Double.parseDouble(scanner.nextLine());
        double foodPerDay = Double.parseDouble(scanner.nextLine());

        double totalWater = days * people * waterPerDay;
        double totalFood = days * people * foodPerDay;


        int foodDayCount = 0;
        int waterDayCount = 0;
        for (int i = 1; i <= days; i++) {
            double energyLoss = Double.parseDouble(scanner.nextLine());
            energy -= energyLoss;
            if (energy <= 0.0) {
                break;
            }

            waterDayCount++;
            if (waterDayCount >= 2) {
                energy += energy * 0.05;
                totalWater -= totalWater * 0.3;
                waterDayCount = 0;
            }

            foodDayCount++;
            if (foodDayCount >= 3) {
                totalFood -= totalFood / people;
                energy += energy * 0.1;
                foodDayCount = 0;
            }
        }

        if (energy >= 1) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energy);
        } else {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", totalFood, totalWater);
        }
    }
}
