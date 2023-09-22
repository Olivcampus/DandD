package Game.Board.Cases;


import Game.InputScanner;
import Personnage.Personnage;
import equipement.Defense.EquipmentDefensive;
import equipement.Defense.potion.*;
import equipement.Defense.shield.*;

import java.util.Objects;

public class EventCaseDefenseLoot {
    EquipmentDefensive loot;
    EquipmentDefensive oldLoot;

    public EquipmentDefensive generateDefenseLoot() {
        int lootChoice = 1 + (int) (Math.random() * ((10 - 1) + 1));

        loot = switch (lootChoice) {
            case 1 -> new IronShield();
            case 2 -> new GoldArmor();
            case 3 -> new LongShield();
            case 4 -> new MagicShield();
            case 5 -> new DragonArmor();
            case 6 -> new AdvancePotion();
            case 7 -> new DragonPotion();
            case 8 -> new DruidPotion();
            case 9 -> new MagicPotion();
            case 10 -> new QualityPotion();
            default -> new BasicPotion();
        };
        return loot;
    }

    public void equipDefenseLoot(Personnage player) {
        oldLoot = player.getRightArm();
        if (Objects.equals(loot.getArmorType(), player.type)) {
            if (Objects.equals(oldLoot.getArmorName(), loot.getArmorName())) {
                System.out.println("vous avez trouvé un équipement identique au votre");
            }
            if (!Objects.equals(oldLoot.getArmorName(), loot.getArmorName())) {
                if (oldLoot.getPowerArmor() < loot.getPowerArmor()) {
                    System.out.println("vous avez trouvé un équipement suivant : " + loot);
                    System.out.println("votre équipement actuel : " + player.getRightArm());
                    System.out.println("voulez vous équiper votre personnage avec tapez 1 pour oui, 2 pour non");
                    int lootequip = new InputScanner().intInputScanner();
                    if (lootequip == 1) {
                        player.setRightArm(loot);
                        System.out.println("Le changement est bien éffectué");
                    }
                    if (lootequip == 2) {
                        System.out.println("Ainsi soit-il");
                    }
                } else {
                    System.out.println("vous avez trouvé un équipement plus faible que le votre");
                }
            }
        } else {
            System.out.println("l'équipement n'est pas compatible avec la classe");
        }
    }
}