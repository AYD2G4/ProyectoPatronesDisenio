/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsistemas;

import java.util.ArrayList;

/**
 *
 * @author miguel
 */
public class cola_de_impresion {
    ArrayList<String> cola_documentos = new ArrayList<String>(); 
    public void imprimir(){
        int num = 0;
        while(!cola_documentos.isEmpty()){
            System.out.println("Imprimiendo.. "+cola_documentos.get(num));
            cola_documentos.remove(num);
            num++;
        }
    }
    
    public void agregarACola(String doc){
        cola_documentos.add(doc);
    }
}
