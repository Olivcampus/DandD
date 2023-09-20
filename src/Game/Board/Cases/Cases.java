package Game.Board.Cases;

import Game.Board.Play.Board;
import Personnage.Personnage;

public interface Cases {

    void EventEnemy(int playerPosition, int boardSize, Personnage player, Board plateaux, int de) ;
    void EventCaseAttackLoot(int playerPosition, int boardSize, Personnage player, Board plateaux, int de);
    void EventCaseDefenseLoot(int playerPosition, int boardSize, Personnage player, Board plateaux, int de);

    void EventCaseAddHealth(int playerPosition, int boardSize, Personnage player, Board plateaux, int de);

}