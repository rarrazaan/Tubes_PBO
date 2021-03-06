/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static gui.UpdatePasien.conn;
import static gui.UpdatePasien.rs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author RVN
 */
public class TampilData extends javax.swing.JFrame {
    static final String DB_URL = "jdbc:mysql://localhost:3306/puskesmas";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    public static int id;
    static int ter, idter, oba, tot;
    /**
     * Creates new form RekamMedis
     */
    public TampilData() {
        try {
            initComponents();
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            
            String sql = "SELECT terapi.*, pasien.nama_pasien, dokter.nama_dokter, obat.nama_obat, obat.harga_obat, rekammedis.*, tagihan.*\n" +
                    "FROM terapi\n" +
                    "LEFT JOIN pasien ON pasien.id_pasien=terapi.id_pasien\n" +
                    "LEFT JOIN dokter ON dokter.id_dokter=terapi.id_dokter\n" +
                    "LEFT JOIN obat ON obat.id_obat=terapi.id_obat\n" +
                    "LEFT JOIN rekammedis ON rekammedis.id_pasien=terapi.id_pasien\n" +
                    "LEFT JOIN tagihan ON tagihan.id_terapi=terapi.id_terapi\n" +
                    "WHERE terapi.id_pasien=";
            int n = MenuPasien.x;
            TampilData.id = n;
            
            rs = stmt.executeQuery(sql+n);
            while(rs.next()){
                TampilData.idter = rs.getInt("id_terapi");
                this.jLabel9.setText(rs.getString("nama_pasien"));
                this.jLabel11.setText(rs.getString("nama_dokter"));
                this.jLabel13.setText(rs.getString("nama_obat"));
                this.jLabel22.setText(rs.getString("keluhan"));   
                this.jLabel14.setText(rs.getString("durasi_terapi"));
                this.jLabel15.setText("Rp "+NumberFormat.getInstance().format(rs.getInt("biaya_terapi")));
                this.jLabel16.setText(rs.getString("tanggal_terapi"));
                this.jLabel18.setText("Rp "+NumberFormat.getInstance().format(rs.getInt("total_biaya")));
                this.jLabel20.setText(rs.getString("pemeriksaan"));
            }
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TampilData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        out = new javax.swing.JButton();
        dashboard = new javax.swing.JButton();
        dokter = new javax.swing.JButton();
        pasien = new javax.swing.JButton();
        obat = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        emp_login = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btn_ok2 = new javax.swing.JButton();
        btn_ok3 = new javax.swing.JButton();
        btn_terapi = new javax.swing.JButton();

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel1.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RS IMAM");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(32, 23, 109, 34);

        btn_add.setBackground(new java.awt.Color(0, 102, 102));
        btn_add.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add-32 (1).png"))); // NOI18N
        btn_add.setText("Tambah Catatan");
        btn_add.setBorder(null);
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel4.add(btn_add);
        btn_add.setBounds(290, 10, 180, 50);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(-1, 1, 1000, 70);

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
                .addGap(0, 230, Short.MAX_VALUE)
                .addComponent(out, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 420, 230, 300);

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
        dokter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-doctor-40 (2).png"))); // NOI18N
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
        pasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-patient-40 (2).png"))); // NOI18N
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

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Biaya Terapi");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(300, 360, 110, 21);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel3.setText("Nama Obat");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 240, 100, 21);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel2.setText("Nama Dokter");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 200, 120, 21);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Durasi Terapi");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(300, 320, 120, 21);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Tanggal Terapi");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 400, 130, 21);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("Total Biaya");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 440, 110, 21);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("Nama Pasien");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(300, 160, 120, 21);

        emp_login.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        emp_login.setForeground(new java.awt.Color(0, 153, 153));
        emp_login.setText("Rekam Medis dan Tagihan Pasien");
        jPanel1.add(emp_login);
        emp_login.setBounds(280, 100, 380, 29);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel9.setText("-");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(510, 160, 400, 18);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel11.setText("-");
        jLabel11.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(510, 200, 400, 18);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel13.setText("-");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel13);
        jLabel13.setBounds(510, 240, 400, 18);

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel14.setText("-");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel14);
        jLabel14.setBounds(510, 320, 400, 18);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel15.setText("-");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel15);
        jLabel15.setBounds(510, 360, 400, 18);

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel16.setText("-");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel16);
        jLabel16.setBounds(510, 400, 400, 18);

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel18.setText("-");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel18);
        jLabel18.setBounds(510, 440, 400, 18);

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel19.setText("Catatan Dokter");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(300, 480, 130, 21);

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel20.setText("-");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel20);
        jLabel20.setBounds(510, 480, 400, 80);

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel21.setText("Keluhan");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(300, 280, 100, 21);

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel22.setText("-");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel22);
        jLabel22.setBounds(510, 280, 400, 18);

        btn_ok2.setBackground(new java.awt.Color(0, 153, 153));
        btn_ok2.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn_ok2.setForeground(new java.awt.Color(255, 255, 255));
        btn_ok2.setText("OK");
        btn_ok2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ok2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ok2);
        btn_ok2.setBounds(540, 630, 150, 45);

        btn_ok3.setBackground(new java.awt.Color(0, 153, 153));
        btn_ok3.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn_ok3.setForeground(new java.awt.Color(255, 255, 255));
        btn_ok3.setText("+");
        btn_ok3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ok3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ok3);
        btn_ok3.setBounds(300, 510, 50, 30);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        dispose();
        MenuManage a = new MenuManage();
        a.setVisible(true);
    }//GEN-LAST:event_dashboardActionPerformed

    private void dokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokterActionPerformed
        dispose();
        MenuDokter a = new MenuDokter();
        a.setVisible(true);
    }//GEN-LAST:event_dokterActionPerformed

    private void pasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasienActionPerformed
        dispose();
        MenuPasien a = null;
        try {
            a = new MenuPasien();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UpdateDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setVisible(true);
    }//GEN-LAST:event_pasienActionPerformed

    private void obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obatActionPerformed
        dispose();
        MenuObat a = new MenuObat();
        a.setVisible(true);
    }//GEN-LAST:event_obatActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        dispose();
        TambahCatatan a = new TambahCatatan();
        a.setVisible(true);
    }//GEN-LAST:event_btn_addActionPerformed

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

    private void btn_ok2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ok2ActionPerformed
        dispose();
        MenuPasien a = null;
        try {
            a = new MenuPasien();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UpdateDokter.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setVisible(true);
    }//GEN-LAST:event_btn_ok2ActionPerformed

    private void btn_ok3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ok3ActionPerformed
        int ctr=0;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            String sql1 = "SELECT terapi.biaya_terapi, terapi.id_terapi, obat.harga_obat FROM terapi LEFT JOIN obat ON obat.id_obat=";
            rs = stmt.executeQuery(sql1+TampilData.idter);
            while(rs.next()){
                id = rs.getInt("id_terapi");
                if (id==idter){
                    ter = rs.getInt("biaya_terapi");
                    oba = rs.getInt("harga_obat");
                    tot = ter +oba;
                }
            }
            String s = "SELECT COUNT(*) FROM tagihan WHERE id_terapi=";
            rs = stmt.executeQuery(s+TampilData.idter);
            while(rs.next()){
                ctr = rs.getInt("COUNT(*)");
            }
            if (ctr==0){
                String sql2 = "INSERT INTO `tagihan` (`id_terapi`, `total_biaya`) VALUES('"+TampilData.idter+"', '"+tot+"')";
                stmt.executeUpdate(sql2);
            }else{
                String sql2 = "UPDATE `tagihan` SET `total_biaya`='"+tot+"'WHERE id_terapi='"+TampilData.idter+"'";
                stmt.executeUpdate(sql2);
            }
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TampilData.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
        TampilData a = new TampilData();
        a.setVisible(true);
    }//GEN-LAST:event_btn_ok3ActionPerformed

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
            java.util.logging.Logger.getLogger(TampilData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TampilData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TampilData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TampilData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_ok2;
    private javax.swing.JButton btn_ok3;
    private javax.swing.JButton btn_terapi;
    private javax.swing.JButton dashboard;
    private javax.swing.JButton dokter;
    private javax.swing.JLabel emp_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton obat;
    private javax.swing.JButton out;
    private javax.swing.JButton pasien;
    // End of variables declaration//GEN-END:variables
}
