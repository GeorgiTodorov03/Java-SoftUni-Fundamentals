import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordsArr = Arrays.stream(scanner.nextLine().split(" "))
                               .collect(Collectors.toList());

        Random rnd = new Random();
        while (!wordsArr.isEmpty()) {
            int random = rnd.nextInt(wordsArr.size());
            String word = wordsArr.get(random);
            System.out.println(word);
            wordsArr.remove(random);
        }
    }
}
