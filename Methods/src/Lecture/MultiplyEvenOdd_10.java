import java.util.Scanner;

class MultiplyEvenByOdds_10 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(Integer.parseInt(scanner.nextLine()));
        int result = FindResult(num);
        System.out.println(result);
    }
    public static int FindResult(int num)
    {
        int result = FindSumOfOdds(num) * FindSumOfEvens(num);
        return result;
    }

    public static int FindSumOfOdds(int num) {

        int sumOfOdds = 0;

        while (num != 0)
        {
            int nextNum = num % 10;

            if (nextNum % 2 == 1)
            {
                sumOfOdds += nextNum;
            }
            num -= nextNum;
            num /= 10;

        }

        return sumOfOdds;
    }

   public static int FindSumOfEvens(int num) {

        int sumOfEvens = 0;
        while (num != 0)
        {
            int nextNum = num%10;

            if (nextNum % 2 == 0)
            {
                sumOfEvens += nextNum;
            }
            num -= nextNum;
            num /= 10;

        }

        return sumOfEvens;
    }
}