package controller;
import model.Curso;

/*
import model.*; // importa toda las clases de model
*/

public class test2
{
    public static void main(String x[]){
     
        Curso curso1= new Curso(); 
        curso1.registrarCurso(123, "Java Programacion", "20250201");
        curso1.Mostrar();
        curso1.Modificar("20250208");
        curso1.Mostrar(); // modificacion de la fecha mostrando los datos curso
        /*
          public String nombre; en la clase pero no debe darse   
           System.out.println (curso1.nombre); //acceso directo, porque es publico
           el atributo debe ser private, porque su finalidad es proteger la data de cualquie
           acceso
           */
    }
}
