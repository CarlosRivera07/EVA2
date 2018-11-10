/*
 * PRÁCTICA FOR #6
    IMPRIMIR LOS MULTIPLOS DE 5 ENTRE EL 0 Y EL 100
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
        
        int iMultiplo;
        
        for (int i = 0; i <= 100; i++) {
            iMultiplo = i % 5;
                if(iMultiplo == 0)
                    System.out.println(i);
            
        }
    }
    
}
