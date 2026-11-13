/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Excepciones.TiempoExcedidoException;
import modelo.ArchivoDescarga;
/**
 *
 * @author davidespinal
 */
public class DescargaController {
    public boolean iniciarDescarga (String nombreArchivo, int tiempoLimite){
        try{
            ArchivoDescarga archivo = new ArchivoDescarga(nombreArchivo, tiempoLimite);
            Runnable descarga = new Runnable(){
                @Override
                public void run(){
                    try{
                        System.out.println("Descargando Archivo: "+ archivo.getNombreArchivo());
                        
                        Thread.sleep(5000);
                        System.out.println("Descarga Completada");
                    } catch (InterruptedException e) {
                        System.out.println("La descarga fue interrumpida.");
                    }
                }
            };
            Thread hilo = new Thread(descarga);
            hilo.start();
            
            if (5> archivo.getTiempoLimite()){
                throw new TiempoExcedidoException("Tiempo Limite de descarga excedido.");
            }
            return true;
        } catch (TiempoExcedidoException e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}