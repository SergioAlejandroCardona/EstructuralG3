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
public class ComboFamiliar extends Combo {

    public ComboFamiliar() {
        descripcion = "Doble Porcion de Papas Fritas, "
                + "salsa roja y mayonesa, queso,3 hambuegruesas amburgueza, gaseosa Familiar";
    }

    @Override
    public int valor() {
        return 15500;
    }
}
