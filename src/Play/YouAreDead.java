package Play;

import Menu.CreateCustomHero;
import Menu.InputScanner;
import Menu.ShowMainMenu;

public class YouAreDead {
    /**
     * Menu se lançant à la mort du joueur
     */
    public YouAreDead() {
        System.out.println("vous êtes décédé");
        System.out.println("choisissez 1 pour recréer un personnage et 2 pour retourner au menu principal");
        int choice = new InputScanner().intInputScanner();
        switch (choice) {
            case 1:
                new CreateCustomHero();
            case 2:
                new ShowMainMenu();
            default:
                System.out.println("choix invalide");
                new YouAreDead();
        }
    }
}
