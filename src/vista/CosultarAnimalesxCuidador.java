/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlCuidador;
import java.awt.TextField;
import java.util.LinkedList;
import modelo.Cuidador;

/**
 *
 * @author LeslyLC
 */
public class CosultarAnimalesxCuidador extends javax.swing.JFrame {

    /**
     * Creates new form CosultarAnimalesxCuidador
     */
    public CosultarAnimalesxCuidador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bcerrar = new javax.swing.JButton();
        Batras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Bcerrar1 = new javax.swing.JButton();
        Batras1 = new javax.swing.JButton();

        Bcerrar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Bcerrar.setText("Cerrar");
        Bcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcerrarActionPerformed(evt);
            }
        });

        Batras.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Batras.setText("Atras");
        Batras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatrasActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(531, 333));
        setPreferredSize(new java.awt.Dimension(531, 333));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id animal", "Nombre Completo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 460, 180));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel1.setText("Id Animal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 80, -1));

        Bcerrar1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Bcerrar1.setText("Cerrar");
        Bcerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bcerrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Bcerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 260, 80, -1));

        Batras1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Batras1.setText("Atras");
        Batras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Batras1ActionPerformed(evt);
            }
        });
        getContentPane().add(Batras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ControlCuidador objc = new ControlCuidador();
        LinkedList<Cuidador> Lcuidador=objc.Consultaraanimalesporcuidador(Integer.parseInt(jTextField1.getText()));
 
        for (int i = 0; i < Lcuidador.size(); i++) {
            jTable1.setValueAt(Lcuidador.get(i).getId_cuidador(), i, 0);
            jTable1.setValueAt(Lcuidador.get(i).getNombrec1(), i, 1);
            
          //  jTable1.setValueAt(Lcuidador.get(i).getApellidoc1(), i, 4);
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void BcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BcerrarActionPerformed

    private void BatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatrasActionPerformed
        OpcionesConsultar abrir = new OpcionesConsultar();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BatrasActionPerformed

    private void Bcerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bcerrar1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Bcerrar1ActionPerformed

    private void Batras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Batras1ActionPerformed
        OpcionesConsultar abrir = new OpcionesConsultar();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Batras1ActionPerformed

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
            java.util.logging.Logger.getLogger(CosultarAnimalesxCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CosultarAnimalesxCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CosultarAnimalesxCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CosultarAnimalesxCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CosultarAnimalesxCuidador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Batras;
    private javax.swing.JButton Batras1;
    private javax.swing.JButton Bcerrar;
    private javax.swing.JButton Bcerrar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
