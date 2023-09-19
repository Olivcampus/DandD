package Game.Board;

import java.util.Scanner;
import Game.Board.Cases.Cases;
import Game.Board.Cases.EventCaseEnemy;
import Game.Menu;
import Game.exception.PlayerOutOfBoardException;
import Personnage.Personnage;


public class Game implements Cases {


    /**
     * S'occupe du bon déroulement du jeu
     *
     * @Board pour le plateau
     * @menu pour modifier le personnage
     */
    public void playTurn(int playerPosition, int boardSize, Personnage player, Board plateaux) {
        int ramdomEvent;
        int de;
        Scanner clavier = new Scanner(System.in);
        System.out.println(player);
        while (true) {
            if (playerPosition == 1) {
                System.out.println("La partie démarre");
            }
            System.out.println("votre position est " + playerPosition + "/" + boardSize);
            System.out.println("quel est votre choix");
            System.out.println("taper 1 pour jeter le dé");
            System.out.println("2 pour modifier votre personnage");
            System.out.println("3 pour quitter");
            int choice = clavier.nextInt();
            ramdomEvent = 1 + (int) (Math.random() * ((6 - 1) + 1));
            if (ramdomEvent == 1) {
                EventEnemy(playerPosition, boardSize,player, plateaux);
            }
            if (choice == 1) {
                de = 1 + (int) (Math.random() * ((6 - 1) + 1));
                playerPosition = playerPosition + de;
                if (playerPosition > boardSize) {
                    try {
                        throw new PlayerOutOfBoardException("vous êtes allé(e) trop loin mouvement annulé"){

                        };
                    } catch (PlayerOutOfBoardException e) {

                        System.out.println("vous avez fais un jet de " + de + " et votre position est de " + playerPosition);
                        playerPosition -= de;
                        System.out.println("retour en position " + playerPosition);
                        Game start = new Game();
                        start.playTurn(playerPosition, boardSize, player, plateaux);
                    }
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
                Pause.StartNewGame();
            }
            if (choice == 3) {
                System.out.println("merci à bientôt");
            }
        }
    }

    @Override
    public  void EventEnemy(int playerPosition, int boardSize, Personnage player, Board plateaux) {
        new EventCaseEnemy(playerPosition, boardSize,  player, plateaux );
    }
}
