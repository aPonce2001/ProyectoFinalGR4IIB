package CapaPresentacion;

import CapaComun.Cm_ClsCliente;
import CapaComun.Cm_ClsPais;
import CapaNegocio.Ng_ClsCliente;
import CapaNegocio.Ng_ClsPais;
import java.util.List;
import java.util.regex.*;
import javax.swing.JOptionPane;

//@author Dennis David

public class JFActualizarDatos extends javax.swing.JFrame {
    Cm_ClsCliente cm_cliente;
    Ng_ClsPais ng_pais;
    List<Cm_ClsPais> listaPais;
    Ng_ClsCliente ng_cliente;
    JFReserva jfReserva;
    private Pattern patNombre = Pattern.compile("[a-zA-ZñáéíóúÑÁÉÍÓÚ\\s]{1,25}");
    private Pattern patPasaporte = Pattern.compile("[0-9]{10}");
    private Pattern patContrasenia = Pattern.compile("(^(?=.*[0-9])(?=.*[a-zñáéíóú])(?=.*[A-ZÑÁÉÍÓÚ]).{6,64}$){0,1}");

    public JFActualizarDatos() {
         initComponents();
         
         this.setLocationRelativeTo(null);
    }
    
    public JFActualizarDatos(Cm_ClsCliente cliente) {
         initComponents();
         
        ng_cliente = new Ng_ClsCliente();
        cm_cliente = cliente;
        ng_pais = new Ng_ClsPais();
        listaPais = ng_pais.mostrarPaisAll(jCBPaisUpdt, true, cm_cliente.getId_pais_fk());
        llenarCamposUsuario();
        this.setLocationRelativeTo(null);
    }
    
    public void llenarCamposUsuario() {
        jTFNombreActualizar.setText(cm_cliente.getNombre());
        jTFApellidoActualizar.setText(cm_cliente.getApellido());
        jTFCedulaAct.setText(cm_cliente.getCedula());
        int index = -1;
        for(Cm_ClsPais aux : listaPais){
            if(aux.getId() == this.cm_cliente.getId_pais_fk()){
                index = listaPais.indexOf(aux);
            }
        }
        jCBPaisUpdt.setSelectedIndex(index + 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFNombreActualizar = new javax.swing.JTextField();
        jTFApellidoActualizar = new javax.swing.JTextField();
        jPFRegistroActualizar = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jCBPaisUpdt = new javax.swing.JComboBox<>();
        jTFCedulaAct = new javax.swing.JTextField();
        jLMaximo1 = new javax.swing.JLabel();
        jLMaximo2 = new javax.swing.JLabel();
        jLContraseniaAviso = new javax.swing.JLabel("\"<html>Si no desea cambiar su contraseña, deje este espacio en blanco.\nLa contraseña debe tener de 6 a 64 caracteres y contener una combinación de caracteres en mayúscula, minúscula y números.</html>\"");
        jBActualizarCliente = new javax.swing.JButton();
        jBCancelarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualización");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Actualización de datos"));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        jLabel3.setText("Pasaporte:");

        jLabel4.setText("País:");

        jLabel6.setText("Contraseña:");

        jTFNombreActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombreActualizarActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar.png"))); // NOI18N

        jLMaximo1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLMaximo1.setText("Máximo 25 caracteres");

        jLMaximo2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLMaximo2.setText("Máximo 25 caracteres");

