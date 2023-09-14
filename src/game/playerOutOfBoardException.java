package game;

public class playerOutOfBoardException extends Exception{
    Game start = new Game();
    public playerOutOfBoardException(int de, int position)  {
        System.out.println("vous allez trop loin, le mouvement est donc annulé");
        position -= de;

    }
}