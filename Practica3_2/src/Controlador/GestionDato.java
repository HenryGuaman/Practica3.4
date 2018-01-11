/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Casa;
import java.util.List;

/**
 *
 * @author Abuelito
 */
public class GestionDato {

    public GestionDato() {
    }

    
    public List<Casa> burbuja(List<Casa> house) {
        
        Casa aux = null;
        int cont = 0;
        int op = 0;
        
        
        for (int i = 0; i < house.size() - 1; i++) {
            for (int j = i + 1; j < house.size(); j++) {
                if (house.get(i).getCodigo() > house.get(j).getCodigo()) {
                    aux = house.get(i);
                    house.set(i, house.get(j));
                    house.set(j,aux);
                    
                }
                
                //for (int k = 0; k <a.length; k++) {
                //  System.out.print(a[k]+" ");
                //}
                //System.out.println();
            }
        }
        //System.out.println("El numero de interacciones es: "+cont); 
        //System.out.println("El numero de operaciones es: "+op);    
        return house;
    }
    
    public List ordenarQuicksort(List<Casa> lista, int izq, int der) {

        Casa pivote = lista.get(izq); 
        int i = izq; 
        int j = der; 
        Casa aux;

        while (i < j) {            // mientras no se crucen las búsquedas
            while (lista.get(i).getCodigo() <= pivote.getCodigo() && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (lista.get(j).getCodigo() > pivote.getCodigo()) {
                j--;         // busca elemento menor que pivote
            }
            if (i < j) {                      // si no se han cruzado                      
                aux = lista.get(i);                  // los intercambia
                lista.set(i, lista.get(j));
                lista.set(j, aux);
            }
        }
        lista.set(izq, lista.get(j)); // se coloca el pivote en su lugar de forma que tendremos
        lista.set(j, pivote); // los menores a su izquierda y los mayores a su derecha
        if (izq < j - 1) {
            ordenarQuicksort(lista, izq, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            ordenarQuicksort(lista, j + 1, der); // ordenamos subarray derecho
        }
        
        return lista;
    }

}
