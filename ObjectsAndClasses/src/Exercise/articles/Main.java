package articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String article = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String title = article.split(", ")[0];
        String content = article.split(", ")[1];
        String author = article.split(", ")[2];

        Article article1 = new Article(title, content, author);

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String commandName = command.split("\\: ")[0];
            String value = command.split("\\: ")[1];



            switch (commandName) {
                case "Edit":
                    article1.edit(value);
                    break;
                case "ChangeAuthor":
                    article1.changeAuthor(value);
                    break;
                case "Rename":
                    article1.rename(value);
                    break;
            }
        }

        System.out.println(article1.toString());
    }
}
