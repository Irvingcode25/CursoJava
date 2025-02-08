package controller;
import model.Alumno;
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    public static void main(String x[]){
        
        Alumno alum1 , alum2;
        //asignar espacio de memoria para alum1 y de paso 
        //poner valores iniciales
        alum1 = new Alumno(4444,"abad","ana",1); 
        alum2=new Alumno();
      //  alum1.registrarAlumno(12345, "Tello", "Angie", 4);
        //mostramos los datos
        alum1.MostrarCarnet();
        alum2.registrarAlumno(12345, "Tello", "Angie", 4);
        alum2.MostrarCarnet();
        // ..... mucho despues se asigna valores a alumn2
    }
}
