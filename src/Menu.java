import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    public void mainMenu() {
        System.out.println("Bienvenue dans le donjon de Naheulbeuk!");

        System.out.println("Menu principal");
        System.out.println("1 : nouvelle partie rapide");
        System.out.println("2 : nouvelle partie personnalisée");
        System.out.println("3 : quittez le jeux");
        System.out.println("veuillez saisir votre choix");
        int choice = sc.nextInt();
        if (choice == 1){
            new Personnage();
        }
        if (choice == 2){
            newGame();
        }
        if (choice == 3){
            System.out.println("merci au revoir !");
        }
    }
    public void newGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez un nom :");
        String name = sc.nextLine();
        System.out.println("Choisissez une classe :");
        String type = sc.nextLine();
        System.out.println(type);

        if ((name.isEmpty()) && (type.isEmpty())) {
            new Personnage();
        }
        if ((!name.isEmpty()) && (type.isEmpty())) {
            new Personnage(name);
        }
        if ((!name.isEmpty()) && (!type.isEmpty())) {
            new Personnage(name, type);
        }
    }
    public void confirmChoice(){
        System.out.println("êtes vous sur de votre choix ?");
        System.out.println("appuyer sur 1 pour oui");
        System.out.println("appuyer sur 2 pour recommencer ");
        int choice = sc.nextInt();
        if(choice == 1){
            Game start = new Game();
            start.game();
        }
        if (choice == 2){
            newGame();
        }
    }
}
