package Exo_Boucles;

import java.util.Scanner;

public class Moyenne {
    public static void main(String[] args) {
        int note=0;
        int somme=0;
        for(int i=0;i<3;i++){
            do{
          System.out.println("Entrer une note entre 0 et 20");
           Scanner sc = new Scanner(System.in);
           note=sc.nextInt();
           
        }while(note<0|| note>20);
         somme=somme+note;
        }
        float moyenne=somme/3;
        
        if (moyenne>=16) {

            System.out.println("Excellent!");
            
        } else if (moyenne>=12 && moyenne<=15) {
            System.out.println("Pas mal!");
        } else{
            System.out.println("Echec");
        }
        
    }
    
}
