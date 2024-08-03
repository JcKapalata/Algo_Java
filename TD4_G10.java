
import java.util.Scanner;

public class TD4_G10 {
    public static void main(String[] args) {
        double a, b, c, delta, x1, x2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre le different coefficients :");
        System.out.print("Le coefficient en X^2 : ");
        a = scan.nextDouble(); System.out.println();
        System.out.print("Le coefficient en X : ");
        b = scan.nextDouble(); System.out.println();
        System.out.print("Terme independant : ");
        c = scan.nextDouble(); System.out.println();

        System.out.println("Votre equation est : " + a + "X^2 " + b +"X " + c);

        // ---Calcul de Delta ---
        delta = Math.pow(b, 2) - (4*a*c);

        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2*a);
            x2 = (-b - Math.sqrt(delta)) / (2*a);   
            
            System.out.println("Votre equation possede 2 recines double qui sont : X1 " + x1 + " et X2 : " + x2);
        }else if (delta == 0) {
            x1 = -b /(2*a);
            x2 = x1;
            System.out.println("Votre equation possede une racines double X1 = X2 : " + x1);
        }else{
            System.out.println("Votre equation ne possede pas de racine double. ");
        }
    }
}
