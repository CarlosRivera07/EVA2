
import java.util.Scanner;

/*
 * PREGUNTAR UN NUMERO DEL 1 AL 7 Y SE IMPRIMIRA EL DIA DE LA SEMANA SEGUN 
CORRESPONDA SU NUMERO
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
        System.out.println("Ingresa un número del 1 al 7 segun los días de la semana: ");
        int iDia;
        iDia = Input.nextInt();
        
        switch(iDia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número fuera de rango");
        }
    }
    
}
