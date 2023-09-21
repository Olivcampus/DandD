package Game.Board.Cases;

import Personnage.Personnage;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateCaseInBoard {
    Scanner clavier = new Scanner(System.in);
    ArrayList<?> plateaux = new ArrayList<>();
     int boardSize;

    public GenerateCaseInBoard() {
        System.out.println("choisissez le nombre de cases");
        int choice = clavier.nextInt();
        boardSize = choice;
        for (int i = 0; i < choice; i++) {
            int ramdomEvent = 1 + (int) (Math.random() * ((6 - 1) + 1));
            plateaux.add(switch (ramdomEvent) {
                case 1: generateMonster();
                case 2: generateAttackLoot();
                case 3: generateDefenseLoot();
                case 4: eventCaseAddHealth();
                default: System.out.println("il ne se passe rien");
            });
        }
    }
    public void boardSize( int boardSize){
        this.boardSize = boardSize;
    }
}