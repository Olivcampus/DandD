package Menu.Menu;

import Personnage.Personnage;

public class DialogBox {

    /**
     * Sert de boite de dialogue pour les textes long
     */
    public void dialogMainMenu() {
        System.out.println("Bienvenue dans le donjon de Naheulbeuk!");
        System.out.println("Menu principal");
        System.out.println("1 : démarrer une partie avec une classe prédéfinis");
        System.out.println("2 : nouvelle partie personnalisée");
        System.out.println("3 : quittez le jeux");
        System.out.println("veuillez saisir votre choix");
    }

    public void dialogBoxGame(Personnage player) {

        System.out.println("votre santé actuelle : " + player.getLife() + " PV, votre force actuelle : " + player.getForce() + " points et votre armure actuelle : " + player.getRightArm().getPowerArmor() + " de résistance");
        System.out.println("quel est votre choix");
        System.out.println("1 : jeter le dé");
        System.out.println("2 : pour quitter");
    }
}