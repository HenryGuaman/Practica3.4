/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Avion;
import Modelo.Boleto;
import Modelo.Pasajero;
import Modelo.Vuelo;
import Vista.VentanaBoleto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author SVAIO
 */
public class EventoBoleto implements ActionListener {

    private VentanaBoleto vBoleto;

    public EventoBoleto(VentanaBoleto vBoleto) {
        this.vBoleto = vBoleto;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource().equals(this.vBoleto.getBotonList().get(0))) {

                int iD = Integer.parseInt(this.vBoleto.getTxtList().get(0).getText());
                int cmb1 = Integer.parseInt(this.vBoleto.getCombo1().getSelectedItem().toString());
                int cmb2 = Integer.parseInt(this.vBoleto.getCombo2().getSelectedItem().toString());
                String hor = this.vBoleto.getTxtList().get(1).getText();
                int cmb3 = Integer.parseInt(this.vBoleto.getCombo2().getSelectedItem().toString());

                Pasajero p1 = this.vBoleto.getgD().buscarPasajero2(cmb1);
                Vuelo vl = this.vBoleto.getgD().buscarVuelo2(cmb2);
                Avion av = this.vBoleto.getgD().buscarAvion2(cmb3);
                Boleto b = new Boleto(iD, p1, vl, hor, av);
                this.vBoleto.getgD().insertBoleto(b);
                this.vBoleto.getgD().leerBoleto();
                Object[][] datoBoleto = this.vBoleto.cargaDatosTabla(this.vBoleto.getgD().leerBoleto().size(), 5);
                this.vBoleto.setDatos(datoBoleto);
                this.vBoleto.getModeloTabla().setDataVector(this.vBoleto.getDatos(), this.vBoleto.getEncabezado());
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(vBoleto, "Todos los campos son necesarios ", "Error Registro", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(vBoleto, "Todos los campos son necesarios ", "Error Registro", JOptionPane.ERROR_MESSAGE);

        }
        if (e.getSource().equals(this.vBoleto.getBotonList().get(1))) {
            this.vBoleto.getTxtList().get(0).setText("");
            this.vBoleto.getTxtList().get(1).setText("");
        }
    }
}
