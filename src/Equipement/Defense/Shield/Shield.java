package Equipement.Defense.Shield;

import Equipement.Defense.EquipmentDefensive;

public class Shield extends EquipmentDefensive {
    /**
     * Patron pour les défenses de types armures
     */
    public Shield(String armorName, int powerArmor) {
        super("Warrior", armorName, powerArmor);
    }
}