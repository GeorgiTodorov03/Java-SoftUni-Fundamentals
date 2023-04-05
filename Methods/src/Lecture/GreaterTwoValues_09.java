import java.util.Scanner;

public class GreaterTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type) {
            case "int":
                int firstNumber = Integer.parseInt(scanner.nextLine());
                int secondNumber = Integer.parseInt(scanner.nextLine());
                int resultI = getMax(firstNumber, secondNumber);
                System.out.println(resultI);
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                char resultC = getMax(firstChar, secondChar);
                System.out.println(resultC);
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                String resultS = getMax(firstString, secondString);
                System.out.println(resultS);
                break;
        }
    }

    public static int getMax(int firstI, int secondI) {
        if (firstI > secondI) {
            return firstI;
        } else {
        return secondI;
        }
    }

    public static char getMax(char firstC, char secondC) {
        if (firstC > secondC) {
            return firstC;
        } else {
            return secondC;
        }
    }

    public static String getMax(String firstS, String secondS) {
        if (firstS.compareTo(secondS) > 0) {
            return firstS;
        } else {
            return secondS;
        }
    }
}
