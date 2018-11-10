
import java.util.Scanner;

/*
 * PRACTICA 1
SOLICITAR 2 NUMEROS ENTEROS Y VERIFICAR SI SON IGUALES O NO
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
        System.out.println("Ingresa el valor del primer número entero: ");
        int iEntero1;
        iEntero1 = Input.nextInt();
        
        System.out.println("Ingresa el valor del segundo número entero: ");
        int iEntero2;
        iEntero2 = Input.nextInt();
        
        if(iEntero1 == iEntero2)
            System.out.println("LOS NÚMEROS ENTEROS SON IGUALES");
        else
            System.out.println("LOS NÚMEROS ENTEROS NO SON IGUALES");
    }
    
}
