/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.GestionDato;

/**
 *
 * @author Estudiante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestionDato gD=new GestionDato();
        VentanaPrincipal vP= new VentanaPrincipal(gD);
        vP.setVisible(true);
    }
    
}
