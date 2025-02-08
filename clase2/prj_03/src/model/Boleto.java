/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class Boleto {
    private int cod_boleto;
    private String origen;
    private String destino;
    private static int contador=0; // esta variable es unica para todos lo objetos, o instancia de boletos

    public Boleto(String origen, String destino) {
        this.contador++; // debe ser autogenerado
        this.cod_boleto= this.contador;
        this.origen = origen;
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Boleto{" + "cod_boleto=" + cod_boleto + ", origen=" + origen + ", destino=" + destino + '}';
    }
     
         
}
