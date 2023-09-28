package Event.GenerateEvent;

import Menu.Menu.InputScanner;
import Personnage.Personnage;
import Equipement.Attack.EquipmentOffensive;

import java.util.Objects;

public class GenerateEventEquipOffensiveLoot extends Personnage {

    EquipmentOffensive oldLoot;
    /**
     *
     *S'occupe de la partie loot pour les équipements Offensifs
     */

    public void equipAttackLoot(Personnage player, EquipmentOffensive loot) {
        oldLoot = player.getLeftArm();
        System.out.println("vous avez trouvé un équipement suivant : " + loot);
        if (Objects.equals(loot.getWeaponType(), player.type)) {
            if (Objects.equals(oldLoot.getWeaponName(), loot.getWeaponName())) {
                System.out.println("vous avez trouvé un équipement identique au votre");
            }
            if (!Objects.equals(oldLoot.getWeaponName(), loot.getWeaponName())) {
                if (oldLoot.getPowerWeapon() < loot.getPowerWeapon()) {
                    System.out.println("votre équipement actuel : " + player.getLeftArm());
                    System.out.println("voulez vous équiper votre personnage avec tapez 1 pour oui, 2 pour non");
                    int lootequip = new InputScanner().intInputScanner();
                    if (lootequip == 1) {
                        player.setLeftArm(loot);
                        player.setForce(player.getForce() + player.getLeftArm().getPowerWeapon() - oldLoot.getPowerWeapon());
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
            System.out.println("cet équipement n'est pas compatible avec votre classe");
        }
    }
}