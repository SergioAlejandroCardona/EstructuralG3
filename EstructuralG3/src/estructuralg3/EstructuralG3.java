/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuralg3;

import Decoradores.Tomate;
import Models.Combo;
import Models.ComboBasico;

/**
 *
 * @author Edwin Grisales Calle
 */
public class EstructuralG3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ComboBasico basico = new ComboBasico();
        basico.getDescripcion();
        System.out.println("Valor del pedido basico: " + basico.valor());
        Tomate PedidoConextraTomate = new Tomate(basico);
        System.out.println("Descripcion del pedido: " + PedidoConextraTomate.getDescripcion());
        System.out.println("Valor total del pedido con extra " + PedidoConextraTomate.valor());
        

        
        
        
        
     }
    
}
