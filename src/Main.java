import game.Menu;
import game.PlateauxException;

public class Main {
    public static void main(String[] args) throws PlateauxException {

        int position = 1;
        Menu start = new Menu();
        start.mainMenu(position);
    }
}