/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericio_extra_1;

import Entidades.Amarre;
import Entidades.Dni;
import Entidades.Puerto;
import Entidades.Velero;
import Entidades.Yate;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

/**
 *
 * @author droa
 */
public class Ejericio_Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Puerto deck1 = new Puerto();
        
        //PreCarga de Datos para Pruebas
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = format.parse("17/03/2023");
        deck1.getAlquileres().add(new Amarre("Gustavo Ascazubi", new Dni('F',"1103345302"), new Date(System.currentTimeMillis()), new Date(123, 3, 15), 1, new Yate(150,3, "PBR-0193", 25, 2015)));
        deck1.getAlquileres().add(new Amarre("Daniel Roa", new Dni('F',"1102988365"), new Date(System.currentTimeMillis()), new Date(123, 2, 28), 3, new Velero(1, "PBR-0193", 15, 2009)));
        
        System.out.println("..:: PRECIO FINAL ALQUILERES ::..");
        deck1.calcularAlquiler();
    }
    
}
