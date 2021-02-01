/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contadorcambalhotas;

/**
 *
 * @author Sammuel
 */
public class ContadorCambalhotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        while(cc<10){
            cc++; // = cc <- cc + 1
            if (cc == 2 || cc == 3 || cc == 4){
               continue; // interrompe a contagem e volta ao while 
            }
            if (cc == 7){
                break; // termina o programa ao atingir o valor acima
            }
            System.out.println("Cambalhota " + cc);
            
        }
    }
    
}
