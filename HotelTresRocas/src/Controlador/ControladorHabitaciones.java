
package Controlador;

import Modelo.ModeloHabitaciones;

import Vista.VistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControladorHabitaciones implements ActionListener,MouseListener{
    
   
   private ModeloHabitaciones modelo;
    
    public ControladorHabitaciones( ModeloHabitaciones modelo){
            this.modelo = modelo;}
    
  
       
    

   
    public void actionPerformed(ActionEvent e){
      
        if(e.getActionCommand().equals(modelo.getVista().btnCancelar)){
           VistaPrincipal vprincipal = new VistaPrincipal();
            
            // Mostrar la vista principal
            vprincipal.setVisible(true);
            
            // Cerrar la vista de habitaciones
            modelo.getVista().dispose();
    
          
        }
      
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(e.getComponent().equals(modelo.getVista().btnCancelar)){
            VistaPrincipal vprincipal = new VistaPrincipal();
            
            // Mostrar la vista principal
            vprincipal.setVisible(true);
            
            // Cerrar la vista de habitaciones
            modelo.getVista().dispose();
      
    }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
