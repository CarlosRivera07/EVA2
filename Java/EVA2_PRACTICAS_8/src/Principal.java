
import java.util.Scanner;

/*
 * PRÁCTICA 8
ESCRIBIR UN PROGRAMA QUE DETERMINE SI UN TRIÁNGULO ES EQUILÁTERO, ISÓSCELES O
ESCALENO.
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
        System.out.println("Ingresa el valor del primer lado del triángulo: ");
        int iLado1;
        iLado1 = Input.nextInt();
        
        System.out.println("Ingresa el valor del segundo lado del triángulo: ");
        int iLado2;
        iLado2 = Input.nextInt();
        
        System.out.println("Ingresa el valor del tercer lado del triangulo: ");
        int iLado3;
        iLado3 = Input.nextInt();
        
        if((iLado1 == iLado2) && (iLado2 == iLado3) && (iLado1 == iLado3))
            System.out.println("Es un Triángulo Equiláterio");
        else
            if((iLado1 == iLado2) || (iLado2 == iLado3) || (iLado1 == iLado3))
                System.out.println("Es un Triángulo Isósceles");
            else 
                System.out.println("Es un Triángulo Escaleno");
    }
    
}
