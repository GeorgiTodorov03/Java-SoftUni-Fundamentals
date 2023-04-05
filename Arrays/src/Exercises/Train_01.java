import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= wagons; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            sum += people;
            System.out.printf(people + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
