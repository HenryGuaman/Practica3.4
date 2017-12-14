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
public class ProgramaVuelo implements Serializable{
    @Id
    private int IdVuelo;
    private Vuelo vuelo;
    private Aeropuerto aeropuerto;
    private int numEscala;
    private String horario;

    public ProgramaVuelo(int IdVuelo, Vuelo vuelo, Aeropuerto aeropuerto, int numEscala, String horario) {
        this.IdVuelo = IdVuelo;
        this.vuelo = vuelo;
        this.aeropuerto = aeropuerto;
        this.numEscala = numEscala;
        this.horario = horario;
    }

    public int getIdVuelo() {
        return IdVuelo;
    }

    public void setIdVuelo(int IdVuelo) {
        this.IdVuelo = IdVuelo;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Aeropuerto getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(Aeropuerto aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public int getNumEscala() {
        return numEscala;
    }

    public void setNumEscala(int numEscala) {
        this.numEscala = numEscala;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "ProgramaVuelo{" + "IdVuelo=" + IdVuelo + ", vuelo=" + vuelo + ", aeropuerto=" + aeropuerto + ", numEscala=" + numEscala + ", horario=" + horario + '}';
    }

    
    
    
}
