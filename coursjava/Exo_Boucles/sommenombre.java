package Exo_Boucles;

import java.util.Scanner;

public class sommenombre {
     public static void main(String[] args) {
        System.out.println("Saisir un nombre");
        int nombre;
        int i;
        int somme=0;
        Scanner sc=new Scanner(System.in);
        nombre=sc.nextInt();
        for(i=0; i<=nombre;i++){
           somme+=i;
        }
          System.out.println(somme);

    }
    
}
