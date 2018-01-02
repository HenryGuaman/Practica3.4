/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Estudiante
 */
@Entity
public class Vuelo implements Serializable  {
    @Id
    private int numVuelo;
    private String origen;
    private String destino;
    private String fechaDePartida;
    private int numPasajeros;

    public Vuelo(int numVuelo, String origen, String destino, String fechaDePartida, int numPasajeros) {
        this.numVuelo = numVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaDePartida = fechaDePartida;
        this.numPasajeros = numPasajeros;
    }

    public Vuelo() {
    }
    

    public int getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaDePartida() {
        return fechaDePartida;
    }

    public void setFechaDePartida(String fechaDePartida) {
        this.fechaDePartida = fechaDePartida;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "numVuelo=" + numVuelo + ", origen=" + origen + ", destino=" + destino + ", fechaDePartida=" + fechaDePartida + ", numPasajeros=" + numPasajeros + '}';
    }

    
    
}
