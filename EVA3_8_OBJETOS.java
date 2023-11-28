/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_objetos;

/**
 *
 * @author leo
 */
public class EVA3_8_OBJETOS {

    public static void main(String[] args) {
        persona perso1 = new persona();
        System.out.println(perso1);
        perso1.nombre = "leo";
        perso1.apellido = "ag";
        perso1.edad = 18;
        System.out.println(perso1);
        System.out.println(perso1);
        
        
        persona perso2 = new persona();
        perso2.nombre = "eze";
        perso2.apellido = "agu";
        perso2.edad = 20;
        System.out.println(perso2);
        System.out.println(perso2);
    }
    public static void imprimirpersona(persona perso){
        System.out.println("Direccion " + perso);
        System.out.println("Nombre completo " + " " + perso.apellido);
        System.out.println("Edad " + perso.edad);
    }
}
//SON PLANTILLAS
//TIPOS DE DATOS
class persona{
    String nombre;
    String apellido;
    int edad;
    
}
