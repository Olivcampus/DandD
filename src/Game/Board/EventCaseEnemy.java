package Game.Board;

import Personnage.monsters.*;

import java.util.ArrayList;



public class EventCaseEnemy {


    public void EventCaseEnemy(ArrayList player, ArrayList enemy) {
        int monsterChoice = 1 + (int) (Math.random() * ((6 - 1) + 1));
        switch (monsterChoice) {
            case 1:
                enemy = String.valueOf(new Goblin());
                break;
            case 2:
                enemy = String.valueOf(new Dragon());
                break;
            case 3:
                enemy = String.valueOf(new Spider());
                break;
            case 4:
                enemy = String.valueOf(new Troll());
                break;
            case 5:
                enemy = String.valueOf(new Vampyr());
                break;
            case 6:
                enemy = String.valueOf(new Witch());
                break;
            case 7:
                enemy = String.valueOf(new WitheRabbit());
                break;

            if ((player.life > 0) && (enemy.life > 0)) {
                player.Life -= enemy.force;
                enemy.life -= player.force;
            }
            if (enemy.life <= 0) {
                System.out.println("vous avez vaincu " + enemy.name);
            } else {
                System.out.println("vous avez succombé");
                System.out.println("voulez vous recommencer le jeux ?");

            }
        }
    }
}
