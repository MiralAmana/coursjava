package D13_TableauSimple;

public class TableauSimple {
    public static void main(String[] args) {
        String[] listeEtudiant = { "Modou sarr", "Issa Pouye", "Gnokhor Gueye" };
        //Utilisation de foreach
        for (String etu: listeEtudiant) {
            System.out.println(etu);
            
        }
        //Utilisation de for 
        for (int i = 0; i < listeEtudiant.length; i++) {
            System.out.println(listeEtudiant[i]);
            
        }
        //Remplacer unevaleur du tableau avec un opérateurs ternaires
        String newvalue=(listeEtudiant[1]=="Issa Pouye")? "Issa Seck": "Issa Gueye";
        listeEtudiant[1]=newvalue;
        System.out.println(newvalue);
        //Affichage du nouveau tableau
        for (int i = 0; i < listeEtudiant.length; i++) {
            System.out.println(listeEtudiant[i]);
            
        }


    }
}
