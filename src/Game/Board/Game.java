package Game.Board;

import java.util.ArrayList;
import java.util.Scanner;
import Game.Menu;
import Game.exception.playerOutOfBoardException;


public class Game implements Cases{

    /**
     * S'occupe du bon déroulement du jeu
     *
     * @Board pour le plateau
     * @menu pour modifier le personnage
     */
    public void playTurn(int playerPosition, int boardSize, ArrayList player, Board plateaux)  throws playerOutOfBoardException {

        int de;
        Scanner clavier = new Scanner(System.in);
        System.out.println(player);
        while (true) {
            if (playerPosition == 1) {
                System.out.println("La partie démarre");
            }
            System.out.println("votre playerPosition est " + playerPosition);
            System.out.println("quel est votre choix");
            System.out.println("taper 1 pour jeter le dé");
            System.out.println("2 pour modifier votre personnage");
            System.out.println("3 pour quitter");
            int choice = clavier.nextInt();
            if (choice == 1) {
                de = 1 + (int) (Math.random() * ((6 - 1) + 1));
                playerPosition = playerPosition + de;
                if (playerPosition > boardSize) {
                    throw new playerOutOfBoardException(playerPosition, de, boardSize, player, plateaux);
                }
                if (playerPosition == boardSize) {
                    System.out.println("votre playerPosition est " + playerPosition);
                    System.out.println("Bravo vous avez gagné");
                    System.out.println("taper 1 pour recommencer");
                    System.out.println("2 pour quitter");
                    clavier.nextLine();
                    int choices = clavier.nextInt();
                    if (choices == 1) {
                        boardSize = 0;
                        playerPosition = 1;
                        Menu Start = new Menu();

                        Start.showMainMenu();
                    }
                    if (choices == 2) {
                        System.out.println("à bientôt ");
                        System.exit(0);
                    }
                }
            }
            if (choice == 2) {
                Menu Pause = new Menu();
                Pause.StartNewGame(player);
            }
            if (choice == 3) {
                System.out.println("merci à bientôt");
            }
        }

    }

    @Override
    public void eventmonster() {

    }
}

