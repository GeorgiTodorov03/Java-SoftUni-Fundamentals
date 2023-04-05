import java.util.Scanner;

public class RectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int area = Area(width, length);
        System.out.println(area);
    }

    public static int  Area(int width, int length) {

        return width * length;
    }
}
