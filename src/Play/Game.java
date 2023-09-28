package Play;

import Menu.Menu.InputScanner;

import Menu.Menu.DialogBox;
import Menu.Menu.*;
import Menu.exception.PlayerOutOfBoardException;
import Personnage.Personnage;
import Event.GenerateEventInCase;

import java.util.ArrayList;

public class Game {
    DialogBox dialogBox = new DialogBox();
    private final InputScanner inputScanner = new InputScanner();

    /**
     * S'occupe du bon déroulement du jeu
     * cette fonction s'occupe du bon déroulement des jeux et appellent les fonctions à mesure du que le jeu avances
     * @menu pour modifier le personnage
     */

    public void playTurn(Personnage player, ArrayList<String> plateaux) {
        GenerateEventInCase event = new GenerateEventInCase();
        Move move = new Move(plateaux.size(), player);
        while (player.isAlive()) {
            dialogBox.dialogBoxGame(player.getPlayerPosition(), plateaux.size(), player, plateaux);
            int choice = inputScanner.intInputScanner();
            if (choice == 1) {
                if (player.getPlayerPosition()< plateaux.size()) {
                    event.setEventAtBoard(player, plateaux);
                    try {
                        player.setPlayerPosition(move.movePlayer(player));
                    } catch (PlayerOutOfBoardException e) {
                        System.out.println("votre position est de " + player.getPlayerPosition() + " " + e.getMessage());
                    } finally {
                        player.setPlayerPosition(move.moveException());
                    }
                } else {
                    new WinGame(player.getPlayerPosition());
                }
            }
            if (choice == 2) {
                System.out.println("retour au menu");
                new ShowMainMenu();
            }
        }
        while (!player.isAlive()) {
            new YouAreDead();
        }
    }
}