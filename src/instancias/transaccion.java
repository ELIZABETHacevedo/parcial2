/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

import java.util.ArrayList;

/**
 *
 * @author Mery Acevedo
 */
public class transaccion {
    
    public Double total=0.0;
    public ArrayList<Producto> lProductos=new ArrayList<Producto>();

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total += total;
    }

    public ArrayList<Producto> getlProductos() {
        return lProductos;
    }

    public void setlProductos(ArrayList<Producto> lProductos) {
        this.lProductos = lProductos;
    }
    
    
    
    
    
}
