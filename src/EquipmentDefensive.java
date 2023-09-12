public class EquipmentDefensive {
        private String armorType ;
        private String armorName ;
        private double powerArmor;
        public  void Equipmentdefensive(String armorType, String armorName, double powerArmor){
            this.armorType = armorType;
            this.armorName = armorName;
            this.powerArmor = powerArmor;
        }

    @Override
    public String toString() {
        return " une protection de type : " + armorType + ", du nom de :  " + armorName + " et d'une résistance de  " +  powerArmor ;
    }
}