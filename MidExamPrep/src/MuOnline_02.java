import java.util.Scanner;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rooms = scanner.nextLine().split("\\|");
        int health = 100;
        int bitcoins = 0;
        int count = 0;
        boolean isDead = false;

        for (int i = 0; i <= rooms.length - 1; i++) {

            String[] currentRoom = rooms[i].split(" ");

            switch (currentRoom[0]) {
                case "potion":
                    int digitHeal = Integer.parseInt(currentRoom[1]);
                    int diff = 100 - health;
                    health = health + digitHeal;
                    if (health > 100) {
                        health = 100;
                        digitHeal = diff;
                    }
                    count++;
                    System.out.printf("You healed for %d hp.%n", digitHeal);
                    System.out.printf("Current health: %d hp.%n", health);

                    break;
                case "chest":
                    int foundBitCoin = Integer.parseInt(currentRoom[1]);
                    bitcoins += foundBitCoin;
                    count++;

                    System.out.printf("You found %d bitcoins.%n", foundBitCoin);
                    break;
                default:
                    int damage = Integer.parseInt(currentRoom[1]);
                    health -= damage;
                    count++;

                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", currentRoom[0]);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", currentRoom[0]);
                        System.out.printf("Best room: %d", count);
                        isDead = true;
                        break;
                    }
                    break;

            }
            if (isDead) {
                break;
            }
        }
        if (!isDead) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", health);
        }

    }
}
