
import java.util.Scanner;

public class TD7_G10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Saisisser l'element de la matrice 2*2 ");

        int[][] matrice =new int [2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Saisissez l'element ("+ (i+1) +", "+ (j+1)+") :");
                matrice [i][j] = scan.nextInt();
            }
        }

        int det = matrice[0][0]*matrice[1][1] - matrice[0][1];
        System.out.println("\n le determinant de la matrice : " + det);

        System.out.println("\n transposee de la matrice : " );
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrice [j][i] +" ");
            }
            System.out.println();
        }
    }
}
