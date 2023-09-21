package Game.Board;

import Personnage.Personnage;

public class DialogBox {
    public void dialogMainMenu() {
        System.out.println("Bienvenue dans le donjon de Naheulbeuk!");
        System.out.println("Menu principal");
        System.out.println("1 : nouvelle partie rapide");
        System.out.println("2 : démarrer une partie avec une classe prédéfinis");
        System.out.println("3 : nouvelle partie personnalisée");
        System.out.println("4 : quittez le jeux");
        System.out.println("veuillez saisir votre choix");
    }
    public void dialogBoxGame(int playerPosition, int boardSize, Personnage player) {
        System.out.println("votre position est " + playerPosition + "/" + boardSize);
        System.out.println("votre santé actuelle : " + player.getLife() + " PV, votre force actuelle : " + player.getForce() + " points et votre armure actuelle : " + player.getRightArm().getPowerArmor() + " de résistance");
        System.out.println("quel est votre choix");
        System.out.println("taper 1 pour jeter le dé");
        System.out.println("2 pour modifier votre personnage");
        System.out.println("3 pour quitter");
    }
}
