
import java.util.Scanner;

public class TD2_G10 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // --- Creation de variable ---
        double arete, perimetre, surface, volume;


        System.out.println("Entre la valeur de l'arete");
        Scanner scan = new Scanner(System.in);
        arete = scan.nextDouble();

        perimetre = arete*4;
        surface = (arete * arete)*6;
        volume = Math.pow(arete, 3);

        System.out.println("le perimetre de votre cube est : "+ perimetre + " metre, sa surface est : " + surface +" Metre carre et son volume est : " + volume + " Metre cube");

        if (surface > volume) {
            System.out.println("Votre cube est plus surface ...");
        } else if(surface < volume){
            System.out.println("Votre cube est plus volume ...");
        }else{
            System.out.println(" Le volume est egal a la surface ...");
        }

        
    }
}

