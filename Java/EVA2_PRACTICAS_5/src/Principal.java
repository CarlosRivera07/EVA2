
import java.util.Scanner;

/*
 * PRÁCTICA 5
ESCRIBIR UN PROGRAMA QUE PIDA TRES VALORES ENTEROS, Y DETERMINE CUAL ES EL MÁS
GRANDE DE LOS TRES.
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
    
        System.out.println("Ingresa el primer valor: ");
        int iVal1;
        iVal1 = Input.nextInt();
        
        System.out.println("Ingresa el segundo valor: ");
        int iVal2;
        iVal2 = Input.nextInt();
        
        System.out.println("Ingresa el tercer valor: ");
        int iVal3;
        iVal3 = Input.nextInt();
        
        if(iVal1 > iVal2)
            if(iVal1 > iVal3)
                System.out.println("El número mayor es: " + iVal1);
            else 
                System.out.println("El número mayor es: " + iVal3);
        else
            if(iVal2 > iVal3)
                System.out.println("El número mayor es: " + iVal2);
            else 
                System.out.println("El número mayor es: " + iVal3);
    }
    
}
