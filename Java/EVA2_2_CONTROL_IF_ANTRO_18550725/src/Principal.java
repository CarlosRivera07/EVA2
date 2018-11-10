
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
    
        if(iEdad >= 18){
            System.out.println("ES MAYOR DE EDAD");
        }else{
            System.out.println("NO ES MAYOR DE EDAD");
    }
    }
}
