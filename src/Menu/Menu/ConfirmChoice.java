package Menu.Menu;

import Personnage.Personnage;
import Personnage.heros.Warrior;
import Personnage.heros.Wizard;

public class ConfirmChoice {
    /**
     *
     * menu de confirmation servant au recap du hero créer par le joueur avant de lancer le jeu
     */
    public ConfirmChoice(Warrior warrior) {confirmChoice(warrior);}

    public ConfirmChoice(Wizard wizard) {
        confirmChoice(wizard);
    }

    /**
     * Confirmation des choix
     */
    public void confirmChoice(Personnage current) {
        System.out.println(current);
        System.out.println("êtes vous sur de votre choix ?");
        System.out.println("appuyer sur 1 pour oui");
        System.out.println("appuyer sur 2 pour retourner au menu principal");
        int choice = new InputScanner().intInputScanner();
        switch (choice) {
            case 1:
                new CreateGame(current);
                break;
            case 2:
                new ShowMainMenu();
                break;
            default:
                System.out.println("veuillez faire un choix valide");
                confirmChoice(current);
        }
    }
}