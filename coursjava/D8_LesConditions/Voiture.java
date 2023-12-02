package D8_LesConditions;

import java.util.Scanner;

public class Voiture {
      // Les attributs
    String marque = "", matricule = "", couleur = "", proprietaire = "", reponse = "";
    int nbPorte, nbPneu, nbPlace;

    public static void main(String[] args) {
        // Création objet de la classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Création objet de la classe Voiture
        Voiture maVoiture = new Voiture();

        System.out.println("Avez-vous une voiture - Oui ou Non");
        maVoiture.reponse = scanner.nextLine();

        if (maVoiture.reponse.equalsIgnoreCase("Oui") || maVoiture.reponse.equalsIgnoreCase("Non")) {
            if (maVoiture.reponse.equalsIgnoreCase("Oui")) {
                System.out.println("Entrer la marque de la voiture");
                maVoiture.marque = scanner.nextLine();

                System.out.println("Entrer le matricule de la voiture");
                maVoiture.matricule = scanner.nextLine();

                System.out.println("Entrer la couleur de la voiture");
                maVoiture.couleur = scanner.nextLine();

                System.out.println("Entrer le propriétaire de la voiture");
                maVoiture.proprietaire = scanner.nextLine();

                System.out.println("Entrer le nombre de portes de la voiture");
                maVoiture.nbPorte = scanner.nextInt();

                System.out.println("Entrer le nombre de pneus de la voiture");
                maVoiture.nbPneu = scanner.nextInt();

                System.out.println("Entrer le nombre de places dans la voiture");
                maVoiture.nbPlace = scanner.nextInt();
                // Afficher les détails de la voiture
                System.out.println("Détails de la voiture:");
                System.out.println("Marque: " + maVoiture.marque);
                System.out.println("Matricule: " + maVoiture.matricule);
                System.out.println("Couleur: " + maVoiture.couleur);
                System.out.println("Propriétaire: " + maVoiture.proprietaire);
                System.out.println("Nombre de portes: " + maVoiture.nbPorte);
                System.out.println("Nombre de pneus: " + maVoiture.nbPneu);
                System.out.println("Nombre de places: " + maVoiture.nbPlace);
            }
             else 
        {
            System.out.println("Vous n'avez pas de voitures");
        }


        } 
       

        // Fermer le scanner
        scanner.close();
    }
}
