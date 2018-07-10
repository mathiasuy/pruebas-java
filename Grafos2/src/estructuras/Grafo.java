/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras;

import java.util.ArrayList;

/**
 *
 * @author user6
 */
public class Grafo {
    
    ArrayList<Nodo>[] grafo;
    public int cant_vertices;
    public boolean[] marcados;
    
    public Grafo(int cant_vertices) {
        grafo = new ArrayList[cant_vertices+1];
        marcados = new boolean[cant_vertices+1];
        this.cant_vertices = cant_vertices+1;
        for (int i=0; i<grafo.length;i++){
            grafo[i] = new ArrayList<>();
            marcados[i] = false;
        }        
    }
    
    public ArrayList<Nodo> adyacentes(Nodo vertice){
        return grafo[vertice.etiqueta];
    }
    

    public void AgregarArista(Nodo vertice_origen, Nodo vertice_destino){
        grafo[vertice_origen.etiqueta].add(vertice_destino);
    }


    public void MarcarVertice(Nodo vertice){
        marcados[vertice.etiqueta] = true;
    }
    
    public void DesMarcarVertice(Nodo vertice){
        marcados[vertice.etiqueta] = false;
    }
    
    public boolean isMarcado(Nodo vertice){
        return marcados[vertice.etiqueta];
    }
    
//    public void AgregarArista(Nodo vertice_origen, Nodo vertice_destino){
//        grafo[vertice_origen.etiqueta].add(vertice_destino);
//    }
    
}
