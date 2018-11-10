
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carla
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner Input = new Scanner(System.in);
        System.out.println("Cuál es tu edad?");
        int iEdad;
        iEdad = Input.nextInt();
        
        System.out.println("Tienes INE?");
        boolean bTieneINE;
        bTieneINE = Input.nextBoolean();
        
        if(iEdad >= 18){
            if(bTieneINE == true){
                System.out.println("PASELE!!");
            }else{
                System.out.println("VAYASE DE AQUI!!");
            }
        }else{
            System.out.println("SAQUESE DE AQUI!!");
        }
    
    
    }
    
}
