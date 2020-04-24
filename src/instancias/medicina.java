/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Mery Acevedo
 */
public class medicina extends Producto {
   
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat sdfa = new SimpleDateFormat("dd/MM/yyyy");
    public int edadMin;
    
    
    public medicina(Double precio, int cantidad,String nombre,int emm,int dia,int mes,int annio) {
        super(precio, cantidad, nombre);
        calendar.set(dia, mes, annio);
        this.edadMin=emm;
    }

    @Override
    public String generarDosis() {
        
        if (this.edadMin<=20) {
            return("este producto no debe \n suministrarse a menores de "+edadMin
                    +"\nvence: "+this.sdfa.format(this.calendar.getTime()));
        }else{
            return ("producto apto para\n todas las edades"
                    +"\nvence: "+this.sdfa.format(this.calendar.getTime()));
        }
        
//To change body of generated methods, choose Tools | Templates.
        
    }
    
}
