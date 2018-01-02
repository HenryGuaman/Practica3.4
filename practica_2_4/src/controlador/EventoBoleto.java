/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.VentanaBoleto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        
    }
    
}
