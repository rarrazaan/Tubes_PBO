/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class MenuDokter extends javax.swing.JFrame {

    /**
     * Creates new form DataDokter
     */
    public MenuDokter() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        dashboard = new javax.swing.JButton();
        dokter = new javax.swing.JButton();
        pasien = new javax.swing.JButton();
        obat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel1.setLayout(null);

        jList1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(280, 150, 236, 278);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("UMUR");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(590, 200, 48, 21);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("JENIS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(590, 320, 46, 21);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("SPESIALIS");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(590, 380, 79, 21);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("GENDER");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(590, 260, 67, 21);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(690, 200, 63, 21);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(690, 260, 63, 21);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(690, 320, 63, 21);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(690, 380, 63, 21);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RS IMAM");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(32, 23, 109, 34);

        btn_update.setBackground(new java.awt.Color(0, 102, 102));
        btn_update.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-update-32.png"))); // NOI18N
        btn_update.setText(" Update Data");
        btn_update.setBorder(null);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel4.add(btn_update);
        btn_update.setBounds(240, 10, 166, 50);

        btn_add.setBackground(new java.awt.Color(0, 102, 102));
        btn_add.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add-32 (1).png"))); // NOI18N
        btn_add.setText("Tambah Data");
        btn_add.setBorder(null);
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel4.add(btn_add);
        btn_add.setBounds(420, 10, 160, 50);

        btn_del.setBackground(new java.awt.Color(0, 102, 102));
        btn_del.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn_del.setForeground(new java.awt.Color(255, 255, 255));
        btn_del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-delete-32.png"))); // NOI18N
        btn_del.setText("Hapus Data");
        btn_del.setBorder(null);
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });
        jPanel4.add(btn_del);
        btn_del.setBounds(600, 10, 160, 50);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(-1, 1, 1000, 70);

        dashboard.setBackground(new java.awt.Color(0, 127, 127));
        dashboard.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-information-40 (2).png"))); // NOI18N
        dashboard.setText("     DASHBOARD");
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });
        jPanel1.add(dashboard);
        dashboard.setBounds(0, 70, 230, 70);

        dokter.setBackground(new java.awt.Color(0, 127, 127));
        dokter.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        dokter.setForeground(new java.awt.Color(255, 255, 255));
        dokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-doctor-40.png"))); // NOI18N
        dokter.setText("     DATA DOKTER");
        dokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokterActionPerformed(evt);
            }
        });
        jPanel1.add(dokter);
        dokter.setBounds(0, 140, 230, 70);

        pasien.setBackground(new java.awt.Color(0, 127, 127));
        pasien.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        pasien.setForeground(new java.awt.Color(255, 255, 255));
        pasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-patient-40 (3).png"))); // NOI18N
        pasien.setText("     DATA PASIEN");
        pasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasienActionPerformed(evt);
            }
        });
        jPanel1.add(pasien);
        pasien.setBounds(0, 210, 230, 70);

        obat.setBackground(new java.awt.Color(0, 127, 127));
        obat.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        obat.setForeground(new java.awt.Color(255, 255, 255));
        obat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-medicine-40 (3).png"))); // NOI18N
        obat.setText("    DATA OBAT");
        obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obatActionPerformed(evt);
            }
        });
        jPanel1.add(obat);
        obat.setBounds(0, 280, 230, 70);

        jPanel2.setBackground(new java.awt.Color(0, 127, 127));

        jButton9.setBackground(new java.awt.Color(0, 127, 127));
        jButton9.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-logout-32.png"))); // NOI18N
        jButton9.setText("LOG OUT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 180, Short.MAX_VALUE)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 350, 230, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        dispose();
        MenuManage a = new MenuManage();
        a.setVisible(true);
    }//GEN-LAST:event_dashboardActionPerformed

    private void dokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dokterActionPerformed

    private void pasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasienActionPerformed
        dispose();
        MenuPasien a = null;
        try {
            a = new MenuPasien();
        } catch (SQLException ex) {
            Logger.getLogger(MenuDokter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setVisible(true);
    }//GEN-LAST:event_pasienActionPerformed

    private void obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obatActionPerformed
        dispose();
        MenuObat a = new MenuObat();
        a.setVisible(true);
    }//GEN-LAST:event_obatActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        dispose();
        UpdateDokter a = new UpdateDokter();
        a.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        dispose();
        TambahDokter a = new TambahDokter();
        a.setVisible(true);
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        dispose();
        HapusDokter a = new HapusDokter();
        a.setVisible(true);
    }//GEN-LAST:event_btn_delActionPerformed

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
            java.util.logging.Logger.getLogger(MenuDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton dashboard;
    private javax.swing.JButton dokter;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton obat;
    private javax.swing.JButton pasien;
    // End of variables declaration//GEN-END:variables
}