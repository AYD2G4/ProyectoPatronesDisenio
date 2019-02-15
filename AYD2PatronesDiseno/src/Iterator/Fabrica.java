/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author Elmer Real
 */
public class Fabrica {
    private String Fabrica;
    private int n=0;
    private Computadora[] computadoras = new Computadora[100];
    public Fabrica(String n){
        this.Fabrica=n;
    }
    public String getName(){
        return this.Fabrica;
    }
    
    public ComputadorasIterator iterator(){
        return new ComputadorasIterator(computadoras);
    }
    
    public void NuevaComputadora(String id){
        Computadora c = new Computadora(id, Fabrica);
        computadoras[n++] = c;
    }
}
