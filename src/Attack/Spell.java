package Attack;
import model.EquipmentOffensive;
public class Spell  extends EquipmentOffensive {
    public Spell(String WeaponType, String WeaponName, double powerWeapon){
        super( WeaponType,  WeaponName,  powerWeapon );
        this.setPowerWeapon(powerWeapon);
        this.setWeaponName(WeaponName);
        this.setWeaponType(WeaponType);

    }

}
