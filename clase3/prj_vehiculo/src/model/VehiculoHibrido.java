
package model;
import interfaz.Combustion;
import interfaz.Electrico;

public class VehiculoHibrido implements Electrico, Combustion{

    @Override
    public void motorElectrico() {
        System.out.println("tiene motor electrico");
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void motorCombustion() {
        System.out.println("tiene motor a combustion");
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
