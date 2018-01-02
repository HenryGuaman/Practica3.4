/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Aeropuerto;
import Vista.VentanaAeropuerto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author SVAIO
 */
public class EventoAeropuerto implements ActionListener {

    private VentanaAeropuerto vAeropuerto;

    public EventoAeropuerto(VentanaAeropuerto vAeropuerto) {
        this.vAeropuerto = vAeropuerto;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.vAeropuerto.getBotonList().get(0))) {
            try {
                int iD = Integer.parseInt(this.vAeropuerto.getTxtList().get(0).getText());
                String nombre = this.vAeropuerto.getTxtList().get(1).getText();
                String ciudad = this.vAeropuerto.getTxtList().get(2).getText();
                String pais = this.vAeropuerto.getTxtList().get(3).getText();
                Aeropuerto a = new Aeropuerto(iD, nombre, ciudad, pais);
                this.vAeropuerto.getgD().insertAeropuerto(a);
                this.vAeropuerto.getgD().leerAeropuerto();
                Object[][] datoAeropuerto = this.vAeropuerto.cargaDatosTabla(this.vAeropuerto.getgD().leerAeropuerto().size(), 4);
                this.vAeropuerto.setDatos(datoAeropuerto);
                this.vAeropuerto.getModeloTabla().setDataVector(this.vAeropuerto.getDatos(), this.vAeropuerto.getEncabezado());
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(vAeropuerto, "Todos los campos son necesarios ", "Error Registro", JOptionPane.ERROR_MESSAGE);
            } catch (NullPointerException npe) {
                JOptionPane.showMessageDialog(vAeropuerto, "Todos los campos son necesarios ", "Error Registro", JOptionPane.ERROR_MESSAGE);

            }
        }
        if (e.getSource().equals(this.vAeropuerto.getBotonList().get(1))) {
            this.vAeropuerto.getTxtList().get(0).setText("");
            this.vAeropuerto.getTxtList().get(1).setText("");
            this.vAeropuerto.getTxtList().get(2).setText("");
        }
    }
}
