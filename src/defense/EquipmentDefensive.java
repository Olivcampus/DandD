package defense;

public class EquipmentDefensive {
        private String armorType ;
        private String armorName ;
        private int powerArmor;
        public  EquipmentDefensive(String armorType, String armorName, int powerArmor){
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

    public void setArmorType(String armorType){
            this.armorType=armorType;
        }

        public void setArmorName(String armorName) {
            this.armorName = armorName;
        }

        public void setPowerArmor (int powerArmor){
            this.powerArmor=powerArmor;
        }
    @Override
    public String toString() {
        return " une protection de type : " + armorType + ", du nom de :  " + armorName + " et d'une résistance de  " +  powerArmor ;
    }
}