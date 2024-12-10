package Controlador;

import Modelo.ModeloPrincipal;
import Vista.VistaActividades;
import Vista.VistaHabitaciones;
import Vista.VistaPrincipal;
import Vista.VistaRegistroCliente;
import Vista.VistaReservas;
import Vista.VistaRestaurante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorPrincipal implements ActionListener, MouseListener {

    
    private ModeloPrincipal modelo;

  



  
    public ControladorPrincipal(ModeloPrincipal modelo) {
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }

    
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

  
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getComponent().equals(modelo.getVista().mntmReservar)) {
            VistaHabitaciones vhabitaciones = new VistaHabitaciones();
            vhabitaciones.setVisible(true);
            modelo.getVista().dispose();
        } if (e.getComponent().equals(modelo.getVista().mntmReservas)) {
            VistaReservas vReservas= new VistaReservas();
            vReservas.setVisible(true);
            modelo.getVista().dispose();
        }
        if(e.getComponent().equals(modelo.getVista().mntmAgregarCliente)){
            VistaRegistroCliente vRegistroCliente = new VistaRegistroCliente();
            vRegistroCliente.setVisible(true);
            modelo.getVista().dispose();
        }if(e.getComponent().equals(modelo.getVista().mntmActividades)){
            VistaActividades vActividades = new VistaActividades();
            vActividades.setVisible(true);
            modelo.getVista().dispose();
        }if(e.getComponent().equals(modelo.getVista().mntmRestaurante)){
            VistaRestaurante vRestaurante = new VistaRestaurante();
            vRestaurante.setVisible(true);
            modelo.getVista().dispose();
        }
    }

   
    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    
    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    
    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}
