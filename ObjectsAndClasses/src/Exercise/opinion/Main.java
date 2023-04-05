package opinion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<People> peoples = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String person = scanner.nextLine();
            String name = person.split(" ")[0];
            int age = Integer.parseInt(person.split(" ")[1]);

            if (age > 30) {
                People people = new People(name, age);
                peoples.add(people);
            }
        }
        for (People people : peoples) {
            System.out.println(people.getName() + " - " + people.getAge());
        }

    }
}
