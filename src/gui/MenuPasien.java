/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class MenuPasien extends javax.swing.JFrame {
    static final String DB_URL = "jdbc:mysql://localhost:3306/puskesmas";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    ArrayList<Integer> ID = new ArrayList<>(50);
    static int i, x;
    /**
     * Creates new form MenuPasien
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public MenuPasien() throws SQLException, ClassNotFoundException{
        initComponents();
        DefaultListModel pilih = new DefaultListModel();
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM pasien";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                pilih.addElement(rs.getString("nama_pasien"));
                ID.add(rs.getInt("id_pasien"));
            }
            if (ID.size()<1){
                btn_update.setEnabled(false);
                btn_del.setEnabled(false);
            }
            stmt.close();
            conn.close();
        } catch (SQLException e) {
        }
        if (ID.size()<1){
            btn_update.setEnabled(false);
            btn_del.setEnabled(false);
        }
        this.jList1.setModel(pilih);
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
        btn_del = new javax.swing.JButton();
        btn_show = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        out = new javax.swing.JButton();
        dashboard = new javax.swing.JButton();
        dokter = new javax.swing.JButton();
        pasien = new javax.swing.JButton();
        obat = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_terapi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel1.setPreferredSize(new java.awt.Dimension(741, 554));
        jPanel1.setLayout(null);

        jList1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 1, true));
        jList1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(280, 146, 236, 370);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Umur");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(580, 150, 46, 21);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Jenis Pasien");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(580, 380, 110, 21);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Ruangan");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(580, 440, 73, 21);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(580, 200, 61, 21);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("-");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(750, 150, 210, 21);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel7.setText("-");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(750, 200, 210, 21);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel8.setText("-");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(750, 380, 210, 21);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel9.setText("-");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(750, 440, 210, 21);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RS IMAM");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(32, 23, 109, 34);

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
        btn_del.setBounds(610, 10, 160, 50);

        btn_show.setBackground(new java.awt.Color(0, 102, 102));
        btn_show.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn_show.setForeground(new java.awt.Color(255, 255, 255));
        btn_show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-show-property-32.png"))); // NOI18N
        btn_show.setText("Tampil Data");
        btn_show.setBorder(null);
        btn_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showActionPerformed(evt);
            }
        });
        jPanel4.add(btn_show);
        btn_show.setBounds(790, 10, 160, 50);

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
        btn_add.setBounds(430, 10, 160, 50);

        btn_update.setBackground(new java.awt.Color(0, 102, 102));
        btn_update.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-update-32 (1).png"))); // NOI18N
        btn_update.setText(" Update Data");
        btn_update.setBorder(null);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel4.add(btn_update);
        btn_update.setBounds(250, 10, 166, 50);

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
                .addGap(0, 110, Short.MAX_VALUE)
                .addComponent(out, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 420, 230, 180);

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

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("Alamat");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(580, 260, 61, 21);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel12.setText("-");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(750, 260, 210, 21);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("Kontak");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(580, 320, 59, 21);

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel14.setText("-");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(750, 320, 210, 21);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("Level");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(580, 490, 45, 21);

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel16.setText("-");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(750, 490, 210, 21);

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
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        int n = jList1.getSelectedIndex();
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            String sql = "SELECT pasien.*, pasiennormal.ruang_rawat, pasiendarurat.ruangan_IGD, pasiendarurat.level\n" +
                "FROM pasien \n" +
                "LEFT OUTER JOIN pasiennormal ON pasien.id_pasien = pasiennormal.id_pasien\n" +
                "LEFT OUTER JOIN pasiendarurat ON pasien.id_pasien = pasiendarurat.id_pasien;";

            rs = stmt.executeQuery(sql);
            n = ID.get(n);
            while(rs.next()){
                i = rs.getInt("id_pasien");
                if(i==n){
                    this.jLabel6.setText(String.valueOf(rs.getInt("umur_pasien")));
                    this.jLabel7.setText(rs.getString("gender_pasien"));
                    this.jLabel8.setText(rs.getString("jenis_pasien"));
                    this.jLabel12.setText(rs.getString("alamat_pasien"));
                    this.jLabel14.setText(rs.getString("kontak_pasien"));
                    if ("Darurat".equals(rs.getString("jenis_pasien"))){
                        this.jLabel9.setText(rs.getString("ruangan_IGD"));
                        this.jLabel16.setText(rs.getString("level"));
                    }else{
                        this.jLabel9.setText(rs.getString("ruang_rawat"));
                        this.jLabel16.setText("-");
                    }
                    
                    
                    x=rs.getInt("id_pasien");
                }
            }
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(MenuPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
        dispose();
        HapusPasien a = new HapusPasien();
        a.setVisible(true);
    }//GEN-LAST:event_btn_delActionPerformed

    private void btn_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showActionPerformed
        dispose();
        TampilData a = new TampilData();
        a.setVisible(true);
    }//GEN-LAST:event_btn_showActionPerformed

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
        
    }//GEN-LAST:event_pasienActionPerformed

    private void obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obatActionPerformed
        dispose();
        MenuObat a = new MenuObat();
        a.setVisible(true);
    }//GEN-LAST:event_obatActionPerformed

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

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        dispose();
        TambahPasien a = new TambahPasien();
        a.setVisible(true);
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        dispose();
        UpdatePasien a = new UpdatePasien();
        a.setVisible(true);
    }//GEN-LAST:event_btn_updateActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new MenuPasien().setVisible(true);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(MenuPasien.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_show;
    private javax.swing.JButton btn_terapi;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton dashboard;
    private javax.swing.JButton dokter;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JButton out;
    private javax.swing.JButton pasien;
    // End of variables declaration//GEN-END:variables
}
