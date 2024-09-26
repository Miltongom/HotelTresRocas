package Modelo;

import Vista.VistaLogin;
import Vista.VistaRegistro;

public class ModeloUsuario {

    private String usuario;
    private String contraseña;
    private String correo;
    private String nombre;
    private String apellido;
    private VistaLogin vista;
    private VistaRegistro vistaRegistro;

    public ModeloUsuario() {

    }

    public ModeloUsuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public ModeloUsuario(VistaRegistro vistaRegistro) {
        this.vistaRegistro = vistaRegistro;
    }

    public ModeloUsuario(String usuario, String correo, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
    }

    public ModeloUsuario(VistaLogin vista) {
        this.vista = vista;
    }

    public VistaLogin getVista() {
        return vista;
    }

    public void setVista(VistaLogin vista) {
        this.vista = vista;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String password) {
        this.contraseña = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public VistaRegistro getVistaRegistro() {
        return vistaRegistro;
    }

    public void setVistaRegistro(VistaRegistro vistaRegistro) {
        this.vistaRegistro = vistaRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
