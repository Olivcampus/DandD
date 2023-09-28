package Event.GenerateEvent;

import Menu.Menu.InputScanner;
import Personnage.Personnage;
import Equipement.Defense.EquipmentDefensive;

import java.util.Objects;

public class GenerateEventEquipDefensiveLoot {
    EquipmentDefensive oldLoot;

    /**
     *
     *S'occupe de la partie loot pour les équipements Défensifs
     */

    public void equipDefenseLoot(Personnage player, EquipmentDefensive loot) {
        oldLoot = player.getRightArm();
        System.out.println("vous avez trouvé un équipement suivant : " + loot);
        if (Objects.equals(loot.getArmorType(), player.type)) {
            if (Objects.equals(oldLoot.getArmorName(), loot.getArmorName())) {
                System.out.println("vous avez trouvé un équipement identique au votre");
            }
            if (!Objects.equals(oldLoot.getArmorName(), loot.getArmorName())) {
                if (oldLoot.getPowerArmor() < loot.getPowerArmor()) {
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
            System.out.println("l'équipement n'est pas compatible avec votre classe");
        }
    }
}