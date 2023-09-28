package Equipement.Attack.Weapon;

import Equipement.Attack.EquipmentOffensive;

/**
 * Patron pour les armes de types Weapon
 */
public class Weapon extends EquipmentOffensive {
    public Weapon(String WeaponName, int powerWeapon) {
        super("Warrior", WeaponName, powerWeapon);
    }
}
