package Game.Board.Cases;

import Game.Board.Play.Board;
import Game.Board.Play.Game;
import Personnage.Personnage;

public class EventCaseAddHealth {
    Game resume = new Game();
    public EventCaseAddHealth(int playerPosition, int boardSize, Personnage player, Board plateaux, int de){
        System.out.println("vous trouvez une fontaine de soin vous gagnez 20 PV");
        player.setLife( player.getLife() + 20 );
        resume.playTurn(playerPosition, boardSize, player, plateaux, de);
    }
}
