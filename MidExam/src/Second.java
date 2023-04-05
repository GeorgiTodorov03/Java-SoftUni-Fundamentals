import java.util.Arrays;
import java.util.Scanner;


public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] commands = scanner.nextLine().split("\\|\\|");
        int fuel = Integer.parseInt(scanner.nextLine());
        int ammo = Integer.parseInt(scanner.nextLine());


        boolean noFuel = false;
        boolean reachedDestination = false;
        for (int i = 0; i <= commands.length - 1; i++) {

            String[] commandLine = commands[i].split(" ");
            String command = commandLine[0];

            switch (command) {
                case "Travel":
                    int value = Integer.parseInt(commandLine[1]);
                    fuel -= value;
                    if (fuel < 0) {
                        noFuel = true;

                    } else {
                        System.out.printf("The spaceship travelled %d light-years.%n", value);
                    }

                    break;
                case "Enemy":
                    int armor = Integer.parseInt(commandLine[1]);

                    if (ammo >= armor) {
                        ammo -= armor;
                        System.out.printf("An enemy with %d armour is defeated.%n", armor);
                    } else {
                        int reducedArmor = armor - ammo;
                        fuel -= reducedArmor * 2;
                        if (fuel > 0) {
                            System.out.printf("An enemy with %d armour is outmaneuvered.%n", armor);
                        } else {
                            noFuel = true;
                        }
                    }
                    break;
                case "Repair":
                    int valueAdd = Integer.parseInt(commandLine[1]);
                    int addedFuel = valueAdd;
                    int addedAmmo = valueAdd * 2;
                    fuel += addedFuel;
                    ammo += addedAmmo;

                    System.out.printf("Ammunitions added: %d.%n", addedAmmo);
                    System.out.printf("Fuel added: %d.%n", addedFuel);
                    break;
                default:
                    reachedDestination = true;
                    break;

            }
            if (noFuel) {
                System.out.println("Mission failed.");
                break;
            }
            if (reachedDestination) {
                System.out.println("You have reached Titan, all passengers are safe.");
            }
        }
    }
}
