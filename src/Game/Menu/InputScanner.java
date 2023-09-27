package Game.Menu;

import java.util.Scanner;

public class InputScanner {
    Scanner clavier = new Scanner(System.in);

    public int intInputScanner() {
        return clavier.nextInt();
    }

    public String strInputScanner() {
        return clavier.nextLine();
    }
}
