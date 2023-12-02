package D12_BreakContinue;

public class BreakContinuee {
    public static void main(String[] args) {
        // exemple 1 avec break
        System.out.println("Apprendre break");
        for (int i = 0; i <3; i++) {
            System.out.println("L'itération numero "+i);
            if (i==2) {
                break;
            }
            
        }
        System.out.println("iteration terminée");
        //exemple 2
        System.out.println("Apprendre break");
        int a=3;
        int b=4;
        if (a !=b) {
            //break; impossible car hors d'une boucle 
            
        }
        // Exemple : continue
        System.out.println("Apprendre continue");
        for (int i = 0; i < 3; i++) {
            if (i==2) {
               continue; 
            }
            System.out.println("itération numéro "+i);
        }
    }
    
}
