

import java.util.Scanner;

public class TD6_G10 {
    public static void main(String[] args) {
        int[] tableau = new int[10];
        int max, min;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < tableau.length; i++) {
             System.out.println("Entre le nombre numero " + i);
             tableau[i] = scan.nextInt();
        }    
        
         min = tableau[0];
         max = tableau[0];
        for (int valeur : tableau) {
             if (valeur >max) {
                 max = valeur;
             }
             else if (valeur < min) {
                 min = valeur;
             }
        }
        System.out.println("Le maximum est "+ max);
        System.out.println("Le minimum est "+ min);
        
    }
}


