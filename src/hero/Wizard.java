package hero;

import defense.Potion;
import game.Menu;
import Attack.Spell;
import game.PlateauxException;
import model.Personnage;

public class Wizard extends Personnage {

    public Wizard (String name, String type, int position) throws PlateauxException {
        super(name, type, position);
        this.setLife(6);
        this.setForce(15);
        this.setLeftArm(String.valueOf(new Spell("spell", "boule de feu", 0)));
        this.setRightArm(String.valueOf(new Potion("potion", "philtre en bois", 0)));

        System.out.println(this);
        Menu Continue = new Menu();
        Continue.confirmChoice(position);
    }
}