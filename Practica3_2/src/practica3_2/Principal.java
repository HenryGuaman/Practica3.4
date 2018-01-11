/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_2;

import Modelo.Casa;
import Modelo.Propietario;
import Controlador.Diccionario;
import Controlador.GestionDato;
import Controlador.Lista;
import java.util.ArrayList;
import java.util.List;
import Controlador.Diccionario;

/**
 *
 * @author SVAIO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestionDato gD = new GestionDato();

        List<Casa> Burbuja = new ArrayList();
        List<Casa> QuickSort = new ArrayList();
        Propietario p = new Propietario(123, "Juan Perez");
        Propietario p1 = new Propietario(456, "Marco Rene");
        Propietario p2 = new Propietario(2341, "LUIS RENE ");
        Propietario p3 = new Propietario(223423, "Henry Guaman");

        Diccionario d = new Diccionario();
        d.agregarElemento(1, p);
        d.agregarElemento(2, p1);
        d.agregarElemento(3, p2);
        d.agregarElemento(4, p3);

        d.imprimir();

        System.out.println("DESPUES DE ELIMINAR ");
        d.eliminarElemento(2);

        d.imprimir();
        System.out.println("Recuperar elemento");
        d.recuperarElemento(3);

        System.out.println("Elementos de Casa");
        Casa c = new Casa(1, p);
        Casa c1 = new Casa(3, p1);
        Casa c2 = new Casa(2, p2);
        Casa c3 = new Casa(4, p3);

        Lista list = new Lista();
        list.agregarElemento(c);
        list.agregarElemento(c1);
        list.agregarElemento(c2);
        list.agregarElemento(c3);
        List<Casa> lista = new ArrayList();
        lista.add(c);
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        System.out.println("Recuperar toda la lista");
        System.out.println(d.recuperarElementos(lista));
        System.out.println("ORDENAMIENTOS QUIcK");
        System.out.println(gD.ordenarQuicksort(lista, 0, 3));
        System.out.println("BURBUJA");
        System.out.println(gD.burbuja(lista));

        list.imprimir();

        list.eliminarElemento(c1);

        list.imprimir();

        list.recuperarElemento(2);

    }

}
