import java.util.Scanner;

public class AppWeb {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        // Les champs de la classe
        int Cin;
        float solde;

        System.out.println("Entrez le CIN :");
        String cin = scanner.nextLine();

        System.out.println("Entrez le NOM :");
        String Nom = scanner.nextLine();

        System.out.println("Entrez le Prenom :");
        String Prenom = scanner.nextLine();

        System.out.println("Entrez le solde Initial (TND) : ");
        solde = scanner.nextFloat();

        final double Plafond_Retrait = 500.00;

        String NumCompte = "APP01";

        int choix;

        do {
            System.out.println("\n--- Menu APPBANK ---");
            System.out.println("1. Consulter le compte");
            System.out.println("2. Effectuer un depot");
            System.out.println("3. Effectuer un retrait");
            System.out.println("4. Quitter");
            System.out.println("Votre choix (1-4):");

            choix = scanner.nextInt();

            switch (choix) {

                case 1:
                    System.out.println("Client : " + Nom + " " + Prenom + " (CIN : " + cin + ")");
                    System.out.println("N° de compte : " + NumCompte);
                    System.out.println("Solde actuel : " + solde + " TND");
                    System.out.println("Plafond Max : " + Plafond_Retrait + " TND");
                    break;

                case 2:
                    System.out.print("\nMontant du dépôt (TND) : ");
                    double montantDepot = scanner.nextDouble();

                    if (montantDepot > 0) {
                        solde = solde + (float) montantDepot;
                        System.out.println("Dépôt réussi. Nouveau solde : " + solde + " TND");
                    } else {
                        System.out.println("Erreur : Le montant doit être supérieur à 0.");
                    }
                    break;

                case 3:
                    System.out.print("\nMontant du retrait (TND) : ");
                    double montantRetrait = scanner.nextDouble();

                    if (montantRetrait <= 0) {
                        System.out.println("Erreur : Le montant doit être supérieur à 0.");
                    } 
                    else if (montantRetrait > Plafond_Retrait) {
                        System.out.println("Retrait refusé : Dépassement du plafond de "
                                + Plafond_Retrait + " TND.");
                    } 
                    else if (montantRetrait > solde) {
                        System.out.println("Retrait refusé : Solde insuffisant ("
                                + solde + " TND disponibles).");
                    } 
                    else {
                        solde = solde - (float) montantRetrait;
                        System.out.println("Retrait réussi. Nouveau solde : "
                                + solde + " TND");
                    }
                    break;

                case 4:
                    System.out.println("\nMerci d'avoir utilisé BankSmart App. Au revoir !");
                    break;

                default:
                    System.out.println("Choix incorrect, veuillez choisir entre 1 et 4.");
            }

        } while (choix != 4);

        scanner.close();
    }
}
