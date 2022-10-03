/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import dao.DProducto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class FrmProducto extends javax.swing.JFrame {

     DProducto dP = new DProducto();
     private int pos = 0;
    /**
     * Creates new form FrmProducto
     */
    public FrmProducto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jBtnLimpiar = new javax.swing.JButton();
        jBtnAgregar = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jBtnPrimero = new javax.swing.JButton();
        jBtnAnterior = new javax.swing.JButton();
        jBtnSiguiente = new javax.swing.JButton();
        jBtnUltimo = new javax.swing.JButton();
        jLblId = new javax.swing.JLabel();
        jLblNombre = new javax.swing.JLabel();
        jLblPrecio = new javax.swing.JLabel();
        jLblExistencia = new javax.swing.JLabel();
        jTfId = new javax.swing.JTextField();
        jTfNombre = new javax.swing.JTextField();
        jTfPrecio = new javax.swing.JTextField();
        jTfExistencia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblRegistros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jBtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/imagen/Nuevo.png"))); // NOI18N
        jBtnLimpiar.setFocusable(false);
        jBtnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnLimpiar);

        jBtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/imagen/Guardar.png"))); // NOI18N
        jBtnAgregar.setFocusable(false);
        jBtnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnAgregar);

        jBtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/imagen/editar.png"))); // NOI18N
        jBtnEditar.setFocusable(false);
        jBtnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEditarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnEditar);

        jBtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/imagen/Eliminar.png"))); // NOI18N
        jBtnEliminar.setFocusable(false);
        jBtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnEliminar);
        jToolBar1.add(jSeparator1);

        jBtnPrimero.setText("|<");
        jBtnPrimero.setFocusable(false);
        jBtnPrimero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnPrimero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPrimeroActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnPrimero);

        jBtnAnterior.setText("<<");
        jBtnAnterior.setFocusable(false);
        jBtnAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAnteriorActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnAnterior);

        jBtnSiguiente.setText(">>");
        jBtnSiguiente.setFocusable(false);
        jBtnSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnSiguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSiguienteActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnSiguiente);

        jBtnUltimo.setText(">|");
        jBtnUltimo.setFocusable(false);
        jBtnUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUltimoActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnUltimo);

        jLblId.setText("ID:");

        jLblNombre.setText("NOMBRE:");

        jLblPrecio.setText("PRECIO:");

        jLblExistencia.setText("EXISTENCIA:");

        jTfExistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfExistenciaActionPerformed(evt);
            }
        });

        jTblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTblRegistros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblExistencia)
                            .addComponent(jLblPrecio)
                            .addComponent(jLblNombre)
                            .addComponent(jLblId))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTfId, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblId)
                            .addComponent(jTfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblNombre)
                            .addComponent(jTfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblPrecio)
                            .addComponent(jTfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLblExistencia)
                            .addComponent(jTfExistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTfExistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfExistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfExistenciaActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        // TODO add your handling code here:
         Limpiar();
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        // TODO add your handling code here:
         if (jTfId.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Necesita agregar el ID", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id = Integer.parseInt(jTfId.getText());
        String nom = jTfNombre.getText();
        double precio = Double.parseDouble(jTfPrecio.getText());
        int existencia = Integer.parseInt(jTfExistencia.getText());

        int b = dP.agregarProducto(id, nom, precio, existencia);

        if (b == 1) {

            JOptionPane.showMessageDialog(this, "Registro Agregado exitosamente", "Guardar", JOptionPane.INFORMATION_MESSAGE);
            Limpiar();

        } else {

            JOptionPane.showMessageDialog(this, "Error al guardar el registro", "Guardar", JOptionPane.ERROR_MESSAGE);

        }
        llenarTabla();
        Limpiar();
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEditarActionPerformed
        // TODO add your handling code here:
        this.dP.getListProducto().get(pos).setId(Integer.parseInt(jTfId.getText()));
        this.dP.getListProducto().get(pos).setNombre(jTfNombre.getText());
        this.dP.getListProducto().get(pos).setPrecio(Double.parseDouble(jTfPrecio.getText()));
        this.dP.getListProducto().get(pos).setExistencia(Integer.parseInt(jTfExistencia.getText()));
        
            JOptionPane.showMessageDialog(this, "Cambios realizados exitosamente", "EDITAR", JOptionPane.INFORMATION_MESSAGE);
            llenarTabla();
            Limpiar();

    }//GEN-LAST:event_jBtnEditarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        // TODO add your handling code here:
         int op;
        op = JOptionPane.showConfirmDialog(this, "¿Desea eliminar el registro?", "Eliminar", JOptionPane.YES_NO_OPTION);
        if (op == 0) {
            dP.getListProducto().remove(pos);
            JOptionPane.showMessageDialog(this, "OK, se eliminará");
            llenarTabla();
            Limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "Operacion Cancelada");
        }
    }//GEN-LAST:event_jBtnEliminarActionPerformed

    private void jBtnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPrimeroActionPerformed
        // TODO add your handling code here:
         if (dP.getListProducto().size() > 0) {
            try {
                pos = 0;
                int id = dP.getListProducto().get(0).getId();
                String nombre = dP.getListProducto().get(0).getNombre();
                double precio = dP.getListProducto().get(0).getPrecio();
                int exist = dP.getListProducto().get(0).getExistencia();
                jTfId.setText("" + id);
                jTfNombre.setText(nombre);
                jTfPrecio.setText("" + precio);
                jTfExistencia.setText("" + exist);
                jBtnAgregar.setEnabled(false);
                jBtnEditar.setEnabled(true);
                jBtnEliminar.setEnabled(true);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "No hay registros", "Registros", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jBtnPrimeroActionPerformed

    private void jBtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAnteriorActionPerformed
        // TODO add your handling code here:
        if (dP.getListProducto().size() > 0) {
            try {
                
                 pos--;
                if (pos < 0) {
                    pos = dP.getListProducto().size() - 1;
                }
                
                int id = dP.getListProducto().get(pos).getId();
                String nombre = dP.getListProducto().get(pos).getNombre();
                double precio = dP.getListProducto().get(pos).getPrecio();
                int exist = dP.getListProducto().get(pos).getExistencia();
                jTfId.setText("" + id);
                jTfNombre.setText(nombre);
                jTfPrecio.setText("" + precio);
                jTfExistencia.setText("" + exist);
                jBtnAgregar.setEnabled(false);
                jBtnEditar.setEnabled(true);
                jBtnEliminar.setEnabled(true);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "No hay registros", "Registros", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jBtnAnteriorActionPerformed

    private void jBtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSiguienteActionPerformed
        // TODO add your handling code here:
        if (dP.getListProducto().size() > 0) {
            try {
                
                 pos++;
                if (pos == dP.getListProducto().size()) {
                    pos = 0;
                }
                
                int id = dP.getListProducto().get(pos).getId();
                String nombre = dP.getListProducto().get(pos).getNombre();
                double precio = dP.getListProducto().get(pos).getPrecio();
                int exist = dP.getListProducto().get(pos).getExistencia();
                jTfId.setText("" + id);
                jTfNombre.setText(nombre);
                jTfPrecio.setText("" + precio);
                jTfExistencia.setText("" + exist);
                jBtnAgregar.setEnabled(false);
                jBtnEditar.setEnabled(true);
                jBtnEliminar.setEnabled(true);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "No hay registros", "Registros", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jBtnSiguienteActionPerformed

    private void jBtnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUltimoActionPerformed
        // TODO add your handling code here:
        if (dP.getListProducto().size() > 0) {
            try {
                
                pos = dP.getListProducto().size() - 1;
                int id = dP.getListProducto().get(pos).getId();
                String nombre = dP.getListProducto().get(pos).getNombre();
                double precio = dP.getListProducto().get(pos).getPrecio();
                int exist = dP.getListProducto().get(pos).getExistencia();
                jTfId.setText("" + id);
                jTfNombre.setText(nombre);
                jTfPrecio.setText("" + precio);
                jTfExistencia.setText("" + exist);
                jBtnAgregar.setEnabled(false);
                jBtnEditar.setEnabled(true);
                jBtnEliminar.setEnabled(true);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "No hay registros", "Registros", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jBtnUltimoActionPerformed

    
    private void llenarTabla() {

        DefaultTableModel tbl = new DefaultTableModel();
        tbl = dP.gelListProd();
        jTblRegistros.setModel(tbl);
    }

    private void Limpiar() {

        jTfId.setText("");
        jTfNombre.setText("");
        jTfPrecio.setText("");
        jTfExistencia.setText("");
        jBtnAgregar.setEnabled(true);
        jBtnEditar.setEnabled(false);
        jBtnEliminar.setEnabled(false);
        jTfId.requestFocus();
    }
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
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnAnterior;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnPrimero;
    private javax.swing.JButton jBtnSiguiente;
    private javax.swing.JButton jBtnUltimo;
    private javax.swing.JLabel jLblExistencia;
    private javax.swing.JLabel jLblId;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblPrecio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTable jTblRegistros;
    private javax.swing.JTextField jTfExistencia;
    private javax.swing.JTextField jTfId;
    private javax.swing.JTextField jTfNombre;
    private javax.swing.JTextField jTfPrecio;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
