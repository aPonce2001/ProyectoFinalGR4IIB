
package Interfaz;

//@author Andrés Ponce

import Fuentes.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JFLogin extends javax.swing.JFrame {

    Conexion conexion = new Conexion("jdbc:sqlserver://sql5054.site4now.net", "DB_A6F631_AEREOPUERTOBD", "DB_A6F631_AEREOPUERTOBD_admin", "P@ssw0rd");
    Cliente clienteLogin;
    JFRegistro jfRegistro;
    
    public JFLogin() throws SQLException {
        initComponents();
        this.conexion.conectarBaseDeDatos();
        this.jfRegistro = new JFRegistro(this.conexion);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        jLCorreo = new javax.swing.JLabel();
        jLContrasenia = new javax.swing.JLabel();
        jTFCorreo = new javax.swing.JTextField();
        jPFContrasenia = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jBIniciarSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");

        jLTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLTitulo.setText("Programa para hacer reservas");

        jLCorreo.setText("Correo electrónico:");

        jLContrasenia.setText("Contraseña:");

        jTFCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCorreoActionPerformed(evt);
            }
        });

        jPFContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFContraseniaActionPerformed(evt);
            }
        });

        jLabel1.setText("Inicia sesión para continuar");

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBIniciarSesion.setText("Iniciar sesión");
        jBIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIniciarSesionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("¿Nuevo aquí?");

        jBRegistrar.setText("Crea una cuenta");
        jBRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLTitulo)
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLContrasenia)
                            .addComponent(jLCorreo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCorreo)
                            .addComponent(jPFContrasenia))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBIniciarSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSalir)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBRegistrar)
                        .addGap(135, 135, 135))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCorreo)
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLContrasenia)
                    .addComponent(jPFContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBIniciarSesion))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCorreoActionPerformed
        this.jBIniciarSesion.doClick();
    }//GEN-LAST:event_jTFCorreoActionPerformed

    private void jPFContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFContraseniaActionPerformed
        this.jBIniciarSesion.doClick();
    }//GEN-LAST:event_jPFContraseniaActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarActionPerformed
        this.jfRegistro.setVisible(true);
    }//GEN-LAST:event_jBRegistrarActionPerformed

    private void jBIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIniciarSesionActionPerformed
        Cliente cliente = new Cliente(0, this.jTFCorreo.getText(), this.jPFContrasenia.getText(), new Pais(), "", 0);
        try{
            this.clienteLogin = this.conexion.login(cliente);
            JOptionPane.showMessageDialog(null, "Ingreso exitoso\n¡Bienvenid@!", "Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Las credenciales ingresadas no son correctas.", "Error en el inicio de sesión", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBIniciarSesionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFLogin().setVisible(true);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error para conectarse a la base de datos.\nPor favor, comunícate con los estudiantes para solventar el problema.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBIniciarSesion;
    private javax.swing.JButton jBRegistrar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLContrasenia;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPFContrasenia;
    private javax.swing.JTextField jTFCorreo;
    // End of variables declaration//GEN-END:variables
}
