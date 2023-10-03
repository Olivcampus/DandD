package Event.GenerateEvent;

import Menu.InputScanner;
import Personnage.Personnage;

public class GenerateEventAttackMonster {
    /**
     * S'occupe de la partie Combat
     */

    public void fightMonster(Personnage player, Personnage enemy) {

        System.out.println("vous allez affronter un " + enemy.getType() + " du nom de : " + enemy.getName() + " d'une force de : " + enemy.getForce() + " points et d'une santé de " + enemy.getLife() + "PV");
        System.out.println("vous avez une force de : " + player.getForce() + " ,une vie de : " + player.getLife() + " et une résistance de " + player.getRightArm().getPowerArmor());
        while ((player.isAlive()) && enemy.isAlive()) {
            System.out.println("voulez vous 1 : vous battre  2: fuir ?");
            int choice = new InputScanner().intInputScanner();
            switch (choice) {
                case 1:
                    enemy.setForce(enemy.getForce() - player.getRightArm().getPowerArmor());
                    if (enemy.getForce() < player.getForce()) {
                        int ramdomEvent = 1 + (int) (Math.random() * ((6 - 1) + 1));
                        if (ramdomEvent <= 2) {
                            System.out.println("l'ennemie à fui ");
                            return;
                        }
                    }
                    enemy.setLife(enemy.getLife() - player.getForce());
                    System.out.println("il lui reste " + enemy.getLife() + " PV ");

                    if (enemy.isAlive()) {
                        player.setLife(player.getLife() - enemy.getForce());
                        System.out.println("il vous reste " + player.getLife() + " PV");
                    }
                    break;
                case 2:
                    int ramdomPosition = 1 + (int) (Math.random() * ((6 - 1) + 1));
                    player.setPlayerPosition(player.getPlayerPosition() - ramdomPosition);
                    if (player.getPlayerPosition() <= 0) {
                        player.setPlayerPosition(1);
                    }
                    System.out.println("vous fuyez à la position : " + player.getPlayerPosition());
                    break;
                default:
                    System.out.println("veuillez faire un choix valide");
                    fightMonster(player, enemy);
            }
        } if (!enemy.isAlive()) {
            System.out.println("vous avez vaincu " + enemy.getName());
        }
    }
}