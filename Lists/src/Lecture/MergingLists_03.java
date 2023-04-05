import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> firstList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> secondList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        List<String> sumLists = new ArrayList<>();

        for (int i = 0; i <= Math.max(firstList.size(), secondList.size()); i++) {

            if (i <= firstList.size() - 1) {
                sumLists.add(firstList.get(i));
            }  if (i <= secondList.size() - 1) {
                sumLists.add(secondList.get(i));
            }
        }
        for (String element : sumLists) {
            System.out.print(element + " ");
        }
    }
}
