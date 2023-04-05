import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strArr = scanner.nextLine().split(" ");
        List<String> repeatList = new ArrayList<>();

        for (int i = 0; i <= strArr.length - 1; i++) {
            String currentWord = strArr[i];
            int len = currentWord.length();

            String repeatWord = repeatArr(currentWord, len);
            repeatList.add(repeatWord);
        }

        System.out.println(String.join("", repeatList));
    }

    public static String repeatArr (String s, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += s;
        }
        return result;
    }
}
