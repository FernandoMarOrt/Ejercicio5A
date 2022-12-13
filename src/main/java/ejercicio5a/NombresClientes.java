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
public enum NombresClientes {
    
    //Nombres de los clientes
    PEPE, ANTONIO, JOSE, FEDERICO, ALFONSO;
    
    
    public static NombresClientes getAleatorio(){
        
        Random numeroRandom = new Random();
        
        NombresClientes [] nombresCli = NombresClientes.values();
        
        //Posicion aleatorio de donde ira el nombre
        int posicionRandom = numeroRandom.nextInt(0,nombresCli.length);
        
        return nombresCli[posicionRandom];
    }
    
}
