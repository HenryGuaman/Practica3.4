/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Avion;
import Vista.VentanaAvion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Abuelito
 */
public class EventoAvion implements ActionListener {

    private VentanaAvion vAvion;

    public EventoAvion(VentanaAvion vAvion) {
        this.vAvion = vAvion;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource().equals(this.vAvion.getBotonList().get(0))) {

                int iD = Integer.parseInt(this.vAvion.getTxtList().get(0).getText());
                String modelo = this.vAvion.getTxtList().get(1).getText();
                String compania = this.vAvion.getTxtList().get(2).getText();
                int capacidad = Integer.parseInt(this.vAvion.getTxtList().get(3).getText());
                Avion av = new Avion(iD, modelo, compania, capacidad);
                this.vAvion.getgD().insertAvion(av);
                this.vAvion.getgD().leerAvion();
                Object[][] datosAvion = this.vAvion.cargaDatosTabla(this.vAvion.getgD().leerAvion().size(), 4);
                this.vAvion.setDatos(datosAvion);
                this.vAvion.getModeloTabla().setDataVector(this.vAvion.getDatos(), this.vAvion.getEncabezado());
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(vAvion, "Todos los campos son necesarios ", "Error Registro", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(vAvion, "Todos los campos son necesarios ", "Error Registro", JOptionPane.ERROR_MESSAGE);

        }
        if (e.getSource().equals(this.vAvion.getBotonList().get(1))) {
            this.vAvion.getTxtList().get(0).setText("");
            this.vAvion.getTxtList().get(1).setText("");
            this.vAvion.getTxtList().get(2).setText("");
            this.vAvion.getTxtList().get(3).setText("");
        }

    }

}
