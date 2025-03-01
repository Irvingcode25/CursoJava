
package model;



public class Conductor {
    private String nro_linc;
     private String categoria;
     private String nombres;

    public Conductor(String nro_linc, String categoria, String nombres) {
        this.nro_linc = nro_linc;
        this.categoria = categoria;
        this.nombres = nombres;
    }

    public String getNro_linc() {
        return nro_linc;
    }

    public void setNro_linc(String nro_linc) {
        this.nro_linc = nro_linc;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nro_linc=" + nro_linc + ", categoria=" + categoria + ", nombres=" + nombres + '}';
    }
    
     
}
