/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author SVAIO
 */
public class Diccionario< Integer, Object> {

    HashMap<Integer, Object> elemento = new HashMap<Integer, Object>();
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

    public List<Object> recuperarElementos() {
        List<Object> ret = null;
        ret = this.lista;
        System.out.println(ret);
        return ret;
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
