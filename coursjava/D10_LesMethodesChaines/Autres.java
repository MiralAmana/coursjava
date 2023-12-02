package D10_LesMethodesChaines;

import java.util.Scanner;

public class Autres {
     public static void main(String[] args) {
        // apprendre la methode concat()
        System.out.println("******Apprendre la methode concat********");
        String salutation="Bonjour";
        String nom="monde";
        System.out.println(salutation.concat(" ").concat(nom));
        // deuxieme methode 
        System.out.println("Bonjour".concat(nom));
        //  Apprendre la methode CharAt
        System.out.println("******Apprendre la methode CharAt()******");
        char reponse;
        Scanner sc=new Scanner(System.in);
        System.out.println("Aimer vous les bananes?O/N");
        reponse=sc.nextLine().charAt(0);
        // if
        if (reponse=='O'){
            System.out.println("M. aime les bananes");
        }else {
            System.out.println("M.n'aime pas les bananes");
        // switch
        switch (reponse) {
            case 'O':
            System.out.println("M. aime les bananes");
                
                break;
             case 'N':
            System.out.println("M. n'aime les bananes");
                
                break;    
        
            default:
            System.out.println("Saisie incorrecte");
                break;
        }
        // Apprendre la méthode compareTo() et compareToIgnoreCase()
        System.out.println("** Apprendre la méthode compareTo() et compareToIgnoreCase() **");
        String myStr1 = "Hello";
        String myStr2 = "hello";
        if (myStr1.compareToIgnoreCase(myStr2) == 0) {
            System.out.println(myStr1.concat(" = ").concat(myStr2));
        }
        else
        {
            System.out.println(myStr1.concat(" est different ").concat(myStr2));
        }
        // Apprendre la méthode compareTo() et compareToIgnoreCase()
        System.out.println("** Apprendre la méthode compareTo() et compareToIgnoreCase() **");
        String mystr1 = "Hello";
        String mystr2 = "hello";
        if (mystr1.compareToIgnoreCase(myStr2) == 0) {
            System.out.println(mystr1.concat(" = ").concat(mystr2));
        }
        else
        {
            System.out.println(mystr1.concat(" est different ").concat(mystr2));
        }

        // Apprendre la méthode compareTo() et equals()
        System.out.println("** Apprendre la méthode compareTo() et equals() **");
        if ("Hello tete".contains("Hello")) {
              System.out.println(" Oui ");
        }
         else
        {
            System.out.println("Non");
        }


    }

    }

}
