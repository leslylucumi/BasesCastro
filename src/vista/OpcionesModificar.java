/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import vista.InsertarAnimal;

/**
 *
 * @author Ángela
 */
public class OpcionesModificar extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public OpcionesModificar() {
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

        Balim = new javax.swing.JButton();
        Bveterinario = new javax.swing.JButton();
        Bcuidador = new javax.swing.JButton();
        Bcerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Banimal = new javax.swing.JButton();
        Bespecie = new javax.swing.JButton();
        Bhabitat = new javax.swing.JButton();
        Batras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Balim.setText("Alimentacion");
        Balim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalimActionPerformed(evt);
            }
        });

        Bveterinario.setText("Veterinario");
        Bveterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BveterinarioActionPerformed(evt);
            }
        });

        Bcuidador.setText("Cuidador");
        Bcuidador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcuidadorActionPerformed(evt);
            }
        });

        Bcerrar.setText("Cerrar");
        Bcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcerrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("OPCIONES MODIFICAR");

        Banimal.setText("Animal");
        Banimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BanimalActionPerformed(evt);
            }
        });

        Bespecie.setText("Especie");
        Bespecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BespecieActionPerformed(evt);
            }
        });

        Bhabitat.setText("Habitat");
        Bhabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BhabitatActionPerformed(evt);
            }
        });

        Batras.setText("Atras");
        Batras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Bhabitat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Balim, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Banimal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bcuidador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Bespecie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Bveterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(Batras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                                .addComponent(Bcerrar)))))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(Balim, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(Banimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bcuidador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bespecie)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bhabitat)
                .addGap(18, 18, 18)
                .addComponent(Bveterinario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bcerrar)
                    .addComponent(Batras)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BcuidadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcuidadorActionPerformed
        ModificarCuidador abrir = new ModificarCuidador();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BcuidadorActionPerformed

    private void BveterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BveterinarioActionPerformed
        ModificarVeterinario abrir = new ModificarVeterinario();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BveterinarioActionPerformed

    private void BalimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalimActionPerformed
        ModificarAlimentacion abrir = new ModificarAlimentacion();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BalimActionPerformed

    private void BcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BcerrarActionPerformed

    private void BanimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BanimalActionPerformed
        ModificarAnimal abrir = new ModificarAnimal();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BanimalActionPerformed

    private void BespecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BespecieActionPerformed
        ModificarEspecie abrir = new ModificarEspecie();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BespecieActionPerformed

    private void BhabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BhabitatActionPerformed
        ModificarHabitat abrir = new ModificarHabitat();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BhabitatActionPerformed

    private void BatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatrasActionPerformed
       Opciones abrir = new Opciones();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BatrasActionPerformed

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
            java.util.logging.Logger.getLogger(OpcionesModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcionesModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcionesModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcionesModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcionesModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Balim;
    private javax.swing.JButton Banimal;
    private javax.swing.JButton Batras;
    private javax.swing.JButton Bcerrar;
    private javax.swing.JButton Bcuidador;
    private javax.swing.JButton Bespecie;
    private javax.swing.JButton Bhabitat;
    private javax.swing.JButton Bveterinario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
