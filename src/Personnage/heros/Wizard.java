package Personnage.heros;

import equipement.Attack.spell.FireBall;
import equipement.defense.potion.BasicPotion;
import Personnage.Personnage;

public class Wizard extends Personnage {

    /**
     * Création du Sorcier
     * @Personnage pour hériter des valeurs par défaut
     */

    public Wizard (String name, String type) {
        super(name, type);
        this.setLeftArm(new FireBall());
        this.setRightArm(new BasicPotion());
        this.setForce(15 + getLeftArm().getPowerWeapon());
        this.setLife(6+ getRightArm().getPowerArmor());
    }
}