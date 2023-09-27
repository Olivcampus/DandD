package Game.Board;

import Game.Menu.InputScanner;

import java.util.ArrayList;

public class CreateBoard {
    ArrayList<Integer> plateaux = new ArrayList<>();
    int boardSize;

    public ArrayList<Integer> generateBoard() {
        System.out.println("choisissez le nombre de cases");
        int choice = new InputScanner().intInputScanner();
        boardSize = choice;
        if (choice >= 20 && choice <= 100) {
            for (int i = 0; i < choice; i++) {
                plateaux.add(i);
            }
        } else {
            System.out.println("Merci de choisir une taille de plateau valide (20 à 100)");
            generateBoard();
        }
        return plateaux;
    }
}
