/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5a;

import java.util.Arrays;

/**
 *
 * @author fer
 */
public class CatalogoClientes {

    private int numeroClientes;

    private Clientes[] listaClientes;

    //EL constructor recibe el tamaño del catalogo e inicializa la estructura
    // de datos con vehiculos aleatorios
    public CatalogoClientes(int tamanio) {

        tamanio = Math.abs(tamanio); //el tamaño dle constructor

        this.numeroClientes = tamanio; //va a ser el numeor de vehiculo

        this.listaClientes = new Clientes[tamanio];

        //Una vez  creada la estructura de datos le doy valor a cada elemento
        for (int i = 0; i < listaClientes.length; i++) {

            this.listaClientes[i] = new Clientes();

        }

    }


    public String toString() {

        String tmp = "";

        for (Clientes c : listaClientes) {
            
            if (c != null) {
                
                tmp += c.toString() + "\n";

            }
        }

        return tmp;
    }
    
    
    
    
    
    public void añadirClientes(Clientes c) {
        
        //Si hay hueco se inserta en el hueco
        if(this.numeroClientes < this.listaClientes.length) {
            
            for (int i = 0; i < this.listaClientes.length; i++) {
                
                
                if(this.listaClientes[i] ==  null){
                    
                    this.listaClientes[i] = c;
                    this.numeroClientes++;
                    
                    System.out.println("Guardando clientes en la posicion" + i) ;
                    break;
                    
                } 
                
                
            }
            
        } else { //SI NO , METO UN ESPACIO MAS 
            
            this.numeroClientes++;//SUMA UN ESPACIO AL CATALOGO
            
            this.listaClientes = Arrays.copyOf(listaClientes, this.numeroClientes); 
//          this.listaVehiculos = Arrays.copyOf(listaClientes, this.numeroClientes*2); //ARRAY NUEVO CON EL DOBLE DE ESPACIOS QUE EL ANTERIOR

            this.listaClientes[this.numeroClientes-1] = c;
            
        }
        
        
    }
    
    
    
    

    public int getNumeroClientes() { //me dice el numero de clientes que hay en el catalogo NO EL TAMAÑO
        return numeroClientes;
    }

    public Clientes[] getListaClientes() {
        return listaClientes;
    }


    public boolean borrarclientes(Clientes c) {

        int pos = buscarClientes(c);

        if (pos >= 0) {

            this.listaClientes[pos] = null; //Es como borrarlo
            this.numeroClientes--;
            return true; //SI encuentra y borra el cliente existosamente devuelve true
        }

        return false; //Si no consigue borrarlo devuelve false

    }

    //ESTO ES UNA BUSQUEDA SECUENCIAL
    public int buscarClientes(Clientes c) {

        for (int i = 0; i < this.listaClientes.length; i++) {

            //MIRA SI EL CLIENTE QUE LE PASO ES IGUAL A UNO DEL ARRAY
            //LE PUSIMOS QUE MIRE EL BASTIDOR
            if (c.equals(this.listaClientes[i])) {

                return i;
            }

        }

        return -1;

    }
    

}
