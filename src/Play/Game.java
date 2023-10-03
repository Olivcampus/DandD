package Play;

import Event.GenerateEventInCase;
import Menu.DialogBox;
import Menu.InputScanner;
import Menu.ShowMainMenu;
import Play.exception.PlayerOutOfBoardException;
import Personnage.Personnage;

import java.util.ArrayList;

public class Game {
    DialogBox dialogBox = new DialogBox();
    private final InputScanner inputScanner = new InputScanner();
    GenerateEventInCase event = new GenerateEventInCase();
    Move move = new Move();

    /**
     * S'occupe du bon déroulement du jeu
     * cette fonction s'occupe du bon déroulement des jeux et appellent les fonctions à mesure du que le jeu avances
     *
     * @menu pour modifier le personnage
     */

    public void playTurn(Personnage player, ArrayList<String> plateaux) {

        while (player.isAlive()) {
            dialogBox.dialogBoxGame(player);
            int choice = inputScanner.intInputScanner();
            switch (choice) {
                case 1:
                    if (player.getPlayerPosition() < plateaux.size()) {
                        try {
                            player.setPlayerPosition(move.movePlayer(plateaux, player));
                        } catch (PlayerOutOfBoardException e) {
                            System.out.println(e.getMessage());
                        } finally {
                            player.setPlayerPosition(move.moveException(plateaux, player));
                        }
                        event.setEventAtBoard(player, plateaux);
                        System.out.println(plateaux);
                        break;
                    }
                case 2:
                    System.out.println("retour au menu");
                    new ShowMainMenu();
                    break;
                default:
                    System.out.println("veuillez faire un choix valide");
                    playTurn(player, plateaux);
                    break;
            }
        } if (!player.isAlive())  {
            new YouAreDead();
        }
    }
}