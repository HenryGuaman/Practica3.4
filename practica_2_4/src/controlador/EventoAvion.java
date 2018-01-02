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

        if (e.getSource().equals(this.vAvion.getBotonList().get(0))) {
            try {
                String modelo = this.vAvion.getTxtList().get(0).getText();
                String compania = this.vAvion.getTxtList().get(1).getText();
                int capacidad = Integer.parseInt(this.vAvion.getTxtList().get(2).getText());
                Avion av = new Avion(modelo, compania, capacidad);
                this.vAvion.getgD().leerAvion();
                Object[][] datostock = this.vAvion.cargarDatosTabla(this.vAvion.getgD().leerAvion().size(), 3);
                this.vAvion.setDatos(datostock);
                this.vAvion.getModeloTabla().setDataVector(this.vStock.getDatos(), this.vStock.getEncabezado());
                this.vAvion.getgD().guardarArchivoStock();

                this.vAvion.getgD().insertAvion(av);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(vAvion, "Todos los campos son necesarios ", "Error Registro", JOptionPane.ERROR_MESSAGE);
            } catch (NullPointerException npe) {
                JOptionPane.showMessageDialog(vAvion, "Todos los campos son necesarios ", "Error Registro", JOptionPane.ERROR_MESSAGE);

            }

        }

    }

}
