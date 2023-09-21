package Game.Board.Cases;

import Game.Board.Play.Game;
import Personnage.Personnage;

public class EventCaseHealth {
    Game resume = new Game();
    public void eventCaseAddHealth(){
        System.out.println("vous trouvez une fontaine de soin vous gagnez 20 PV");


    }
    public void healthPlayer(Personnage player){
        player.setLife( player.getLife() + 20 );
    }
}
