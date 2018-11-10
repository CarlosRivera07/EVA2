/*
 * PRÁCTICA FOR #7
    IMPRIMA LOS NUMEROS PARES ENTRE EL 0 Y EL 100
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
        
        System.out.println("Los números pares son: ");
        for (int i = 0; i <= 100; i++) {
            iMultiplo = i % 2;
                if(iMultiplo == 0)
                    System.out.println(i);
            
        }
    }
    
}
