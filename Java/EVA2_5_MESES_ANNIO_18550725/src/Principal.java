
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    Scanner Input = new Scanner(System.in);
    
        System.out.println("Ingresa un número del mes: ");
        int iMes;
        iMes = Input.nextInt();
        if (iMes == 1) {
            System.out.println("El mes 1 es ENERO");
        } else {
            if (iMes == 2) {
                System.out.println("El mes 2 es FEBRERO");
            } else {
                if (iMes == 3) {
                    System.out.println("El mes 3 es MARZO");
                } else {
                    if (iMes == 4) {
                        System.out.println("El mes 4 es ABRIL");
                    } else {
                        if (iMes == 5) {
                            System.out.println("El mes 5 es MAYO");
                        } else {
                            if (iMes == 6) {
                                System.out.println("El mes 6 es JUNIO");
                            } else {
                                if (iMes == 7) {
                                    System.out.println("El mes 7 es JULIO");
                                } else {
                                    if (iMes == 8) {
                                        System.out.println("El mes 8 es AGOSTO");
                                    } else {
                                        if (iMes == 9) {
                                            System.out.println("El mes 9 es SEPTIEMBRE");
                                        } else {
                                            if (iMes == 10) {
                                                System.out.println("El mes 10 es OCTUBRE");
                                            } else {
                                                if (iMes == 11) {
                                                    System.out.println("El mes 11 es NOVIEMBRE");
                                                } else {
                                                    if (iMes == 12) {
                                                        System.out.println("El mes 12 es DICIEMBRE");
                                                    } else {
                                                        System.out.println("Número fuera de rango");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

    
    
}
