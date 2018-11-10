/*
 * PRÁCTICA 4
SOLICITAR UN VALOR Y VERIFICAR SI EL NÚMERO ES POSITIVO O NEGATIVO
 */
package eva2_practicas_4;

import java.util.Scanner;

/**
 *
 * @author CARLOS ROGELIO RIVERA LUJAN 18550725
 */
public class EVA2_PRACTICAS_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner Input = new Scanner(System.in);
    
        System.out.println("Ingresa un valor entero positivo o negativo: ");
        
        int iVal;
        iVal = Input.nextByte();
        if(iVal > 0)
            System.out.println("1");
        else
        if(iVal == 0)
            System.out.println("0");
        else
        if(iVal < 0)
            System.out.println("-1");
        
    }
    
}
