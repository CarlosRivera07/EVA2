
import java.util.Scanner;

/*
 * Preguntar el año y mediante el modulo calcular si es año bisiesto o no
 */

/**
 *
 * @author Carlos Rogelio Rivera Lujan 18550725
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner Input = new Scanner(System.in);
        System.out.println("Ingrese el año: ");
        int iAño;
        iAño = Input.nextInt();
        
        int iMod = iAño % 4;
        int iMod2 = iAño % 100;
        int iMod3 = iAño % 400;
        if(iMod == 0)
            if(iMod2 == 0)
                if(iMod3 == 0)
                    System.out.println("Es año bisiesto!");
                else 
                    System.out.println("No es año bisiesto!");
            else 
               System.out.println("Es año bisiesto!");
        else
            System.out.println("No es año bisiesto!");
    }
    
}
