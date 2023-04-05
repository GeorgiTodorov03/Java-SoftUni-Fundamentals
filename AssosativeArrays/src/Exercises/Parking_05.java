import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Parking_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> parkValidation = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] commandLine = scanner.nextLine().split(" ");
            String command = commandLine[0];

            switch (command) {
                case "register":
                    String user = commandLine[1];
                    String plateNumber = commandLine[2];
                    if (parkValidation.containsKey(user)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);

                    } else {
                        parkValidation.put(user, plateNumber);
                        System.out.printf("%s registered %s successfully%n", user, plateNumber);
                    }
                    break;
                case "unregister":
                     user = commandLine[1];
                    if (parkValidation.containsKey(user)) {
                        parkValidation.remove(user);
                        System.out.printf("%s unregistered successfully%n", user);

                    } else {
                        System.out.printf("ERROR: user %s not found%n", user);
                    }
                    break;
            }
        }

        for (Map.Entry<String, String> entry : parkValidation.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
