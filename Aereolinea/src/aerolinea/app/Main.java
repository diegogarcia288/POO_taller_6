/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aerolinea.app;

import aerolinea.modelo.Pasajero;
import aerolinea.modelo.Vuelo;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Vuelo vuelo1 = new Vuelo("AV-204" ,"Cartagena" , 2);
        
        Pasajero p1 = new Pasajero("Sara");
        Pasajero p2 = new Pasajero("Tomas");
        Pasajero p3 = new Pasajero("Lina");
        
        p3.mostrarReserva();
        
        p1.reservarVuelo(vuelo1);
        p2.reservarVuelo(vuelo1);
        p3.reservarVuelo(vuelo1);
        
        System.out.print(vuelo1.getSillasDisponibles());
        
        vuelo1.setDestino("Santa Marta");
        
        p1.mostrarReserva();
        p2.mostrarReserva();
        p3.mostrarReserva();
        
        System.out.println(p1.getVuelo() == p2.getVuelo());
    }
}
