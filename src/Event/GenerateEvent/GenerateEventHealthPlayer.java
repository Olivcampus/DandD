package Event.GenerateEvent;

import Personnage.Personnage;

public class GenerateEventHealthPlayer {
    public void healthPlayer(Personnage player) {
        player.setLife(player.getLife() + 20);
    }
}
