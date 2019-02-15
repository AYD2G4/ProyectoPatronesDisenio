package Iterator;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elmer Real
 */
public class Computadora {
    public String id;
    public String Fabrica;

    public Computadora(String id,String c) {
        this.id = id;
        this.Fabrica = c;
    }
    
    public void print(){
        System.out.println(">>Codigo:"+id+"_"+Fabrica);
    }
    
    
}
