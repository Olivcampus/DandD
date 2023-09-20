package Personnage.monsters;

import Personnage.Personnage;

public class Dragon extends Personnage {
    public Dragon(){
        super("Lucas", "Dragon");
        this.setForce(60);
        this.setLife(100);
    }
}
