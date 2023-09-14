package hero;

import Attack.Weapon;
import game.Menu;
import model.Personnage;
import defense.shield;
public class Warrior extends Personnage {
    public Warrior() {
        this("Noname");

    }

    public Warrior(String name) {
        this(name, "Warrior" );
    }

    public Warrior(String name, String type) {
        super(name, type);
        this.setLeftArm(String.valueOf(new Weapon("blade", "épée en bois", 0)));
        this.setRightArm(String.valueOf(new shield("shield", "bouclier en bois", 0)));
        System.out.println(this);
     }
}