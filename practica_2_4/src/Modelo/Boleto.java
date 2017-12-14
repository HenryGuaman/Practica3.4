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
public class Boleto implements Serializable{
   @Id
    private int numero;
    private Pasajero pasajero;
    private Vuelo vuelo;
    private String clase;
    private Avion avion;

    public Boleto(int numero, Pasajero pasajero, Vuelo vuelo, String clase, Avion avion) {
        this.numero = numero;
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.clase = clase;
        this.avion = avion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    @Override
    public String toString() {
        return "Boleto{" + "numero=" + numero + ", pasajero=" + pasajero + ", vuelo=" + vuelo + ", clase=" + clase + ", avion=" + avion + '}';
    }

   
}
