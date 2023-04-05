import java.util.Scanner;

public class MiddleChar_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        //метод който принтира средните символи
        // ако е нечетна думата един символ и е равен на дължината / 2
        middleChar(text);
    }

    public static void middleChar(String word) {
        if (word.length() % 2 == 1) {
            int middle = word.length() / 2;
            System.out.println(word.charAt(middle));
        } else {
            int firstMid = word.length() / 2 - 1;
            int secondMid = word.length() / 2;
            System.out.print(word.charAt(firstMid) + "" + word.charAt(secondMid));
        }
    }
}
