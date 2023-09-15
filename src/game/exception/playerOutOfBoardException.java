package game.exception;

public class playerOutOfBoardException extends Exception{

    public playerOutOfBoardException(){
        super("You WON !");
    }
}