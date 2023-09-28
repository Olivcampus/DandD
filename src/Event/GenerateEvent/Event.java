package Event.GenerateEvent;

import Personnage.Personnage;
import Equipement.Attack.EquipmentOffensive;
import Equipement.Defense.EquipmentDefensive;

public interface Event {
    void equipAttackLoot(Personnage player, EquipmentOffensive loot);

    void equipDefenseLoot(Personnage player, EquipmentDefensive loot);

    void fightMonster(int playerPosition, Personnage player, Personnage monster);

    void healthPlayer(Personnage player);
}