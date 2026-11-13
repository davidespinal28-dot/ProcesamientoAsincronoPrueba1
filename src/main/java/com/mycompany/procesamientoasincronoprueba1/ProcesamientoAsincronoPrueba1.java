/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.procesamientoasincronoprueba1;

import Controlador.DescargaController;

/**
 *
 * @author davidespinal
 */
public class ProcesamientoAsincronoPrueba1 {

    public static void main(String[] args) {
        DescargaController controller = new DescargaController();
        
        boolean resultado = controller.iniciarDescarga("Video.mp4",3);
        if (resultado){
            System.out.println("Proceso Iniciado Correctamente");
        }else {
            System.out.println("Error en la descarga.");
        }
    }
}
