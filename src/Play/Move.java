package Play;

import Menu.exception.PlayerOutOfBoardException;
import Personnage.Personnage;

public class Move {
    private int de;
    private final int boardSize;
    private int playerPosition;

    public Move(int boardSize, Personnage player) {
        this.boardSize = boardSize;
        this.playerPosition = player.getPlayerPosition();
    }

    public int movePlayer(Personnage player) throws PlayerOutOfBoardException {
        if (playerPosition < boardSize) {
            de = 1 + (int) (Math.random() * ((6 - 1) + 1));
            player.setPlayerPosition(playerPosition += de);
        } else if (playerPosition > boardSize) {
            throw new PlayerOutOfBoardException();
        }
        return playerPosition;
    }

    public int moveException() {
        if (playerPosition > boardSize) {
            playerPosition -= de;
            System.out.println("retour en position " + playerPosition);
        }
        return playerPosition;
    }
}