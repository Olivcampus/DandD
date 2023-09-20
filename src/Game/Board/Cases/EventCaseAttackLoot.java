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
           loot =switch (lootChoice) {
                case 1-> new IronSword();
                case 2-> new FireSword();
                case 3-> new IceSword();
                case 4-> new IronHammer();
                case 5-> new TriforceSword();
                default -> new WoodSword();
            };
        }

        if (Objects.equals(player.getType(), "Wizard")) {
            loot = switch (lootChoice) {
                case 1-> new FireBall();
                case 2-> new IceBall();
                case 3-> new MeteorShower();
                case 4-> new Implosion();
                case 5-> new EarthQuake();
                default -> new MagicArrow();
            };
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


