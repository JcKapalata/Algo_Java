import java.util.Scanner;

public class TD1_G10 {
    public static void main(String[] args) {
        // String nom = "Jean";
        // System.out.println(nom);

        // --- Creation de variable ---
        int ageAnnee,ageMois,anneeActuelle, moisActuel, moisNaissance ,anneeNaissance;

        // --- Demander info annee-mois ---
		System.out.println("Entre annee actuel :");
		Scanner Scan = new Scanner(System.in);
		anneeActuelle = Scan.nextInt();

        System.out.println("Entre mois actuel :");
		moisActuel = Scan.nextInt();

        System.out.println("Entre le mois de Naissance :");
        moisNaissance = Scan.nextInt();
		
        System.out.println("Entre votre annee de Naissance actuel :");
        anneeNaissance = Scan.nextInt();

        // --- Effectuer le calcul d'age ---
        ageAnnee = anneeActuelle - anneeNaissance;
        ageMois = moisActuel - moisNaissance;

        if (ageMois < 0){
            ageAnnee = ageAnnee -1;
            ageMois = ageMois +12;
        }

        // --- Afficher ageActuelle et mois Actuelle ---
        System.out.println("Vous avez " + ageAnnee + " ans, et " + ageMois + " mois");
    }
}
