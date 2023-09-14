package defense;
import model.EquipmentDefensive;
public class shield  extends EquipmentDefensive {
    public shield (String armorType, String armorName, double powerArmor){
        super (armorType, armorName, powerArmor);
        this.setArmorType (armorType);
        this.setArmorName(armorName);
        this.setPowerArmor(powerArmor);
    }
}