
import java.util.Scanner;

/*
 * PRÁCTICA 6
ESRCRIBIR UN PORGRAMA QUE SOLICITE LAS COORDENADAS DE UN PUNTO 
(EN UN SISTEMA CARTESIANO) Y DETERMINE A QUE CUADRANTE CORRESPONDE.
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
    
        System.out.println("Ingresa la coordenada X: ");
        int iX;
        iX = Input.nextInt();
        
        System.out.println("Ingresa la coordenada Y: ");
        int iY;
        iY = Input.nextInt();
        
        if(iX > 0 && iY > 0)
            System.out.println("SE ENCUENTRA EN EL PRIMER CUADRANTE");
            else 
                if(iX > 0 && iY < 0)
                    System.out.println("SE ENCUENTRA EN EL SEGUNDO CUADRANTE");
                else
                    if(iX < 0 && iY < 0)
                        System.out.println("SE ENCUENTRA EN EL TERCER CAUDRANTE");
                    else 
                        System.out.println("SE ENCUENTRA EN EL CUARTO CUADRANTE");
    }
    
}
