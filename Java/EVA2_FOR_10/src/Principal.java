
import java.util.Scanner;

/*
 * PRÁCTICA 10
    PEDIR UN NÚMERO AL USUARIO E IMPRIMIR LA MISMA ANTIDAD DE ASTERISOS "*"
 */

/**
 *
 * @author CARLOS ROGELIO RIVERA LUJAN 18550725
 */
public class Principal {

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
            System.out.println("*");
            
        }
    }
    
}
