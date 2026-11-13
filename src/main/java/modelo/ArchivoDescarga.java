/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author davidespinal
 */
public class ArchivoDescarga {
    private String nombreArchivo;
    private int tiempoLimite;
    
    public ArchivoDescarga(String nombreArchivo, int tiempoLimite){
        this.nombreArchivo = nombreArchivo;
        this.tiempoLimite = tiempoLimite;
    }
    public String getNombreArchivo(){
        return nombreArchivo;
    }
    public int getTiempoLimite(){
        return tiempoLimite;
    }
}
