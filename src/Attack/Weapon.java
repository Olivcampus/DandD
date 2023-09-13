package Attack;

import model.EquipmentOffensive;

public class Weapon extends EquipmentOffensive {
    public Weapon(String WeaponType, String WeaponName, double powerWeapon){
        super(WeaponType, WeaponName, powerWeapon);
        this.setPowerWeapon(powerWeapon);
        this.setWeaponName(WeaponName);
        this.setWeaponType(WeaponType);
    }
}
