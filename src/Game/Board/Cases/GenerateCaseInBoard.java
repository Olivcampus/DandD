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

    ArrayList<Integer> plateaux = new ArrayList<>();
    EventCaseHealth caseHealth = new EventCaseHealth();
    EventCaseNothing caseNothing = new EventCaseNothing();
    Game start = new Game();

    public GenerateCaseInBoard(Personnage current) {
        System.out.println("choisissez le nombre de cases");
        int choice = new InputScanner().intInputScanner();
        boardSize = choice;
        if (choice >= 20 && choice <= 100) {
            for (int i = 0; i < choice; i++) {
                plateaux.add(i);
                System.out.println("Le plateau de " + choice + " cases a été généré.");
                int playerPosition = 1;
                start.playTurn(playerPosition, boardSize, current );
            }
        } else {
            System.out.println("Merci de choisir une taille de plateau valide (20 à 100)");
            new GenerateCaseInBoard(current);
        }

    }


    public void setEventAtBoard(int playerPosition, Personnage player) {
        int ramdomEvent = 1 + (int) (Math.random() * ((5 - 1) + 1));

        switch (ramdomEvent) {
            case 1:
                generateMonster();
                monster.fightMonster(playerPosition, player);
                break;
            case 2:
                generateAttackLoot();
                attLoot.equipAttackLoot(player);
                break;
            case 3:
                generateDefenseLoot();
                defLoot.equipDefenseLoot(player);
                break;
            case 4:
                eventCaseHealth();
                caseHealth.healthPlayer(player);
                break;
            case 5:
                nothingToString();
                break;
        }

    }


    public void eventCaseHealth() {
        caseHealth.eventCaseHealth();
    }

    public void nothingToString() {
        caseNothing.nothingToString();
    }

    @Override
    public void generateMonster() {

        monster.generateMonster();
    }

    @Override
    public void generateAttackLoot() {

        attLoot.generateAttackLoot();
    }

    @Override
    public void generateDefenseLoot() {
        defLoot.generateDefenseLoot();
    }
}
