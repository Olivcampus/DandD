public class Personnage {

    private String name;
    private int life;
    private int force;
    private String type;
    private String leftArm;
    private String rightArm;
    EquipmentOffensive defautW = new EquipmentOffensive();
    EquipmentDefensive defautS = new EquipmentDefensive();
    Menu Continue = new Menu();
    public Personnage (){
        this.name ="Warrior";
        this.life = 10;
        this.force = 15;
        defautW.equipmentoffensive("blade", "épée émoussée", 0);
        defautS.Equipmentdefensive("shield", "bouclier en bois", 0);
        this.leftArm = defautS.toString();
        this.rightArm = defautW.toString();
        this.type = "Warrior";
        System.out.println(this);
        Game Start =  new Game();
        Start.game();
    }
    public Personnage (String name){

        this.name = name;
        this.life = 10;
        this.force = 15;
        defautW.equipmentoffensive("blade", "épée émoussée", 0);
        defautS.Equipmentdefensive("shield", "bouclier en bois", 0);
        this.leftArm = defautS.toString();
        this.rightArm = defautW.toString();
        this.type = "Warrior";
        System.out.println(this);
        Continue.confirmChoice();
    }
    public Personnage (String name, String type) {
        this.name = name;
        this.life = 10;
        this.force = 15;
        defautW.equipmentoffensive("blade", "épée émoussée", 0);
        defautS.Equipmentdefensive("shield", "bouclier en bois", 0);
        this.leftArm = defautS.toString();
        this.rightArm = defautW.toString();
        this.type = type;
        System.out.println(this);
        Continue.confirmChoice();
    }

    @Override
    public String toString() {
        return "votre nom : "+ name + " vie :" + life + " force : " + force + " votre classe :" + type +" votre équipement : " + leftArm + " et " + rightArm + ".";
    }


}