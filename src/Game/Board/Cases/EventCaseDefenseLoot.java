package Game.Board.Cases;

import Game.Board.Play.Board;
import Game.Board.Play.Game;
import Personnage.Personnage;
import equipement.Defense.EquipmentDefensive;
import equipement.Defense.potion.*;
import equipement.Defense.shield.*;

import java.util.Objects;
import java.util.Scanner;

public class EventCaseDefenseLoot {
    EquipmentDefensive loot;
    EquipmentDefensive oldLoot;
    Scanner show = new Scanner(System.in);
    Game resume = new Game();

    public EventCaseDefenseLoot(int playerPosition, int boardSize, Personnage player, Board plateaux, int de) {
        generateLoot(player);
        equiploot(player);
        resume.playTurn(playerPosition, boardSize, player, plateaux, de);
    }

    public void generateLoot(Personnage player) {
        int lootChoice = 1 + (int) (Math.random() * ((5 - 1) + 1));

        if (Objects.equals(player.getType(), "Warrior")) {
            switch (lootChoice) {
                case 1:
                    loot = new IronShield();
                    break;
                case 2:
                    loot = new GoldArmor();
                    break;
                case 3:
                    loot = new LongShield();
                    break;
                case 4:
                    loot = new MagicShield();
                    break;
                case 5:
                    loot = new DragonArmor();
                    break;
            }
        }

        if (Objects.equals(player.getType(), "Wizard")) {
            switch (lootChoice) {
                case 1:
                    loot = new AdvancePotion();
                    break;
                case 2:
                    loot = new DragonPotion();
                    break;
                case 3:
                    loot = new DruidPotion();
                    break;
                case 4:
                    loot = new MagicPotion();
                    break;
                case 5:
                    loot = new QualityPotion();
                    break;
            }
        }
    }

    public void equiploot(Personnage player) {
        System.out.println("vous avez trouvé un équipement suivant : " + loot);
        System.out.println("votre équipement actuel : " + player.getRightArm());
        System.out.println("voulez vous équiper votre personnage avec tapez 1 pour oui, 2 pour non");
        int lootequip = show.nextInt();
        if (lootequip == 1) {
            oldLoot = player.getRightArm();
            player.setRightArm(loot);
            player.setLife(player.getLife() + player.getRightArm().getPowerArmor() - oldLoot.getPowerArmor());
            System.out.println("Le changement est bien éffectué");
        }
        if (lootequip == 2) {
            System.out.println("Ainsi soit-il");
        }
    }
}


