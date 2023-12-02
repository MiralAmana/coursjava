package Exo_Boucles;

import java.util.Scanner;

public class Temperature {

       
        public static void main(String[] args) {
         int temperature;
         System.out.println("**********Bienvenue dans notre appli*********");
            System.out.println("Entrer la température actuelle");
            Scanner sc = new Scanner(System.in);
            temperature=sc.nextInt();
            if (temperature>30) {
                System.out.println("Il fait chaud");
                
            }else if (temperature<=29 && temperature>=17) {
                System.out.println("Le temps est agréable");
            }else if (temperature<=16 && temperature>=0) {
                System.out.println("Il fait froid");
            }else{
                System.out.println("Il gèle!!! ");
            }


            
    
            
    
    
    
        }


    }
    

