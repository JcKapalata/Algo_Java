
import java.util.Scanner;

public class Mini_Projet_G10 {
    public static void main(String[] args) {
        int nbre;
        System.out.println("Entre la taille du tableau : ");
        Scanner scan = new Scanner(System.in);
        nbre = scan.nextInt();
        
        // --- Ajouter les element du tebleau ---
        int[] tab = new int[nbre];
        for (int i = 1; i <= tab.length; i++) {
            System.out.println("Entre le nombre numero "+ i);
            tab[i-1] = scan.nextInt();
        }

        // --- Affichage des elements du tableau avant selection de trie ---
        System.out.print("Affichage avant selection du trie : ");
        for (int e : tab) {
            System.out.print( e + ", ");
        }
        System.out.println();

        // --- Transformation des elements du tableau par la selection du trie  --- 
        for (int non_Trie = 0; non_Trie < tab.length; non_Trie++) {
            int max = tab[non_Trie];
            int max_index = non_Trie;
            for (int i = non_Trie+1; i < tab.length; i++) {
                if (tab[i] > max) {
                    max = tab[i];
                    max_index = i;
                }
            }
            tab[max_index] = tab[non_Trie];
            tab[non_Trie] = max;
        }
        // Affichage des elements du tableau apres selection du trie ---
        System.out.print("Affichage apres selection du trie : ");
        for (int e : tab) {
            System.out.print( e + ", ");
        }
        System.out.println();

    }
    
}
