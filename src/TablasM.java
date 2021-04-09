/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MEMO0464
 */
public class TablasM {
    private String cad="";
    private int c=10;
    public String tabla(int a, int b){
        cad="";
        c=10;
        if(a<=b*10){
            tabla(a+b, b);
            cad+=b+" X "+c+" = "+a+"\n";
             c--;
        }
        return cad;
    }
}
