package game;

import hero.Warrior;
import hero.Wizard;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public void mainMenu(int position) throws PlateauxException {
        System.out.println("Bienvenue dans le donjon de Naheulbeuk!");

        System.out.println("game.Menu principal");
        System.out.println("1 : nouvelle partie rapide");
        System.out.println("2 : nouvelle partie personnalisée");
        System.out.println("3 : quittez le jeux");
        System.out.println("veuillez saisir votre choix");
        int choice = sc.nextInt();
        if (choice == 1) {
            new Warrior(position);
        }
        if (choice == 2) {
            newGame(position);
        }
        if (choice == 3) {
            System.out.println("merci au revoir !");
        }
    }

    public void newGame(int position) throws PlateauxException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez un nom :");
        String name = sc.nextLine();
        System.out.println("Choisissez une classe :");
        String type = sc.nextLine();
        System.out.println(type);

        if ((name.isEmpty()) && (type.isEmpty())) {
            new Warrior(position);
        }
        if ((!name.isEmpty()) && (type.isEmpty())) {
            new Warrior(name, position);
        }
        if  (!type.isEmpty()) {
            if (type.equals("Warrior")) {
                new Warrior(name, type, position);
            }
            if (type.equals("Wizard")) {
                new Wizard(name, type, position);
            }
        }
    }

    public void confirmChoice(int position) throws PlateauxException {
        System.out.println("êtes vous sur de votre choix ?");
        System.out.println("appuyer sur 1 pour oui");
        System.out.println("appuyer sur 2 pour recommencer ");
        int choice = sc.nextInt();
        if (choice == 1) {
            Game start = new Game();
            start.game();
        }
        if (choice == 2) {
            newGame(position);
        }
    }
}