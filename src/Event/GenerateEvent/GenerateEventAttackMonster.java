package Event.GenerateEvent;

import Menu.Menu.InputScanner;
import Menu.Menu.YouAreDead;
import Personnage.Personnage;

public class GenerateEventAttackMonster {
    /**
     *
     * S'occupe de la partie Combat
     */

    public void fightMonster(Personnage player, Personnage enemy) {

        if ((player.isAlive()) && enemy.isAlive())
            System.out.println("vous allez affronter un " + enemy.getType() + " du nom de : " + enemy.getName() + " d'une force de : " + enemy.getForce() + " points et d'une santé de " + enemy.getLife() + "PV");
        System.out.println("vous avez une force de : " + player.getForce() + " ,une vie de : " + player.getLife() + " et une résistance de " + player.getRightArm().getPowerArmor());
        System.out.println("voulez vous : 1 :vous battre  2: fuir ?");
        int choice = new InputScanner().intInputScanner();
        if (choice == 1) {
            enemy.setForce(enemy.getForce() - player.getRightArm().getPowerArmor());
            int ramdomEvent = 1 + (int) (Math.random() * ((6 - 1) + 1));
            if (ramdomEvent <= 2) {
                System.out.println("l'ennemie à fui ");
                return;
            } else {
                enemy.setLife(enemy.getLife() - player.getForce());
                System.out.println("il vous reste " + player.getLife() + " PV et à votre ennemie " + enemy.getLife() + " PV");
            }
            if (enemy.isAlive()) {
                player.setLife(player.getLife() - enemy.getForce());
            }
        }
        if (choice == 2) {
            System.out.println("vous fuyez");
            int ramdomPosition = 1 + (int) (Math.random() * ((6 - 1) + 1));
            player.setPlayerPosition(player.getPlayerPosition()- ramdomPosition) ;
            if (player.getPlayerPosition() <= 0) {
                player.setPlayerPosition(1);
            }
        }
        if (!player.isAlive()) {
            new YouAreDead();
        } else if (!enemy.isAlive()) {
            System.out.println("vous avez vaincu " + enemy.getName());
        }
    }
}
