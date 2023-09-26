package Game;

import Game.Board.Cases.GenerateCaseInBoard;
import Game.Board.DialogBox;
import Personnage.Personnage;
import Personnage.heros.*;

import Personnage.heros.HerosPreset.*;

import java.util.ArrayList;


public class Menu {

    ArrayList<Warrior> warriors = new ArrayList<>();
    ArrayList<Wizard> wizards = new ArrayList<>();
    Warrior warrior = new Warrior();
    DialogBox dialogBox = new DialogBox();

    /**
     * Menu Principal du jeu
     */
    public void showMainMenu() {
        dialogBox.dialogMainMenu();

        int choice = new InputScanner().intInputScanner();
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
        int classChoice = new InputScanner().intInputScanner();
        switch (classChoice) {
            case 1:
                Warrior player = new DefaultWarrior();
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

        System.out.println("Choisissez un nom :");
        String name = new InputScanner().strInputScanner();
        System.out.println("Choisissez une classe , tapez 1 pour guerrier, 2 pour sorcier");
        int type = new InputScanner().intInputScanner();
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
        System.out.println("appuyer sur 2 pour supprimer et retourner au menu principal");
        int choice = new InputScanner().intInputScanner();
        switch (choice) {
            case 1:
                createGame(current);
                break;
            case 2:
                warriors.remove(current);
                showMainMenu();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }
    }

    public void createGame(Personnage current) {
        new GenerateCaseInBoard(current);

    }
}