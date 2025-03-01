
package model;

import model.Persona;

public class Pasajero extends Persona{
    
    private String cod_pasajero;
        
    public Pasajero(String cod_pasajero, Persona persona) {
        super(persona.getDNI(), persona.getNombre());
        this.cod_pasajero = cod_pasajero;
        
    }

    public String getCod_pasajero() {
        return cod_pasajero;
    }

    public void setCod_pasajero(String cod_pasajero) {
        this.cod_pasajero = cod_pasajero;
    }

        
    @Override
    public String toString() {
        return "Pasajero{" + "cod_pasajero=" + cod_pasajero + ", DNI=" + super.getDNI() + ", NOMBRE= "+ super.getNombre() + '}';
    }
    
    
    
}    

//    public Pasajero(String cod_pasajero, Persona persona) {
//        this.cod_pasajero = cod_pasajero;
//        this.persona = persona;
//    }
//
//    public String getCod_pasajero() {
//        return cod_pasajero;
//    }
//
//    public void setCod_pasajero(String cod_pasajero) {
//        this.cod_pasajero = cod_pasajero;
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
//        return "Pasajero{" + "cod_pasajero=" + cod_pasajero + ",persona" + persona + '}';
//    }
//    
