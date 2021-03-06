/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlCitas;
import modelo.Citas;

/**
 *
 * @author LeslyLC
 */
public class InsertarCita extends javax.swing.JFrame {

    /**
     * Creates new form InsertarCita
     */
    public InsertarCita() {
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

        jLabel2 = new javax.swing.JLabel();
        Jidveterinario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jidanimal = new javax.swing.JTextField();
        Bagregar = new javax.swing.JButton();
        Blimpiar = new javax.swing.JButton();
        Batras = new javax.swing.JButton();
        Bcerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoologico/insertar citas-04.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Jidveterinario.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        getContentPane().add(Jidveterinario);
        Jidveterinario.setBounds(120, 100, 110, 21);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel3.setText("ID veterinario");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 100, 72, 15);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel4.setText("ID animal");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 140, 53, 15);

        jidanimal.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        getContentPane().add(jidanimal);
        jidanimal.setBounds(120, 140, 110, 21);

        Bagregar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Bagregar.setText("Agregar");
        Bagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagregarActionPerformed(evt);
            }
        });
        getContentPane().add(Bagregar);
        Bagregar.setBounds(40, 230, 80, 23);

        Blimpiar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Blimpiar.setText("Limpiar");
        Blimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Blimpiar);
        Blimpiar.setBounds(140, 230, 80, 23);

        Batras.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Batras.setText("Atrás");
        Batras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatrasActionPerformed(evt);
            }
        });
        getContentPane().add(Batras);
        Batras.setBounds(380, 270, 59, 23);

        Bcerrar.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Bcerrar.setText("Cerrar");
        Bcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcerrarActionPerformed(evt);
            }
        });
        getContentPane().add(Bcerrar);
        Bcerrar.setBounds(450, 270, 65, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zoologico/insertar citas-04.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 530, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagregarActionPerformed
        int id_animal_veterinario;
        int id_veterinario_animal;
        id_animal_veterinario = Integer.parseInt(Jidveterinario.getText());
        id_veterinario_animal = Integer.parseInt(jidanimal.getText());

        ControlCitas objce = new ControlCitas();
        Citas objc = new Citas(id_animal_veterinario, id_veterinario_animal);
        boolean f = objce.insertarCita(objc);

        if (f) {

            System.out.println("Se inserto la Cita");
        } else {
            System.out.println("No se inserto el Cita");
        }
        
    }//GEN-LAST:event_BagregarActionPerformed

    private void BcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BcerrarActionPerformed

    private void BatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatrasActionPerformed
        OpcionesInsertar abrir = new OpcionesInsertar();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BatrasActionPerformed

    private void BlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlimpiarActionPerformed
       Jidveterinario.setText("");
        jidanimal.setText("");

    }//GEN-LAST:event_BlimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(InsertarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bagregar;
    private javax.swing.JButton Batras;
    private javax.swing.JButton Bcerrar;
    private javax.swing.JButton Blimpiar;
    private javax.swing.JTextField Jidveterinario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jidanimal;
    // End of variables declaration//GEN-END:variables
}
