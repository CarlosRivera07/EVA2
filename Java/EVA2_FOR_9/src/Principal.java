/*
 * PRÁCTICA FOR #9
    IMRPIMIR LOS NÚMEROS DEL 1 AL 100 Y MOSTRAR SU SUMATORIA.
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
        
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            
        }
        
        int iSumatoria = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "+");
            iSumatoria = iSumatoria + i;
        }
        System.out.println("");
        System.out.println("La sumatoria es: " + iSumatoria);
    }
    
}
