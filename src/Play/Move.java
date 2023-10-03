package Play;

import Play.exception.PlayerOutOfBoardException;
import Personnage.Personnage;

import java.util.ArrayList;

public class Move {
    private int de;

    /**
     * Cette classe s'occupe des déplacements du joueur
     */


    public int movePlayer(ArrayList<String> plateaux, Personnage player) throws PlayerOutOfBoardException {
        de = 1 + (int) (Math.random() * ((6 - 1) + 1));
        System.out.println("la valeur du dé est de : " + de);
        player.setPlayerPosition(player.getPlayerPosition() + de);
        System.out.println("votre position est : " + player.getPlayerPosition() + " sur : " + plateaux.size());
        if (player.getPlayerPosition() > plateaux.size()) {
            throw new PlayerOutOfBoardException();
        } else {

            return player.getPlayerPosition();
        }
    }

    public int moveException(ArrayList<String> plateaux, Personnage player) {
        if (player.getPlayerPosition() > plateaux.size()) {
            player.setPlayerPosition(player.getPlayerPosition() - de);
            System.out.println("retour en position " + player.getPlayerPosition());
        }
        return player.getPlayerPosition();
    }
}