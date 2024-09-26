/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conector;

    
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conector {

    private static final String CLASE = "com.mysql.jdbc.Driver";
    private final String HOST = "sql.freedb.tech";
    private final String USUARIO = "freedb_Grupo1";
    private final String CLAVE = "A6wuw#n?#8MR5ZY";
    private final String BASEDATOS = "freedb_HotelTresRocas";
    private final String URL;

    private Connection link;
    private PreparedStatement ps;

    public conector() {
        this.URL = "jdbc:mysql://" + this.HOST + "/" + this.BASEDATOS;
    }

    public void conectar() throws NoSuchMethodException {
        try {
            Class.forName(CLASE).getDeclaredConstructor().newInstance();
            this.link = DriverManager.getConnection(this.URL, this.USUARIO, this.CLAVE);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | SQLException ex) {
            Logger.getLogger(conector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void desconectar() {
        try {
            this.link.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public PreparedStatement preparar(String sql) {
        try {
            ps = link.prepareStatement(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return ps;
    }
    
    public void mensaje(String mensaje, String titulo, int tipoMensaje){
     JOptionPane.showMessageDialog(null, mensaje, titulo, tipoMensaje);
}
}


