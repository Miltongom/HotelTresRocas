package Controlador;

import Modelo.ModeloUsuario;
import Vista.VistaPrincipal;
import Vista.VistaRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControladorUsuario implements ActionListener {

    private ArrayList<ModeloUsuario> baseDatosUsuarios = new ArrayList<>();

    private ModeloUsuario modelo;

    public ControladorUsuario(ModeloUsuario modelo) {
        this.modelo = modelo;

        baseDatosUsuarios.add(new ModeloUsuario("mgomez", "joetd2003@gmail.com", "12345"));
    }

    public boolean validarUsuario() {

        String inputUser = modelo.getVista().txtusuario.getText();
        String inputCorr = String.valueOf(modelo.getVista().txtcorreo.getText());
        String inputPass = String.valueOf(modelo.getVista().txtcontraseña.getPassword());

        for (ModeloUsuario usuario : baseDatosUsuarios) {

            if (usuario.getUsuario().equals(inputUser) && usuario.getContraseña().equals(inputPass)
                    && usuario.getCorreo().equals(inputCorr)) {
                return true;
            }
        }
        return false;
    }

    public void registrarUsuario() {
        if (String.valueOf(modelo.getVistaRegistro().txtPassR.getPassword()).equals(String.valueOf(modelo.getVistaRegistro().txtPassOtraVezR.getPassword()))) {
            ModeloUsuario usuario = new ModeloUsuario();
            usuario.setUsuario(modelo.getVistaRegistro().txtUsuarioR.getText());
            usuario.setNombre(modelo.getVistaRegistro().txtNombre.getText());
            usuario.setApellido(modelo.getVistaRegistro().txtApellidos.getText());
            usuario.setCorreo(modelo.getVistaRegistro().txtcorreo.getText());
            usuario.setContraseña(String.valueOf(modelo.getVistaRegistro().txtPassR.getPassword()));
            baseDatosUsuarios.add(usuario);

            JOptionPane.showMessageDialog(null, "Usuario reigstrado con exito", "Registro de usuario", JOptionPane.INFORMATION_MESSAGE);

            modelo.getVistaRegistro().txtUsuarioR.setText("");
            modelo.getVistaRegistro().txtcorreo.setText("");
            modelo.getVistaRegistro().txtPassR.setText("");
            modelo.getVistaRegistro().txtPassOtraVezR.setText("");
            modelo.getVistaRegistro().txtNombre.setText("");
            modelo.getVistaRegistro().txtApellidos.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "Contraseñas diferentes, favor de validar", "Registro de usuario", JOptionPane.ERROR_MESSAGE);

            modelo.getVistaRegistro().txtPassR.setText("");
            modelo.getVistaRegistro().txtPassOtraVezR.setText("");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (modelo.getVistaRegistro() == null) {
            if (e.getActionCommand().equals(modelo.getVista().btningresar.getActionCommand())) {
                // Validar las credenciales del usuario
                if (validarUsuario()) {
                    VistaPrincipal vprincipal = new VistaPrincipal();
                    vprincipal.setVisible(true);
                    modelo.getVista().dispose();
                } else {

                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else if (e.getActionCommand().equals(modelo.getVista().btnregistrarce.getActionCommand())) {
                VistaRegistro vregistro = new VistaRegistro();
                vregistro.setVisible(true);
            }
        } else if (modelo.getVista() == null) {
            if (e.getActionCommand().equals(modelo.getVistaRegistro().btnGuardar.getActionCommand())) {
                registrarUsuario();
            }
        }
    }
}