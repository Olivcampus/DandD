package Game.Board.Cases.GenerateCaseEvent;

import Personnage.Personnage;

public class HealthPlayer {
    public void healthPlayer(Personnage player) {
        player.setLife(player.getLife() + 20);
    }
}
