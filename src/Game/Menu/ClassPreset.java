package Game.Menu;


import Personnage.heros.Warrior;
import Personnage.heros.Wizard;

import java.util.ArrayList;

public class ClassPreset {
    ArrayList<Warrior> warriors = new ArrayList<>();
    ArrayList<Wizard> wizards = new ArrayList<>();
    public  ClassPreset() {
        System.out.println("choisissez votre classe : tapez  1 pour guerrier ou 2 pour sorcier");
        int choice = new InputScanner().intInputScanner();

        switch (choice) {
            case 1:
                Warrior player = new Warrior("NoName");
                warriors.add(player);
                new ConfirmChoice(player);
            case 2:
                Wizard wizard = new Wizard("NoName");
                wizards.add(wizard);
                new ConfirmChoice(wizard);
            default:
                System.out.println("veuillez faire un choix valide");
                new ClassPreset();
        }
    }
}