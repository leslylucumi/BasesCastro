/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlCuidador;
import modelo.Cuidador;

/**
 *
 * @author Acer
 */
public class ModificarCuidador extends javax.swing.JFrame {
    int id_cuidador;
    /**
     * Creates new form Insertarcuidador
     */
    public ModificarCuidador() {
        initComponents();
        Jnombrec1.setEnabled(false);
        Jnombrec2.setEnabled(false);
        Japellidoc1.setEnabled(false);
        Japellidoc2.setEnabled(false);
        Jcorreoc.setEnabled(false);
        Jtelefonoc1.setEnabled(false);
        Jtelefonoc2.setEnabled(false);
        Jdireccionc.setEnabled(false);
        Jedadc.setEnabled(false);
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

        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Jnombrec1 = new javax.swing.JTextField();
        Jnombrec2 = new javax.swing.JTextField();
        Japellidoc2 = new javax.swing.JTextField();
        Japellidoc1 = new javax.swing.JTextField();
        Jtelefonoc1 = new javax.swing.JTextField();
        Jcorreoc = new javax.swing.JTextField();
        Jdireccionc = new javax.swing.JTextField();
        Jtelefonoc2 = new javax.swing.JTextField();
        Jedadc = new javax.swing.JTextField();
        Baceptarcuidador = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Jidcuidador = new javax.swing.JTextField();
        Batrascuidador = new javax.swing.JButton();
        Bmodificarcuidador = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Primer nombre");

        jLabel2.setText("Segundo nombre");

        jLabel3.setText("Primer apellido");

        jLabel4.setText("Segundo apellido");

        jLabel5.setText("Dirección");

        jLabel6.setText("Telefono2");

        jLabel7.setText("Telefono1");

        jLabel8.setText("Correo");

        jLabel9.setText("Edad");

        Jnombrec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jnombrec1ActionPerformed(evt);
            }
        });

        Jnombrec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jnombrec2ActionPerformed(evt);
            }
        });

        Japellidoc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Japellidoc2ActionPerformed(evt);
            }
        });

        Japellidoc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Japellidoc1ActionPerformed(evt);
            }
        });

        Jtelefonoc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtelefonoc1ActionPerformed(evt);
            }
        });

        Jcorreoc.setToolTipText("");
        Jcorreoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JJcorreocActionPerformed(evt);
            }
        });

        Jdireccionc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JdireccioncActionPerformed(evt);
            }
        });

        Jtelefonoc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtelefonoc2ActionPerformed(evt);
            }
        });

        Jedadc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JedadcActionPerformed(evt);
            }
        });

        Baceptarcuidador.setText("Aceptar");
        Baceptarcuidador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaceptarcuidadorActionPerformed(evt);
            }
        });

        jLabel10.setText("Identificación");

        Jidcuidador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JidcuidadorActionPerformed(evt);
            }
        });

        Batrascuidador.setText("Cancelar");
        Batrascuidador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatrascuidadorActionPerformed(evt);
            }
        });

        Bmodificarcuidador.setText("Modificar");
        Bmodificarcuidador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmodificarcuidadorActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("MODIFICAR CUIDADOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Baceptarcuidador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bmodificarcuidador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Batrascuidador)
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Jnombrec2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Japellidoc2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Japellidoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel1))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Jnombrec1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jidcuidador, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jcorreoc, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jtelefonoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jdireccionc, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Jtelefonoc2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(Jedadc, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Jtelefonoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Jidcuidador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jcorreoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(Jnombrec1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(Jnombrec2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Japellidoc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(Japellidoc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(Jdireccionc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(Jtelefonoc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(Jedadc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bmodificarcuidador)
                    .addComponent(Baceptarcuidador)
                    .addComponent(Batrascuidador))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jnombrec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jnombrec1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jnombrec1ActionPerformed

    private void Jnombrec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jnombrec2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jnombrec2ActionPerformed

    private void Japellidoc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Japellidoc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Japellidoc2ActionPerformed

    private void Japellidoc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Japellidoc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Japellidoc1ActionPerformed

    private void Jtelefonoc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtelefonoc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtelefonoc1ActionPerformed

    private void JJcorreocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JJcorreocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JJcorreocActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void JdireccioncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JdireccioncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JdireccioncActionPerformed

    private void Jtelefonoc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtelefonoc2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtelefonoc2ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void JedadcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JedadcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JedadcActionPerformed

    private void BaceptarcuidadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaceptarcuidadorActionPerformed
     int id_cuidador;

        try {

            ControlCuidador objc = new ControlCuidador();
            id_cuidador = Integer.parseInt(Jidcuidador.getText());
            Cuidador objcu = objc.ModificarCuidador(id_cuidador);
            Jnombrec1.setText(objcu.getNombrec1());
            Jnombrec2.setText(objcu.getNombrec2());
            Jcorreoc.setText(objcu.getCorreoc()+ "");
            Jtelefonoc1.setText(objcu.getTelc1()+ "");
            Jtelefonoc2.setText(objcu.getTelc2()+ "");
            Japellidoc1.setText(objcu.getApellidoc1()+ "");
            Japellidoc2.setText(objcu.getApellidoc2()+ "");
            Jdireccionc.setText(objcu.getDirc()+ "");
            Jedadc.setText(objcu.getEdadc()+ "");
            // jXDatePickerlastmodi.setText(obje.getLast_update() + "");

            Jnombrec1.setEnabled(true);
            Jnombrec2.setEnabled(true);
            Jcorreoc.setEnabled(true);
            Jtelefonoc1.setEnabled(true);
            Jtelefonoc2.setEnabled(true);
            Japellidoc1.setEnabled(true);
            Japellidoc2.setEnabled(true);
            Jdireccionc.setEnabled(true);
            Jedadc.setEnabled(true);

        } catch (Exception e) {
            System.out.println("error" + e);
            e.printStackTrace();
        }
                                         
    }//GEN-LAST:event_BaceptarcuidadorActionPerformed

    private void JidcuidadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JidcuidadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JidcuidadorActionPerformed

    private void BatrascuidadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatrascuidadorActionPerformed
        Menu abrir = new Menu();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BatrascuidadorActionPerformed

    private void BmodificarcuidadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmodificarcuidadorActionPerformed
    // TODO add your handling code here:
        id_cuidador = Integer.parseInt(Jidcuidador.getText());
        String nombrec1 = null;
        String nombrec2 = null;
        String apellidoc1 = null;
        String apellidoc2 = null;
        int edadc = 0;
        String correoc = null;
        String telc1 = null;
        String telc2 = null;
        String dirc = null;
     

        if (Jnombrec2.getText()!=""){
            nombrec2 = Jnombrec2.getText();
        }

        if (Japellidoc2.getText()!=""){
            apellidoc2 = Japellidoc2.getText();
        }

        if (Jtelefonoc2.getText()!=""){
            telc2 = Jtelefonoc2.getText();
        }


        nombrec1 = Jnombrec1.getText();
        apellidoc1 = Japellidoc1.getText();
        edadc = Integer.parseInt(Jedadc.getText());
        correoc = Jcorreoc.getText();
        telc1 = Jtelefonoc1.getText();
        dirc = Jdireccionc.getText();

        ControlCuidador objm = new ControlCuidador();

        Cuidador objc = new Cuidador(nombrec1,nombrec2,apellidoc1,apellidoc2,edadc,correoc,telc1,telc2, dirc);

        try {
            boolean ch = objm.ModificarCuidadores(objc, id_cuidador);
            if (ch){
                System.out.println("Se modificó el cuidador");
            } else {
                System.out.println("No se modificó");
            }
        } catch (Exception e) {
            System.out.println(e);
        }                                              
    }//GEN-LAST:event_BmodificarcuidadorActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCuidador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarCuidador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Baceptarcuidador;
    private javax.swing.JButton Batrascuidador;
    private javax.swing.JButton Bmodificarcuidador;
    private javax.swing.JTextField Japellidoc1;
    private javax.swing.JTextField Japellidoc2;
    private javax.swing.JTextField Jcorreoc;
    private javax.swing.JTextField Jdireccionc;
    private javax.swing.JTextField Jedadc;
    private javax.swing.JTextField Jidcuidador;
    private javax.swing.JTextField Jnombrec1;
    private javax.swing.JTextField Jnombrec2;
    private javax.swing.JTextField Jtelefonoc1;
    private javax.swing.JTextField Jtelefonoc2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
