package Equipement.Defense;

public class EquipmentDefensive {
    private final String armorType;
    private final String armorName;
    private final int powerArmor;

    /**
     * Déclare les attributs pour les équipements défensifs
     */
    public EquipmentDefensive(String armorType, String armorName, int powerArmor) {
        this.armorType = armorType;
        this.armorName = armorName;
        this.powerArmor = powerArmor;
    }

    public String getArmorType() {
        return armorType;
    }

    public String getArmorName() {
        return armorName;
    }

    public int getPowerArmor() {
        return powerArmor;
    }


    @Override
    public String toString() {
        return " une protection du nom de :  " + armorName + " et d'une résistance de  " + powerArmor;
    }
}