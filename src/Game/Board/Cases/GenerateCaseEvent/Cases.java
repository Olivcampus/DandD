package Game.Board.Cases.GenerateCaseEvent;


import Personnage.Personnage;
import equipement.Attack.EquipmentOffensive;
import equipement.Defense.EquipmentDefensive;

public interface Cases {
    void equipAttackLoot(Personnage player, EquipmentOffensive loot);

    void equipDefenseLoot(Personnage player, EquipmentDefensive loot);

    void fightMonster(int playerPosition, Personnage player, Personnage monster);

    void healthPlayer(Personnage player);


}
