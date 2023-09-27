package Game.Board.Cases;

import Game.Board.Cases.CreateCase.*;
import Game.Board.Cases.GenerateCaseEvent.*;
import Personnage.Personnage;
import equipement.Attack.EquipmentOffensive;
import equipement.Defense.EquipmentDefensive;


public class GenerateCaseInBoard implements CreateCases, Cases {

    EventCaseEnemy monster = new EventCaseEnemy();
    EventCaseAttackLoot attLoot = new EventCaseAttackLoot();
    EventCaseDefenseLoot defLoot = new EventCaseDefenseLoot();
    EventCaseHealth msgHealth = new EventCaseHealth();
    EventCaseNothing msgNothing = new EventCaseNothing();

    public void setEventAtBoard(int playerPosition, Personnage player) {
        int ramdomEvent = 1 + (int) (Math.random() * ((5 - 1) + 1));

        switch (ramdomEvent) {
            case 1:
                generateMonster();
                fightMonster(playerPosition, player, monster.generateMonster());
                break;
            case 2:
                generateAttackLoot();
                equipAttackLoot(player, attLoot.generateAttackLoot());
                break;
            case 3:
                generateDefenseLoot();
                equipDefenseLoot(player, defLoot.generateDefenseLoot());
                break;
            case 4:
                String string = msgHealth.toString();
                System.out.println(string);
                healthPlayer(player);
                break;
            case 5:
                String string1 = msgNothing.toString();
                System.out.println(string1);
                break;
        }

    }


    @Override
    public void generateMonster() {

        monster.generateMonster();
    }

    @Override
    public void generateAttackLoot() {
        attLoot.generateAttackLoot();
    }

    @Override
    public void generateDefenseLoot() {
        defLoot.generateDefenseLoot();
    }

    @Override
    public void equipAttackLoot(Personnage player, EquipmentOffensive loot) {
        new EquipAttLoot().equipAttackLoot(player, attLoot.generateAttackLoot());
    }

    @Override
    public void equipDefenseLoot(Personnage player, EquipmentDefensive loot) {
        new EquipDefLoot().equipDefenseLoot(player, defLoot.generateDefenseLoot());
    }


    @Override
    public void fightMonster(int playerPosition, Personnage player, Personnage enemy) {
        new AttMonster().fightMonster(playerPosition, player, monster.generateMonster());
    }

    @Override
    public void healthPlayer(Personnage player) {
        new HealthPlayer().healthPlayer(player);
    }
}
