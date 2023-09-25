package Game.Board.Cases;

import Game.Board.Play.WinGame;
import Personnage.Personnage;

import java.util.ArrayList;

public class CheckPosition {

    public CheckPosition(int playerPosition, int boardSize, Personnage player, ArrayList<Object> plateaux) {
        if (playerPosition == boardSize) {
            new WinGame(playerPosition);
        }
        if (plateaux.get(playerPosition) instanceof EventCaseEnemy eventEnemy) {
            eventEnemy.fightMonster(playerPosition, player);
        }
        if (plateaux.get(playerPosition) instanceof EventCaseHealth eventHealth) {
            System.out.println(eventHealth);
            eventHealth.healthPlayer(player);
        }
        if (plateaux.get(playerPosition) instanceof EventCaseDefenseLoot eventDefLoot) {
            eventDefLoot.equipDefenseLoot(player);
        }
        if (plateaux.get(playerPosition) instanceof EventCaseNothing eventNothing) {
            System.out.println(eventNothing);
        }
        if (plateaux.get(playerPosition) instanceof EventCaseAttackLoot eventAttLoot) {
            eventAttLoot.equipAttackLoot(player);
        }
    }
}
