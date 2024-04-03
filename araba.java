/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg211213098_huseyin_kursat_cinar;

import java.awt.Component;
import java.awt.PopupMenu;
import javax.lang.model.element.Element;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ListModel;


/**
 *
 * @author kursad
 */
public class araba extends javax.swing.JFrame {

    private int i=0;
    
    DefaultListModel myModel = new DefaultListModel();
    
    /**
     * Creates new form odev
     */
    public araba() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        hck98_jLabel1 = new javax.swing.JLabel();
        hck98_jButton1 = new javax.swing.JButton();
        hck98_jLabel2 = new javax.swing.JLabel();
        hck98_jLabel3 = new javax.swing.JLabel();
        hck98_jCheckBox1 = new javax.swing.JCheckBox();
        hck98_jCheckBox2 = new javax.swing.JCheckBox();
        hck98_jCheckBox3 = new javax.swing.JCheckBox();
        hck98_jCheckBox4 = new javax.swing.JCheckBox();
        hck98_jCheckBox5 = new javax.swing.JCheckBox();
        hck98_jRadioButton1 = new javax.swing.JRadioButton();
        hck98_jRadioButton2 = new javax.swing.JRadioButton();
        hck98_jRadioButton3 = new javax.swing.JRadioButton();
        hck98_jButton2 = new javax.swing.JButton();
        hck98_jButton3 = new javax.swing.JButton();
        hck98_jButton4 = new javax.swing.JButton();
        hkc98_jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        hkc98_jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        hkc98_jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hck98_jLabel1.setText("Otomobil Markası");

