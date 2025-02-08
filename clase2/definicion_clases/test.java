
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test
{
    public static void main(String x[]){
        //definicion /creacion del objeto
        //nombre_clase nombre_objeto ; es la sintaxis
        Alumno alum1;
        
        //Inicial el objeto (darle un espacio en memoria)
        //Opcionalmente darle valores iniciales
        alum1 =null;  //este objeto es nada (no tiene espacio en memoria)
        
        // ...muchas lineas adelante recien se requiere llenar datos
        alum1 = new Alumno(); // recien estamos asignamos espacio en memoria
        // ahora que tiene espacio de memoria recien se puede usar alum1
        alum1.registrarAlumno(12345, "Tello", "Angie", 4);
        //mostramos los datos
        alum1.MostrarCarnet();
    }
}
