import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        //1. съдържание брой символи
        if (!isValidLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        //2. метод дали се състои само от букви и цифри
        if (!isValid(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        //3. метод да проверим дали има поне 2 символа
        if (!isValidDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidDigits(password) && isValid(password) && isValidLength(password)) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isValidLength(String pass) {
        if (pass.length() >= 6 && pass.length() <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(String pass) {
        for (char element: pass.toCharArray()) {
            if (!Character.isLetterOrDigit(element)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidDigits(String pass) {
        int count = 0;
        for (char element: pass.toCharArray()) {
            if (Character.isDigit(element)) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
