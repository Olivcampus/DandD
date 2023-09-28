package Event.CreateEvent;


import Equipement.Attack.EquipmentOffensive;
import Equipement.Attack.Spell.*;
import Equipement.Attack.Weapon.*;

public class CreateEventAttackLoot {
    EquipmentOffensive loot;

    /**
     * Créer les armes lors de la création du plateau
     */

    public EquipmentOffensive generateAttackLoot() {
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
        return loot;
    }
}