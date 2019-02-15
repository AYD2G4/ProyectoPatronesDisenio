/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsistemas;

/**
 *
 * @author miguel
 */
public class Ensamblaje {
    public void ensamblar(){
        System.out.println("Ensamblando placa madre... ");
        System.out.println("Ensamblando memoria RAM... ");
        System.out.println("Ensamblando disco duro... ");
        System.out.println("Ensamblando memoria video... ");
    }
    public void testear(){
        System.out.println("RAM funcionando... ");
        System.out.println("Disco duro funcionando... ");
        System.out.println("Video funcionando... ");
    }
    public void reparar(){
        System.out.println("Reparando RAM... ");
        System.out.println("Reparando disco... ");
        System.out.println("Reparando video... ");
    }
}
