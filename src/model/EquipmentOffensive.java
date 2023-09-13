package model;

public class  EquipmentOffensive {
    private String WeaponType ;
    private String WeaponName ;
    private double powerWeapon;
    public EquipmentOffensive(String WeaponType, String WeaponName, double powerWeapon ){
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

    public void setPowerWeapon(double powerWeapon){
        this.powerWeapon=powerWeapon;
    }

    @Override
    public String toString() {
        return " une arme de type :" + WeaponType + ", du nome de :  "+  WeaponName + " et d'une puissance de : " +powerWeapon;
    }
}