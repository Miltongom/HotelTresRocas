/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementacion;

import Conector.conector;
import Conector.SQL;
import Modelo.ModeloCliente;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Interfaz.IClientes;

/**
 *
 * @author diego
 */
public class ClientesImp implements IClientes {

    conector conector = new conector();
    SQL sql = new SQL();
    PreparedStatement ps;
    ResultSet rs;

    private boolean resultado;

    public boolean agregarCliente(ModeloCliente modelo) {
        boolean resultado = true;
        try {
            conector.conectar();
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(ClientesImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        ps = conector.preparar(sql.getAGREGAR_CLIENTES());
        try {
            ps.setInt(1, modelo.getCodigo());
            ps.setString(2, modelo.getNombre());
            ps.setString(3, modelo.getApellido());
            ps.setString(4, modelo.getDireccion());
            ps.setString(5, modelo.getCorreo());
            ps.setString(6, modelo.getTelefono());
            resultado = ps.execute();
        } catch (SQLException ex) {
            conector.mensaje(ex.getMessage(), "Error en la Insercion ", 0);
        }
        return resultado;

    }

}
