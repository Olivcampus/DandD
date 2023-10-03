package Play.exception;


public class PlayerOutOfBoardException extends Exception {
    /**
     * Exception qui gère la sortie du tableau
     */

    public PlayerOutOfBoardException() {
        super("vous avez étais trop loin !");
    }
}
