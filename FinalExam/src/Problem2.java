import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String boss = scanner.nextLine();

            String regex = "\\|(?<bossName>[A-Z]+)\\|:#(?<title>[A-Z]*[a-z]+ [A-Z]*[a-z]+)#";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(boss);

            if (matcher.find()) {
                String bossName = matcher.group("bossName");
                String title = matcher.group("title");
                int strength = bossName.length();
                int armor = title.length();

                System.out.printf("%s, The %s%n", bossName, title);
                System.out.printf(">> Strength: %d%n", strength);
                System.out.printf(">> Armor: %d%n", armor);
            }
            else {
                System.out.println("Access denied!");
            }
        }
    }
}
