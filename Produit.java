import java.util.Scanner;
public class Produit {
    String reference;
    String designation;
    double prixHT;
    int quantiteStock ;
    int remise ;
    public Produit(String ref,String des,double prix,int qte,int rs){
        reference=ref;
        designation=des;
        prixHT=prix;
        quantiteStock=qte;
        remise=rs;
    }
    public String getreference(){
        return reference;
    }
    public String getdesignation(){
        return designation;
    }
    public double getprixHT(){
        return prixHT;
    }
    public int getquantiteStock(){
        return quantiteStock;
    }
    public void setreference(String ref){
        reference=ref;
    }
    public void setdesignation(String des){
        designation=des;
    }
    public void setprixHT(double prix){
        prixHT=prix;
    }
    public void setquantiteStock(int qte){
        quantiteStock=qte;
    }
    public double calculervaleurStock(){
        return quantiteStock*prixHT;
    }
    public double remise(){
        return (prixHT*remise)/100;
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("donner la reference : ");
        String ref = sc.nextLine();
        System.out.print("donner la designation : ");
        String des = sc.nextLine();
        System.out.print("donner le prix HT : ");
        double prix = sc.nextDouble(); 
        System.out.print("donner la quantite en stock : "); 
        int qte = sc.nextInt();    
        System.out.print("donner le remise : "); 
        int rs = sc.nextInt();  
        Produit p1 = new Produit(ref, des, prix, qte,rs);
        System.out.println("reference:"+p1.getreference());
        System.out.println("designation : " + p1.getdesignation());
        System.out.println("prix HT : " + p1.getprixHT());        
        System.out.println("quantite : " + p1.getquantiteStock());
        System.out.println("valeur du stock : " + p1.calculervaleurStock());
        System.out.println("remise : " + p1.remise());
        int choix;

        do {
            System.out.println("MENU");
            System.out.println("1. Afficher les informations du produit");
            System.out.println("2. Afficher le calcul du stock");
            System.out.println("3. Faire une remise sur le produit");
            System.out.println("4. Quitter");
            System.out.print("Donner votre choix : ");
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("Reference : " + p1.getreference());
                    System.out.println("Designation : " + p1.getdesignation());
                    System.out.println("Prix HT : " + p1.getprixHT());
                    System.out.println("Quantite : " + p1.getquantiteStock());
                    break;
                case 2:
                    System.out.println("Valeur du stock : " + p1.calculervaleurStock());
                    break;

                case 3:
                    System.out.print("Donner le pourcentage de remise : ");
                    double remise = sc.nextDouble();
                    double nouveauPrix = p1.getprixHT() - (p1.getprixHT() * remise / 100);
                    p1.setprixHT(nouveauPrix);
                    System.out.println("Nouveau prix HT : " + p1.getprixHT());
                    break;
                case 4:
                    System.out.println("au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }

            } while (choix != 4);

        sc.close();
    }
}
