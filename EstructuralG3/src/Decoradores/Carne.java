/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decoradores;

import Models.Combo;

/**
 *
 * @author Edwin Grisales Calle
 */
public class Carne extends PorcionAdicionalDecorator{
      Combo combo;

    public Carne(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String getDescripcion() {
        return combo.getDescripcion()+ " mas porción extra de carne";
    }

    @Override
    public int valor() {
        return 800+combo.valor();
    }
}
