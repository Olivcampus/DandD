package game.Board;

import java.util.Scanner;

import game.Menu;
import game.exception.playerOutOfBoardException;

public class Game {

    /**
     * S'occupe du bon déroulement du jeu
     *
     * @throws Throwable en cas d'erreur
     * @Board pour le plateau
     * @menu pour modifier le personnage
     */
    public void playTurn() throws playerOutOfBoardException {

        Board plateaux = new Board();
        System.out.println(plateaux);
        int size = 0;
        Board boardSize = boardSize(size);
        System.out.println(boardSize);
        int de;
        int playerPosition = 1;
        Scanner clavier = new Scanner(System.in);

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
                    throw new playerOutOfBoardException();
                }
                if (playerPosition == boardSize) {
                    System.out.println("votre playerPosition est " + playerPosition);
                    System.out.println("Bravo vous avez gagné");
                    System.out.println("taper 1 pour recommencer");
                    System.out.println("2 pour quitter");
                    clavier.nextLine();
                    int choices = clavier.nextInt();
                    if (choices == 1) {
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
                Pause.StartNewGame();
            }
            if (choice == 3) {
                System.out.println("merci à bientôt");
            }
        }

    }
}

