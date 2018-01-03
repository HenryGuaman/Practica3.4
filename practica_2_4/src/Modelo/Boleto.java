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
    private int id;
    private Pasajero pasajero;
    private Vuelo vuelo;
    private String clase;
    private Avion avion;

    public Boleto(int id, Pasajero pasajero, Vuelo vuelo, String clase, Avion avion) {
        this.id = id;
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.clase = clase;
        this.avion = avion;
    }

    

    public Boleto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Boleto{" + "id=" + id + ", pasajero=" + pasajero + ", vuelo=" + vuelo + ", clase=" + clase + ", avion=" + avion + '}';
    }

    
   
}
