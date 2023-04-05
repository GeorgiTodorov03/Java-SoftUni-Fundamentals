import java.util.Scanner;

public class VowelCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toLowerCase();

        //правим метод който да брои колко гласни букви имаме в думата
        System.out.println(vowelCount(word));
    }

    public static int vowelCount(String word) {
        int count = 0;

        for (char element: word.toCharArray()) {
            if (element == 'a' || element == 'e' || element == 'o' || element == 'i' || element == 'u') {
                count++;
            }
        }
        return count;
    }
}
