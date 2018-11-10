/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //for : no manipulamos la variable del contador
        //DETENERNOS CUANDO ENCONTREMOS UN NUMERO DIVISIBLE
        //ENTRE 6
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            int iResiduo = i % 5;
            if(iResiduo == 0)
                break; //INTERRUMPE LA LOGICA DEL PROGRAMA
        }
        //CONTINUE
        //IMPRIMIR TODOS LOS NUMEROS QUE NO SEAN DIVISIBLES ENTRE 5
        for (int i = 1; i < 10; i++) {
             System.out.println(i);
            int iResiduo = i % 5;
            if(iResiduo == 0)
                continue; // INTERRUMPIR LA INTERACCION ACTUAL
        }
    }
   
    
}
