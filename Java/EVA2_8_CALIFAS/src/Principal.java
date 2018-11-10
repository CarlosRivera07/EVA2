
import java.util.Scanner;

/*
 * SOLICITA LA CALIFICACION EN LETRA Y SE IMPRIMIRA LA CALIFICACION NUMERICA
 */

/**
 *
 * @author CARLOS ROGELIUO RIVERA LUJAN 18550725
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Input = new Scanner(System.in);
        System.out.println("Ingresa la calificación de la A a la F: ");
        String sCalifa = Input.nextLine();
        
        
        switch(sCalifa){
            case "A":
                System.out.println("Tu calificación es 100");
                break;
            case "B":
                System.out.println("Tu calificación es 90");
                break;
            case "C":
                System.out.println("Tu calificación es 80");
                break;
            case "D":
                System.out.println("Tu calificación es 70");
                break;
            case "F":
                System.out.println("Tu calificación es 0");
                break;
            default:
                System.out.println("Calificación fuera de rango");
        }
    }
    
}
