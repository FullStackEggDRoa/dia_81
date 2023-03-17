/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;

import Entidades.Circunferencia;
import Entidades.Forma;
import Servicios.serviciosCircunferencia;
import Servicios.serviciosRectangulo;
import java.util.ArrayList;

/**
 *
 * @author droa
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        serviciosCircunferencia sC = new serviciosCircunferencia();
        serviciosRectangulo sR = new serviciosRectangulo();
        ArrayList<Forma> formas = new ArrayList<>();
        
        formas.add(sC.crearCircunferencia());
        formas.add(sR.crearRectangulo());
        
        for (Forma aux: formas){
            aux.calcularArea();
            aux.calcularPerimetro();
        }
        
    }
    
}
