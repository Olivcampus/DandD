package Personnage;

import equipement.Attack.EquipmentOffensive;
import equipement.defense.EquipmentDefensive;

public abstract class Personnage {

    private String name;
    private int life;
    private int force;
    public String type;
    protected EquipmentOffensive leftArm;
    protected EquipmentDefensive rightArm;

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
        this.force = force;
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
        return "votre nom : " + name + " vie :" + life + " force : " + force + " votre classe :" + type + " votre équipement : " + leftArm + " et " + rightArm + ".";
    }
}