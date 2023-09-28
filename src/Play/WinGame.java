package Play;

import Menu.Menu.InputScanner;
import Menu.Menu.ShowMainMenu;

public class WinGame {
    /**
     * Fonction qui se déclenche quand le joueur a gagné
     */
    public WinGame() {
        System.out.println("Bravo vous avez gagné");
        System.out.println("taper 1 pour recommencer");
        System.out.println("2 pour quitter");
        int choices = new InputScanner().intInputScanner();
        if (choices == 1) {
            new ShowMainMenu();
        }
        if (choices == 2) {
            System.out.println("à bientôt ");
            System.exit(0);
        }
    }
}