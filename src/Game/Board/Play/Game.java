package Game.Board.Play;

import Game.InputScanner;

import java.util.ArrayList;

import Game.Board.Cases.*;
import Game.Board.DialogBox;
import Game.Menu;
import Game.exception.PlayerOutOfBoardException;
import Personnage.Personnage;

public class Game {
    Menu Pause = new Menu();
    DialogBox dialogBox = new DialogBox();
    private final InputScanner inputScanner = new InputScanner();

    /**
     * S'occupe du bon déroulement du jeu
     *
     * @Board pour le plateau
     * @menu pour modifier le personnage
     */

    public void playTurn(int playerPosition, int boardSize, Personnage player, ArrayList<CreateCases> plateaux) {
        Move move = new Move(boardSize, playerPosition);
        while (playerPosition <= boardSize) {
            if (playerPosition == 1) System.out.println("La partie démarre");
            dialogBox.dialogBoxGame(playerPosition, boardSize, player);
            int choice = inputScanner.intInputScanner();
            if (choice == 1) {

                if (playerPosition < boardSize) {

                    try {
                        playerPosition = move.movePlayer();
                    } catch (PlayerOutOfBoardException e) {
                        System.out.println("votre position est de " + playerPosition + " " + e.getMessage());
                    } finally {
                        playerPosition = move.moveException();
                    }
                    new CheckPosition(playerPosition, boardSize, player, plateaux);
                }
            }
            if (choice == 2) {
                Pause.StartNewGame();
            }
            if (choice == 3) {
                System.out.println("retour au menu");
                Pause.showMainMenu();
            }
        }
    }
}