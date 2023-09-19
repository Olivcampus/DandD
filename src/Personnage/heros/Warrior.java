package Personnage.heros;

import equipement.Attack.weapon.WoodSword;
import Personnage.Personnage;
import equipement.defense.shield.WoodShield;
import java.util.Arrays;

public class Warrior extends Personnage {
    /**
     * Création du guerrier
     * @Personnage pour hériter des valeurs par défaut
     */
    public Warrior() {

         this("Noname");

    }

    public Warrior(String name) {

        this(name, "Warrior" );

    }

    public Warrior(String name, String type) {
        super(name, type);
        this.setLeftArm(new WoodSword());
        this.setRightArm(new WoodShield());
        this.setForce(getForce() + getLeftArm().getPowerWeapon());
        this.setLife(getLife() + getRightArm().getPowerArmor());


        System.out.println(this);

     }
}