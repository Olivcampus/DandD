package Personnage;

import Equipement.Attack.EquipmentOffensive;
import Equipement.Defense.EquipmentDefensive;

public abstract class Personnage {

    private final String name;
    private int life;
    private int force;
    public String type;
    protected EquipmentOffensive leftArm;
    protected EquipmentDefensive rightArm;
    private int playerPosition;

    /**
     * Classe abstraite créant les attributs qui vont servir à la création des héros et des monstres
     */

    public Personnage() {
        this("Noname");
    }

    public Personnage(String name) {

        this(name, "Warrior");
    }

    public Personnage(String name, String type) {
        this.name = name;
        this.life = 10;
        this.force = 10;
        this.type = type;
    }


    public void setForce(int force) {
        if (force < 0) force = 0;
        this.force = force;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }
//    public abstract boolean receivePotion(Potion potion);

    public boolean isAlive() {
        return life > 0;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getForce() {
        return force;
    }

    public String getType() {
        return type;
    }

    public EquipmentOffensive getLeftArm() {
        return leftArm;
    }

    public EquipmentDefensive getRightArm() {
        return rightArm;
    }

    public void setLeftArm(EquipmentOffensive leftArm) {
        this.leftArm = leftArm;
    }

    public void setRightArm(EquipmentDefensive rightArm) {
        this.rightArm = rightArm;
    }


    @Override
    public String toString() {
        return "votre nom est " + name + " , votre vie est de :" + life + " Pv, d'une force de : " + force + " ,votre classe est : " + type + " " + leftArm + " et aussi " + rightArm;
    }
}