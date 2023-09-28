package Menu.Menu;

public class YouAreDead {
    /**
     * Menu se lançant à la mort du joueur
     */
    public  YouAreDead() {
        int choice = new InputScanner().intInputScanner();
        System.out.println("vous êtes décédé");
        System.out.println("choisissez 1 pour recréer un personnage et 2 pour retourner au menu principale");
        switch (choice) {
            case 1:
                new CreateCustomHero();
            case 2:
                new ShowMainMenu();
        }
    }
}
