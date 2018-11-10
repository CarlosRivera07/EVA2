/*
 * PRÁCTICA FOR #8
    IMPRIMIR 20 NÚMEROS ALEATPORIOS CUYO VALOR SEA ENTRE EL 1 Y EL 100
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
        
        for (int i = 0; i <= 20; i++) {
            int iRandom;
            iRandom = (int) (Math.random()*100);
            System.out.println(iRandom);
            
        }
    }
    
}
