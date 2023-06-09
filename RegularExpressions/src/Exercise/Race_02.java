import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names = scanner.nextLine();
        List<String> racersNames = Arrays.stream(names.split(", ")).collect(Collectors.toList());

        Map<String, Integer> racersDistance = new LinkedHashMap<>();
        racersNames.forEach(name -> racersDistance.put(name, 0));

        String regexLetter = "[A-Za-z]+";
        Pattern patternLetter = Pattern.compile(regexLetter);

        String regexDigit = "[0-9]";
        Pattern patternDigit = Pattern.compile(regexDigit);

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {

            StringBuilder nameBuilder = new StringBuilder();
            Matcher matcherLetter = patternLetter.matcher(input);

            while (matcherLetter.find()) {
                nameBuilder.append(matcherLetter.group());
            }

            int distance = 0;
            Matcher matcherDigit = patternDigit.matcher(input);

            while (matcherDigit.find()) {
                distance += Integer.parseInt(matcherDigit.group());
            }

            String racerName = nameBuilder.toString();
            if (racersDistance.containsKey(racerName)) {
                int currentDistance = racersDistance.get(racerName);
                racersDistance.put(racerName, currentDistance + distance);
            }


            input = scanner.nextLine();
        }

        List<String> nameFirstThree = racersDistance.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(3).map(entry -> entry.getKey()).collect(Collectors.toList());

        System.out.println("1st place: " + nameFirstThree.get(0));
        System.out.println("2nd place: " + nameFirstThree.get(1));
        System.out.println("3rd place: " + nameFirstThree.get(2));
    }
}
