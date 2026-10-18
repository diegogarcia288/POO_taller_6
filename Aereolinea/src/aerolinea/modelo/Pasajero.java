/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aerolinea.modelo;

import aerolinea.modelo.Vuelo;

/**
 *
 * @author User
 */
public class Pasajero {

    private String nombre;
    private Vuelo vuelo;

    public Pasajero(String nombre) {
        this.nombre = nombre;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void reservarVuelo(Vuelo vuelo) {
        if (vuelo == null) {
            System.out.println(nombre + "No hay vuelo");
        return;
        }
        boolean exito = vuelo.reservarSillas();

        if (exito) {
            this.vuelo = vuelo;
            System.out.println(nombre + "reservó en: " + vuelo.getCodigo());
        } else {
            System.out.println(nombre + ": vuelo " + vuelo.getCodigo() + " lleno");
        }
    }
    
    public void mostrarReserva() {
        if (vuelo == null){
            System.out.println(nombre + " Sin reserva.");
        }
        else{
            System.out.println(nombre + " Viaja a: " + vuelo.getDestino());
        }
    }
    
}
