package Game.Board.Cases;

import Game.Board.Play.Board;
import Game.Board.Play.Game;
import Personnage.Personnage;
import equipement.Attack.EquipmentOffensive;
import equipement.Attack.spell.*;
import equipement.Attack.weapon.*;

import java.util.Objects;
import java.util.Scanner;

public class EventCaseAttackLoot {
    EquipmentOffensive loot;
    EquipmentOffensive oldLoot;
    Scanner show = new Scanner(System.in);
    Game resume = new Game();

    public  EventCaseAttackLoot(int playerPosition, int boardSize, Personnage player, Board plateaux, int de) {
        generateLoot(player);
        equiploot(player);
        resume.playTurn(playerPosition, boardSize, player, plateaux, de);
    }

    public void generateLoot(Personnage player) {
        int lootChoice = 1 + (int) (Math.random() * ((5 - 1) + 1));

        if (Objects.equals(player.getType(), "Warrior")) {
            switch (lootChoice) {
                case 1:
                    loot = new IronSword();
                    break;
                case 2:
                    loot = new FireSword();
                    break;
                case 3:
                    loot = new IceSword();
                    break;
                case 4:
                    loot = new IronHammer();
                    break;
                case 5:
                    loot = new TriforceSword();
                    break;
            }
        }

        if (Objects.equals(player.getType(), "Wizard")) {
            switch (lootChoice) {
                case 1:
                    loot = new FireBall();
                    break;
                case 2:
                    loot = new IceBall();
                    break;
                case 3:
                    loot = new MeteorShower();
                    break;
                case 4:
                    loot = new Implosion();
                    break;
                case 5:
                    loot = new EarthQuake();
                    break;
            }
        }
    }

    public void equiploot(Personnage player) {
        System.out.println("vous avez trouvé un équipement suivant : " + loot);
        System.out.println("votre équipement actuel : " + player.getLeftArm());
        System.out.println("voulez vous équiper votre personnage avec tapez 1 pour oui, 2 pour non");
        int lootequip = show.nextInt();
        if (lootequip == 1) {
            oldLoot = player.getLeftArm();
            player.setLeftArm(loot);
            player.setForce(player.getForce() + player.getLeftArm().getPowerWeapon() - oldLoot.getPowerWeapon());
            System.out.println("Le changement est bien éffectué");
        }
        if (lootequip == 2) {
            System.out.println("Ainsi soit-il");
        }
    }
}


