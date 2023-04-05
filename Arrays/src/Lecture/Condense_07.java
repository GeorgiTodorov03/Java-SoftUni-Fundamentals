import java.util.Arrays;
import java.util.Scanner;

public class Condense_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();



        while (numArr.length > 1) {

            int[] condensed = new int[numArr.length - 1];
            for (int index = 0; index < numArr.length - 1; index++) {
                condensed[index] = numArr[index] + numArr[index + 1];

            }
            numArr = condensed;
        }
        System.out.println(numArr[0]);
    }
}
