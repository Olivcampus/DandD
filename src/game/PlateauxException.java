package game;

public class PlateauxException extends Exception{
    public PlateauxException(int de, int position){
        System.out.println("vous allez trop loin, le mouvement est don annulé");
        position -= de;
    }
}
