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
public class ComboEspecial extends Combo{
     
    
    
    public ComboEspecial() {
  descripcion="Porcion de Papas Fritas grande, " +
   "salsa, queso, hamburgueza con doble carne, gaseosa 3 litros";
 }
    
    
    @Override
    public int valor() {
        return 12300;
    }
}
