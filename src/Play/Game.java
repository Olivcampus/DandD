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
     *
     * @Board pour le plateau
     * @menu pour modifier le personnage
     */

    public void playTurn(int playerPosition, int boardSize, Personnage player, ArrayList<String> plateaux) {
        GenerateEventInCase event = new GenerateEventInCase();
        Move move = new Move(boardSize, playerPosition);
        while (player.isAlive()) {
            dialogBox.dialogBoxGame(playerPosition, boardSize, player, plateaux);
            int choice = inputScanner.intInputScanner();
            if (choice == 1) {
                if (playerPosition < boardSize) {
                    event.setEventAtBoard(playerPosition, player, plateaux);
                    try {
                        playerPosition = move.movePlayer();
                    } catch (PlayerOutOfBoardException e) {
                        System.out.println("votre position est de " + playerPosition + " " + e.getMessage());
                    } finally {
                        playerPosition = move.moveException();
                    }
                } else {
                    new WinGame(playerPosition);
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