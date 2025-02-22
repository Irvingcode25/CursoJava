
package model;

/**
 *
 * @author Alumno
 */
public class Efectivo extends FormaPago {
    private String tipoModena; // soles o dolares
    
    public Efectivo(double monto){
            super("Pago en Efectivo");
    tipoModena = "soles";
    this.monto = monto;
    
    
    
    }

    public String getTipoModena() {
        return tipoModena;
    }

    public void setTipoModena(String tipoModena) {
        this.tipoModena = tipoModena;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
