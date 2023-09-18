package Game.Board;

import java.util.Scanner;
import java.util.ArrayList;

public class Board {

    static ArrayList<Integer> boards = new ArrayList<>();
    Scanner clavier = new Scanner(System.in);

    /**
     * Génère le plateau
     * @case à implémenter
     */
    public Board() {
        System.out.println("choisissez le nombre de cases");
        int choice = clavier.nextInt();
        for (int i= 0; i<choice; i++){
            boards.add(i) ;
        }
    }

    public static int boardSize() {
        int boardSize = boards.size();
        return boardSize;
    }
}

