package Game.Board.Cases;

import Personnage.Personnage;

public class EventCaseHealth {

    public String toString() {
        return "vous trouvez une fontaine de soin vous gagnez 20 PV";
    }

    public void healthPlayer(Personnage player) {
        player.setLife(player.getLife() + 20);
    }
}
