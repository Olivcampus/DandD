package Game.Board.Cases;

import Game.Board.Play.*;
import Personnage.Personnage;

public  class RamdomEvent implements Cases {
    public void ramdomEvent(int playerPosition, int boardSize, Personnage player, Board plateaux, int de) {
        int ramdomEvent = 1 + (int) (Math.random() * ((6 - 1) + 1));
        if (ramdomEvent == 1) {
            EventEnemy(playerPosition, boardSize, player, plateaux, de);
        }
        if (ramdomEvent == 2) {
            EventCaseAttackLoot(playerPosition, boardSize, player, plateaux, de);
        }
        if (ramdomEvent == 3) {
            EventCaseDefenseLoot(playerPosition, boardSize, player, plateaux, de);
        }
        if (ramdomEvent == 4 || ramdomEvent == 6) {
            EventCaseAddHealth(playerPosition, boardSize, player, plateaux, de);
        }
    }
    @Override
    public void EventEnemy(int playerPosition, int boardSize, Personnage player, Board plateaux, int de) {
        new EventCaseEnemy(playerPosition, boardSize, player, plateaux, de);
    }

    @Override
    public void EventCaseAttackLoot(int playerPosition, int boardSize, Personnage player, Board plateaux, int de) {
        new EventCaseAttackLoot(playerPosition, boardSize, player, plateaux, de);
    }

    @Override
    public void EventCaseDefenseLoot(int playerPosition, int boardSize, Personnage player, Board plateaux, int de) {
        new EventCaseDefenseLoot(playerPosition, boardSize, player, plateaux, de);
    }

    @Override
    public void EventCaseAddHealth(int playerPosition, int boardSize, Personnage player, Board plateaux, int de) {
        new EventCaseAddHealth(playerPosition, boardSize, player, plateaux, de);
    }
}
