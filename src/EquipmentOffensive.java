public class EquipmentOffensive {
    private String WeaponType ;
    private String WeaponName ;
    private double powerWeapon;
    public void equipmentoffensive(String WeaponType, String WeaponName, double powerWeapon ){
        this.WeaponType = WeaponType;
        this.WeaponName = WeaponName;
        this.powerWeapon = powerWeapon;
    }

    @Override
    public String toString() {
        return " une arme de type :" + WeaponType + ", du nome de :  "+  WeaponName + " et d'une puissance de : " +powerWeapon;
    }
}