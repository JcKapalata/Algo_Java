
import java.util.Scanner;;

public class TD3_G10 {
    public static void main(String[] args) {
        
            int temps, minutes, seconde, heures;

            Scanner scan = new Scanner(System.in);
            System.out.println("Entre un temps en secondes :");
            temps = scan.nextInt();

            heures = temps / 3600;
            minutes = (temps % 3600) / 60;
            seconde = (temps % 3600) % 60;
            System.out.println("Votre temps est egal a : " + heures + " heure " + minutes + " munites "+ seconde + "seconde");
        
    }
}
