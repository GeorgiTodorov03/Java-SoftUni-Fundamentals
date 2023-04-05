import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (type) {
            case "add":
                addNumber(firstNumber, secondNumber);
                break;
            case "multiply":
                multiplyNumber(firstNumber, secondNumber);
                break;
            case "subtract":
                subtractNumber(firstNumber, secondNumber);
                break;
            case "divide":
                divideNumber(firstNumber, secondNumber);
                break;

        }
    }
        public static void addNumber(int first, int second) {
        int result = first + second;
            System.out.println(result);
        }

        public static void multiplyNumber(int firstM, int secondM) {
        int result = firstM * secondM;
            System.out.println(result);
        }

        public static void subtractNumber(int firstS, int secondS) {
        int result = firstS - secondS;
            System.out.println(result);
        }

        public static void divideNumber(int firstD, int secondD) {
        int result = firstD / secondD;
            System.out.println(result);
        }
}
