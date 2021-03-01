
package Interfaz;

import Fuentes.*;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

//@author Kelvin Ojeda
 
public class JFClase extends javax.swing.JFrame {

    Clase clase;
    static Conexion conexion;
    ArrayList<Clase> clases;
    
    public JFClase() {
        initComponents();
        this.clase = new Clase();
        this.conexion = null;
        this.clases = new ArrayList<Clase>();
        this.setLocationRelativeTo(null); 
    }
    
    public JFClase(Conexion conexion) {
        initComponents();
        this.clase = new Clase();
        this.conexion = conexion;
        this.clases = this.conexion.obtenerListaClases();
        this.setLocationRelativeTo(null); 
        jBRellenarTabla.doClick();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jBInsertarTipo = new javax.swing.JButton();
        jBEliminarTipo = new javax.swing.JButton();
        jBRellenarTabla = new javax.swing.JButton();
        jBActualizarClase = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFTipo = new javax.swing.JTextField();
        jTFNombreClase = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTClases = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu1.setText("jMenu1");

        setTitle("Clase");

        jBInsertarTipo.setText("Insertar");
        jBInsertarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsertarTipoActionPerformed(evt);
            }
        });

        jBEliminarTipo.setText("Eliminar");
        jBEliminarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarTipoActionPerformed(evt);
            }
        });

        jBRellenarTabla.setText("Mostrar");
        jBRellenarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRellenarTablaActionPerformed(evt);
            }
        });

        jBActualizarClase.setText("Actualizar");
        jBActualizarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarClaseActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de datos:"));

        jLabel1.setText("Tipo");

        jLabel2.setText("Nombre de clase");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(jTFTipo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFNombreClase, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFNombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jTClases.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTClases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clase", "Nombre de la clase"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTClases);

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBSalir)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBInsertarTipo)
                            .addComponent(jBRellenarTabla)
                            .addComponent(jBActualizarClase)
                            .addComponent(jBEliminarTipo))
                        .addGap(93, 93, 93))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jBInsertarTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBActualizarClase)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEliminarTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBRellenarTabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(jBSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBInsertarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertarTipoActionPerformed
        int tipo = Integer.parseInt(this.jTFTipo.getText());
        String nombreClase = this.jTFNombreClase.getText();
        clase = new Clase(tipo, nombreClase);
        this.conexion.subirALaBase(clase);
        jBRellenarTabla.doClick();
    }//GEN-LAST:event_jBInsertarTipoActionPerformed

    private void jBEliminarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarTipoActionPerformed
        this.conexion.eliminarDeLaBase(Integer.parseInt(this.jTFTipo.getText()), Clase.class);
        jBRellenarTabla.doClick();
    }//GEN-LAST:event_jBEliminarTipoActionPerformed

    private void jBRellenarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRellenarTablaActionPerformed
        this.clases = this.conexion.obtenerListaClases();
        DefaultTableModel modeloTabla = (DefaultTableModel) this.jTClases.getModel();
        modeloTabla.setNumRows(0);
        Object[] fila = new Object[2];
        for(int i = 0; i < this.clases.size(); i++){
            fila[0] = this.clases.get(i).getTipo();
            fila[1] = this.clases.get(i).getNombreClase();
            modeloTabla.addRow(fila);
        }
    }//GEN-LAST:event_jBRellenarTablaActionPerformed

    private void jBActualizarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarClaseActionPerformed
        int tipo= Integer.parseInt(this.jTFTipo.getText());
        String nombreclase= this.jTFNombreClase.getText();
        clase = new Clase(tipo, nombreclase);
        this.conexion.actualizarEnLaBase(tipo, clase);
        jBRellenarTabla.doClick();
    }//GEN-LAST:event_jBActualizarClaseActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBSalirActionPerformed
    
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
            java.util.logging.Logger.getLogger(JFClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFClase().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizarClase;
    private javax.swing.JButton jBEliminarTipo;
    private javax.swing.JButton jBInsertarTipo;
    private javax.swing.JButton jBRellenarTabla;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTClases;
    private javax.swing.JTextField jTFNombreClase;
    private javax.swing.JTextField jTFTipo;
    // End of variables declaration//GEN-END:variables
}
