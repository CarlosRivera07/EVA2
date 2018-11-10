/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        
        boolean MateriasTerminadas;
        MateriasTerminadas = true;
        
        if(MateriasTerminadas == true){
            boolean ServicioLiberado;
            ServicioLiberado = true;
            if(ServicioLiberado == true){
                boolean ResidenciasLiberadas;
                ResidenciasLiberadas = true;
                if(ResidenciasLiberadas == true){
                    System.out.println("Si te puedes titular");
                }else{
                    System.out.println("No te puedes titular");
                }
            }else{
                System.out.println("No te puedes titular");
            }
        }else{
            System.out.println("No te puedes titular");
        }
    }
    
}
