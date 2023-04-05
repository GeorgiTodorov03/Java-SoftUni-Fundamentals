import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String places = scanner.nextLine();
        String regex = "(=|\\/)(?<destination>[A-Z][A-Za-z]{2,})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(places);

        int travelPoints = 0;
        List<String> listDestinations = new ArrayList<>();

        while (matcher.find()) {
            String destination = matcher.group("destination");
            travelPoints += destination.length();
            listDestinations.add(destination);
        }

        System.out.printf("Destinations: %s%n",String.join(", ", listDestinations));
        System.out.printf("Travel Points: %d", travelPoints);
    }
}
