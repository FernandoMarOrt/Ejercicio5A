/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ejercicio5a;

import java.util.Random;

/**
 *
 * @author Fer
 */
public enum ApellidosClientes {
    
    //Apellidos de los clientes
    JIMENEZ, ORTIZ, TORRES, MARTINEZ, VIANA,;

    public static ApellidosClientes getAleatorio() {
        
        
        Random numeroRandom = new Random();

        ApellidosClientes[] apellidosCli = ApellidosClientes.values();

        //Posicion aleatorio de donde ira al apellido
        int posicionRandom = numeroRandom.nextInt(0, apellidosCli.length);

        return apellidosCli[posicionRandom];
    }
    
}
