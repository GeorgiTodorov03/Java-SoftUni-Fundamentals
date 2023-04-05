import java.util.*;

public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pieces = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> pieceMap = new LinkedHashMap<>();

        for (int i = 0; i <= pieces - 1; i++) {
            String piecesData = scanner.nextLine();
            String[] piecePart = piecesData.split("\\|");
            String pieceName = piecePart[0];
            String composer = piecePart[1];
            String tone = piecePart[2];

            List<String> pieceInfo = new ArrayList<>();

            pieceInfo.add(composer);
            pieceInfo.add(tone);
            pieceMap.put(pieceName, pieceInfo);
        }

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {

            if (command.contains("Add")) {
                String pieceName = command.split("\\|")[1];
                String composer = command.split("\\|")[2];
                String tone = command.split("\\|")[3];

                if (pieceMap.containsKey(pieceName)) {
                    System.out.println(pieceName + " is already in the collection!");

                } else {
                    List<String> addList = new ArrayList<>();
                    addList.add(composer);
                    addList.add(tone);
                    pieceMap.put(pieceName, addList);
                    System.out.printf("%s by %s in %s added to the collection!%n", pieceName, composer, tone);
                }

            } else if (command.contains("Remove")) {
                String removePiece = command.split("\\|")[1];

                if (pieceMap.containsKey(removePiece)) {
                    pieceMap.remove(removePiece);
                    System.out.println("Successfully removed " + removePiece + "!");
                } else {
                    System.out.println("Invalid operation! " + removePiece + " does not exist in the collection.");
                }

            } else if (command.contains("ChangeKey")) {
                String pieceName = command.split("\\|")[1];
                String newKey = command.split("\\|")[2];

                if (pieceMap.containsKey(pieceName)) {
                    List<String> currentInfo = pieceMap.get(pieceName);
                    currentInfo.remove(1);
                    currentInfo.add(newKey);
                    pieceMap.put(pieceName, currentInfo);
                    System.out.printf("Changed the key of %s to %s!%n", pieceName, newKey);
                } else {
                    System.out.println("Invalid operation! " + pieceName + " does not exist in the collection.");
                }

            }



            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : pieceMap.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }


    }
}
