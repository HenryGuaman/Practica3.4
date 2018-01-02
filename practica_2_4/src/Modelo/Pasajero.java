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
public class Pasajero implements Serializable {

    @Id
    private int id;
    private String nombreYAp;
    private String cedula;
    private String telefono;
    private String nacionalidad;

    public Pasajero(int id, String nombreYAp, String cedula, String telefono, String nacionalidad) {
        this.id = id;
        this.nombreYAp = nombreYAp;
        this.cedula = cedula;
        this.telefono = telefono;
        this.nacionalidad = nacionalidad;
    }

   

    public Pasajero() {
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreYAp() {
        return nombreYAp;
    }

    public void setNombreYAp(String nombreYAp) {
        this.nombreYAp = nombreYAp;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "id=" + id + ", nombreYAp=" + nombreYAp + ", cedula=" + cedula + ", telefono=" + telefono + ", nacionalidad=" + nacionalidad + '}';
    }

   
}
