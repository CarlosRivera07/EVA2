
import java.util.Scanner;

/*
 * PRÁCTICA 10
ESCRIBIR UN PROGRAMA PARA DETERMINAR LA ELEGIBILIDAD PARA ADMITIR A UN ESTUDIANTE
A UN CURSO BASADO EN SUS CALIICACIONES.
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
        
        System.out.println("Ingresa tu calificación en Matemáticas: ");
        int iMate;
        iMate = Input.nextInt();
        
        System.out.println("Ingresa tu calificación en Física: ");
        int iFisica;
        iFisica = Input.nextInt();
        
        System.out.println("Ingresa tu caliciación en Química: ");
        int iQuimica;
        iQuimica = Input.nextInt();
        
        int iSuma;
        iSuma = iMate + iFisica + iQuimica;
        
        if((iMate >= 65) && (iFisica >= 55) && (iQuimica >= 55) && (iSuma >= 180))
            System.out.println("Eres elegible para el curso");
        else
            if((iMate >= 65) || (iSuma >= 140))
                System.out.println("Eres elegible para el curso");
            else 
                System.out.println("No eres elegible para el curso");
    }
    
}
