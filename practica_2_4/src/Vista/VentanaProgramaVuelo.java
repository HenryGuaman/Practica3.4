/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Aeropuerto;
import Modelo.ProgramaVuelo;
import Modelo.Vuelo;
import controlador.EventoProgramaVuelo;
import controlador.GestionDato;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Eduardo
 */
public class VentanaProgramaVuelo extends JInternalFrame {

    private List<JLabel> etiquetaList;
    private List<JButton> botonList;
    private List<JTextField> txtList;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    private JComboBox combo1;
    private JComboBox combo2;
    private GestionDato gD;

    public VentanaProgramaVuelo(GestionDato gD) {
        super("Programa del Vuelo", true, true, true, true);
        this.setSize(750, 500);
        this.gD = gD;
        this.iniciacomponente();
    }

    public void iniciacomponente() {
        this.etiquetaList = new ArrayList<JLabel>();

        this.etiquetaList.add(new JLabel("Id Vuelo:"));
        this.etiquetaList.add(new JLabel("Vuelo: "));
        this.etiquetaList.add(new JLabel("AeroPuerto: "));
        this.etiquetaList.add(new JLabel("N° DE Escala: "));
        this.etiquetaList.add(new JLabel("Horario: "));

        this.txtList = new ArrayList<JTextField>();
        this.txtList.add(new JTextField(16));
        this.txtList.add(new JTextField(13));
        this.txtList.add(new JTextField(13));

        this.combo1 = new JComboBox();
        this.combo2 = new JComboBox();

        JPanel panel = new JPanel();
        this.botonList = new ArrayList<JButton>();
        this.botonList.add(new JButton("Guardar"));
        this.botonList.add(new JButton("Nuevo"));
        
        this.botonList.get(0).addActionListener(new EventoProgramaVuelo(this));
        this.botonList.get(1).addActionListener(new EventoProgramaVuelo(this));
        
        this.encabezado = new Object[5];

        this.encabezado[0] = "Id Vuelo";
        this.encabezado[1] = "Vuelo";
        this.encabezado[2] = "AeroPuerto";
        this.encabezado[3] = "N° DE Escala";
        this.encabezado[4] = "Horario";

        this.modeloTabla = new DefaultTableModel(this.datos, this.encabezado);
        this.tabla = new JTable(this.modeloTabla);
        this.scroll = new JScrollPane(this.tabla);

        panel.add(this.etiquetaList.get(0));
        panel.add(this.txtList.get(0));
        panel.add(this.etiquetaList.get(1));
        panel.add(this.combo1);
        panel.add(this.etiquetaList.get(2));
        panel.add(this.combo2);
        panel.add(this.etiquetaList.get(3));
        panel.add(this.txtList.get(1));
        panel.add(this.etiquetaList.get(4));
        panel.add(this.txtList.get(2));

        panel.add(botonList.get(0));
        panel.add(botonList.get(1));

        panel.add(this.scroll);
        this.add(panel);

    }

    
    public Object[] CargaCombo() {
       int[] retorno = new int[this.gD.leerVuelo().size()];
        int i = 0;
        for (Vuelo v : this.gD.leerVuelo()) {
            retorno[i] = v.getId();
            i++;
        }
        return null;
    }

    public Object[] CargaCombo2() {
        int[] retorno = new int[this.gD.leerAeropuerto().size()];
        int i = 0;
        for (Aeropuerto a : this.gD.leerAeropuerto()) {
            retorno[i] = a.getId();
            i++;
        }
        return null;
    }

    public Object[][] cargaDatosTabla(int h, int w) {
        Object[][] retorno = new Object[h][w];
        int i = 0;
        for (ProgramaVuelo p : this.gD.leerProgramaVuelo()) {
            retorno[i][0] = p.getId();
            retorno[i][1] = p.getVuelo().getId();
            retorno[i][2] = p.getAeropuerto().getId();
            retorno[i][3] = p.getNumEscala();
            retorno[i][4] = p.getHorario();
            i++;
        }
        return retorno;
    }
    
    public List<JLabel> getEtiquetaList() {
        return etiquetaList;
    }

    public void setEtiquetaList(List<JLabel> etiquetaList) {
        this.etiquetaList = etiquetaList;
    }

    public List<JButton> getBotonList() {
        return botonList;
    }

    public void setBotonList(List<JButton> botonList) {
        this.botonList = botonList;
    }

    public List<JTextField> getTxtList() {
        return txtList;
    }

    public void setTxtList(List<JTextField> txtList) {
        this.txtList = txtList;
    }

    public Object[][] getDatos() {
        return datos;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }

    public Object[] getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Object[] encabezado) {
        this.encabezado = encabezado;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public JComboBox getCombo1() {
        return combo1;
    }

    public void setCombo1(JComboBox combo1) {
        this.combo1 = combo1;
    }

    public JComboBox getCombo2() {
        return combo2;
    }

    public void setCombo2(JComboBox combo2) {
        this.combo2 = combo2;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }

}
