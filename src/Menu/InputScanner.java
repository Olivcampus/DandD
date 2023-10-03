package Menu;

import java.util.Scanner;

public class InputScanner {
    Scanner clavier = new Scanner(System.in);

    /**
     * S'occupe de récupérer les choix des joueurs
     */
    public int intInputScanner() {
        return clavier.nextInt();
    }

    public String strInputScanner() {
        return clavier.nextLine();
    }
}