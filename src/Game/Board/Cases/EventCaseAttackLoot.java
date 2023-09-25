package Game.Board.Cases;

import Game.InputScanner;
import Personnage.Personnage;
import equipement.Attack.EquipmentOffensive;
import equipement.Attack.spell.*;
import equipement.Attack.weapon.*;

import java.util.Objects;

public class EventCaseAttackLoot {
    EquipmentOffensive loot;
    EquipmentOffensive oldLoot;

    public CreateCases generateAttackLoot() {
        int lootChoice = 1 + (int) (Math.random() * ((10 - 1) + 1));
        loot = switch (lootChoice) {
            case 1 -> new IronSword();
            case 2 -> new FireSword();
            case 3 -> new IceSword();
            case 4 -> new IronHammer();
            case 5 -> new TriforceSword();
            case 6 -> new FireBall();
            case 7 -> new IceBall();
            case 8 -> new MeteorShower();
            case 9 -> new Implosion();
            case 10 -> new EarthQuake();
            default -> new MagicArrow();
        };
        return (CreateCases) loot;
    }

    public void equipAttackLoot(Personnage player) {
        oldLoot = player.getLeftArm();
        if (Objects.equals(loot.getWeaponType(), player.type)) {
            if (Objects.equals(oldLoot.getWeaponName(), loot.getWeaponName())) {
                System.out.println("vous avez trouvé un équipement identique au votre");
            }
            if (!Objects.equals(oldLoot.getWeaponName(), loot.getWeaponName())) {
                if (oldLoot.getPowerWeapon() < loot.getPowerWeapon()) {
                    System.out.println("vous avez trouvé un équipement suivant : " + loot);
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

