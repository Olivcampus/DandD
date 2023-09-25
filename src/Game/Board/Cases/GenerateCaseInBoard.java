package Game.Board.Cases;

import Game.InputScanner;
import Game.Board.Play.Game;
import Personnage.Personnage;
import equipement.Attack.EquipmentOffensive;
import equipement.Defense.EquipmentDefensive;

import java.util.ArrayList;

public class GenerateCaseInBoard implements Cases {
    ArrayList<Object> plateaux = new ArrayList<>();
    int boardSize;
    EventCaseEnemy monster = new EventCaseEnemy();
    EventCaseAttackLoot attLoot = new EventCaseAttackLoot();
    EventCaseDefenseLoot defLoot = new EventCaseDefenseLoot();

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
        int ramdomEvent = 1 + (int) (Math.random() * ((5 - 1) + 1));

        if (ramdomEvent == 1) {

            plateaux.set(i, generateMonster());
        }
        if (ramdomEvent == 2) {

            plateaux.set(i, generateAttackLoot());
        }
        if (ramdomEvent == 3) {

            plateaux.set(i, generateDefenseLoot());
        }
        if (ramdomEvent == 4) {
            plateaux.set(i, new EventCaseHealth());
        }
        if (ramdomEvent == 5) {
            plateaux.set(i, new EventCaseNothing());
        }
    }

    @Override
    public Personnage generateMonster() {

        return monster.generateMonster();
    }

    @Override
    public EquipmentOffensive generateAttackLoot() {
        return attLoot.generateAttackLoot();
    }

    @Override
    public EquipmentDefensive generateDefenseLoot() {
        return defLoot.generateDefenseLoot();
    }
}

