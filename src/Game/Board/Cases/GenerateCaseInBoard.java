package Game.Board.Cases;

import Game.InputScanner;
import Game.Board.Play.Game;
import Personnage.Personnage;

import java.util.ArrayList;

public class GenerateCaseInBoard implements CreateCases {
    int boardSize;
    EventCaseEnemy monster = new EventCaseEnemy();
    EventCaseAttackLoot attLoot = new EventCaseAttackLoot();
    EventCaseDefenseLoot defLoot = new EventCaseDefenseLoot();

    ArrayList<CreateCases> plateaux = new ArrayList<>();

    public GenerateCaseInBoard(Personnage current) {
        System.out.println("choisissez le nombre de cases");
        int choice = new InputScanner().intInputScanner();
        boardSize = choice;
        System.out.println(choice);
        if (choice >= 20 && choice <= 100) {

            for (int i = 0; i < choice; i++) {
                plateaux.add(setEventAtBoard());

            }
            int playerPosition = 1;
            Game start = new Game();
            start.playTurn(playerPosition, boardSize, current, plateaux);
        } else {
            System.out.println("Merci de choisir une taille de plateau valide (20 à 100)");
            new GenerateCaseInBoard(current);
        }
        System.out.println("Le plateau de " + choice + " cases a été généré.");

    }


    public CreateCases setEventAtBoard() {
        int ramdomEvent = 1 + (int) (Math.random() * ((5 - 1) + 1));
            if (ramdomEvent == 1) {
                plateaux.add(generateMonster());
            } else if (ramdomEvent == 2) {
                plateaux.add(generateAttackLoot());
            } else if (ramdomEvent == 3) {
                plateaux.add(generateDefenseLoot());
            } else if (ramdomEvent == 4) {
                plateaux.add((CreateCases) new EventCaseNothing());
            } else if (ramdomEvent == 5) {
                plateaux.add((CreateCases) new EventCaseHealth());
            }
        System.out.println(plateaux);


        return (CreateCases) plateaux;
    }

    @Override
    public CreateCases generateMonster() {

        return monster.generateMonster();
    }

    @Override
    public CreateCases generateAttackLoot() {

        return attLoot.generateAttackLoot();
    }

    @Override
    public CreateCases generateDefenseLoot() {
        return defLoot.generateDefenseLoot();
    }
}
