/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Aeropuerto;
import Modelo.ProgramaVuelo;
import Modelo.Vuelo;
import Vista.VentanaProgramaVuelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author SVAIO
 */
public class EventoProgramaVuelo implements ActionListener {

    private VentanaProgramaVuelo vPVuelo;

    public EventoProgramaVuelo(VentanaProgramaVuelo vPVuelo) {
        this.vPVuelo = vPVuelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vPVuelo.getBotonList().get(0))) {

            int iD = Integer.parseInt(this.vPVuelo.getTxtList().get(0).getText());
            String cmb1 = this.vPVuelo.getCombo1().getSelectedItem().toString();
            String cmb2 = this.vPVuelo.getCombo2().getSelectedItem().toString();
            int nE = Integer.parseInt(this.vPVuelo.getTxtList().get(1).getText());
            String hor = this.vPVuelo.getTxtList().get(2).getText();
            Vuelo vl = this.vPVuelo.getgD().buscarVuelo(cmb1);
            Aeropuerto aE = this.vPVuelo.getgD().buscarAeropuerto(cmb2);
            ProgramaVuelo pV = new ProgramaVuelo(iD, vl, aE, nE, hor);
            this.vPVuelo.getgD().insertProgramaVuelo(pV);
            this.vPVuelo.getgD().leerProgramaVuelo();
            Object[][] datoPVuelo = this.vPVuelo.cargaDatosTabla(this.vPVuelo.getgD().leerProgramaVuelo().size(), 5);
            this.vPVuelo.setDatos(datoPVuelo);
            this.vPVuelo.getModeloTabla().setDataVector(this.vPVuelo.getDatos(), this.vPVuelo.getEncabezado());

        }

    }
}
