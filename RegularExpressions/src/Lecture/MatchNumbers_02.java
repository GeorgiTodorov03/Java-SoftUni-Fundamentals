import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchNumbers_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phones = scanner.nextLine();
        String regex = "\\+359([- ])2\\1\\d{3}\\1\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher phoneMatcher = pattern.matcher(phones);

        List<String> matchedPhones = new LinkedList<>();
        while (phoneMatcher.find()) {
            matchedPhones.add(phoneMatcher.group());
        }
        System.out.println(String.join(", ", matchedPhones));
    }
}
