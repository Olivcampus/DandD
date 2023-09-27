package Game.Board.Cases.CreateCase;


import Personnage.Personnage;
import Personnage.monsters.*;

public class EventCaseEnemy {
    Personnage enemy;

    public Personnage generateMonster() {
        int monsterChoice = 1 + (int) (Math.random() * ((7 - 1) + 1));
        switch (monsterChoice) {
            case 1:
                enemy = new Goblin();
                break;
            case 2:
                enemy = new Dragon();
                break;
            case 3:
                enemy = new Spider();
                break;
            case 4:
                enemy = new Troll();
                break;
            case 5:
                enemy = new Vampyr();
                break;
            case 6:
                enemy = new Witch();
                break;
            case 7:
                enemy = new WhiteRabbit();
                break;
        }
        return enemy;
    }


}