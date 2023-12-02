import java.util.Scanner;

public class Heure {
    public static void main(String[] args) {
        int heure;
        int minute;
        do{
            System.out.println("Entrer une heure valide(00h-23h)");
            Scanner sc=new Scanner(System.in);
            heure=sc.nextInt();
        }while(heure<0  || heure>23);
         do{
            System.out.println("Entrer des minutes valides(00min-59min)");
            Scanner sc=new Scanner(System.in);
            minute=sc.nextInt();
        }while(minute<0 || minute>59);
        if (minute<59) {
            minute+=1;
            System.out.println("Il sera "+heure+" h et "+minute+" min dans une minutes!");
        } else if (minute==59 && heure==23) {
            System.out.println("Il sera minuit! Va te coucher!");
            
        } else if (minute==59){
           
            heure=heure+1;
            System.out.println("Il sera "+heure+" h et 00 min dans une minutes!");
        }
       
    }
    }

