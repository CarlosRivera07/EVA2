
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
        Scanner Input = new Scanner(System.in);
        
        int iSuma = 0;
        for(int i = 1; i <= 5; i++){
            System.out.println("Edad " + i + ":");
            iSuma = iSuma + Input.nextInt();
        }
        double dMedia = (double)iSuma / 5;
        System.out.println("La media es: " + dMedia);
    }
    
}
