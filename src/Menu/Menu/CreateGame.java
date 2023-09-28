package Menu.Menu;

import Board.CreateBoard;
import Play.Game;
import Personnage.Personnage;

import java.util.ArrayList;

public class CreateGame {
    ArrayList<String> plateaux;

    /**
     *
     * Instancie la création du plateau et des cases et lance le jeux
     */
    public  CreateGame(Personnage current) {
        plateaux = new CreateBoard().generateBoard();
        System.out.println("Le plateau de " + plateaux.size() + " cases a été généré.");
        current.setPlayerPosition(1);
        System.out.println("La partie démarre");
        Game start = new Game();
        start.playTurn(current, plateaux);

    }
}