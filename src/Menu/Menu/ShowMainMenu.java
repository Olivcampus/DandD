package Menu.Menu;

public class ShowMainMenu {
    DialogBox dialogBox = new DialogBox();

    /**
     * Menu Principal du jeu
     */
    public ShowMainMenu() {
        dialogBox.dialogMainMenu();
        int choice = new InputScanner().intInputScanner();
        switch (choice) {
            case 1:
                new ClassPreset();
                break;
            case 2:
                new CreateCustomHero();
                break;
            case 3:
                System.out.println("merci au revoir !");
                break;
            default: new ShowMainMenu();
        }
    }
}
