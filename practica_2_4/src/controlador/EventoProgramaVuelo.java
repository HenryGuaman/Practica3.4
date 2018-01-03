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
import javax.swing.JOptionPane;

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
        try {
            if (e.getSource().equals(this.vPVuelo.getBotonList().get(0))) {

                int iD = Integer.parseInt(this.vPVuelo.getTxtList().get(0).getText());
                int cmb1 = Integer.parseInt(this.vPVuelo.getCombo1().getSelectedItem().toString());
                int cmb2 = Integer.parseInt(this.vPVuelo.getCombo2().getSelectedItem().toString());
                int nE = Integer.parseInt(this.vPVuelo.getTxtList().get(1).getText());
                String hor = this.vPVuelo.getTxtList().get(2).getText();
                Vuelo vl = this.vPVuelo.getgD().buscarVuelo2(cmb1);
                Aeropuerto aE = this.vPVuelo.getgD().buscarAeropuerto2(cmb2);
                ProgramaVuelo pV = new ProgramaVuelo(iD, vl, aE, nE, hor);
                this.vPVuelo.getgD().insertProgramaVuelo(pV);
                this.vPVuelo.getgD().leerProgramaVuelo();
                Object[][] datoPVuelo = this.vPVuelo.cargaDatosTabla(this.vPVuelo.getgD().leerProgramaVuelo().size(), 5);
                this.vPVuelo.setDatos(datoPVuelo);
                this.vPVuelo.getModeloTabla().setDataVector(this.vPVuelo.getDatos(), this.vPVuelo.getEncabezado());
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(vPVuelo, "Todos los campos son necesarios ", "Error Registro", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(vPVuelo, "Todos los campos son necesarios ", "Error Registro", JOptionPane.ERROR_MESSAGE);
        }
        if (e.getSource().equals(this.vPVuelo.getBotonList().get(1))) {
            this.vPVuelo.getTxtList().get(0).setText("");
            this.vPVuelo.getTxtList().get(1).setText("");
            this.vPVuelo.getTxtList().get(2).setText("");
        }

    }
}
