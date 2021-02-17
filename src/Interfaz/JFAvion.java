
package Interfaz;

import Fuentes.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

//@author Kelvin Ojeda

public class JFAvion extends javax.swing.JFrame {

    /**
     * Creates new form JFAvion
     */
    public Avion avion;
    public static Conexion conexion;
    
    public JFAvion() {
        initComponents();
        this.avion = new Avion();
        this.conexion = new Conexion();
        this.setLocationRelativeTo(null);
    }
    
    public JFAvion(Conexion conexion) {
        initComponents();
        this.avion = new Avion();
        this.conexion = conexion;
        this.setLocationRelativeTo(null);
        this.jBMostrarAvion.doClick();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBInsertarAvion = new javax.swing.JButton();
        jBEliminarAvion = new javax.swing.JButton();
        jBMostrarAvion = new javax.swing.JButton();
        jBActualizarAvion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFidAvion = new javax.swing.JTextField();
        jTFDescripcion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAviones = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Avión");

        jBInsertarAvion.setText("Insertar");
        jBInsertarAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsertarAvionActionPerformed(evt);
            }
        });

        jBEliminarAvion.setText("Eliminar");
        jBEliminarAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarAvionActionPerformed(evt);
            }
        });

        jBMostrarAvion.setText("Mostrar");
        jBMostrarAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMostrarAvionActionPerformed(evt);
            }
        });

        jBActualizarAvion.setText("Actualizar");
        jBActualizarAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarAvionActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de datos:"));

        jLabel1.setText("ID Avión");

        jLabel2.setText("Descripción");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFidAvion)
                    .addComponent(jTFDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFidAvion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jTAviones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTAviones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Avión", "Descripción"
            }
        ));
        jScrollPane2.setViewportView(jTAviones);

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBSalir)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBInsertarAvion)
                                    .addComponent(jBEliminarAvion)
                                    .addComponent(jBActualizarAvion)
                                    .addComponent(jBMostrarAvion))
                                .addGap(63, 63, 63))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBInsertarAvion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBEliminarAvion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBActualizarAvion)
                        .addGap(44, 44, 44)
                        .addComponent(jBMostrarAvion)
                        .addGap(70, 70, 70)
                        .addComponent(jBSalir))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBInsertarAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertarAvionActionPerformed
        int idAvion = Integer.parseInt(this.jTFidAvion.getText());
        String descripcionAvion= this.jTFDescripcion.getText();
        avion = new Avion(idAvion, descripcionAvion);
        this.conexion.subirALaBase(avion);
        this.jBMostrarAvion.doClick();
    }//GEN-LAST:event_jBInsertarAvionActionPerformed

    private void jBEliminarAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarAvionActionPerformed
        int idAvion= Integer.parseInt(this.jTFidAvion.getText());
        this.conexion.eliminarDeLaBase(idAvion, Avion.class);
        this.jBMostrarAvion.doClick();
    }//GEN-LAST:event_jBEliminarAvionActionPerformed

    private void jBMostrarAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMostrarAvionActionPerformed
        ArrayList<Avion> aviones = this.conexion.obtenerListaAviones();
        DefaultTableModel modeloTabla = (DefaultTableModel) this.jTAviones.getModel();
        modeloTabla.setNumRows(0);
        Object[] fila = new Object[2];
        for(int i = 0; i < aviones.size(); i++){
            fila[0] = aviones.get(i).getIdAvion();
            fila[1] = aviones.get(i).getDescripcion();
            modeloTabla.addRow(fila);
        }
    }//GEN-LAST:event_jBMostrarAvionActionPerformed

    private void jBActualizarAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarAvionActionPerformed
        int idAvion= Integer.parseInt(this.jTFidAvion.getText());
        String descripcionAvion= this.jTFDescripcion.getText();
        avion = new Avion(idAvion, descripcionAvion);
        this.conexion.actualizarEnLaBase(idAvion, avion);
        this.jBMostrarAvion.doClick();
    }//GEN-LAST:event_jBActualizarAvionActionPerformed

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
            java.util.logging.Logger.getLogger(JFAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAvion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizarAvion;
    private javax.swing.JButton jBEliminarAvion;
    private javax.swing.JButton jBInsertarAvion;
    private javax.swing.JButton jBMostrarAvion;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTAviones;
    private javax.swing.JTextField jTFDescripcion;
    private javax.swing.JTextField jTFidAvion;
    // End of variables declaration//GEN-END:variables
}
