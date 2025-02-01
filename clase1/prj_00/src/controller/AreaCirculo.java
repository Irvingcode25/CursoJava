
package controller;
/*
variable es un espacio de memoria que tiene dimensiones dependiendo del tipo de variable

*/
/**
 *
 * @author Irving Fermin
 */
public class AreaCirculo { //el nombre del archivo debe ser igual al nombre de la clase
    public static void main(String[] args) {
        //calcular el area de una circuferencia de radio=2.5
        //nom_variable=valor;  // nom_variable almacena valor
        float radio= 2.5f;   //declaracion o definicion de la variable
                        // tipo_de_dato nombre_variable;
                        //radio tiene un valor asignado
        float area;   //varible sin valor inicial             
        final float pi= 3.141592654f;
        area = pi * radio * radio;
        System.out.println("El Area del Circulo de radio "+radio+" es "+area);
          System.out.println(area);
     //   pi =3.13f; // nuevo valor de pi
         System.out.println("pi es "+pi);
    }
    
}
