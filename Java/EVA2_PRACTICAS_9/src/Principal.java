
import java.util.Scanner;

/*
 * PRÁCTICA 9
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
        System.out.println("Ingresa el valor de A: ");
        int iA;
        iA = Input.nextInt();
        System.out.println("Ingresa el valor de B: ");
        int iB;
        iB = Input.nextInt();
        System.out.println("Ingresa el valor de C: ");
        int iC;
        iC = Input.nextInt();
        
        int iDisc = (iB * iB) - (4*iA*iC);
        boolean bBande = true;
        if(iDisc > 0){
            System.out.println("Trinomio Ax^2 ");
            
        }else if(iDisc == 0){
            System.out.println("Trinomio Cuadrado Perfecto");
        }else{
            bBande = false;
                System.out.println("Sin solución");
        }
        if(bBande){
            double dX1, dX2;
            double dRaiz = Math.sqrt(iDisc);
            dX1 = (-iB + dRaiz) / (2 * iA);
            dX2 = (-iB - dRaiz) / (2 * iA);
            System.out.println("X1 = " + dX1);
            System.out.println("X2 = " + dX2);
        }
    }
    }
    
   
    