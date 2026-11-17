import java.util.Scanner;
public class Tableau {
    public static  void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("question 1 :");
        double[]moyenne={10.50,11.50,14};
        for(int i=0;i<3;i++){
            System.out.println(moyenne[i]);
        
    }
    System.out.println("question 2 :");
    System.out.println("la longueure du tableau :"+moyenne.length);
    System.out.println("question 3 :");
    double[] myListe =new double[3];
    System.out.println("enter "+myListe.length+" values");
    for(int i=0;i<3;i++){
            myListe[i]=scanner.nextDouble();
        
    }
    System.out.println("question 4 :");
    double[]moyenn={10.50,11.50,14};
    moyenn[1]=0;
        for(int i=0;i<3;i++){
            System.out.println(moyenn[i]);
    }
    System.out.println("question 5 :");
    double[]somme = new double[3];
    somme[0]=myListe[0]+moyenn[0];
    somme[1]=myListe[1]+moyenn[1];
    somme[2]=myListe[2]+moyenn[2];
    for(int i=0;i<3;i++){
            System.out.println(somme[i]);
    }
}
}