package Game.Board.Play;


import java.util.Scanner;

import Game.Board.Cases.GenerateCaseInBoard;
import Game.Board.DialogBox;
import Game.Menu;
import Game.exception.PlayerOutOfBoardException;
import Personnage.Personnage;

public class Game {
    Menu Pause = new Menu();

    DialogBox dialogBox = new DialogBox();

    /**
     * S'occupe du bon déroulement du jeu
     *
     * @Board pour le plateau
     * @menu pour modifier le personnage
     */
    public void playTurn(int playerPosition, int boardSize, Personnage player, GenerateCaseInBoard plateaux, int de) {
        Move move = new Move();
        GenerateCaseInBoard RandomEvent = new GenerateCaseInBoard();
        Scanner clavier = new Scanner(System.in);
        while (playerPosition <= boardSize) {
            if (playerPosition == 1) System.out.println("La partie démarre");
            dialogBox.dialogBoxGame( playerPosition,  boardSize,  player);
            int choice = clavier.nextInt();
            if (choice == 1) {

                if (playerPosition < boardSize) {

                    try {
                        playerPosition = move.MovePlayer(playerPosition, boardSize);

                    } catch (PlayerOutOfBoardException e) {

                        System.out.println("votre position est de " + playerPosition + " " + e.getMessage());

                    } finally {
                        playerPosition = move.MoveException(playerPosition, boardSize);
                    }

                }

                if (playerPosition == boardSize) {
                    new WinGame(playerPosition);
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
