/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Implementacion.ClientesImp;
import Modelo.ModeloCliente;
import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class ControladorCliente implements ActionListener, WindowListener, MouseListener {

    ModeloCliente modelo;
    ClientesImp implementacion = new ClientesImp();

    public ControladorCliente(ModeloCliente modelo) {
        this.modelo = modelo;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(modelo.getVista().btnGuardar.getActionCommand())) {
            boolean resultado;
            ModeloCliente modelo = new ModeloCliente();
            modelo.setCodigo(Integer.parseInt(this.modelo.getVista().txtCodigoCliente.getText()));
            modelo.setNombre(this.modelo.getVista().txtNombre.getText());
            modelo.setApellido(this.modelo.getVista().txtApellido.getText());
            modelo.setDireccion(this.modelo.getVista().txtDireccion.getText());
            modelo.setCorreo(this.modelo.getVista().txtCorreo.getText());
            modelo.setTelefono(this.modelo.getVista().txtTelefono.getText());
            resultado = implementacion.agregarCliente(modelo);
            if (!resultado) {
                mostrarMensaje("Producto agregado con éxito", "Agregar Producto", JOptionPane.INFORMATION_MESSAGE); 
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese numeros enteros para realizar la insercion correctamente", "Ocurrió un error", JOptionPane.INFORMATION_MESSAGE);
                    modelo.getVista().txtCodigoCliente.setText("0");  
            }
        }
    }

    public void limpiar() {
        modelo.getVista().txtCodigoCliente.setText("");
        modelo.getVista().txtNombre.setText("");
        modelo.getVista().txtApellido.setText("");
        modelo.getVista().txtDireccion.setText("");
        modelo.getVista().txtCorreo.setText("");
        modelo.getVista().txtTelefono.setText("");
    }

    public void mostrarMensaje(String mensaje, String titulo, int tipoMensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, tipoMensaje); // Muestra el mensaje
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosing(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
