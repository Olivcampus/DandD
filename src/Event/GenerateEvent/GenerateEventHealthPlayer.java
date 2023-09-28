package Event.GenerateEvent;

import Personnage.Personnage;

public class GenerateEventHealthPlayer {
    /**
     *
     * S'occupe de rajouter des PV aux joueurs
     */
    public void healthPlayer(Personnage player) {
        player.setLife(player.getLife() + 20);
    }
}
