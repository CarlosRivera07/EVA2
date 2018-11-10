
import java.util.Scanner;

/*
 * PRÁCTICA 3
SOLICITAR UN NÚMERO Y VERIFICAR SI ES POSITIVO O NEGATIVO
 */

/**
 *
 * @author CARLOS ROGELIO RIVERA LUJAN
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner Input = new Scanner(System.in);
        System.out.println("Ingresa un valor positivo o negativo: ");
        int iVal;
        iVal = Input.nextInt();
        
        if(iVal < 0)
            System.out.println("Es número negativo!!");
        else
            System.out.println("Es número positivo!!");
    }
    
}
