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
public class ComboBasico extends Combo{

    
     public ComboBasico() {
  descripcion="Porcion de Papas Fritas, " +
   "salsa, queso, hamburgueza sencilla, gaseosa";
 }
    
    
    @Override
    public int valor() {
        return 6200;
    }
    
}
