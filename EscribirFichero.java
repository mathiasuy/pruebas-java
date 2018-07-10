/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribirfichero;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author mbotr
 */
public class EscribirFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C:/workspace/prueba.txt");
            pw = new PrintWriter(fichero);
            
            for (int i=0;i<10;i++){
                pw.println("Linea "+i);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally
        {
            try {
                if (null != fichero){
                    fichero.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
