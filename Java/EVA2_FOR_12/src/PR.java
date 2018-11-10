
import java.util.Scanner;

/*
 * PRÁCTICA FOR #12
    IMPRIMIR N CANTIDAD DE ASTERISCOS (SEGÚN UN VALOR SOLICITADO AL USUARIO).
 */

/**
 *
 * @author CARLOS ROGELIO RIVERA LUJAN 18550725
 */
public class PR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa un número cualquiera: ");
        int iNum;
        iNum = input.nextInt();
        
        for (int i = 0; i <= iNum; i++) {
            System.out.print("* ");
            
        }
    }
    
}
