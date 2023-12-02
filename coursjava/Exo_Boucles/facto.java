package Exo_Boucles;

import java.util.Scanner;

public class facto {
    public static void main(String[] args) {
        int nombre;
        int facto=1;
        int i;
        System.out.println("Entrer votre nombre");
        Scanner sc =new Scanner(System.in);
        nombre=sc.nextInt();
        for(i=1;i<=nombre;i++){
            facto*=i;
        }
        System.out.println("le factiorielle de "+ nombre + " est "+facto);
    }
}
