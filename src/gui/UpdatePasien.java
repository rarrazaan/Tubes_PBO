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
 * @author RVN
 */
public class UpdatePasien extends javax.swing.JFrame {

    /**
     * Creates new form UpdatePasien
     */
    public UpdatePasien() {
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
        jLabel1 = new javax.swing.JLabel();
        edt_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rb_lk = new javax.swing.JRadioButton();
        rb_pr = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        btn_simpan1 = new javax.swing.JButton();
        edt_kontak = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edt_alamat = new javax.swing.JTextField();
        edt_umur = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rb_lk1 = new javax.swing.JRadioButton();
        rb_pr1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        out = new javax.swing.JButton();
        obat = new javax.swing.JButton();
        pasien = new javax.swing.JButton();
        dokter = new javax.swing.JButton();
        dashboard = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        emp_login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("NAMA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(280, 140, 47, 21);

        edt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_nameActionPerformed(evt);
            }
        });
        jPanel1.add(edt_name);
        edt_name.setBounds(420, 140, 450, 30);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("GENDER");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(280, 200, 67, 21);

        rb_lk.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        rb_lk.setForeground(new java.awt.Color(0, 153, 153));
        rb_lk.setText("LAKI-LAKI");
        rb_lk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_lkActionPerformed(evt);
            }
        });
        jPanel1.add(rb_lk);
        rb_lk.setBounds(420, 200, 93, 27);

        rb_pr.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        rb_pr.setForeground(new java.awt.Color(0, 153, 153));
        rb_pr.setText("PEREMPUAN");
        rb_pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_prActionPerformed(evt);
            }
        });
        jPanel1.add(rb_pr);
        rb_pr.setBounds(540, 200, 107, 27);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("KONTAK");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 250, 69, 21);

        btn_simpan.setBackground(new java.awt.Color(0, 153, 153));
        btn_simpan.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-save-32.png"))); // NOI18N
        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel1.add(btn_simpan);
        btn_simpan.setBounds(400, 530, 150, 45);

        btn_simpan1.setBackground(new java.awt.Color(0, 153, 153));
        btn_simpan1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_simpan1.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-cancel-32.png"))); // NOI18N
        btn_simpan1.setText("BATAL");
        btn_simpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpan1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_simpan1);
        btn_simpan1.setBounds(660, 530, 150, 45);

        edt_kontak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_kontakActionPerformed(evt);
            }
        });
        jPanel1.add(edt_kontak);
        edt_kontak.setBounds(420, 250, 450, 30);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("ALAMAT");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 300, 67, 21);

        edt_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_alamatActionPerformed(evt);
            }
        });
        jPanel1.add(edt_alamat);
        edt_alamat.setBounds(420, 300, 450, 50);

        edt_umur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_umurActionPerformed(evt);
            }
        });
        jPanel1.add(edt_umur);
        edt_umur.setBounds(420, 370, 450, 30);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("UMUR");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(280, 370, 48, 21);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("RUANGAN");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(280, 470, 81, 21);

        rb_lk1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        rb_lk1.setForeground(new java.awt.Color(0, 153, 153));
        rb_lk1.setText("NORMAL");
        rb_lk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_lk1ActionPerformed(evt);
            }
        });
        jPanel1.add(rb_lk1);
        rb_lk1.setBounds(420, 420, 83, 27);

        rb_pr1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        rb_pr1.setForeground(new java.awt.Color(0, 153, 153));
        rb_pr1.setText("DARURAT");
        rb_pr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_pr1ActionPerformed(evt);
            }
        });
        jPanel1.add(rb_pr1);
        rb_pr1.setBounds(540, 420, 91, 27);

        jPanel2.setBackground(new java.awt.Color(0, 111, 111));

        out.setBackground(new java.awt.Color(0, 127, 127));
        out.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        out.setForeground(new java.awt.Color(255, 255, 255));
        out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-logout-32.png"))); // NOI18N
        out.setText("LOG OUT");
        out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(out, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 180, Short.MAX_VALUE)
                .addComponent(out, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 350, 230, 250);

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

        pasien.setBackground(new java.awt.Color(0, 127, 127));
        pasien.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        pasien.setForeground(new java.awt.Color(255, 255, 255));
        pasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-patient-40 (2).png"))); // NOI18N
        pasien.setText("     DATA PASIEN");
        pasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasienActionPerformed(evt);
            }
        });
        jPanel1.add(pasien);
        pasien.setBounds(0, 210, 230, 70);

        dokter.setBackground(new java.awt.Color(0, 127, 127));
        dokter.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        dokter.setForeground(new java.awt.Color(255, 255, 255));
        dokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-doctor-40 (2).png"))); // NOI18N
        dokter.setText("     DATA DOKTER");
        dokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dokterActionPerformed(evt);
            }
        });
        jPanel1.add(dokter);
        dokter.setBounds(0, 140, 230, 70);

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

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RS IMAM");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(32, 23, 109, 34);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(-1, 1, 1000, 70);

        jComboBox1.setBackground(new java.awt.Color(240, 240, 240));
        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH", "NR-01", "NR-02", "IGD-01", "IGD-02" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(420, 470, 70, 24);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("TIPE PASIEN");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(280, 420, 100, 21);

        emp_login.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        emp_login.setForeground(new java.awt.Color(0, 153, 153));
        emp_login.setText("UPDATE PASIEN");
        jPanel1.add(emp_login);
        emp_login.setBounds(280, 90, 174, 29);

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

    private void edt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_nameActionPerformed

    private void rb_lkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_lkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_lkActionPerformed

    private void rb_prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_prActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_prActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
       
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_simpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpan1ActionPerformed
        
    }//GEN-LAST:event_btn_simpan1ActionPerformed

    private void edt_kontakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_kontakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_kontakActionPerformed

    private void edt_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_alamatActionPerformed

    private void edt_umurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_umurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_umurActionPerformed

    private void rb_lk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_lk1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_lk1ActionPerformed

    private void rb_pr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_pr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_pr1ActionPerformed

    private void obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obatActionPerformed
        dispose();
        MenuObat a = new MenuObat();
        a.setVisible(true);
    }//GEN-LAST:event_obatActionPerformed

    private void pasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasienActionPerformed
        dispose();
        MenuPasien a = null;
        try {
            a = new MenuPasien();
        } catch (SQLException ex) {
            Logger.getLogger(UpdatePasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdatePasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setVisible(true);
    }//GEN-LAST:event_pasienActionPerformed

    private void dokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokterActionPerformed
        dispose();
        MenuDokter a = new MenuDokter();
        a.setVisible(true);
    }//GEN-LAST:event_dokterActionPerformed

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        dispose();
        MenuManage a = new MenuManage();
        a.setVisible(true);
    }//GEN-LAST:event_dashboardActionPerformed

    private void outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outActionPerformed

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
            java.util.logging.Logger.getLogger(UpdatePasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_simpan1;
    private javax.swing.JButton dashboard;
    private javax.swing.JButton dokter;
    private javax.swing.JTextField edt_alamat;
    private javax.swing.JTextField edt_kontak;
    private javax.swing.JTextField edt_name;
    private javax.swing.JTextField edt_umur;
    private javax.swing.JLabel emp_login;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton obat;
    private javax.swing.JButton out;
    private javax.swing.JButton pasien;
    private javax.swing.JRadioButton rb_lk;
    private javax.swing.JRadioButton rb_lk1;
    private javax.swing.JRadioButton rb_pr;
    private javax.swing.JRadioButton rb_pr1;
    // End of variables declaration//GEN-END:variables
}
