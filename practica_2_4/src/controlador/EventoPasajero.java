/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Pasajero;
import Vista.VentanaPasajero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author SVAIO
 */
public class EventoPasajero implements ActionListener {

    private VentanaPasajero vPasajero;

    public EventoPasajero(VentanaPasajero vPasajero) {
        this.vPasajero = vPasajero;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource().equals(this.vPasajero.getBotonList().get(0))) {

                int iD = Integer.parseInt(this.vPasajero.getTxtList().get(0).getText());
                String n1 = this.vPasajero.getTxtList().get(1).getText();
                String n2 = this.vPasajero.getTxtList().get(2).getText();
                String n3 = this.vPasajero.getTxtList().get(3).getText();
                String n4 = this.vPasajero.getTxtList().get(4).getText();
                Pasajero p = new Pasajero(iD, n1, n2, n3, n4);
                this.vPasajero.getgD().insertPasajero(p);
                this.vPasajero.getgD().leerPasajero();
                Object[][] datoPasajero = this.vPasajero.cargaDatosTabla(this.vPasajero.getgD().leerPasajero().size(), 5);
                this.vPasajero.setDatos(datoPasajero);
                this.vPasajero.getModeloTabla().setDataVector(this.vPasajero.getDatos(), this.vPasajero.getEncabezado());
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(vPasajero, "Todos los campos son necesarios ", "Error Registro", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(vPasajero, "Todos los campos son necesarios ", "Error Registro", JOptionPane.ERROR_MESSAGE);

        }

        if (e.getSource().equals(this.vPasajero.getBotonList().get(1))) {
            this.vPasajero.getTxtList().get(0).setText("");
            this.vPasajero.getTxtList().get(1).setText("");
            this.vPasajero.getTxtList().get(2).setText("");
            this.vPasajero.getTxtList().get(3).setText("");
            this.vPasajero.getTxtList().get(4).setText("");
        }
    }
}
