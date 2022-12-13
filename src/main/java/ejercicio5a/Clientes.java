/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5a;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Fer
 */
public class Clientes {

    private NombresClientes nombre;
    private ApellidosClientes apellido;
    private String nif;

    public Clientes() {
        
        this.nombre = NombresClientes.getAleatorio();
        this.apellido = ApellidosClientes.getAleatorio();
        this.nif = RandomStringUtils.randomNumeric(8) + RandomStringUtils.randomAlphabetic(1);
        
    }


    public NombresClientes getNombre() {
        return nombre;
    }

    public void setNombre(NombresClientes nombre) {
        this.nombre = nombre;
    }

    public ApellidosClientes getApellido() {
        return apellido;
    }

    public void setApellido(ApellidosClientes apellido) {
        this.apellido = apellido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.nif);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Clientes other = (Clientes) obj;
        return Objects.equals(this.nif, other.nif);
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + '}';
    }
    
    
    
    

}
