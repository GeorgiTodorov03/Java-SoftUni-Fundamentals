import java.util.Scanner;

public class CharInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        //правим метод който принтира всички елементи които се намират между нашите два символа
        // a, d (b, c)
        charRange(first,second);
    }

    public static void charRange(char n1, char n2) {
        if (n1 < n2) {
            for (int i = n1 + 1; i < n2; i++) {
                char currentChar = (char)i;
                System.out.print(currentChar + " ");
            }
        }
        if (n2 < n1) {
            for (int i = n2; i < n1; i++) {
                char currentChar = (char)i;
                System.out.print(currentChar + " ");
            }
        }
    }
}
