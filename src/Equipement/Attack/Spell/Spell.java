package Equipement.Attack.Spell;

import Equipement.Attack.EquipmentOffensive;

public class Spell extends EquipmentOffensive {
    /**
     * Patron pour les armes de types Spell
     */
    public Spell(String WeaponName, int powerWeapon) {
        super("Wizard", WeaponName, powerWeapon);
    }

}
