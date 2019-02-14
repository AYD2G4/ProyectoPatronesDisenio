/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayd2patronesdiseno;

import perifericos.teclado;
import perifericos.usb;
import subsistemas.sistema_de_archivos;
import subsistemas.ventana;

/**
 *
 * @author miguel
 */

public class interfaces1{
    public interface Subject {    
        public void registerObserver(Observer o);    
        public void removeObserver(Observer o);    
        public void notifyObservers(); 
    }
    public interface Observer {
        public void update(ventana ve, sistema_de_archivos sa, teclado te, usb u);
    }
    
    public interface DisplayElement {
        public void display();
    }
    
    
}
