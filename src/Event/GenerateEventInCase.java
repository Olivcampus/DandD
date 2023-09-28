package Event;

import Event.CreateEvent.*;
import Event.GenerateEvent.*;
import Personnage.Personnage;
import Equipement.Attack.EquipmentOffensive;
import Equipement.Defense.EquipmentDefensive;

import java.util.ArrayList;

public class GenerateEventInCase implements NewEvent, Event {

    CreateEventEnemy monster = new CreateEventEnemy();
    CreateEventAttackLoot attLoot = new CreateEventAttackLoot();
    CreateEventDefenseLoot defLoot = new CreateEventDefenseLoot();
    CreateEventHealth msgHealth = new CreateEventHealth();
    CreateNoEvent msgNothing = new CreateNoEvent();

    /**
     *
     * Sert à déterminer l'événement lié à la position du joueur sur le plateau
     *
     */

    public void setEventAtBoard(Personnage player, ArrayList<String> plateaux) {
        switch (plateaux.get(player.getPlayerPosition())) {
            case "M" -> {
                generateMonster();
                fightMonster(player);
                plateaux.set(player.getPlayerPosition(), "o|-<");
            }
            case "EO" -> {
                generateAttackLoot();
                equipAttackLoot(player, attLoot.generateAttackLoot());
                plateaux.set(player.getPlayerPosition(), "o|-<");
            }
            case "ED" -> {
                generateDefenseLoot();
                equipDefenseLoot(player, defLoot.generateDefenseLoot());
                plateaux.set(player.getPlayerPosition(), "o|-<");
            }
            case "H" -> {
                String string = msgHealth.toString();
                System.out.println(string);
                healthPlayer(player);
                plateaux.set(player.getPlayerPosition(), "o|-<");
            }
            case "NO", "o|-<" -> {
                String string1 = msgNothing.toString();
                System.out.println(string1);
                plateaux.set(player.getPlayerPosition(), "o|-<");
            }
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
        new GenerateEventEquipOffensiveLoot().equipAttackLoot(player, attLoot.generateAttackLoot());
    }

    @Override
    public void equipDefenseLoot(Personnage player, EquipmentDefensive loot) {
        new GenerateEventEquipDefensiveLoot().equipDefenseLoot(player, defLoot.generateDefenseLoot());
    }


    @Override
    public void fightMonster(Personnage player) {
        new GenerateEventAttackMonster().fightMonster(player, monster.generateMonster());
    }

    @Override
    public void healthPlayer(Personnage player) {
        new GenerateEventHealthPlayer().healthPlayer(player);
    }
}