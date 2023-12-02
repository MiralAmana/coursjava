package Exo_Boucles;

import java.util.Scanner;

public class Impair {
    public static void main(String[] args) {
        int nombre;
        System.out.println("Entrer un nombre");
        Scanner scanner= new Scanner(System.in);
        nombre=scanner.nextInt();
        if (nombre%2==0) {
            System.out.println("Ce nombre est pair");
            
        } else {
            System.out.println("Ce nombre est impair");
            
        }
    }
}
