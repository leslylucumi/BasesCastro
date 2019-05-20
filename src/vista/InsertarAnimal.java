/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlAlimentacion;
import control.ControlAnimal;
import control.ControlEspecie;
import control.ControlHabitat;
import java.io.File;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import modelo.Alimentacion;
import modelo.Animal;
import modelo.Especie;
import modelo.Habitat;

/**
 *
 * @author Ángela
 */
public class InsertarAnimal extends javax.swing.JFrame {
    
    LinkedList<Especie> le;
    LinkedList<Habitat> lh;
    LinkedList<Alimentacion> lA;
    String esp;
    String habi;
    String alim;
    
    /**
     * Creates new form Insertaranimal2
     */
    public InsertarAnimal() {
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

        jLabel1 = new javax.swing.JLabel();
        Jpesoa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Jnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Bcerraranimal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Bagregaranimal = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Blimpiaranimal = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        Batras = new javax.swing.JButton();
        Jedad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        rutaimgcara = new javax.swing.JTextField();
        rutaimgcuerpo = new javax.swing.JTextField();
        Jid = new javax.swing.JTextField();
        rutaimgopcional = new javax.swing.JTextField();
        Jdescripa = new javax.swing.JTextField();
        Jgeneroa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Babririmgcara = new javax.swing.JButton();
        Babririmgcuerpo = new javax.swing.JButton();
        Babririmgopcional = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Edad");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 84, 24, 14);
        getContentPane().add(Jpesoa);
        Jpesoa.setBounds(116, 279, 111, 20);

        jLabel2.setText("img");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 111, 16, 14);
        getContentPane().add(Jnombre);
        Jnombre.setBounds(116, 248, 111, 20);

        jLabel3.setText("img2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 140, 22, 14);

        jLabel4.setText("img3");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 169, 22, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("INSERTAR ANIMAL");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(248, 11, 153, 22);

        jLabel10.setText("Especie");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(330, 84, 36, 14);

        jLabel5.setText("Género");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 194, 35, 14);

        jLabel11.setText("Alimentación");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(330, 139, 60, 14);

