package Game.exception;


public class PlayerOutOfBoardException extends Exception {

    public PlayerOutOfBoardException() {
        super("vous avez étais trop loin !");
    }
}
