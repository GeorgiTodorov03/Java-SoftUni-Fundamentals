import java.util.*;
import java.util.stream.Collectors;

public class ListProducts_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> vegetables = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            vegetables.add(product);
        }
        Collections.sort(vegetables);

        for (int i = 0; i < n; i++) {
            System.out.printf("%d%s%n",i + 1, vegetables.get(i));
        }
    }
}
