/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.Objects;

/**
 *
 * @author user6
 */
public class Nodo {

        public Nodo( int etiqueta) {
            this.x = x;
            this.y = y;
            this.etiqueta = etiqueta;
        }
        boolean marcado = false;
        double x;
        double y;
        int etiqueta;

    @Override
    public boolean equals(Object obj) {
        return ((Nodo)obj).etiqueta == this.etiqueta;
    }

        
        
        @Override
        public String toString() {
            return "(" + etiqueta  + ")";
        }    
    
}
