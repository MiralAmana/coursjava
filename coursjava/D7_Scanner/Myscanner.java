package D7_Scanner;

import java.util.Scanner;

public class Myscanner {
      // attributs
    String prenom="",lnaiss="";
    int age;
    
    //les methodes
    
        public void parler()
        {
            System.out.println("je suis entrain de parler");
        }
    ;
    public static void main(String[] args) {
        //création d'un objet
      Scanner sc = new Scanner(System.in);
      //demander le prenom
      System.out.println("entrer votre prénom, lieu de naissance et age");
      //recuperation du prenom saisie
      Myscanner myScanner =new Myscanner();
      myScanner.prenom= sc.nextLine();
      myScanner.lnaiss= sc.nextLine();
      myScanner.age= sc.nextInt();
      
      //fermer le scanner
      sc.close();
      // Affichage du prenom saisi
      System.out.println("Bonjour "+myScanner.prenom + '\n'+ "Vous avez" +myScanner.age +"ans" + '\n'+ "Vous etes né à: "+myScanner.lnaiss);
      // execution de la methode parler 
      myScanner.parler();
}
}