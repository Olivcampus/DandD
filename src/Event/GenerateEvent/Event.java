package Event.GenerateEvent;

import Equipement.Attack.EquipmentOffensive;
import Equipement.Defense.EquipmentDefensive;
import Personnage.Personnage;

public interface Event {
    void equipAttackLoot(Personnage player, EquipmentOffensive loot);

    void equipDefenseLoot(Personnage player, EquipmentDefensive loot);

    void fightMonster(Personnage player);

    void healthPlayer(Personnage player);
}