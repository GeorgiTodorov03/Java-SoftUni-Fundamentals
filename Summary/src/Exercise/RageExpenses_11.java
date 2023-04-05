import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //headset, mouse, keyboard, and display
        int gamesLost = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCount = gamesLost / 2;
        int mouseCount = gamesLost / 3;
        int keyboardCount = gamesLost / 6;
        int displayCount = gamesLost / 12;

        //сума за слушалки = бр. слушалки * headsetPrice
        //сума за мишки = бр. мишки * mousePrice
        //сума за клавиатури = бр. клавиатури * keyboardPrice
        //сума за монитори = бр. монитори * displayPrice
        //обща сума = сума за слушалки + сума за мишки + сума за клавиатура + сума за монитори
        double totalSum = (headsetCount * headsetPrice) + (mouseCount * mousePrice) + (keyboardCount * keyboardPrice) + (displayCount * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.", totalSum);
    }
}
