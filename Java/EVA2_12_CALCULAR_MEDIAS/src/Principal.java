
import java.util.Scanner;

/*
 * SOLICITAR 5 EDADES Y CALCULAR LA MEDIA, MEDIANTE EL USO DE ACUMULADORES
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
         
        System.out.println("Ingresa la primera edad:");
        iSuma = iSuma + Input.nextInt();
        System.out.println("Ingresa la segunda edad:");
        iSuma = iSuma + Input.nextInt();
        System.out.println("Ingresa la tercera edad:");
        iSuma = iSuma + Input.nextInt();
        System.out.println("Ingresa la cuarta edad:");
        iSuma = iSuma + Input.nextInt();
        System.out.println("Ingresa quinta edad:");
        iSuma = iSuma + Input.nextInt();
        
        double dMedia = (double)iSuma / 5;
        System.out.println("La media de las edades es: " + dMedia);
        
        
        
    }
    
}
