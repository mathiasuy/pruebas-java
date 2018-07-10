/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos2;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;
import estructuras.Nodo;
import java.awt.HeadlessException;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import estructuras.*;
import oracle.jrockit.jfr.JFR;

/**
 *
 * @author user6
 */


public class Grafos2 extends JFrame{

    
    mxGraph graph = new mxGraph();  
    final double ANCHO = 30;
    final double TAM = 30;
    final double ALTO = 30;
    final int HORIZONTAL = 150;
    final int VERTICAL = 60;    
    Grafo grafo;
    mxGraphComponent graphComponent = new mxGraphComponent(graph);
    

//    grafo[0] = l;
    
    
    void crearGrafo(){
        grafo = new Grafo(6);
        grafo.AgregarArista(new Nodo(1), new Nodo(2));
        grafo.AgregarArista(new Nodo(1), new Nodo(3));
        grafo.AgregarArista(new Nodo(2), new Nodo(5));
        grafo.AgregarArista(new Nodo(2), new Nodo(3));
        grafo.AgregarArista(new Nodo(2), new Nodo(6));
    }

    public void DFS(Grafo g, Nodo vertice,Object v0, int medio, int nivel) throws InterruptedException{
        grafo.MarcarVertice(vertice);
        ArrayList<Nodo> adyacentes = grafo.adyacentes(vertice);
        medio -=15;
        for (Nodo w : adyacentes){
            if (!grafo.isMarcado(w)){
                
                Object v1 = insertarNodo(null, w, medio, nivel);
                insertarLinea(null, "", v0, v1);
                DFS(g, w,v1, medio+=70, nivel+=60);

                nivel-=60;
//                medio -=adyacentes.size()*2;                  
            }
        }
                        medio -=10;
    }
    
    public Grafos2() throws HeadlessException, InterruptedException {
    getContentPane().add(graphComponent);          
    crearGrafo();
        Nodo vertice = new Nodo(1);
        Object v0 = insertarNodo(null,vertice, HORIZONTAL, 0);
        int vertical = VERTICAL;
        int nivel = 50;
        DFS(grafo, vertice,v0, HORIZONTAL, nivel);
    
    
    for (int i = 1; i < grafo.cant_vertices; i++){
        for (Nodo n : grafo.adyacentes(new Nodo(i))){
            System.out.println(i + " -> " + n.toString());
        }
    }

//    graphComponent.addMouseListener(
//            new MouseAdapter() {
//        @Override
//            public void mouseClicked(MouseEvent me) {
//                      insertarNodo(null,"click", 80, 30);   
//            }
//        }
//    );
    
//      mxGraph 
      
      
//      insertarNodo(null,"asdasd", 20, 30);   
//      insertarNodo(null,"asdasd", 30, 30);   
//      insertarNodo(null,"asdasd", 60, 30); 
//      insertarNodo(null,"asdasd", 80, 30);   
      
      
      
//      graph.getModel().beginUpdate();
//       Object defaultParent = graph.getDefaultParent();  
//        Object v1 = graph.insertVertex(defaultParent, null, "Hello", 20, 20, 80, 30);
//        Object v2 = graph.insertVertex(defaultParent, null, "World", 240, 150, 80, 30);
//        graph.insertEdge(defaultParent, null, "Edge", v1, v2);
//      graph.getModel().endUpdate();
      
      
           
      
//      graph.getModel().beginUpdate();
//      Object defaultParent = graph.getDefaultParent();    
//        Object v3 = graph.insertVertex(defaultParent, null, "Allo", 20, 20, 80, 30);
//        Object v4 = graph.insertVertex(v3, "afsdfas", "3", 200, 100, 30, 30);//horizontal,vertical,ancho,alto
//        graph.insertEdge(defaultParent, null, "Edge", v1, v2);
//      graph.getModel().endUpdate();      
        
    }
    
    private Object insertarNodo(Object contenedor,Object etiqueta, double x, double y){
      Object v3 = null;
        if (contenedor == null){
            contenedor = graph.getDefaultParent();    
        }
        graph.getModel().beginUpdate();
        try {
//            Thread.sleep(50);
            v3 = graph.insertVertex(contenedor, null, etiqueta, x, y, ANCHO, ALTO);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR al insertar el nodo");
        }finally{
            graph.getModel().endUpdate();
        }
        return v3;
    }
    private Object insertarLinea(Object contenedor,Object etiqueta, Object v1, Object v2){
      Object v3 = null;
        if (contenedor == null){
            contenedor = graph.getDefaultParent();    
        }
        graph.getModel().beginUpdate();
        try {
            graph.insertEdge(contenedor, null, etiqueta, v1, v2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR al insertar el nodo");
        }finally{
            graph.getModel().endUpdate();
        }
        return v3;
    }
    private void formMousePressed(java.awt.event.MouseEvent evt) {          
        

//        mxGraph graph = new mxGraph();
//      Object defaultParent = graph.getDefaultParent();
//      graph.getModel().beginUpdate();
//      Object v1 = graph.insertVertex(defaultParent, null, "Hello", 20, 20, 80, 30);
//      Object v2 = graph.insertVertex(defaultParent, null, "World", 240, 150, 80, 30);
//      graph.insertEdge(defaultParent, null, "Edge", v1, v2);
//      graph.getModel().endUpdate();
//        mxGraphComponent graphComponent = new mxGraphComponent(graph);
//      getContentPane().add(graphComponent);        
    
    }      
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws HeadlessException, InterruptedException {
        // TODO code application logic here
        
    Grafos2 frame = new Grafos2();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 320);
    frame.setVisible(true);               
    }
    
}
