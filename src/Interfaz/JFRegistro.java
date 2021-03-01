
package Interfaz;

//@author Andrés Ponce

import Fuentes.*;
import java.util.ArrayList;
import java.util.regex.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JFRegistro extends javax.swing.JFrame {

    private Conexion conexion;
    private ArrayList<Pais> paises;
    private Pattern patPasaporte = Pattern.compile("[0-9]+");
    private Pattern patCorreo = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    private Pattern patContrasenia = Pattern.compile("^(?=.*[0-9])(?=.*[a-zñáéíóú])(?=.*[A-ZÑÁÉÍÓÚ]).{6,20}$");
    private Pattern patNombre = Pattern.compile("[a-zA-ZñáéíóúÑÁÉÍÓÚ\\s]+");
    private Pattern patTelefono = Pattern.compile("[0-9]*");
    
    public JFRegistro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public JFRegistro(Conexion conexion) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.conexion = conexion;
        this.llenarComboBoxPais();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLMensaje = new javax.swing.JLabel();
        jLPasaporte = new javax.swing.JLabel();
        jLCorreo = new javax.swing.JLabel();
        jLContrasenia = new javax.swing.JLabel();
        jLContrasenia1 = new javax.swing.JLabel();
        jLNombres = new javax.swing.JLabel();
        jLPais = new javax.swing.JLabel();
        jLTelefono = new javax.swing.JLabel();
        jTFPasaporte = new javax.swing.JTextField();
        jCBPais = new javax.swing.JComboBox<>();
        jPFConfirmarContrasenia = new javax.swing.JPasswordField();
        jPFContrasenia = new javax.swing.JPasswordField();
        jTFCorreo = new javax.swing.JTextField();
        jTFNombres = new javax.swing.JTextField();
        jTFTelefono = new javax.swing.JTextField();
        jLAdvertencia = new javax.swing.JLabel();
        jLRequisitos = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBRegistro = new javax.swing.JButton();

        setTitle("Registro");

        jLMensaje.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLMensaje.setText("Registro");

        jLPasaporte.setText("*Número de pasaporte:");

        jLCorreo.setText("*Correo electrónico:");

        jLContrasenia.setText("*Contraseña:");

        jLContrasenia1.setText("*Confirmar contraseña:");

        jLNombres.setText("*Nombres completos:");

        jLPais.setText("*País de origen:");

        jLTelefono.setText("Número de teléfono:");

        jTFPasaporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPasaporteActionPerformed(evt);
            }
        });

        jCBPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja un país..." }));

        jPFConfirmarContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFConfirmarContraseniaActionPerformed(evt);
            }
        });

        jPFContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPFContraseniaActionPerformed(evt);
            }
        });

        jTFCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCorreoActionPerformed(evt);
            }
        });

        jTFNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombresActionPerformed(evt);
            }
        });

        jTFTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefonoActionPerformed(evt);
            }
        });

        jLAdvertencia.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLAdvertencia.setText("Los campos que inician con un asterisco (*) son obligatorios.");

        jLRequisitos.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLRequisitos.setText("La contraseña debe tener de 6 a 20 caracteres y contener una combinación de caracteres en mayúscula, minúscula y números.");

        jBLimpiar.setText("Limpiar entradas");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBRegistro.setText("Registrarse");
        jBRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 111, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLRequisitos)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBSalir)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLPasaporte)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFPasaporte))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLContrasenia)
                                    .addComponent(jLContrasenia1)
                                    .addComponent(jLCorreo)
                                    .addComponent(jLNombres)
                                    .addComponent(jLPais)
                                    .addComponent(jLTelefono))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCBPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPFConfirmarContrasenia)
                                    .addComponent(jPFContrasenia)
                                    .addComponent(jTFCorreo)
                                    .addComponent(jTFNombres)
                                    .addComponent(jTFTelefono)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLMensaje)
                                .addGap(157, 157, 157)
                                .addComponent(jBLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLAdvertencia)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLMensaje)
                    .addComponent(jBLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPasaporte)
                    .addComponent(jTFPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombres)
                    .addComponent(jTFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCorreo)
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLContrasenia)
                    .addComponent(jPFContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLContrasenia1)
                    .addComponent(jPFConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLRequisitos)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPais)
                    .addComponent(jCBPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefono)
                    .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLAdvertencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBRegistro))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.setVisible(false);
        this.jBLimpiar.doClick();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        this.jTFPasaporte.setText("");
        this.jTFCorreo.setText("");
        this.jTFNombres.setText("");
        this.jTFTelefono.setText("");
        this.jPFContrasenia.setText("");
        this.jPFConfirmarContrasenia.setText("");
        this.jCBPais.setSelectedIndex(0);
        this.jTFPasaporte.requestFocus();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistroActionPerformed
        Matcher matIDCliente = this.patPasaporte.matcher(this.jTFPasaporte.getText());
        Matcher matCorreo = this.patCorreo.matcher(this.jTFCorreo.getText());
        Matcher matContrasenia = this.patContrasenia.matcher(this.jPFContrasenia.getText());
        Matcher matNombre = this.patNombre.matcher(this.jTFNombres.getText().toUpperCase());
        Matcher matTelefono = this.patTelefono.matcher(this.jTFTelefono.getText());
        if(this.jPFContrasenia.getText().equals(this.jPFConfirmarContrasenia.getText()) && matContrasenia.matches() && matCorreo.matches() && matNombre.matches() && matTelefono.matches() && matIDCliente.matches() && this.jCBPais.getSelectedIndex() != 0){
            long idCliente = Long.parseLong(this.jTFPasaporte.getText());
            String correo = this.jTFCorreo.getText();
            String contrasenia = this.jPFContrasenia.getText();
            Pais pais = this.paises.get(this.jCBPais.getSelectedIndex() - 1);;
            String nombre = this.jTFNombres.getText().toUpperCase();
            long telefono;
            if(this.jTFTelefono.getText().equals("")){
                telefono = -1;
            }else{
                telefono = Long.parseLong(this.jTFTelefono.getText());
            }
            Cliente cliente = new Cliente(idCliente, correo, contrasenia, pais, nombre, telefono);
            this.conexion.registro(cliente);
            JOptionPane.showMessageDialog(null, "¡Registro exitoso!", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            this.jBSalir.doClick();
        }else{
            String error = "";
            error += this.jPFContrasenia.getText().equals(this.jPFConfirmarContrasenia.getText())?"":"- Las contraseñas no coinciden.\n";
            error += matIDCliente.matches()?"":"- El número de pasaporte ingresado no es válido.\n";
            error += matNombre.matches()?"":"- Los nombres ingresados no son válidos.\n";
            error += matCorreo.matches()?"":"- El correo ingresado no es válido.\n";
            error += matContrasenia.matches()?"":"- La contraseña ingresada no es válida. La contraseña debe tener de 6 a 20 caracteres y contener una combinación de caracteres en mayúscula, minúscula y números.\n";
            error += this.jCBPais.getSelectedIndex() != 0?"":"- No ha seleccionado un país.\n";
            error += matTelefono.matches()?"":"- El número de teléfono ingresado no es correcto.\n";
            JOptionPane.showMessageDialog(null, "Comprueba la siguiente información:\n\n" + error, "Error en el registro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBRegistroActionPerformed

    private void jTFPasaporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPasaporteActionPerformed
        this.jBRegistro.doClick();
    }//GEN-LAST:event_jTFPasaporteActionPerformed

    private void jTFNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombresActionPerformed
        this.jBRegistro.doClick();
    }//GEN-LAST:event_jTFNombresActionPerformed

    private void jTFCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCorreoActionPerformed
        this.jBRegistro.doClick();
    }//GEN-LAST:event_jTFCorreoActionPerformed

    private void jPFContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFContraseniaActionPerformed
        this.jBRegistro.doClick();
    }//GEN-LAST:event_jPFContraseniaActionPerformed

    private void jPFConfirmarContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPFConfirmarContraseniaActionPerformed
        this.jBRegistro.doClick();
    }//GEN-LAST:event_jPFConfirmarContraseniaActionPerformed

    private void jTFTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefonoActionPerformed
        this.jBRegistro.doClick();
    }//GEN-LAST:event_jTFTelefonoActionPerformed

    public void llenarComboBoxPais(){
        this.paises = this.conexion.obtenerListaPaises();
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel)this.jCBPais.getModel();
        comboBoxModel.removeAllElements();
        this.jCBPais.addItem("Elija un país");
        for(Pais aux: this.paises){
            this.jCBPais.addItem(aux.getNombrePais());
        }
    }
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(JFRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBRegistro;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBPais;
    private javax.swing.JLabel jLAdvertencia;
    private javax.swing.JLabel jLContrasenia;
    private javax.swing.JLabel jLContrasenia1;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLMensaje;
    private javax.swing.JLabel jLNombres;
    private javax.swing.JLabel jLPais;
    private javax.swing.JLabel jLPasaporte;
    private javax.swing.JLabel jLRequisitos;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JPasswordField jPFConfirmarContrasenia;
    private javax.swing.JPasswordField jPFContrasenia;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFNombres;
    private javax.swing.JTextField jTFPasaporte;
    private javax.swing.JTextField jTFTelefono;
    // End of variables declaration//GEN-END:variables
}
