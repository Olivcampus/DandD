package Game.Board.Cases;


import Personnage.Personnage;

public interface Cases {
    void equipAttackLoot(Personnage player);
    void equipDefenseLoot(Personnage player);
    void fightMonster(int playerPosition, Personnage player);
    void healthPlayer(Personnage player);


}
