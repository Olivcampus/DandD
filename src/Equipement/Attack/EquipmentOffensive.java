package Equipement.Attack;

public class EquipmentOffensive {
    private final String WeaponType;
    private final String WeaponName;
    private final int powerWeapon;

    /**
     * Déclare les attributs pour les équipements offensifs
     */
    public EquipmentOffensive(String WeaponType, String WeaponName, int powerWeapon) {
        this.WeaponType = WeaponType;
        this.WeaponName = WeaponName;
        this.powerWeapon = powerWeapon;
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
        return " une arme du nom de :  " + WeaponName + " et d'une puissance de : " + powerWeapon;
    }
}