/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aerolinea.modelo;

/**
 *
 * @author User
 */
public class Vuelo {

    private String codigo;
    private String destino;
    private int sillasDisponibles;

    public Vuelo(String codigo, String destino, int sillasDisponibles) {
        this.codigo = codigo;
        setDestino(destino);
            if(sillasDisponibles < 0){
            }
            else{
                this.sillasDisponibles = sillasDisponibles;
            }
            
        this.sillasDisponibles = 0;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo() {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        if (destino != null && !destino.trim().isEmpty())
            this.destino = destino;
    }
    
    public int getSillasDisponibles(){
        return sillasDisponibles;
    }
    
    public boolean reservarSillas() {
        if(sillasDisponibles > 0){
            sillasDisponibles = -1;
            return true;
        }
        else{
                return false;}    
    }
    
}
