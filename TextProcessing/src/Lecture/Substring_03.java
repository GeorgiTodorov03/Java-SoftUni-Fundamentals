import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String removeWord = scanner.nextLine();
        String text = scanner.nextLine();


        int index = text.indexOf(removeWord);
        while (text.contains(removeWord)) {
            text = text.replace(removeWord, "");
            index = text.indexOf(removeWord);
        }
        System.out.println(text);
    }
}
