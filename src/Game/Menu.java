package Game;

import Personnage.Personnage;
import Personnage.heros.Warrior;
import Personnage.heros.Wizard;
import Game.Board.Play.Board;
import Game.Board.Play.Game;

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
        switch (choice) {
            case 1:
                Warrior warrior = new Warrior();
                warriors.add(warrior);
                confirmChoice(warrior);
                break;
            case 2:
                StartNewGame();
            case 3:
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
        System.out.println("Choisissez une classe , tapez 1 pour guerrier, 2 pour sorcier");
        int type = sc.nextInt();
        System.out.println(type);

        if (!name.isEmpty() && type == 1) {
            Warrior warrior = new Warrior(name, "Warrior");
            warriors.add(warrior);
            confirmChoice(warrior);
        }

        if (!name.isEmpty() && type == 2) {
            Wizard wizard = new Wizard(name, "Wizard");
            wizards.add(wizard);
            confirmChoice(wizard);
        } else {
            System.out.println("Nom ou/et type non renseigné, veuillez recommencer");
            StartNewGame();
        }

    }

    /**
     * Confirmation des choix
     */
    public void confirmChoice(Personnage current) {
        System.out.println(current);
        System.out.println("êtes vous sur de votre choix ?");
        System.out.println("appuyer sur 1 pour oui");
        System.out.println("appuyer sur 2 pour recommencer ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                int de = 0;
                Game start = new Game();
                Board plateaux = new Board();
                int boardSize = plateaux.boardSize();
                int playerPosition = 1;
                start.playTurn(playerPosition, boardSize, current, plateaux, de);
                break;
            case 2:
                StartNewGame();
        }
    }
}