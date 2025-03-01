
package controller;

import model.*;


public class Test1 {
    public static void main(String[] args) {
        
        //LISTA DE PERSONAS
       // Persona p1=new Persona("12345678", "Irving Fermin");
        //Persona p2=new Persona("87654321", "Juan Herencia");
//        Persona p3=new Persona("22233345", "Giancarlo Bramon");
//        Persona p4=new Persona("44455566", "Issac Mendoza");
        
        model.Persona p1 =new Persona("12345678", "Irving Fermin");
        model.Persona p2 =new Persona("87654321", "Juan Herencia");
        model.Persona p3 =new Persona("22233345", "Giancarlo Bramon");
        model.Persona p4 =new Persona("44455566", "Issac Mendoza");

        model.Conductor con1= new Conductor("VM123456", p1);
        model.Conductor con2= new Conductor("VM654321", p2);
        
        model.Pasajero pas1= new Pasajero("0001", p3);
        
        model.Viaje via1=new Viaje("a1", "lima", "rimac", pas1, con1);
        
       System.out.println(via1);


////LISTA DE CONDUCTORES
//        Conductor con1= new Conductor("VM123456", p1);
//        Conductor con2= new Conductor("VM546321", p2);
//        // LISTA DE PASAJEROS
//        Pasajero pas1= new Pasajero("uber_001", p3);
//        Pasajero pas2= new Pasajero("Uber_002", p4);
//        //LISTA DE VIAJES REALIZADOS
//        Viaje via1=new Viaje("via_20250301_001", "Lima", "Villa El Salvador", pas1, con1);
//        Viaje via2=new Viaje("via_20250301_002", "Rimac", "Lurin", pas2, con2);
//        
//        System.out.println(via1);
//        System.out.println("");
//        System.out.println(via2);
//        
//        
    }
}
