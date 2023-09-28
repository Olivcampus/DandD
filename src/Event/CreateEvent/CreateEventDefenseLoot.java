package Event.CreateEvent;

import Equipement.Defense.EquipmentDefensive;
import Equipement.Defense.Potion.*;
import Equipement.Defense.Shield.*;

public class CreateEventDefenseLoot {
    EquipmentDefensive loot;

    /**
     * Créer les protections lors de la création du plateau
     * */
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
}