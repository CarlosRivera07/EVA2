
import java.util.Scanner;

/*
 * PRACTICA DONDE SE APLICA EL USO DEL SWITCH
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
    
        System.out.println("Ingresa un número del mes: ");
        int iMes;
        iMes = Input.nextInt();
        switch(iMes){
            //OPCIONES
            case 1: //PRIMER CASO --> ENERO
                System.out.println("ENERO");
                break;
            case 2: 
                System.out.println("FEBRERO");
                break;
            case 3: 
                System.out.println("MARZO");
                break;
            case 4: 
                System.out.println("ABRIL");
                break; 
            case 5: 
                System.out.println("MAYO");
                break;
            case 6: 
                System.out.println("JUNIO");
                break;
            case 7: 
                System.out.println("JULIO");
                break;
            case 38: 
                System.out.println("AGOSTO");
                break;
            case 9: 
                System.out.println("SEPTIEMBRE");
                break;
            case 10: 
                System.out.println("OCTUBRE");
                break;
            case 11: 
                System.out.println("NOVIEMBRE");
                break;
            case 12: 
                System.out.println("DICIEMBRE");
                break;
            default:
                System.out.println("No corresponde con un número del mes");
        }
    //AQUI NOS MANDA EL BREAK
    }
    
    
}
