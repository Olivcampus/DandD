package Game.Board.Cases;


import Personnage.Personnage;
import Personnage.monsters.*;
import Game.Menu;

import Game.InputScanner;

import java.util.ArrayList;

public class EventCaseEnemy {
    Personnage enemy;
    ArrayList<Personnage> Enemy = new ArrayList<>();
    public Personnage generateMonster() {
        int monsterChoice = 1 + (int) (Math.random() * ((7 - 1) + 1));
        switch (monsterChoice) {
            case 1:
                enemy = new Goblin();
                break;
            case 2:
                enemy = new Dragon();
                break;
            case 3:
                enemy = new Spider();
                break;
            case 4:
                enemy = new Troll();
                break;
            case 5:
                enemy = new Vampyr();
                break;
            case 6:
                enemy = new Witch();
                break;
            case 7:
                enemy = new WhiteRabbit();
                break;
        }
        Enemy.add(enemy);
        return enemy;
    }

    public void fightMonster(int playerPosition, Personnage player) {
        System.out.println("vous allez affronter un " + enemy.getType() + " du nom de : " + enemy.getName() + " d'une force de : " + enemy.getForce() + " points et d'une santé de " + enemy.getLife() + "PV");
        while (player.getLife() >= 0 || enemy.getLife() >= 0) {
            System.out.println("vous avez une force de : " + player.getForce() + " ,une vie de : " + player.getLife() + " et une résistance de " + player.getRightArm().getPowerArmor());
            if ((player.getLife() > 0) && (enemy.getLife() > 0)) {
                System.out.println("voulez vous : 1 :vous battre  2: fuir ?");
                int choice = new InputScanner().intInputScanner();
                if (choice == 1) {
                    enemy.setForce(enemy.getForce() - player.getRightArm().getPowerArmor());
                    if (enemy.getForce() < 0) {
                        enemy.setForce(0);
                    }
                    enemy.setLife(enemy.getLife() - player.getForce());
                    if (enemy.getLife() > 0) {
                        player.setLife(player.getLife() - enemy.getForce());
                    }
                    int ramdomEvent = 1 + (int) (Math.random() * ((6 - 1) + 1));
                    if (ramdomEvent <= 3) {
                        System.out.println("l'ennemie à fui ");
                        return;
                    } else {
                        System.out.println("il vous reste " + player.getLife() + " PV et à votre ennemie " + enemy.getLife() + " PV");
                    }
                }
                if (choice == 2) {
                    System.out.println("vous fuyez");
                    int ramdomPosition = 1 + (int) (Math.random() * ((6 - 1) + 1));
                    if (playerPosition < ramdomPosition) {
                        playerPosition = 1;
                    }
                    playerPosition -= ramdomPosition;
                }
            }
            if (player.getLife() <= 0) {
                System.out.println("vous avez succombé");
                System.out.println("voulez vous recommencer le jeux ?");
                Menu start = new Menu();
                start.showMainMenu();
            } else {
                System.out.println("vous avez vaincu " + enemy.getName());
                return;
            }
        }

    }
}