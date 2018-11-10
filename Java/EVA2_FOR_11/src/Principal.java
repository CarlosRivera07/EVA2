
import java.util.Scanner;

/*
 * PRÁCTICA FOR #11
    PEDIR UN NÚMERO AL USUARIO E IMPRIMIR LOS NÚMEROS DEL 1 AL 100 QUE NO SEAN
    DIVISIBLE ENTRE EL NÚMERO  PROPORCIONADO.
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
        System.out.println("Ingresa un número entero: ");
        int iNum;
        iNum = input.nextInt();
        
        System.out.println("Los números no divisibles son: ");
        for (int i = 1; i <= 100; i++) {
            int iMod;
            iMod = i % iNum;
            
            if(iMod == 0){
            }else{
                System.out.println(i);}
        }
    }
    
}
