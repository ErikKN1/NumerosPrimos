/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numerosprimos;

import javax.swing.JOptionPane;

/**
 *
 * @author Erik
 */
public class NumerosPrimos {

    public static void main(String[] args) {
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero a evaluar"));
        if(EsPrimo(numero)){
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es Primo");
        }else{
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es no es Primo");
        }
    }
    
    public static boolean EsPrimo(int numero){
        if(numero<=1){
            return false;
        }
        int cont=0;
        for(int divisor=(int)Math.sqrt(numero);divisor>1;divisor--){
            if(numero%divisor==0){
                cont+=1;
            }
        }
        if(cont>=1){
            return false;
        }else{
            return true;
        }
    }
}
