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
        int iSuma = 0; //PUNTO DE PARTIDA
        System.out.println("Valor de Suma: " + iSuma);
        iSuma = iSuma + 10; // 0 + 10
        System.out.println("Valor de Suma: " + iSuma);
        iSuma = iSuma + 10;
        System.out.println("Valor de Suma: " + iSuma);
        //MULTIPLICACION
        int iMult = 1;
        System.out.println("Valor de iMult: " + iMult);
        iMult = iMult * 5;
        System.out.println("Valor de iMult: " + iMult);
        iMult *= 5;
        System.out.println("Valor de iMult: " + iMult);
        //RESTA
        int iResta = 100;
        System.out.println("Valor de iResta: " + iResta);
        iResta = iResta - 5;
        System.out.println("Valor de iResta: " + iResta);
        iResta -= 5;
        System.out.println("Valor de iResta: " + iResta);
        //CONTADOR:
        //TIPO ESPECIAL DE ACUMULADOR
        int iCont = 0;
        System.out.println("Cuanto tienes = " + iCont);
        iCont = iCont + 1;
        System.out.println("Cuanto tienes = " + iCont);
        iCont += 1; //INCREMENTE EN CUALQUIER VALOR
        System.out.println("Cuanto tienes = " + iCont);
        iCont ++; //SOLAMENTE INCREMENTA EN 1
        System.out.println("Cuanto tienes = " + iCont);
        iCont --;
        System.out.println("Cuanto tienes = " + iCont);
        String sCade = "Hola";
        System.out.println(sCade);
        sCade = sCade + "Mundo";
        System.out.println(sCade);
        //iCont++ --> se aplica después
        //++iCont --> se aplica al momento
        System.out.println("++++++++++");
        System.out.println("El valor de iCont: " + iCont);
        iCont ++;
        System.out.println("El valor de iCont: " + iCont);
        ++iCont;
        System.out.println("El valor de iCont: " + iCont);

        
    }
    
}
