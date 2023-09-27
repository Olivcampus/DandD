package Game.Menu;

import Game.Board.CreateBoard;
import Game.Board.Play.Game;
import Personnage.Personnage;

import java.util.ArrayList;

public class CreateGame {
    ArrayList<Integer> plateaux;
    public  CreateGame(Personnage current) {
        plateaux = new CreateBoard().generateBoard();
        int boardSize = plateaux.size();
        System.out.println("Le plateau de " + boardSize + " cases a été généré.");
        int playerPosition = 1;
        System.out.println("La partie démarre");
        Game start = new Game();
        start.playTurn(playerPosition, boardSize, current);

    }
}
