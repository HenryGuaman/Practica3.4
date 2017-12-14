/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.VentanaAeropuerto;
import Vista.VentanaAvion;
import Vista.VentanaBoleto;
import Vista.VentanaPasajero;
import Vista.VentanaPrincipal;
import Vista.VentanaProgramaVuelo;
import Vista.VentanaVuelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Eduardo
 */
public class EventoVentanaPrincipal implements ActionListener{
    private VentanaPrincipal ventana;

    public EventoVentanaPrincipal(VentanaPrincipal ventana) {
        this.ventana = ventana;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.ventana.getMenuItemList().get(0))){
            VentanaPasajero vp=new VentanaPasajero(this.ventana.getgD());
            vp.setVisible(true);
            this.ventana.getEscritorio().add(vp);
        }
        
        if(e.getSource().equals(this.ventana.getMenuItemList().get(1))){
            VentanaAeropuerto va=new VentanaAeropuerto(this.ventana.getgD());
            va.setVisible(true);
            this.ventana.getEscritorio().add(va);
        }
        
        if(e.getSource().equals(this.ventana.getMenuItemList().get(2))){
            VentanaAvion vav=new VentanaAvion(this.ventana.getgD());
            vav.setVisible(true);
            this.ventana.getEscritorio().add(vav);
        }
        if(e.getSource().equals(this.ventana.getMenuItemList().get(3))){
            VentanaVuelo vv=new VentanaVuelo(this.ventana.getgD());
            vv.setVisible(true);
            this.ventana.getEscritorio().add(vv);
        }
        
        if(e.getSource().equals(this.ventana.getMenuItemList().get(4))){
            VentanaProgramaVuelo vp=new VentanaProgramaVuelo(this.ventana.getgD());
            vp.setVisible(true);
            this.ventana.getEscritorio().add(vp);
        }
        
        if(e.getSource().equals(this.ventana.getMenuItemList().get(5))){
            VentanaBoleto vb=new VentanaBoleto(this.ventana.getgD());
            vb.setVisible(true);
            this.ventana.getEscritorio().add(vb);
        }
    }
    
}