        hck98_jButton1.setText("Marka Ekle");
        hck98_jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hck98_jButton1MouseClicked(evt);
            }
        });

        hck98_jLabel2.setText("Yakıt");

        hck98_jLabel3.setText("Vites");

        hck98_jCheckBox1.setText("Benzin");
        hck98_jCheckBox1.setToolTipText("");

        hck98_jCheckBox2.setText("Benzin & LPG");

        hck98_jCheckBox3.setText("Dizel");

        hck98_jCheckBox4.setText("Elektrik");

        hck98_jCheckBox5.setText("Hybrid");

        buttonGroup1.add(hck98_jRadioButton1);
        hck98_jRadioButton1.setText("Manuel");

        buttonGroup1.add(hck98_jRadioButton2);
        hck98_jRadioButton2.setText("Yarı Otomatik");

        buttonGroup1.add(hck98_jRadioButton3);
        hck98_jRadioButton3.setText("Otomatik");

        hck98_jButton2.setText("Filtre Ekle");
        hck98_jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hck98_jButton2ActionPerformed(evt);
            }
        });

        hck98_jButton3.setText("Filtre Kaldır");
        hck98_jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hck98_jButton3ActionPerformed(evt);
            }
        });

        hck98_jButton4.setText("Filtre Sıfırla");
        hck98_jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hck98_jButton4ActionPerformed(evt);
            }
        });

        hkc98_jLabel1.setText("Filtreler");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Audi", "BMW", "Citroen", "Dacia", "Fiat", "Ford", "Honda", "Kia", "Mercedes-Benz", "Nissan" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        hkc98_jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setViewportView(hkc98_jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hck98_jButton2)
                        .addGap(48, 48, 48)
                        .addComponent(hck98_jButton3)
                        .addGap(48, 48, 48)
                        .addComponent(hck98_jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hck98_jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hck98_jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hck98_jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hck98_jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hck98_jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hck98_jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hck98_jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hkc98_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hck98_jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hck98_jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hck98_jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hck98_jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hck98_jButton1))))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hkc98_jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hkc98_jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hck98_jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hck98_jButton1)
                            .addComponent(hkc98_jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hck98_jLabel2)
                            .addComponent(hck98_jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hck98_jRadioButton1)
                            .addComponent(hck98_jCheckBox1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hck98_jCheckBox2)
                            .addComponent(hck98_jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hck98_jCheckBox3)
                            .addComponent(hck98_jRadioButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hck98_jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hck98_jCheckBox5)
                        .addGap(44, 44, 44)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hck98_jButton2)
                    .addComponent(hck98_jButton3)
                    .addComponent(hck98_jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hck98_jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hck98_jButton1MouseClicked
        // TODO add your handling code here:
     
     jComboBox1.addItem(hkc98_jTextField1.getText());
        
        
    }//GEN-LAST:event_hck98_jButton1MouseClicked

    private void hck98_jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hck98_jButton2ActionPerformed
        // TODO add your handling code here:
        String cumle;
        cumle=(String) (jComboBox1.getSelectedItem());
        
        if(hck98_jCheckBox1.isSelected()){
            cumle=(cumle+", "+(String)(hck98_jCheckBox1.getText()));
        }
        if(hck98_jCheckBox2.isSelected()){
            cumle=(cumle+", "+(String)(hck98_jCheckBox2.getText()));
        }
        if(hck98_jCheckBox3.isSelected()){
            cumle=(cumle+", "+(String)(hck98_jCheckBox3.getText()));
        }
        if(hck98_jCheckBox4.isSelected()){
            cumle=(cumle+", "+(String)(hck98_jCheckBox4.getText()));
        }
        if(hck98_jCheckBox5.isSelected()){
            cumle=(cumle+", "+(String)(hck98_jCheckBox5.getText()));
        }
        if(hck98_jRadioButton1.isSelected()){
            cumle=(cumle+", "+(String)(hck98_jRadioButton1.getText()));
        }
        if(hck98_jRadioButton2.isSelected()){
            cumle=(cumle+", "+(String)(hck98_jRadioButton2.getText()));
        }
        if(hck98_jRadioButton3.isSelected()){
            cumle=(cumle+", "+(String)(hck98_jRadioButton3.getText()));
        }
        
        myModel.addElement(cumle);
        hkc98_jList1.setModel(myModel);
        i++;
    }//GEN-LAST:event_hck98_jButton2ActionPerformed

    private void hck98_jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hck98_jButton3ActionPerformed
        // TODO add your handling code here:
        int index = hkc98_jList1.getSelectedIndex();
        myModel.removeElementAt(index);
        hkc98_jList1.setModel(myModel);
    }//GEN-LAST:event_hck98_jButton3ActionPerformed

    private void hck98_jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hck98_jButton4ActionPerformed
        // TODO add your handling code here:
        myModel.removeAllElements();
        hkc98_jList1.setModel(myModel);
    }//GEN-LAST:event_hck98_jButton4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        System.out.println(jComboBox1.getSelectedItem());
        System.out.println(hkc98_jList1.getSelectedIndex());
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(araba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(araba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(araba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(araba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new araba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton hck98_jButton1;
    private javax.swing.JButton hck98_jButton2;
    private javax.swing.JButton hck98_jButton3;
    private javax.swing.JButton hck98_jButton4;
    private javax.swing.JCheckBox hck98_jCheckBox1;
    private javax.swing.JCheckBox hck98_jCheckBox2;
    private javax.swing.JCheckBox hck98_jCheckBox3;
    private javax.swing.JCheckBox hck98_jCheckBox4;
    private javax.swing.JCheckBox hck98_jCheckBox5;
    private javax.swing.JLabel hck98_jLabel1;
    private javax.swing.JLabel hck98_jLabel2;
    private javax.swing.JLabel hck98_jLabel3;
    private javax.swing.JRadioButton hck98_jRadioButton1;
    private javax.swing.JRadioButton hck98_jRadioButton2;
    private javax.swing.JRadioButton hck98_jRadioButton3;
    private javax.swing.JLabel hkc98_jLabel1;
    private javax.swing.JList<String> hkc98_jList1;
    private javax.swing.JTextField hkc98_jTextField1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private String[] toString(Object selectedItem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
