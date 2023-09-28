package Personnage.heros;

import Equipement.Attack.Spell.MagicArrow;
import Equipement.Defense.Potion.BasicPotion;
import Personnage.Personnage;

public class Wizard extends Personnage {

    /**
     * Création du Sorcier
     *
     * @Personnage pour hériter des valeurs par défaut
     */
    public Wizard(String name) {
        this(name, "Wizard");
    }

    public Wizard(String name, String type) {
        super(name, type);
        this.setLeftArm(new MagicArrow());
        this.setRightArm(new BasicPotion());
        this.setForce(this.getForce() + this.getLeftArm().getPowerWeapon());
    }
}