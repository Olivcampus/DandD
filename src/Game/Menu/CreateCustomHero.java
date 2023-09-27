package Game.Menu;

import Personnage.heros.Warrior;
import Personnage.heros.Wizard;

import java.util.ArrayList;

public class CreateCustomHero {
    ArrayList<Warrior> warriors = new ArrayList<>();

    ArrayList<Wizard> wizards = new ArrayList<>();

    public CreateCustomHero() {

        System.out.println("Choisissez un nom :");
        String name = new InputScanner().strInputScanner();
        System.out.println("Choisissez une classe , tapez 1 pour guerrier, 2 pour sorcier");
        int type = new InputScanner().intInputScanner();
        System.out.println(type);

        if (!name.isEmpty() && type == 1) {
            Warrior warrior = new Warrior(name);
            warriors.add(warrior);
            new ConfirmChoice(warrior);
        }

        if (!name.isEmpty() && type == 2) {
            Wizard wizard = new Wizard(name);
            wizards.add(wizard);
            new ConfirmChoice(wizard);
        } else {
            System.out.println("Nom ou/et type non renseigné, veuillez recommencer");
            new CreateCustomHero();
        }
    }
}