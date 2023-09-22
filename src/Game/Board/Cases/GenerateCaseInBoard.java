package Game.Board.Cases;

import Game.InputScanner;
import Game.Board.Play.Game;
import Personnage.Personnage;

import java.util.ArrayList;

public class GenerateCaseInBoard {
    EventCaseEnemy monster = new EventCaseEnemy();
    EventCaseDefenseLoot defLoot = new EventCaseDefenseLoot();
    EventCaseAttackLoot attLoot = new EventCaseAttackLoot();
    ArrayList<Object> plateaux = new ArrayList<>();
    int boardSize;

    public GenerateCaseInBoard(Personnage current) {
        System.out.println("choisissez le nombre de cases");
        int choice = new InputScanner().intInputScanner();
        boardSize = choice;
        if (choice >= 20 && choice <= 100) {
            for (int i = 0; i < choice; i++) {
                plateaux.add(i);
                setEventAtBoard(i);
            }
            System.out.println("Le plateau de " + choice + " cases a été généré.");

            int playerPosition = 1;
            Game start = new Game();
            start.playTurn(playerPosition, boardSize, current, plateaux);
        } else {
            System.out.println("Merci de choisir une taille de plateau valide (20 à 100)");
            new GenerateCaseInBoard(current);
        }
    }

    public void setEventAtBoard(int i) {
        int max = 5;
        int min = 1;
        int range = max - min + 1;
        int ramdomEvent = (int) (Math.random() * range) + min;

        if (ramdomEvent == 1) {
            plateaux.set(i, monster.generateMonster());
        }
        if (ramdomEvent == 2) {
            plateaux.set(i, attLoot.generateAttackLoot());
        }
        if (ramdomEvent == 3) {
            plateaux.set(i, defLoot.generateDefenseLoot());
        }
        if (ramdomEvent == 4) {
            plateaux.set(i, new EventCaseHealth());
        }
        if (ramdomEvent == 5) {
            plateaux.set(i, new EventCaseNothing());
        }
    }
}