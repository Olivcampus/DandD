package Game;

import Personnage.Personnage;
import Personnage.heros.Warrior;
import Personnage.heros.Wizard;
import Game.Board.Board;
import Game.Board.Game;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    ArrayList<Warrior> warriors = new ArrayList<>();
    ArrayList<Wizard> wizards = new ArrayList<>();

    /**
     * Menu Principal du jeu
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
            Warrior warrior = new Warrior();
            warriors.add(warrior);
            Menu Continue = new Menu();
            Continue.confirmChoice(warrior);
        }
        if (choice == 2) {
            StartNewGame();
        }
        if (choice == 3) {
            System.out.println("merci au revoir !");
        }
    }

    /**
     * Permet la création ou la modification des personages
     */
    public void StartNewGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez un nom :");
        String name = sc.nextLine();
        System.out.println("Choisissez une classe :");
        String type = sc.nextLine();
        System.out.println(type);
        if ((name.isEmpty()) || (type.isEmpty())) {
            System.out.println("veuillez saisir un nom ou un type");
            StartNewGame();
        }

        if (!name.isEmpty() && type.equals("Warrior")) {
            Warrior warrior = new Warrior(name, type);
            warriors.add(warrior);
            Menu Continue = new Menu();
            Continue.confirmChoice(warrior);
        }

        if (!name.isEmpty() && type.equals("Wizard")) {
            Wizard wizard = new Wizard(name, type);
            wizards.add(wizard);
            Menu Continue = new Menu();
            Continue.confirmChoice(wizard);
        }

    }

    /**
     * Confirmation des choix
     */
    public void confirmChoice(Personnage current) {
        System.out.println("êtes vous sur de votre choix ?");
        System.out.println("appuyer sur 1 pour oui");
        System.out.println("appuyer sur 2 pour recommencer ");
        int choice = sc.nextInt();
        if (choice == 1) {
            Game start = new Game();
            Board plateaux = new Board();
            int boardSize = plateaux.boardSize();
            System.out.println(boardSize);
            int playerPosition = 1;
            start.playTurn(playerPosition, boardSize, current, plateaux);
            showMainMenu();
        }

        if (choice == 2) {
            StartNewGame();
        }
    }
}