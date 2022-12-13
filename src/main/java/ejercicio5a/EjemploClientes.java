/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5a;

/**
 *
 * @author alvaro
 */
public class EjemploClientes {

    public static void main(String[] args) {

        //Creo un catalogo de clientes por ejemplo de tamaño 10
        CatalogoClientes catalogoC = new CatalogoClientes(10);

        System.out.println("Numero de clientes " + catalogoC.getNumeroClientes());

        System.out.println(catalogoC);

        //Añado un cliente al catalogo 
        System.out.println("");

        System.out.println("Añadir cliente");

        Clientes cliente1 = new Clientes();

        System.out.println("*******************************************************");

        cliente1.setNif("12345678A");
        catalogoC.añadirClientes(cliente1);

        System.out.println("Cantidad de clientes despues de añadir un cliente nuevo: " + catalogoC.getNumeroClientes());
        System.out.println("");
        System.out.println(catalogoC);

        //Busco un cliente en el catalogo
        System.out.println("");

        System.out.println("*******************************************************");

        System.out.println("Buscar cliente");

        int lugarCliente = catalogoC.buscarClientes(cliente1);

        System.out.println("El cliente buscado esta en la posicion: " + lugarCliente);
        
        
        
        //borrar un cliente especifico del catalogo
        System.out.println("");

        System.out.println("Borrar cliente");

        System.out.println("*******************************************************");

        catalogoC.borrarclientes(catalogoC.getListaClientes()[10]);

        System.out.println("Cantidad de clientes despues de borrar un cliente: " + catalogoC.getNumeroClientes());
        System.out.println("");
        System.out.println(catalogoC);

    }
}
