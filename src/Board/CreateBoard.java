package Board;

import Menu.Menu.InputScanner;

import java.util.ArrayList;

public class CreateBoard {
    ArrayList<String> plateaux = new ArrayList<>();

    GenerateCaseInBoard generateCase = new GenerateCaseInBoard();

    /**
     * Retourne le tableau
     */
    public ArrayList<String> generateBoard() {
        System.out.println("choisissez le nombre de cases");
        int choice = new InputScanner().intInputScanner();
        if (choice >= 20 && choice <= 100) {
            for (int i = 0; i < choice; i++) {
                if (i == 1) {
                    plateaux.add("Start");
                } else if (i == (choice - 1)) {
                    plateaux.add("Win");
                } else if (i == 0) {
                    plateaux.add("Game");
                } else {
                    plateaux.add(generateCase.generateCaseInBoard());
                }
            }
        } else {
            System.out.println("Merci de choisir une taille de plateau valide (20 à 100)");
            generateBoard();
        }
        return plateaux;
    }
}