
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
        // 0 --> 1
        // numeros entre 1 y 10
        int iNumeAlea = (int)(Math.random() * 10) + 1;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Adivina el número");
            int iNume = Input.nextInt();
            if(iNume == iNumeAlea){
                System.out.println("Felicidades, ganaste!");
                break;
            }
            if(i == 2){
                System.out.println("Perdiste compa!");
            }

        }
    }
    
}
