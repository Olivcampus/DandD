package hero;
import Attack.Weapon;
import game.Menu;
import game.PlateauxException;
import model.Personnage;
import defense.shield;
public class Warrior extends Personnage {
    public Warrior(int position) throws PlateauxException {
        super(position);
        this.setLeftArm(String.valueOf(new Weapon("blade", "épée en bois", 0)));
        this.setRightArm(String.valueOf(new shield("shield", "bouclier en bois", 0)));
        System.out.println(this);
        Menu Continue = new Menu();
        Continue.confirmChoice(position);
    }

    public Warrior(String name, int position) throws PlateauxException {
        super(name, position);
        this.setLeftArm(String.valueOf(new Weapon("blade", "épée en bois", 0)));
        this.setRightArm(String.valueOf(new shield("shield", "bouclier en bois", 0)));
        System.out.println(this);
        Menu Continue = new Menu();
        Continue.confirmChoice(position);
    }

    public Warrior(String name, String type, int position) throws PlateauxException {
        super(name, type, position);
        this.setLeftArm(String.valueOf(new Weapon("blade", "épée en bois", 0)));
        this.setRightArm(String.valueOf(new shield("shield", "bouclier en bois", 0)));
        System.out.println(this);
        Menu Continue = new Menu();
        Continue.confirmChoice(position);
     }
}