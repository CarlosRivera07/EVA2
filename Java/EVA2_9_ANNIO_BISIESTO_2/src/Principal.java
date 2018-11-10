
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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el año: ");
        int iAnnio = input.nextInt();
        
        int imod = iAnnio % 4;
        int imod2 = iAnnio % 100;
        int imod3 = iAnnio % 400;
        
        if(imod == 0 && (!(imod2 == 0)) || imod3 == 0)
            System.out.println("Es año bisesto");
        else
            System.out.println("No es año bisiesto");
        
    }
    
}
