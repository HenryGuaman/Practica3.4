/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author SVAIO
 */
public class Diccionario<K, E> {

    Hashtable<Integer, Object> elemento = new Hashtable<Integer, Object>();
    ArrayList<Object> lista = new ArrayList<Object>();

    public boolean agregarElemento(Integer clave, Object valor) {

        elemento.put(clave, valor);

        return true;
    }

    public Object recuperarElemento(Integer clave) {
    
        Object re = elemento.get(clave);
        System.out.println(re);
        return re;
    }

    public List<E> recuperarElementos(List<E> lista) {
        ArrayList<E> lis= new ArrayList<E>();
        lis.addAll(lista);
        return lis;
    }

    public boolean eliminarElemento(Integer clave) {

        if (elemento.containsKey(clave)) {
            elemento.remove(clave);
            elemento.entrySet();

            return true;

        } else {
            System.out.println("No existe el valor a eliminar");
            return false;
        }

    }

    public void imprimir() {
        Iterator it = elemento.keySet().iterator();
        while (it.hasNext()) {
            Integer key = (Integer) it.next();
            System.out.println("clave: " + key + " , " + elemento.get(key));

        }

    }

}
