/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.EventoVentanaPrincipal;
import controlador.GestionDato;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Eduardo
 */
public class VentanaPrincipal extends JFrame {

    private JMenuBar menu;
    private JDesktopPane escritorio;
    private List<JMenu> menuList;
    private List<JMenuItem> menuItemList;
    private GestionDato gD;

    public VentanaPrincipal(GestionDato gD) {
        this.setTitle("Sistemas de Vuelos");
        this.setSize(825, 800);
        this.setDefaultCloseOperation(3);
        this.gD = gD;
        iniciaComponente();
    }

    public void iniciaComponente() {
        this.menu = new JMenuBar();
        this.escritorio = new JDesktopPane();
        this.menuList = new ArrayList<JMenu>();
        this.menuList.add(new JMenu("Pasajero"));
        this.menuList.add(new JMenu("Aueropuerto"));
        this.menuList.add(new JMenu("Avion"));
        this.menuList.add(new JMenu("Vuelo"));
        this.menuList.add(new JMenu("Programa de Vuelo"));
        this.menuList.add(new JMenu("Boleto"));
        
        

        this.menuItemList = new ArrayList<JMenuItem>();
        this.menuItemList.add(new JMenuItem("Registro del Pasajero"));
        this.menuItemList.add(new JMenuItem("Registro del Aeropuerto"));
        this.menuItemList.add(new JMenuItem("Registro del Avion"));
        this.menuItemList.add(new JMenuItem("Registro de Vuelo"));
        this.menuItemList.add(new JMenuItem("Horarios de Vuelos"));
        this.menuItemList.add(new JMenuItem("Datos del Boleto"));
        

        this.setContentPane(this.escritorio);
        this.setJMenuBar(menu);

        this.menu.add(this.menuList.get(0));
        this.menu.add(this.menuList.get(1));
        this.menu.add(this.menuList.get(2));
        this.menu.add(this.menuList.get(3));
        this.menu.add(this.menuList.get(4));
        this.menu.add(this.menuList.get(5));
        this.menuList.get(0).add(this.menuItemList.get(0));
        this.menuList.get(1).add(this.menuItemList.get(1));
        this.menuList.get(2).add(this.menuItemList.get(2));
        this.menuList.get(3).add(this.menuItemList.get(3));
        this.menuList.get(4).add(this.menuItemList.get(4));
        this.menuList.get(5).add(this.menuItemList.get(5));
        

        this.menuItemList.get(0).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(1).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(2).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(3).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(4).addActionListener(new EventoVentanaPrincipal(this));
        this.menuItemList.get(5).addActionListener(new EventoVentanaPrincipal(this));
        
    }

    public JMenuBar getMenu() {
        return menu;
    }

    public void setMenu(JMenuBar menu) {
        this.menu = menu;
    }

    public JDesktopPane getEscritorio() {
        return escritorio;
    }

    public void setEscritorio(JDesktopPane escritorio) {
        this.escritorio = escritorio;
    }

    public List<JMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<JMenu> menuList) {
        this.menuList = menuList;
    }

    public List<JMenuItem> getMenuItemList() {
        return menuItemList;
    }

    public void setMenuItemList(List<JMenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }
    
    

}
