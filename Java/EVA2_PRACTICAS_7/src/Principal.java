
import java.util.Scanner;

/*
 *PRÁCTICA 7 
Escribir un programa que lea la temperatura en grados centígrados, y muestre un mensaje acorde a la
temperatura:
 */

/**
 *
 * @author CARLOS ROGELIO RIVERA LUJAN
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner Input = new Scanner(System.in);
    
        System.out.println("Ingresa la temperatura en °C: ");
        int iTemperatura;
        iTemperatura = Input.nextInt();
        
        if(iTemperatura < 0)
            System.out.println("Freezing weather");
        else 
            if(iTemperatura > 0 && iTemperatura < 10)
                System.out.println("Very Cold weather");
            else 
                if(iTemperatura > 10 && iTemperatura < 20)
                    System.out.println("Cold weather");
                else 
                    if(iTemperatura > 20 && iTemperatura < 30)
                        System.out.println("Normal in Temp");
                    else 
                        if(iTemperatura > 30 && iTemperatura < 40)
                            System.out.println("Its Hot");
                        else 
                            if(iTemperatura >= 40)
                                System.out.println("Its Very Hot");
    }
    
}
