package eresmayordeedad;
import java.util.Scanner;
import java.util.Random;
public class AdivinaElNumero { 
    public static void main(String[] args) {
        Random random= new Random();
        int numeroSecreto=random.nextInt(100)+1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adivina en qué número estoy pensando");
            int posibleNumero=0;
        do {    
            posibleNumero=scanner.nextInt();
            if(numeroSecreto>posibleNumero){
                System.out.println("El número que estoy pensando es mayor.Vuelve a intentar");
            }else if(numeroSecreto<posibleNumero){
                System.out.println("El número que estoy pensando es menor. Vuelve a intentar.");
            } else{
                System.out.println("Adivinaste el número.");
            }
            
        } while (numeroSecreto!=posibleNumero);
    }
    
}
