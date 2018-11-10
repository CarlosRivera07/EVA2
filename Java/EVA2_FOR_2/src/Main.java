
import java.util.Scanner;

/*
 * PRÁCTICA FOR #2
    IMPRIMIR SU NOMBRE EL NÚMERO DE VECES QUE EL USUARIO QUIERA.
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
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Cuántas veces desea que se repita el nombre? ");
        int iNum;
        iNum = Input.nextInt();
                
        for (int i = 1; i <= iNum; i++) {
            System.out.println("Carlos Rogelio Rivera Lujan");
            
        }
    }
    
}
