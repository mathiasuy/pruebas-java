/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3grafos;

import javax.swing.JLabel;

/**
 *
 * @author user6
 */
class Nodos {
    public int x;
    public int y;
    public int valor;
    public int costo;
    JLabel lbl;

    /**
     * 
     * @param x
     * @param y
     * @param valor
     * @param costo 
     */
    public Nodos(int x, int y, int valor, int costo, JLabel lbl) {
        this.x = x;
        this.y = y;
        this.valor = valor;
        this.costo = costo;
        this.lbl = lbl;
    }

    @Override
    public String toString() {
        return "(" + "" + x + "," + y + ") " + valor + ", costo=" + costo;
    }
    
}
