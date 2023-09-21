package Game.Board.Cases;


import Game.Board.Play.Game;
import Personnage.Personnage;
import Personnage.monsters.*;
import Game.Menu;

import java.util.Scanner;


public class EventCaseEnemy {
    Personnage enemy;
    Scanner show = new Scanner(System.in);
    Game resume = new Game();


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
        return enemy;
    }

    public void fightMonster(int playerPosition, int boardSize, Personnage player, GenerateCaseInBoard plateaux, int de) {
        System.out.println("vous allez affronter un " + enemy.getType() + " du nom de : " + enemy.getName() + " d'une force de : " + enemy.getForce() + " points et d'une santé de " + enemy.getLife() + "PV");
        while (player.getLife() >= 0 || enemy.getLife() >= 0) {
            System.out.println("vous avez une force de : " + player.getForce() + " ,une vie de : " + player.getLife() + " et une résistance de " + player.getRightArm().getPowerArmor());
            if ((player.getLife() > 0) && (enemy.getLife() > 0)) {
                System.out.println("voulez vous : 1 :vous battre  2: fuir ?");
                int choice = show.nextInt();
                if (choice == 1) {
                    enemy.setForce(enemy.getForce() - player.getRightArm().getPowerArmor());
                    if (enemy.getForce() < 0) {
                        enemy.setForce(0);
                    }
                    player.setLife(player.getLife() - enemy.getForce());
                    enemy.setLife(enemy.getLife() - player.getForce());
                    System.out.println("il vous reste " + player.getLife() + " PV et à votre ennemie " + enemy.getLife() + " PV");
                }
                    if (choice == 2) {
                        System.out.println("vous fuyez");
                        playerPosition--;
                        resume.playTurn(playerPosition, boardSize, player, plateaux, de);
                    }

            }
            if (player.getLife() <= 0) {
                System.out.println("vous avez succombé");
                System.out.println("voulez vous recommencer le jeux ?");
                Menu start = new Menu();
                start.showMainMenu();
            } else {
                System.out.println("vous avez vaincu " + enemy.getName());
                resume.playTurn(playerPosition, boardSize, player, plateaux, de);
            }
        }

    }
}


