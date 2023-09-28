package Personnage.heros;

import Equipement.Attack.Weapon.WoodSword;
import Personnage.Personnage;
import Equipement.Defense.Shield.WoodShield;

public class Warrior extends Personnage {
    /**
     * Création du guerrier
     * qui hérite de personnage pour les valeurs par défaut
     */

    public Warrior(String name) {
        this(name, "Warrior");
    }

    public Warrior(String name, String type) {
        super(name, type);
        this.setLeftArm(new WoodSword());
        this.setRightArm(new WoodShield());
        this.setForce(getForce() + getLeftArm().getPowerWeapon());
    }
}