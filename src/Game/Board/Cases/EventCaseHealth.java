package Game.Board.Cases;

import Personnage.Personnage;


public class EventCaseHealth  {
    String msg= "";
    public void eventCaseHealth() {

        msg= "vous trouvez une fontaine de soin vous gagnez 20 PV";

    }
    public void healthPlayer(Personnage player) {
        player.setLife(player.getLife() + 20);
    }

}

