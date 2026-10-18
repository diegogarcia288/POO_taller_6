/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca.app;

import Biblioteca.modelo.Libro;
import Biblioteca.personas.Socio;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro ("Cien años de Soledad" , "Gabriel García Márquez");
        
        libro1.mostrarInformacion();
        
        Libro libro2 = libro1;
        Libro libro3 = new Libro("Cien años de Soledad" , "Gabriel García Márquez");
        
        libro2.prestar();
        
        System.out.println(libro1.estaDisponible());
        System.out.println(libro3.estaDisponible());
        System.out.println(libro1 == libro2);
        System.out.println(libro1 == libro3);
        
        
        Libro libro14 = null;
        
        if(libro14 == null){
            System.out.println("No hay Libro");
        }
        else{
            libro14.mostrarInformacion();
        }
        
        libro1.setTitulo("");
        System.out.println(libro1.getTitulo());
        Libro libro5 = new Libro("" , "Anónimo");
        System.out.println(libro5.getTitulo());
        
        Socio socio1 = new Socio("Camila");
        socio1.prestarLibro(libro3);
        socio1.prestarLibro(libro1);
        socio1.prestarLibro(null);
        System.out.println(socio1.getLibrosPrestados());
        libro3.estaDisponible();
    }
}
