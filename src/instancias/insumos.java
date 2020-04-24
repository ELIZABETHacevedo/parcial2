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
public final class insumos extends Producto{
    public String datos;
    public insumos(Double precio, int cantidad,String nombre,String datos) {
     
        super(precio, cantidad, nombre );
        this.datos=datos;
    }

    @Override
    public String generarDosis() {
        return (this.datos);
//To change body of generated methods, choose Tools | Templates.
    }
    
}
