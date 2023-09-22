package Game.Board.Play;

import Game.exception.PlayerOutOfBoardException;

public class Move {
    int de;

    public int MovePlayer(int playerPosition, int boardSize) throws PlayerOutOfBoardException {
        if (playerPosition < boardSize) {
            de = 1 + (int) (Math.random() * ((6 - 1) + 1));
            playerPosition += de;
        } else if (playerPosition > boardSize) {
            throw new PlayerOutOfBoardException();
        }
        return playerPosition;
    }

    public int MoveException(int playerPosition, int boardSize) {
        if (playerPosition > boardSize) {
            playerPosition -= de;
            System.out.println("retour en position " + playerPosition);
        }
        return playerPosition;
    }
}