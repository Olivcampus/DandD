package model;

public class EquipmentDefensive {
        private String armorType ;
        private String armorName ;
        private double powerArmor;
        public  EquipmentDefensive(String armorType, String armorName, double powerArmor){
            this.armorType = armorType;
            this.armorName = armorName;
            this.powerArmor = powerArmor;
        }

        public void setArmorType(String armorType){
            this.armorType=armorType;
        }

        public void setArmorName(String armorName) {
            this.armorName = armorName;
        }

        public void setPowerArmor (double powerArmor){
            this.powerArmor=powerArmor;
        }
    @Override
    public String toString() {
        return " une protection de type : " + armorType + ", du nom de :  " + armorName + " et d'une résistance de  " +  powerArmor ;
    }
}