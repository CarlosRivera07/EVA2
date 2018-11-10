
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CARLOS ROGELIO RIVERA LUJAN 18550725
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        System.out.println("Introduce un número entero positivo (mayor a 1): ");
        int iNum = input.nextInt();
        boolean bPrimo = true;
        for (int i = 2; i < iNum; i++) {
            //RESIDUO
            if((iNum % i) == 0)
                bPrimo = false;
            break;
                        
        }
        if(bPrimo)
            System.out.println("Es Primo");
        else
            System.out.println("No es primo");
    }
    
   
}
