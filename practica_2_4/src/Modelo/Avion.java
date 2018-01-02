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
public class Avion implements Serializable{
    @Id
    private int id;
    private String modelo; 
    private String compania;
    private int capacidad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Avion(int id, String modelo, String compania, int capacidad) {
        this.id = id;
        this.modelo = modelo;
        this.compania = compania;
        this.capacidad = capacidad;
    }

   

   

    
    public Avion(String modelo, String compania, int capacidad) {
        this.modelo = modelo;
        this.compania = compania;
        this.capacidad = capacidad;
    }

    public Avion() {
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Avion{" + "id=" + id + ", modelo=" + modelo + ", compania=" + compania + ", capacidad=" + capacidad + '}';
    }

    

    
    
}
