
/**
 * Write a description of class Alumno here.
 * 
 * @author (Irving fermin) 
 * @version 1.0
 */
public class Alumno
{
   //Atributos
   private int cod_alum;
   private String apellidos;
   private String nombres;
   private String DNI;
   private String especialidad;
   private String fec_nacim;
   private String fec_inscrip;
   private int año_estudio;
   
   //metodos u operaciones (void no regresa nada , por eso se coloca)
       public void registrarAlumno(int cod,String ape,String nom, 
                                    int año_est ){
            cod_alum=cod;
            apellidos=ape;
            nombres=nom;
            año_estudio=año_est;
        }
    public int ObtenerAñoEstudios(){ 
        return año_estudio;
    }
    
    public void MostrarCarnet(){
        System.out.println("Codigo : " +cod_alum);
        System.out.println("Apellidos : " +apellidos);
        System.out.println("Nombres   : " +nombres);
        System.out.println("Año de estudios : " +año_estudio);
        
    }
    
    
}
