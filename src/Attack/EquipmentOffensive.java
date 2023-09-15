package Attack;

public class  EquipmentOffensive {
    private String WeaponType ;
    private String WeaponName ;
    private int powerWeapon;
    public EquipmentOffensive(String WeaponType, String WeaponName, int powerWeapon ){
        this.WeaponType = WeaponType;
        this.WeaponName = WeaponName;
        this.powerWeapon = powerWeapon;
    }
    public void setWeaponType(String WeaponType){
        this.WeaponType = WeaponType;
    }

    public void setWeaponName(String WeaponName){
        this.WeaponName=WeaponName;
    }

    public void setPowerWeapon(int powerWeapon){
        this.powerWeapon=powerWeapon;
    }

    public String getWeaponType() {
        return WeaponType;
    }

    public String getWeaponName() {
        return WeaponName;
    }

    public int getPowerWeapon() {
        return powerWeapon;
    }

    @Override
    public String toString() {
        return " une arme de type :" + WeaponType + ", du nome de :  "+  WeaponName + " et d'une puissance de : " +powerWeapon;
    }
}