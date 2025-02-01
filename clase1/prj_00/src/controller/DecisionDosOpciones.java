
package controller;

public class DecisionDosOpciones {
    public static void main(String[] args) {
        //Determinar si un alumno si ha aprobado o desaprobado el curso de java de programacion
        // si la calificacion final es mayor o igual a 14 mostrar aprobado de otra forma mostrar desaprobado
        float califFinal=13.8f;
        if (califFinal>=14) {
            System.out.println("Aprobado con "+califFinal);
        }else{
            System.out.println("Desaprobado con "+califFinal);
        }
    }
            
    
    
}
