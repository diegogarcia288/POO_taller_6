/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca.modelo;

/**
 *
 * @author User
 */
public class Libro {

    private String autor;
    private String titulo;
    private boolean disponible;

    public Libro(String titulo, String autor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.disponible = true;
    }

    /**
     * GETTERSS Y SETTERS
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("Título inválido");
            if(this.titulo == null) {
                this.titulo = "Sin título";
            }
        } else {
            this.titulo = titulo;
        }
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void prestar() {
        this.disponible = false;
    }

    public void devolver() {
        this.disponible = true;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + getTitulo() + ", Autor: " + getAutor());
        System.out.println("Disponible " + estaDisponible());
    }
    
    public boolean mismoTitulo(Libro otro){
        if(otro != null && this.titulo.equals(otro.getTitulo())){
            return true;
        }
        
        return false;
    }

}
