package Game.Board.Play;

import java.util.Scanner;

import Game.Board.Cases.*;
import Game.Menu;
import Game.exception.PlayerOutOfBoardException;
import Personnage.Personnage;

public class Game {

    /**
     * S'occupe du bon déroulement du jeu
     *
     * @Board pour le plateau
     * @menu pour modifier le personnage
     */
    public void playTurn(int playerPosition, int boardSize, Personnage player, Board plateaux, int de) {
        Move move = new Move();
        RamdomEvent event = new RamdomEvent();
        Scanner clavier = new Scanner(System.in);
        System.out.println(player);
        while (playerPosition <= boardSize) {
            if (playerPosition == 1) System.out.println("La partie démarre");
            System.out.println("votre position est " + playerPosition + "/" + boardSize);
            System.out.println("quel est votre choix");
            System.out.println("taper 1 pour jeter le dé");
            System.out.println("2 pour modifier votre personnage");
            System.out.println("3 pour quitter");
            int choice = clavier.nextInt();


            if (choice == 1) {
                if (playerPosition < boardSize) {
                    try {
                        playerPosition = move.MovePlayer(playerPosition);

                        event.ramdomEvent(playerPosition, boardSize, player, plateaux, de);

                    } catch (PlayerOutOfBoardException e) {

                        System.out.println("votre position est de " + playerPosition + " " + e.getMessage());

                    } finally {
                        playerPosition = move.MoveException(playerPosition);
                    }
                }

                if (playerPosition == boardSize) {
                    new WinGame(playerPosition);
                }
            }

            if (choice == 2) {
                Menu Pause = new Menu();
                Pause.StartNewGame();
            }
            if (choice == 3) {
                System.out.println("merci à bientôt");
                System.exit(0);

            }
        }
    }



}
