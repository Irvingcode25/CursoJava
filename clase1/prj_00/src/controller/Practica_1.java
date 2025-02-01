/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Alumno
 */
public class Practica_1 {

    public static void main(String[] args) {
        float califFinal = 10.5f;
        float a = 20, b = 0;
        if (califFinal <= 20 && califFinal >= 0) {
            if (califFinal >= 14) {
                System.out.println("APROBADO " + califFinal);
            } else if (califFinal >= 10) {
                System.out.println("PARA SUSTITUTORIO " + califFinal);
            } else {
                System.out.println("DESAPROBADO " + califFinal);
            }

        } else {
            System.out.println("CALIFICACION INVALIDA ");
        }

    }

}
