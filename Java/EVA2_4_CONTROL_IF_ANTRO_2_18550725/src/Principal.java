
import java.util.Scanner;

/*
 * PREGUNTAR SI TIENE INE Y CON EL IF MOSTRAR LA SALIDA DEPENDIENDO SI ES TRUE 
O FALSE
 */

/**
 *
 * @author carla
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner Input = new Scanner(System.in);
        System.out.println("Tienes tu INE?");
    boolean bTieneINE;
    bTieneINE = Input.nextBoolean();
    
    if(bTieneINE == true){
        System.out.println("SI TIENE INE");
    }else{
        System.out.println("NO TIENE INE");
    }
    }
    
}
