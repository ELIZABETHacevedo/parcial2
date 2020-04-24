/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

/**
 *
 * @author Mery Acevedo
 */
public abstract class Producto {
    public Double precio;
    public int cantidad;
    public String nombre;
    

    public Producto(Double precio, int cantidad,String nombre) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.nombre=nombre;
        
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    
    public abstract String generarDosis() ;
    
    
    
}
