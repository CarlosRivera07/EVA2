
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CARLOS ROGLEIO RIVERA LUJAN 18550725
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Adivina el número aleatorio entre el 1 y el 10");
                int iRand = (int) (Math.random() * 10) + 1;

                System.out.println(iRand);

        int iNum;
        iNum = input.nextInt();
        while(iNum == iRand){
            
            System.out.println("Que bien, adivinaste el número!");
           
        } 
        
    }
    
}
