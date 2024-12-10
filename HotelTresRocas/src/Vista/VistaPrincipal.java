
package Vista;

import Controlador.ControladorPrincipal;
import Modelo.ModeloPrincipal;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VistaPrincipal extends javax.swing.JFrame {

 fondo f=new fondo();

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        ModeloPrincipal modelo = new ModeloPrincipal(this);
        ControladorPrincipal controlador = new ControladorPrincipal(modelo);
        setControlador(controlador);
         setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new fondo();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnAgregarCliente = new javax.swing.JMenu();
        mntmAgregarCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mntmReservar = new javax.swing.JMenu();
        mntmReservas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mntmActividades = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mntmRestaurante = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mnAgregarCliente.setText("Agregar Cliente");

        mntmAgregarCliente.setText("Agregar Cliente");
        mnAgregarCliente.add(mntmAgregarCliente);

        jMenuBar1.add(mnAgregarCliente);

        jMenu2.setText("Edición");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Habitaciones ");

        mntmReservar.setText("Reservar Ahora");
        jMenu3.add(mntmReservar);

        mntmReservas.setText("Reservas");
        jMenu3.add(mntmReservas);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Actividades");

        mntmActividades.setText("Ver Actividades");
        jMenu5.add(mntmActividades);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Restaurante");

        mntmRestaurante.setText("Restaurante");
        mntmRestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntmRestauranteActionPerformed(evt);
            }
        });
        jMenu6.add(mntmRestaurante);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Pagos");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mntmRestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntmRestauranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mntmRestauranteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnAgregarCliente;
    public javax.swing.JMenuItem mntmActividades;
    public javax.swing.JMenuItem mntmAgregarCliente;
    public javax.swing.JMenu mntmReservar;
    public javax.swing.JMenuItem mntmReservas;
    public javax.swing.JMenuItem mntmRestaurante;
    // End of variables declaration//GEN-END:variables

    
     public void setControlador(ControladorPrincipal controlador){
        mntmReservar.addActionListener(controlador);
        mntmReservar.addMouseListener(controlador);
        mntmAgregarCliente.addMouseListener(controlador);
         mntmAgregarCliente.addActionListener(controlador);
         mntmActividades.addMouseListener(controlador);
         mntmActividades.addActionListener(controlador);
           mntmRestaurante.addMouseListener(controlador);
         mntmRestaurante.addActionListener(controlador);
         mntmReservas.addMouseListener(controlador);
         mntmReservas.addActionListener(controlador);
         
    }

     
     class fondo extends JPanel {
         
         private Image imagen;
         
         @Override
         public void paint(Graphics g){
             imagen = new ImageIcon(getClass().getResource("/img/fondo.jpg")).getImage();
             System.out.println(imagen);
             
             g.drawImage(imagen, 0, 0,getWidth(),getHeight(), (ImageObserver) this);
             
             setOpaque(false);
             
             super.paint(g);
             
         }
     
     }
}
