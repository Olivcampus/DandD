package Play;

import Menu.exception.PlayerOutOfBoardException;

public class Move {
    private int de;
    private final int boardSize;
    private int playerPosition;

    public Move(int boardSize, int playerPosition) {
        this.boardSize = boardSize;
        this.playerPosition = playerPosition;
    }

    public int movePlayer() throws PlayerOutOfBoardException {
        if (playerPosition < boardSize) {
            de = 1 + (int) (Math.random() * ((6 - 1) + 1));
            playerPosition += de;
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