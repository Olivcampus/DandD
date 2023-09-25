package Game.Board.Cases;

import Personnage.Personnage;
import equipement.Attack.EquipmentOffensive;
import equipement.Defense.EquipmentDefensive;

public interface Cases {
    Personnage generateMonster();
    EquipmentOffensive generateAttackLoot();
    EquipmentDefensive generateDefenseLoot();

}
