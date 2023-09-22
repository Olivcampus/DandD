package Game.Board.Play;

import Game.InputScanner;
import Game.Menu;

public class WinGame {

    public WinGame(int playerPosition) {
        System.out.println("votre playerPosition est " + playerPosition);
        System.out.println("Bravo vous avez gagné");
        System.out.println("taper 1 pour recommencer");
        System.out.println("2 pour quitter");
        int choices = new InputScanner().intInputScanner();
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
