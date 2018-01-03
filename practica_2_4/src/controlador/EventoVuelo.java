/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.VentanaVuelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Abuelito
 */
public class EventoVuelo implements ActionListener{

    private VentanaVuelo vVuelo;

    public EventoVuelo(VentanaVuelo vVuelo) {
        this.vVuelo = vVuelo;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
