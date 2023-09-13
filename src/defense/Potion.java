package defense;
import model.EquipmentDefensive;
public class Potion extends EquipmentDefensive {
    public Potion (String armorType, String armorName, double powerArmor){
        super (armorType, armorName, powerArmor);
        this.setArmorType (armorType);
        this.setArmorName(armorName);
        this.setPowerArmor(powerArmor);
    }
}
