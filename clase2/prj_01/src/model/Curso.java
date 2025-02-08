//siempre al inicio del paquete se debe ingresar el nombre del paquete
package model;

public class Curso
{
    private int cod_curso;
    private String nom_curso;
    private String fec_inicio;
    
    public void registrarCurso(int cod,String nomC,String fec_ini){
            cod_curso=cod;
            nom_curso=nomC;
            fec_inicio=fec_ini;
        }
        
     public void Mostrar() {
        System.out.println("Codigo Curso : " +cod_curso);
        System.out.println("Nombre del Curso : " +nom_curso);
        System.out.println("Fecha de Inicio   : " +fec_inicio);
             
        
    }    
     public void Modificar(String fec_ini1){
          fec_inicio=fec_ini1;
        }
    
}