        jLContraseniaAviso.setText("<html>Si no desea cambiar su contraseña, deje este espacio en blanco.\nLa contraseña debe tener de 6 a 64 caracteres y contener una combinación de caracteres en mayúscula, minúscula y números.</html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNombreActualizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLContraseniaAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPFRegistroActualizar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBPaisUpdt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTFCedulaAct)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFApellidoActualizar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLMaximo2)
                                    .addComponent(jLMaximo1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFNombreActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMaximo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFApellidoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMaximo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCedulaAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBPaisUpdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPFRegistroActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLContraseniaAviso)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jBActualizarCliente.setText("Actualizar");
        jBActualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarClienteActionPerformed(evt);
            }
        });

        jBCancelarCliente.setText("Cancelar");
        jBCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jBActualizarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBCancelarCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBActualizarCliente)
                    .addComponent(jBCancelarCliente))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBActualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarClienteActionPerformed
        Matcher matNombre = this.patNombre.matcher(this.jTFNombreActualizar.getText());
        Matcher matApellido = this.patNombre.matcher(this.jTFApellidoActualizar.getText());
        Matcher matPasaporte = this.patPasaporte.matcher(this.jTFCedulaAct.getText());
        Matcher matContrasenia = this.patContrasenia.matcher(this.jPFRegistroActualizar.getText());
        if(matNombre.matches() && matApellido.matches() && matPasaporte.matches() && matContrasenia.matches() && this.jCBPaisUpdt.getSelectedIndex() != 0){
            String passwd = jPFRegistroActualizar.getText();
            if(passwd.equals("")) {
                passwd = cm_cliente.getPasswd();
            }
            System.out.println("cm_cliente.getId() es: " + cm_cliente.getId());
            System.out.println("jTFNombreActualizar.getText() es: " + jTFNombreActualizar.getText());
            System.out.println("jTFApellidoActualizar.getText() es: " + jTFApellidoActualizar.getText());
            System.out.println("jTFCedulaAct.getText() es: " + jTFCedulaAct.getText());
            System.out.println("passwd es: " + passwd);
            System.out.println("jCBPaisUpdt.getSelectedIndex() es: " + jCBPaisUpdt.getSelectedIndex());
            int resultado = ng_cliente.actualizarCliente(
                cm_cliente.getId(),
                jTFNombreActualizar.getText(), 
                jTFApellidoActualizar.getText(), 
                jTFCedulaAct.getText(),
                passwd, 
                this.listaPais.get(jCBPaisUpdt.getSelectedIndex() - 1).getId()
            );
            cm_cliente = new Cm_ClsCliente(cm_cliente.getId(), jTFNombreActualizar.getText(), jTFApellidoActualizar.getText(), jTFCedulaAct.getText(), passwd, this.listaPais.get(jCBPaisUpdt.getSelectedIndex() - 1).getId());
            if(resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registro realizado con éxito");
                this.jfReserva = new JFReserva(cm_cliente);
                this.jfReserva.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error!");
            }
        }else{
            String error = "";
            error += matNombre.matches()?"":"- El nombre ingresado no es válido.\n";
            error += matApellido.matches()?"":"- El apellido ingresado no es válido.\n";
            error += matPasaporte.matches()?"":"- El número de pasaporte ingresado no es válido.\n";
            error += matContrasenia.matches()?"":"- La contraseña ingresada no es válida. La contraseña debe tener de 6 a 64 caracteres y contener una combinación de caracteres en mayúscula, minúscula y números.\n";
            error += this.jCBPaisUpdt.getSelectedIndex() != 0?"":"- No ha seleccionado un país.\n";
            JOptionPane.showMessageDialog(null, "Comprueba la siguiente información:\n\n" + error, "Error en el registro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBActualizarClienteActionPerformed

    private void jBCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarClienteActionPerformed
        this.jfReserva = new JFReserva(cm_cliente);
        this.jfReserva.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBCancelarClienteActionPerformed

    private void jTFNombreActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreActualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFActualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFActualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFActualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFActualizarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFActualizarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizarCliente;
    private javax.swing.JButton jBCancelarCliente;
    private javax.swing.JComboBox<String> jCBPaisUpdt;
    private javax.swing.JLabel jLContraseniaAviso;
    private javax.swing.JLabel jLMaximo1;
    private javax.swing.JLabel jLMaximo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPFRegistroActualizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFApellidoActualizar;
    private javax.swing.JTextField jTFCedulaAct;
    private javax.swing.JTextField jTFNombreActualizar;
    // End of variables declaration//GEN-END:variables
}