
package model;


public class TarjetaCredito extends FormaPago{
    private int cantCoutas;
    private String nro_Tarjeta;
    
    public TarjetaCredito (double monto){
        super("Tarjeta de Credito");
        cantCoutas=1;
        nro_Tarjeta="";
        this.monto= monto;
    }

    public int getCantCoutas() {
        return cantCoutas;
    }

    public void setCantCoutas(int cantCoutas) {
        this.cantCoutas = cantCoutas;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getNro_Tarjeta() {
        return nro_Tarjeta;
    }

    public void setNro_Tarjeta(String nro_Tarjeta) {
        this.nro_Tarjeta = nro_Tarjeta;
    }
    
    
}
