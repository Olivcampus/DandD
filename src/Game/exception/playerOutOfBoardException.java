package Game.exception;

import Game.Board.Board;
import Game.Board.Game;
import Personnage.heros.Player;

import java.util.ArrayList;

public class playerOutOfBoardException extends Exception {

    public playerOutOfBoardException(int positon, int de, int boardSize, ArrayList player, Board plateaux) throws playerOutOfBoardException {
        System.out.println("vous êtes allé(e) trop loin mouvement annulé");
        System.out.println("vous avez fais un jet de " + de + " et votre position est de " + positon);
        positon -= de;
        System.out.println("retour en position " + positon);
        Game start = new Game();

        start.playTurn(positon, boardSize, player, plateaux);
    }
}
