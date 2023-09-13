package model;

public abstract class Personnage {

    private String name;
    private int life;
    private int force;
    private String type;
    private String leftArm;
    private String rightArm;

    public Personnage(int position) {
        this.name = "hero.Warrior";
        this.life = 10;
        this.force = 15;
        this.type = "Warrior";
        this.leftArm = "";
        this.rightArm="";
    }

    public Personnage(String name, int position) {

        this.name = name;
        this.life = 10;
        this.force = 15;
        this.type = "hero.Warrior";
        this.leftArm = "";
        this.rightArm="";
    }

    public Personnage(String name, String type, int position) {
        this.name = name;
        this.life = 10;
        this.force = 10;
        this.leftArm = "";
        this.rightArm="";
        this.type = type;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setLeftArm(String leftArm) {
        this.leftArm = leftArm;
    }

    public void setRightArm(String rightArm) {
        this.rightArm = rightArm;
    }

    @Override
    public String toString() {
        return "votre nom : " + name + " vie :" + life + " force : " + force + " votre classe :" + type + " votre équipement : " + leftArm + " et " + rightArm + ".";
    }
}