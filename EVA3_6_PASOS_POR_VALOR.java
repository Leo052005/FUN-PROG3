/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_pasos_por_valor;

/**
 *
 * @author leo
 */
public class EVA3_6_PASOS_POR_VALOR {

    public static void main(String[] args) {
        int x=10;
        System.out.println("el valor de x en el main es " + x);
        sumarValor(x);
    }
    public static void sumarValor(int valor){
        System.out.println("El valor recibido en sumarValor " + valor);
        valor++;
        System.out.println("El valor modificado es " + valor);
;
    }
}
