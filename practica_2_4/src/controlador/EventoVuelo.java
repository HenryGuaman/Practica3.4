/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Vuelo;
import Vista.VentanaVuelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Abuelito
 */
public class EventoVuelo implements ActionListener {

    private VentanaVuelo vVuelo;

    public EventoVuelo(VentanaVuelo vVuelo) {
        this.vVuelo = vVuelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vVuelo.getBotonList().get(0))) {
            int iD = Integer.parseInt(this.vVuelo.getTxtList().get(0).getText());
            String origen = this.vVuelo.getTxtList().get(1).getText();
            String destino = this.vVuelo.getTxtList().get(2).getText();
            String partida = this.vVuelo.getTxtList().get(3).getText();
            int capacidad = Integer.parseInt(this.vVuelo.getTxtList().get(4).getText());
            Vuelo v = new Vuelo(iD, origen, destino, partida, capacidad);
            this.vVuelo.getgD().insertVuelo(v);
            this.vVuelo.getgD().leerVuelo();
            Object[][] datosVuelo = this.vVuelo.cargaDatosTabla(this.vVuelo.getgD().leerVuelo().size(), 5);
            this.vVuelo.setDatos(datosVuelo);
            this.vVuelo.getModeloTabla().setDataVector(this.vVuelo.getDatos(), this.vVuelo.getEncabezado());
        }
    }

}
