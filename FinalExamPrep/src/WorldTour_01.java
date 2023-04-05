import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();
        StringBuilder stopsBuilder = new StringBuilder(stops);

        String command = scanner.nextLine();

        while (!command.equals("Travel")) {

            if (command.contains("Add Stop")) {
                int index = Integer.parseInt(command.split(":")[1]);
                String stopAdd = command.split(":")[2];

                if (validIndex(index, stopsBuilder)) {
                    stopsBuilder.insert(index, stopAdd);
                }

            } else if (command.contains("Remove Stop")) {
                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);

                if (validIndex(startIndex, stopsBuilder) && validIndex(endIndex, stopsBuilder)) {
                    stopsBuilder.delete(startIndex, endIndex + 1);
                }


            } else if (command.contains("Switch")) {
                String oldStop = command.split(":")[1];
                String newStop = command.split(":")[2];

                if (stopsBuilder.toString().contains(oldStop)) {
                    String updatedStops = stopsBuilder.toString().replace(oldStop, newStop);
                    stopsBuilder = new StringBuilder(updatedStops);
                }

            }

            System.out.println(stopsBuilder);
            command = scanner.nextLine();
        }

        System.out.println("Ready for world tour! Planned stops: " + stopsBuilder);
    }

    public static boolean validIndex (int index, StringBuilder stops) {

        return index >= 0 && index <= stops.length() - 1;
    }
}
