/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author SVAIO
 */
public class Casa {
    
    private int codigo;
    private Propietario duenio;

    public Casa(int codigo, Propietario duenio) {
        this.codigo = codigo;
        this.duenio = duenio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Propietario getDuenio() {
        return duenio;
    }

    public void setDuenio(Propietario duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Casa{" + "codigo=" + codigo + ", duenio=" + duenio + '}';
    }
}
