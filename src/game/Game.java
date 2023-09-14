package game;

import java.util.Scanner;

public class Game {

    int[] plateaux = new int[64];
    int de;
    int position =1;
    Scanner clavier = new Scanner(System.in);

    /**
     *
     *  je suis une javadoc !!!!
     * @throws playerOutOfBoardException
     */
    public void game() throws playerOutOfBoardException {

        while (position <= plateaux.length) {
            if (position == 1) {
                System.out.println("La partie démarre");
            }
            System.out.println("votre position est " + position);
            System.out.println("quel est votre choix");
            System.out.println("taper 1 pour jeter le dé");
            System.out.println("2 pour modifier votre personnage");
            System.out.println("3 pour quitter");
            int choice = clavier.nextInt();
            if (choice == 1) {
                de = 1 + (int) (Math.random() * ((6 - 1) + 1));
                position = position + de;
                if (position > plateaux.length) {
                    throw new playerOutOfBoardException(de, position);
                }
                if (position == plateaux.length) {
                    System.out.println("votre position est " + position);
                    System.out.println("Bravo vous avez gagné");
                    System.out.println("taper 1 pour recommencer");
                    System.out.println("2 pour quitter");
                    clavier.nextLine();
                    int choices = clavier.nextInt();
                    if (choices == 1) {
                        Menu Start = new Menu();

                        Start.showMainMenu();
                    }
                    if (choices == 2) {
                        System.out.println("à bientôt ");
                        System.exit(0);
                    }
                }
            }
            if (choice == 2) {
                Menu Pause = new Menu();
                Pause.StartNewGame();
            }
            if (choice == 3) {
                System.out.println("merci à bientôt");
            }
        }

    }
}
