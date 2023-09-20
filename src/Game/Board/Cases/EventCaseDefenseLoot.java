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
            loot=  switch (lootChoice) {
                case 1-> new IronShield();
                case 2-> new GoldArmor();
                case 3-> new LongShield();
                case 4-> new MagicShield();
                case 5-> new DragonArmor();
                default -> new WoodShield();
            };
        }

        if (Objects.equals(player.getType(), "Wizard")) {
            loot = switch (lootChoice) {
                case 1-> new AdvancePotion();
                case 2-> new DragonPotion();
                case 3-> new DruidPotion();
                case 4-> new MagicPotion();
                case 5-> new QualityPotion();
                default -> new BasicPotion();
            };
        }
    }

    public void equiploot(Personnage player) {
        System.out.println("vous avez trouvé un équipement suivant : " + loot);
        System.out.println("votre équipement actuel : " + player.getRightArm());
        System.out.println("voulez vous équiper votre personnage avec tapez 1 pour oui, 2 pour non");
        int lootequip = show.nextInt();
        if (lootequip == 1) {
            player.setRightArm(loot);
            System.out.println("Le changement est bien éffectué");
        }
        if (lootequip == 2) {
            System.out.println("Ainsi soit-il");
        }
    }
}


