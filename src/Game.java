import java.util.Scanner;
public class Game{
    int plateaux = 64;
    int position = 1;
    int de ;
    Scanner clavier = new Scanner(System.in);

    public void  game(){
        while (position < plateaux){
            if (position == 1){
                System.out.println("La partie démarre");
            }
            else {
                System.out.println("votre position est " + position);
            }
            System.out.println("quel est votre choix");
            System.out.println("taper 1 pour jeter le dé");
            System.out.println("2 pour modifier votre personnage");
            System.out.println("3 pour quitter");
            clavier.nextLine();
            int choice = clavier.nextInt();
            if(choice == 1){
                de = 1 + (int)(Math.random() * ((6 - 1) + 1));
                position += de;
            }
            if (choice == 2){
                Menu Pause  = new Menu();
                Pause.newGame();
            }
            if (choice == 3){
                System.out.println("merci à bientôt");
            }
        }
        System.out.println("Bravo vous avez gagné");
        System.out.println("taper un pour recommencer");
        System.out.println("2 pour quitter");
        clavier.nextLine();
        int choice = clavier.nextInt();
        if(choice == 1){
            Menu Start = new Menu();
            Start.mainMenu();
        }
        if (choice == 2){
            System.out.println("à bientôt ");
        }
    }
}

