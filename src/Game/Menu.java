package Game;

import Personnage.heros.Warrior;
import Personnage.heros.Wizard;
import Game.Board.Board;
import Game.Board.Game;
import Game.exception.playerOutOfBoardException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    ArrayList player = new ArrayList<>();

    /**
     * Menu Principal du jeu
     *
     */
    public void showMainMenu() {

        System.out.println("Bienvenue dans le donjon de Naheulbeuk!");
        System.out.println("Menu principal");
        System.out.println("1 : nouvelle partie rapide");
        System.out.println("2 : nouvelle partie personnalisée");
        System.out.println("3 : quittez le jeux");
        System.out.println("veuillez saisir votre choix");
        int choice = sc.nextInt();
        if (choice == 1) {
            player = new ArrayList((Collection) new Warrior());
        }
        if (choice == 2) {
            StartNewGame(player);
        }
        if (choice == 3) {
            System.out.println("merci au revoir !");
        }
        Menu Continue = new Menu();
        Continue.confirmChoice(player);
    }

    /**
     * Permet la création ou la modification des personages
     */
    public void StartNewGame(ArrayList player) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez un nom :");
        String name = sc.nextLine();
        System.out.println("Choisissez une classe :");
        String type = sc.nextLine();
        System.out.println(type);
        if ((name.isEmpty()) && (type.isEmpty())) {

            player = new ArrayList((Collection) new Warrior());
        }
        if ((!name.isEmpty()) && (type.isEmpty())) {

            player = new ArrayList((Collection) new Warrior(name));
        }
        if (!type.isEmpty()) {
            if (type.equals("Warrior")) {

                player = new ArrayList((Collection) new Warrior(name, type));
            }
            if (type.equals("Wizard")) {
                player = new ArrayList((Collection) new Wizard(name, type));
            }
        }
        Menu Continue = new Menu();
        Continue.confirmChoice(player);
    }

    /**
     * Confirmation des choix
     */
    public void confirmChoice(ArrayList player) {
        System.out.println("êtes vous sur de votre choix ?");
        System.out.println("appuyer sur 1 pour oui");
        System.out.println("appuyer sur 2 pour recommencer ");
        int choice = sc.nextInt();
        if (choice == 1) {
            Game start = new Game();
            try {
                Board plateaux = new Board();
                int boardSize = Board.boardSize();
                System.out.println(boardSize);
                int playerPosition = 1;
                start.playTurn(playerPosition, boardSize, player, plateaux);
            } catch (playerOutOfBoardException e) {
               showMainMenu();
            }
        }
        if (choice == 2) {
            StartNewGame(player);
        }
    }
}