/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao01;

/**
 *
 * @author Sammuel
 */
public class Fatorial {
    
    private int num = 0; // numero a calcular
    private int fat = 1; // resultado
    private String formula = ""; // formula de fatoração
    
    public void setValor (int n){  // preenche o valor e o calcula
        num = n; 
        int f = 1; 
        String s = ""; 
        for(int c = n; c > 1; c--){
            f *= c;
            s += c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    public int getFatorial(){ 
        return fat;
    }
    public String getFormula(){
        return formula;
    }
}