        Bcerraranimal.setText("Cerrar");
        Bcerraranimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcerraranimalActionPerformed(evt);
            }
        });
        getContentPane().add(Bcerraranimal);
        Bcerraranimal.setBounds(454, 317, 63, 23);

        jLabel6.setText("Descripción");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 223, 54, 14);

        Bagregaranimal.setText("Agregar");
        Bagregaranimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BagregaranimalActionPerformed(evt);
            }
        });
        getContentPane().add(Bagregaranimal);
        Bagregaranimal.setBounds(330, 252, 71, 23);

        jLabel7.setText("Nombre");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 251, 37, 14);

        Blimpiaranimal.setText("Limpiar");
        Blimpiaranimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpiaranimalActionPerformed(evt);
            }
        });
        getContentPane().add(Blimpiaranimal);
        Blimpiaranimal.setBounds(454, 252, 65, 23);

        jLabel8.setText("Peso");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 282, 23, 14);

        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(413, 136, 176, 20);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(413, 81, 176, 20);

        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(413, 188, 176, 20);

        Batras.setText("Atras");
        Batras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatrasActionPerformed(evt);
            }
        });
        getContentPane().add(Batras);
        Batras.setBounds(330, 317, 59, 23);
        getContentPane().add(Jedad);
        Jedad.setBounds(116, 81, 111, 20);

        jLabel12.setText("Id");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 58, 10, 14);

        rutaimgcara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaimgcaraActionPerformed(evt);
            }
        });
        getContentPane().add(rutaimgcara);
        rutaimgcara.setBounds(116, 108, 111, 20);
        getContentPane().add(rutaimgcuerpo);
        rutaimgcuerpo.setBounds(116, 137, 111, 20);
        getContentPane().add(Jid);
        Jid.setBounds(116, 55, 111, 20);
        getContentPane().add(rutaimgopcional);
        rutaimgopcional.setBounds(116, 166, 111, 20);
        getContentPane().add(Jdescripa);
        Jdescripa.setBounds(116, 220, 111, 20);
        getContentPane().add(Jgeneroa);
        Jgeneroa.setBounds(116, 194, 111, 20);

        jLabel13.setText("Habitat");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(330, 191, 35, 14);

        Babririmgcara.setText("Abrir");
        Babririmgcara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BabririmgcaraActionPerformed(evt);
            }
        });
        getContentPane().add(Babririmgcara);
        Babririmgcara.setBounds(245, 107, 58, 23);

        Babririmgcuerpo.setText("Abrir");
        Babririmgcuerpo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BabririmgcuerpoActionPerformed(evt);
            }
        });
        getContentPane().add(Babririmgcuerpo);
        Babririmgcuerpo.setBounds(245, 136, 58, 23);

        Babririmgopcional.setText("Abrir");
        Babririmgopcional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BabririmgopcionalActionPerformed(evt);
            }
        });
        getContentPane().add(Babririmgopcional);
        Babririmgopcional.setBounds(245, 165, 58, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                     

    
    private void BcerraranimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcerraranimalActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BcerraranimalActionPerformed

    private void BagregaranimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BagregaranimalActionPerformed
        String temp;
        String temp2;
        String temp3;
        int id_animal;
        int edad;
        String imganimalcara;
        String imganimalcuerpo;
        String imganimal;
        String genero;
        String descripcion;
        String nombre;
        double peso;
        int id_Especie;
        int id_Habitat;
        int id_Alimentacion;
        id_Alimentacion = 0;
        id_Especie = 0;
        id_Habitat = 0;

//        for (int i = 0; i < le.size(); i++) {
//            if (esp.equals(le.get(i).getNombreE())) {
//                id_Especie = le.get(i).getId();
//            }
//        }
//
//        for (int i = 0; i < lA.size(); i++) {
//            if (alim.equals(lA.get(i).getNombreA())) {
//                id_Alimentacion = lA.get(i).getId();
//            }
//        }
//
//        for (int i = 0; i < lh.size(); i++) {
//            if (habi.equals(lh.get(i).getNombreH())) {
//                id_Habitat = lh.get(i).getId();
//            }
//        }
        ///// 
        id_animal = Integer.parseInt(Jid.getText());
        edad = Integer.parseInt(Jedad.getText());
        imganimalcara = rutaimgcara.getText();
        imganimalcuerpo = rutaimgcuerpo.getText();
        imganimal = rutaimgopcional.getText();
        genero = Jgeneroa.getText();
        descripcion = Jdescripa.getText();
        nombre = Jnombre.getText();
        peso = Double.parseDouble(Jpesoa.getText());

        ControlAnimal objca = new ControlAnimal();
        Animal obje = new Animal(id_animal, edad, imganimalcara, imganimalcuerpo, imganimal, genero, descripcion, nombre, peso, id_Especie, id_Habitat, id_Alimentacion);
        boolean f = objca.insertarAnimal(obje);

        if (f) {

            System.out.println("Se inserto el Animal");
        } else {
            System.out.println("No se inserto el Animal");
        }
    }//GEN-LAST:event_BagregaranimalActionPerformed

    private void BlimpiaranimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlimpiaranimalActionPerformed
        //cajadetexto1.setText(null);
        //cajadetexto2.setText("");
    }//GEN-LAST:event_BlimpiaranimalActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        esp = (String) jComboBox1.getSelectedItem();
        alim = (String) jComboBox3.getSelectedItem();
        habi = (String) jComboBox4.getSelectedItem();
        // System.out.println("iten seleccionado "+jComboBox1.getSelectedItem());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void BatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatrasActionPerformed
        OpcionesInsertar abrir = new OpcionesInsertar();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BatrasActionPerformed

    private void rutaimgcaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaimgcaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutaimgcaraActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        ControlEspecie objce = new ControlEspecie();
        le = objce.consultarEspecies();

        for (int i = 0; i < le.size(); i++) {
            jComboBox1.addItem(le.get(i).getNombreE());

        }

        ControlHabitat objch = new ControlHabitat();
        lh = objch.consultarHabitat();

        for (int i = 0; i < lh.size(); i++) {
            jComboBox4.addItem(lh.get(i).getNombreH());

        }

        ///////////
        ControlAlimentacion objcA = new ControlAlimentacion();
        lA = objcA.consultarAlimentacion();

        for (int i = 0; i < lA.size(); i++) {
            jComboBox3.addItem(lA.get(i).getNombreA());

        }
    }//GEN-LAST:event_formWindowOpened

    private void BabririmgcaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BabririmgcaraActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();

        if (archivo != null) {
            rutaimgcara.setText(archivo.getAbsolutePath());
        }
    }//GEN-LAST:event_BabririmgcaraActionPerformed

    private void BabririmgcuerpoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BabririmgcuerpoActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();

        if (archivo != null) {
            rutaimgcuerpo.setText(archivo.getAbsolutePath());
        }
    }//GEN-LAST:event_BabririmgcuerpoActionPerformed

    private void BabririmgopcionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BabririmgopcionalActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();

        if (archivo != null) {
            rutaimgopcional.setText(archivo.getAbsolutePath());
        }
    }//GEN-LAST:event_BabririmgopcionalActionPerformed

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
            java.util.logging.Logger.getLogger(InsertarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertarAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Babririmgcara;
    private javax.swing.JButton Babririmgcuerpo;
    private javax.swing.JButton Babririmgopcional;
    private javax.swing.JButton Bagregaranimal;
    private javax.swing.JButton Batras;
    private javax.swing.JButton Bcerraranimal;
    private javax.swing.JButton Blimpiaranimal;
    private javax.swing.JTextField Jdescripa;
    private javax.swing.JTextField Jedad;
    private javax.swing.JTextField Jgeneroa;
    private javax.swing.JTextField Jid;
    private javax.swing.JTextField Jnombre;
    private javax.swing.JTextField Jpesoa;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField rutaimgcara;
    private javax.swing.JTextField rutaimgcuerpo;
    private javax.swing.JTextField rutaimgopcional;
    // End of variables declaration//GEN-END:variables
}
