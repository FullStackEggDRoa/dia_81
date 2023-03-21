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
import Servicios.serviciosAmarre;
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
        int opcion = 0;
        
        serviciosAmarre sA = new serviciosAmarre();
        
        
        // puertoTipo1 -> 438 amarres para embarcaciones de 8m a 80 metros eslora
        Puerto puertoTipo1 = new Puerto();
        
        
        //PreCarga de Datos para Pruebas
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = format.parse("29/03/2023");
        
        puertoTipo1.getAlquileres().add(new Amarre("Gustavo Ascazubi", new Dni('D',"1103345302"), new Date(System.currentTimeMillis()), new Date(123, 3, 15), 1, new Yate(150,3, "PBR-0193", 25, 2015)));
        puertoTipo1.getAlquileres().add(new Amarre("Daniel Roa", new Dni('F',"1102988365"), new Date(System.currentTimeMillis()), date, 3, new Velero(1, "PBR-0193", 15, 2009)));
        
        do{
            
            System.out.println(".:: MENU ::.");
            System.out.println("1. Ingresar Datos Usuario");
            System.out.println("2. Ingresar Enbarcación");
            System.out.println("3. Alquilar Amarre");
            System.out.println("4. Mostrar Estados");
            System.out.print("Elija la Opción: ");
            switch (opcion) {
                case 1 -> ;
                case 2 -> ;
                case 3 -> puertoTipo1.getAlquileres().add(sA.alquilerAmarre(puertoTipo1.getAlquileres()));
                case 4 -> puertoTipo1.calcularAlquiler();
                default -> throw new AssertionError();
            }
        }while(true);
       
        
//        System.out.println("..:: PRECIO FINAL ALQUILERES ::..");
//        deck1.calcularAlquiler();
    }
    
    
    //Manipuladores Local Date.
    
    /*System.out.println("Introduce la fecha del día de inicio de alquiler en formato dd/MM/yyyy: ");
        String fechaStringInicio = leer.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaInicio = LocalDate.parse(fechaStringInicio, formatter);

        System.out.println("Introduce la fecha del día de entrega de alquiler en formato dd/MM/yyyy: ");
        String fechaStringFinal = leer.next();

        LocalDate fechaFinal = LocalDate.parse(fechaStringFinal, formatter);

        public long diasAlquiler() {
        return ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
    }*/
    
}
