/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CARLOS ROGELIO RIVERA LUJAN 18550725
 */
public class MA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 10; i++) {
            System.out.println(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            } 
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(" ");
            for (int j = 9; j >= i; j--) {
                System.out.print("* ");
            }
        }
    
    
}
}
