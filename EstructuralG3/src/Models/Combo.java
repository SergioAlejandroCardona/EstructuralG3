/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Edwin Grisales Calle
 */
public abstract class Combo {
      String descripcion = "";

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

 
    
    public abstract int valor();

}
