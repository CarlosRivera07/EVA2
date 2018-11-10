
import java.util.Scanner;

/*
 * PRÁCTICA 2
SOLICITAR UN NÚMERO Y VERIFICAR SI ES PAR O IMPAR
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
    Scanner Input = new Scanner(System.in);
        System.out.println("Ingresa un número para determinar si es par o impar: ");
        int iVal;
        iVal = Input.nextInt();
        
        int iMod;
        iMod = iVal % 2;
        
        if(iMod == 0)
            System.out.println("El número es PAR");
        else
            System.out.println("El número es IMPAR");
        
    }
    
}
