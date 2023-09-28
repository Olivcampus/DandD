package Menu.Menu;


import Personnage.heros.Warrior;
import Personnage.heros.Wizard;

public class ClassPreset {
    /**
     * Créer un personnage par défaut
     */
    public  ClassPreset() {
        System.out.println("choisissez votre classe : tapez  1 pour guerrier ou 2 pour sorcier");
        int choice = new InputScanner().intInputScanner();

        switch (choice) {
            case 1:
                Warrior player = new Warrior("NoName");
                new ConfirmChoice(player);
            case 2:
                Wizard wizard = new Wizard("NoName");
                new ConfirmChoice(wizard);
            default:
                System.out.println("veuillez faire un choix valide");
                new ClassPreset();
        }
    }
}