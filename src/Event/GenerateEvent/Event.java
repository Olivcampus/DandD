package Event.GenerateEvent;

import Personnage.Personnage;
import Equipement.Attack.EquipmentOffensive;
import Equipement.Defense.EquipmentDefensive;

public interface Event {
    void equipAttackLoot(Personnage player, EquipmentOffensive loot);

    void equipDefenseLoot(Personnage player, EquipmentDefensive loot);

    void fightMonster(Personnage player);

    void healthPlayer(Personnage player);
}