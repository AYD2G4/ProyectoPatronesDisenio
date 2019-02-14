/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subsistemas;

import java.util.Random;

/**
 *
 * @author miguel
 */
public class sistema_de_archivos {
    public void leer_archivo(String ruta, int cantidad_para_leer, int desc){
        System.out.println("Leyendo "+ruta);
        for (int i = 0; i < cantidad_para_leer; i++) {
            System.out.println("Leyendo... "+(i+1)+" caracteres");
        }
    }
    public int abrir_archivo(String ruta){
        System.out.println("Abriendo... "+ruta);
        return (int) (Math.random()*((1000-0)+1));
    }   
    public void guardar_archivo(String ruta, int desc){
        System.out.println("Guardando... "+ruta);
    }
}
