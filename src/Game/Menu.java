package Game;

import Game.Board.Cases.GenerateCaseInBoard;
import Game.Board.DialogBox;
import Personnage.Personnage;
import Personnage.heros.*;
import Game.Board.Play.*;
import Personnage.heros.HerosPreset.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    ArrayList<Warrior> warriors = new ArrayList<>();
    ArrayList<Wizard> wizards = new ArrayList<>();
    Warrior warrior = new Warrior();
    DialogBox dialogBox = new DialogBox();

    int boardSize;
    /**
     * Menu Principal du jeu
     */
    public void showMainMenu() {
        dialogBox.dialogMainMenu();

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                warriors.add(warrior);
                confirmChoice(warrior);
                break;

            case 2:
                classPreset();
                break;
            case 3:
                StartNewGame();
                break;
            case 4:
                System.out.println("merci au revoir !");
                break;
        }

    }

    public void classPreset() {
        System.out.println("choisissez votre classe : tapez  1 pour guerrier ou 2 pour sorcier");
        int classChoice = sc.nextInt();
        switch (classChoice) {
            case 1:
                Warrior player= new DefaultWarrior();
                warriors.add(player);
                confirmChoice(player);
            case 2:
                Wizard wizard = new DefaultWizard();
                wizards.add(new DefaultWizard());
                confirmChoice(wizard);
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
            Warrior warrior = new Warrior(name);
            warriors.add(warrior);
            confirmChoice(warrior);
        }

        if (!name.isEmpty() && type == 2) {
            Wizard wizard = new Wizard(name);
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
        System.out.println("appuyer sur 2 pour retourner au menu Principal ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                createGame(current);
                break;
            case 2:
                showMainMenu();
                break;
        }
    }
    public void createGame(Personnage current){
        int de = 0;
        Game start = new Game();
        GenerateCaseInBoard plateaux = new GenerateCaseInBoard();
        plateaux.boardSize(boardSize);

        int playerPosition = 1;
        start.playTurn(playerPosition, boardSize, current, plateaux, de);
    }
}