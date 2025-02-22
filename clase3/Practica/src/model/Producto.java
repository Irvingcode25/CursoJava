
package model;

public class Producto {
    private String nombre;
    private String caracteristica;
    private int cantidad;
    private double precio;

    public Producto(String nombre, String caracteristica, int cantidad, double precio) {
        this.nombre = nombre;
        this.caracteristica = caracteristica;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return " Producto{ " + " nombre= " + nombre + ", caracteristica= " + caracteristica + ", cantidad= " + cantidad + ", precio= " + precio + '}';
    }
    
    
}