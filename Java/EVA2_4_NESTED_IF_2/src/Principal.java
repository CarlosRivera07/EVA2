/*
 * Aplicacion del nested if
 */

/**
 *
 * @author Carlos Rogelio Rivera Lujan 18550725
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int iCalifa = 522;
        
        
        if(iCalifa == 100){
            System.out.println("A");
        }else{
            if(iCalifa >= 90 && iCalifa < 100){
            System.out.println("B");
                }else{
                    if(iCalifa >= 80 && iCalifa < 90){
                    System.out.println("C");
                        }else{
                            if(iCalifa >= 70 && iCalifa < 80){
                            System.out.println("D");
                                }else{
                                    if(iCalifa >= 60 && iCalifa < 70){
                                    System.out.println("F");
                                        }else{
                                        System.out.println("Calificación fuera de rango");
    }
    }
    }
    }
    }
    }
    
    
}
