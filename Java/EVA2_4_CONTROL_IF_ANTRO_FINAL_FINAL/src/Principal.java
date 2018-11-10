
import java.util.Scanner;

/*
 * APLICACION EL "AND" EN JAVA
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
        
        System.out.println("Cuál es tu edad?");
        int iEdad;
        iEdad = input.nextInt();
        
        System.out.println("Tienes INE?");
        boolean bTieneINE;
        bTieneINE = input.nextBoolean();
        
        if (iEdad >= 18 && bTieneINE == true){
            System.out.println("PASALE!!");
            
        }else{ System.out.println("NO ENTRAS!!");
    }
        
    }
    
}
