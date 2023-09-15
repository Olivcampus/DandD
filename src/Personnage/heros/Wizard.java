package Personnage.heros;

import Attack.spell.FireBall;
import defense.potion.BasicPotion;
import game.Menu;
import Personnage.Personnage;
import game.exception.playerOutOfBoardException;

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
        System.out.println(getForce());
        Menu Continue = new Menu();
        Continue.confirmChoice();

    }


}