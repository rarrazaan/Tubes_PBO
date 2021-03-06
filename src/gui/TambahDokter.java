/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static gui.TambahPasien.conn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Types.NULL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author RVN
 */
public class TambahDokter extends javax.swing.JFrame {
    static final String DB_URL = "jdbc:mysql://localhost:3306/puskesmas";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    public static String nama;
    /**
     * Creates new form TambahDokter
     */
    public TambahDokter() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        out = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        obat = new javax.swing.JButton();
        pasien = new javax.swing.JButton();
        dokter = new javax.swing.JButton();
        dashboard = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        rb_lk = new javax.swing.JRadioButton();
        rb_pr = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        edt_name = new javax.swing.JTextField();
        emp_login = new javax.swing.JLabel();
        btn_terapi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

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
                .addGap(0, 110, Short.MAX_VALUE)
                .addComponent(out, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 420, 230, 180);

        btn_simpan.setBackground(new java.awt.Color(0, 153, 153));
        btn_simpan.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-save-32.png"))); // NOI18N
        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        jPanel1.add(btn_simpan);
        btn_simpan.setBounds(412, 500, 150, 45);

        btn_batal.setBackground(new java.awt.Color(0, 153, 153));
        btn_batal.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-cancel-32.png"))); // NOI18N
        btn_batal.setText("BATAL");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });
        jPanel1.add(btn_batal);
        btn_batal.setBounds(672, 500, 150, 45);

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
        pasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-patient-40 (3).png"))); // NOI18N
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
        dokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-doctor-40.png"))); // NOI18N
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
        jPanel4.setBounds(1, 1, 1000, 70);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("NAMA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(278, 159, 47, 21);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("KONTAK");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(278, 209, 69, 21);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("GENDER");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(278, 249, 70, 21);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("ALAMAT");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(278, 299, 67, 21);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("SPESIALIS");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(278, 377, 79, 21);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(418, 377, 500, 30);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(418, 299, 500, 60);

        rb_lk.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        rb_lk.setForeground(new java.awt.Color(0, 153, 153));
        rb_lk.setText("LAKI-LAKI");
        rb_lk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_lkActionPerformed(evt);
            }
        });
        jPanel1.add(rb_lk);
        rb_lk.setBounds(418, 249, 93, 27);

        rb_pr.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        rb_pr.setForeground(new java.awt.Color(0, 153, 153));
        rb_pr.setText("PEREMPUAN");
        rb_pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_prActionPerformed(evt);
            }
        });
        jPanel1.add(rb_pr);
        rb_pr.setBounds(538, 249, 107, 27);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(418, 209, 500, 30);

        edt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_nameActionPerformed(evt);
            }
        });
        jPanel1.add(edt_name);
        edt_name.setBounds(418, 159, 500, 30);

        emp_login.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        emp_login.setForeground(new java.awt.Color(0, 153, 153));
        emp_login.setText("TAMBAH DOKTER");
        jPanel1.add(emp_login);
        emp_login.setBounds(278, 102, 191, 29);

        btn_terapi.setBackground(new java.awt.Color(0, 127, 127));
        btn_terapi.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_terapi.setForeground(new java.awt.Color(255, 255, 255));
        btn_terapi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-examination-40 (1).png"))); // NOI18N
        btn_terapi.setText("    DATA TERAPI");
        btn_terapi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_terapiActionPerformed(evt);
            }
        });
        jPanel1.add(btn_terapi);
        btn_terapi.setBounds(0, 350, 230, 70);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleParent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        String name = edt_name.getText();
        String gender = "";
        String kontak = jTextField2.getText();
        String alamat = jTextField4.getText();
        String spesialis = jTextField5.getText();
        if (rb_lk.isSelected()) {
            gender = "Laki-Laki";
        } else if (rb_pr.isSelected()) {
            gender = "Perempuan";
        }
        if (name.isEmpty() || gender.isEmpty() || alamat.isEmpty() || kontak.isEmpty() || spesialis.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
        }else{
            try{
                //Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                stmt = conn.createStatement();
                String Nama = name;
                String Gender = gender;
                String Kontak = kontak;
                String Alamat = alamat;
                String Spesialis = spesialis;

                String sql = "INSERT INTO `dokter` (`id_dokter`, `nama_dokter`, `gender_dokter`, `alamat_dokter`, `spesialis`, `kontak_dokter`) VALUES (NULL, '"+Nama+"','"+Gender+"','"+Alamat+"','"+Spesialis+"','"+Kontak+"')";

                stmt.executeUpdate(sql);
                stmt.close();
                conn.close();
            } catch (SQLException e) {
            }
        }
        dispose();
        MenuDokter a = new MenuDokter();
        a.setVisible(true);
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        dispose();
        MenuDokter a = new MenuDokter();
        a.setVisible(true);
    }//GEN-LAST:event_btn_batalActionPerformed

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
            Logger.getLogger(TambahDokter.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TambahDokter.class.getName()).log(Level.SEVERE, null, ex);
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

    private void rb_lkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_lkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_lkActionPerformed

    private void rb_prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_prActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_prActionPerformed

    private void edt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_nameActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outActionPerformed
        try {
            dispose();
            JOptionPane.showMessageDialog(this, "Logout Berhasil");
            LogIn a = new LogIn();
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MenuManage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuManage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_outActionPerformed

    private void btn_terapiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_terapiActionPerformed
        dispose();
        MenuTerapi a = null;
        try {
            a = new MenuTerapi();
        } catch (SQLException ex) {
            Logger.getLogger(MenuTerapi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuTerapi.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setVisible(true);
    }//GEN-LAST:event_btn_terapiActionPerformed

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
            java.util.logging.Logger.getLogger(TambahDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahDokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahDokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_terapi;
    private javax.swing.JButton dashboard;
    private javax.swing.JButton dokter;
    private javax.swing.JTextField edt_name;
    private javax.swing.JLabel emp_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton obat;
    private javax.swing.JButton out;
    private javax.swing.JButton pasien;
    private javax.swing.JRadioButton rb_lk;
    private javax.swing.JRadioButton rb_pr;
    // End of variables declaration//GEN-END:variables
}
