import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWords : banWordsArr) {
            if (text.contains(banWords)) {
                text = text.replace(banWords, repeatArr("*", banWords.length()));
            }
        }
        System.out.println(text);
    }

    public static String repeatArr (String s, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
         result += s;
        }
        return result;
    }
}
