/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;

/**
 *
 * @author SVAIO
 */
public class Lista<Object> {

    ArrayList<Object> elementoList = new ArrayList<Object>();

    public boolean agregarElemento(Object valor) {

        elementoList.add(valor);

        return true;
    }
    public Object recuperarElemento(int id) {
        Object res = elementoList.get(id);
        System.out.println(res);
        return res;
    }
    public boolean eliminarElemento(Object ob) {
        for (int i = 0; i < elementoList.size(); i++) {
            if (elementoList.get(i).equals(ob)) {
                System.out.println("Elemento Eliminado");
                elementoList.remove(i);
                return true;
            } else {
                if (i == elementoList.size() + 1) {
                    System.out.println("No se encuentra el valor");
                    return false;
                }
            }
        }
        return false;
    }
    public void imprimir() {
        int c = elementoList.size();
        for (int i = 0; i < c; i++) {
            System.out.println(elementoList.get(i));
        }
    }
}

