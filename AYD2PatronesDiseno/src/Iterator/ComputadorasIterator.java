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
public class ComputadorasIterator {
     private Computadora[] compu;
    private int location =0;

    public ComputadorasIterator(Computadora[] compu) {
        this.compu = compu;
    }
    
    public Computadora next(){
        return compu[location++];
    }
    
    public boolean hasNext(){
        if(location<compu.length && compu[location]!=null){
            return true;
        }else{
            return false;
        }
    }
}
