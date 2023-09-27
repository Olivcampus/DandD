package Game.Board.Play;

import Game.Menu.InputScanner;

import Game.Menu.DialogBox;
import Game.Menu.*;
import Game.exception.PlayerOutOfBoardException;
import Personnage.Personnage;
import Game.Board.Cases.GenerateCaseInBoard;

public class Game {
    DialogBox dialogBox = new DialogBox();
    private final InputScanner inputScanner = new InputScanner();

    /**
     * S'occupe du bon déroulement du jeu
     *
     * @Board pour le plateau
     * @menu pour modifier le personnage
     */

    public void playTurn(int playerPosition, int boardSize, Personnage player) {
        GenerateCaseInBoard event = new GenerateCaseInBoard();
        Move move = new Move(boardSize, playerPosition);
        while (player.isAlive()) {

            dialogBox.dialogBoxGame(playerPosition, boardSize, player);
            int choice = inputScanner.intInputScanner();
            if (choice == 1) {
                if (playerPosition < boardSize) {
                    event.setEventAtBoard(playerPosition, player);
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
                new CreateCustomHero();
            }
            if (choice == 3) {
                System.out.println("retour au menu");
                new ShowMainMenu();
            }
        }
        while (!player.isAlive()) {
            new YouAreDead();
        }
    }
}
