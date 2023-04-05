package article2;

import articles.Article;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());



        for (int i = 0; i < n; i++) {
            String article = scanner.nextLine();
            String title = article.split(", ")[0];
            String content = article.split(", ")[1];
            String author = article.split(", ")[2];

            Article article1 = new Article(title, content, author);

            System.out.println(article1.toString());
        }
    }
}
