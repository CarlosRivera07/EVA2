
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
        Scanner input = new Scanner (System.in);
        String sCade = "";
        while (!sCade.equals("X")) {
            System.out.println("Introduce un mensaje (X para salir)");  
            sCade = input.nextLine();
            System.out.println("Tu mensaje: " + sCade);
            
        }
    }
    
}
