
package model;
import model.Persona;

public class Conductor extends Persona{
     
    private String nro_licencia;
    //private Persona persona;
    
    public Conductor(String nro_licencia, Persona persona) {
        super(persona.getDNI(),persona.getNombre());
        this.nro_licencia = nro_licencia;
        
    }

    public String getNro_licencia() {
        return nro_licencia;
    }

    public void setNro_licencia(String nro_licencia) {
        this.nro_licencia = nro_licencia;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nro_licencia= " + nro_licencia +" numero DNI " +super.getDNI()+ " nombre " +super.getNombre() +'}';
    }
        
    
}


//    public Conductor(String nro_licencia, Persona persona) {
//        this.nro_licencia = nro_licencia;
//        this.persona = persona;
//    }
//
//    public String getNro_licencia() {
//        return nro_licencia;
//    }
//
//    public void setNro_licencia(String nro_licencia) {
//        this.nro_licencia = nro_licencia;
//    }
//
//    public Persona getPersona() {
//        return persona;
//    }
//
//    public void setPersona(Persona persona) {
//        this.persona = persona;
//    }
//
//    @Override
//    public String toString() {
//        return "Conductor{" + "nro_licencia=" + nro_licencia + ", persona=" + persona + '}';
//    }