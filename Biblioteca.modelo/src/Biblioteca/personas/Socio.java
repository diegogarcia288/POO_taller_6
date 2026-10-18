/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca.personas;

import Biblioteca.modelo.Libro;

/**
 *
 * @author User
 */
public class Socio {
    private String nombre;
    private int librosPrestados;
    
    public Socio(String nombre){
        this.nombre = nombre;
        this.librosPrestados = 0;
    }
    
    public int getLibrosPrestados(){
        return librosPrestados;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(){
        this.nombre = nombre;
    }
    
    public void prestarLibro(Libro libro){
        if(libro == null){
            System.out.println("No hay libro para prestar");
        }
        else if(!libro.estaDisponible()){
            System.out.println("El libro: " + libro.getTitulo() + "No está disponible");
            }
        else{
            System.out.println("Está disponible");
            libro.prestar();
            this.librosPrestados = +1;
            System.out.println(nombre + "Recibió: " + libro.getTitulo());
        }
    }
    
    public void devolverLibro(Libro libro){
        if (libro.getTitulo() == null || libro.getTitulo().trim().isEmpty()){
            System.out.println("No hay libro");
    }
    else if (this.librosPrestados > 0) {
        libro.devolver();
        this.librosPrestados = -1;
    }
        
    }
}
