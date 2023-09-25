package Game.Board.Cases;

import Game.Board.Play.WinGame;
import Personnage.Personnage;

import java.util.ArrayList;

public class CheckPosition implements Cases {

    public CheckPosition(int playerPosition, int boardSize, Personnage player, ArrayList<CreateCases> plateaux) {
        if (playerPosition == boardSize) {
            new WinGame(playerPosition);
        }
        else if (plateaux.get(playerPosition) instanceof EventCaseEnemy ) {
            System.out.println("younes bosse");
            fightMonster(playerPosition, player);
        }
        else if (plateaux.get(playerPosition) instanceof EventCaseHealth eventHealth) {
            System.out.println(eventHealth);
            healthPlayer(player);
        }
        else if (plateaux.get(playerPosition) instanceof EventCaseDefenseLoot ) {
            System.out.println("younes");
            equipDefenseLoot(player);
        }
        else if (plateaux.get(playerPosition) instanceof EventCaseNothing eventNothing) {
            System.out.println(eventNothing);
        }
        else  if (plateaux.get(playerPosition) instanceof EventCaseAttackLoot ) {
            System.out.println("fuck");
            equipAttackLoot(player);
        }
    }

    @Override
    public void equipAttackLoot(Personnage player) {
        EventCaseAttackLoot attLoot = new EventCaseAttackLoot();
        attLoot.equipAttackLoot(player);

    }

    @Override
    public void equipDefenseLoot(Personnage player) {
        EventCaseDefenseLoot defLoot = new EventCaseDefenseLoot();
        defLoot.equipDefenseLoot(player);
    }

    @Override
    public void fightMonster(int playerPosition, Personnage player) {
        EventCaseEnemy fight = new EventCaseEnemy();
        fight.fightMonster(playerPosition, player);
    }

    @Override
    public void healthPlayer(Personnage player) {
        EventCaseHealth health = new EventCaseHealth();
        health.healthPlayer(player);
    }
}
