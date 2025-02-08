/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author Alumno
 */
public class Producto {
    //atributos
    private int cod_prod;
    private String nombre;
    private double precio;
    private int stock;
    //constructores

    public Producto(int cod_prod, String nombre, double precio, int stock) {
        this.cod_prod = cod_prod; //this es para diferenciar lo similares nombres
        this.nombre = nombre;  // This es una referencia a la clase en curso
        this.precio = precio;
        this.stock = stock;
    }
    // los contructores pueden tener sobre carga
    public Producto(int cod_prod, String nombre) {
        this.cod_prod = cod_prod; //this es para diferenciar lo similares nombres
        this.nombre = nombre;  // This es una referencia a la clase en curso
        this.precio = 0.0; //inicializar el resto de atributos 
        this.stock = 0;
    }
    
    // constructor vacio PUEDO TENER VARIOS CONSTRUCTORES
     public Producto() {
        this.cod_prod = 0; 
        this.nombre = "SIN NOMBRE";  
        this.precio = 0.0;  
        this.stock = 0;
    }
     public boolean EsVendible(){
         boolean esVendible=true ;
         if(cod_prod==0 || nombre.equals("SIN NOMBRE") || stock==0 || precio==0) {
             esVendible=false;
         }
         return esVendible;
     }
     // GET ES UN METODO PARA OBTENER EL CODIGO DEL PRODUCTO
    public int getCod_prod() {
        return cod_prod;
    }
    // SET ES EL METODO PARA GUARDAR O ASIGNAR EL CODIGO DEL PRODUCTO
    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }
    // METODO PARA OBTENER EL NOMBRE
    public String getNombre() {
        return nombre;
    }
    // METODO PARA PONER NOMBRE
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    // SE USA COMO UN PRINTLN , CUANDO ES UN CARACTER SE GUARDA EN COMILLA SIMPLE
    @Override
    public String toString() {
        return "Producto{" + "cod_prod=" + cod_prod + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.cod_prod;
        hash = 23 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.cod_prod != other.cod_prod) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    
}
