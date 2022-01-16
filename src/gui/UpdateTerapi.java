/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static gui.TambahTerapi.conn;
import static gui.UpdateObat.rs;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.sql.Types.NULL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author RVN
 */
public class UpdateTerapi extends javax.swing.JFrame {
    static final String DB_URL = "jdbc:mysql://localhost:3306/puskesmas";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    Map<Integer, String> map_dokter = new HashMap<>();
    Map<Integer, String> map_pasien = new HashMap<>();
    Map<Integer, String> map_obat = new HashMap<>();
    /**
     * Creates new form update
     */
    public UpdateTerapi() {
        try {
            initComponents();
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            String sql = "SELECT id_dokter, nama_dokter FROM dokter";
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                map_dokter.put(rs.getInt("id_dokter"), rs.getString("nama_dokter"));
            }
            String sql1 = "SELECT id_pasien, nama_pasien FROM pasien";
            rs = stmt.executeQuery(sql1);
            while(rs.next()){
                map_pasien.put(rs.getInt("id_pasien"), rs.getString("nama_pasien"));
            }
            String sql2 = "SELECT id_obat, nama_obat FROM obat";
            rs = stmt.executeQuery(sql2);
            while(rs.next()){
                map_obat.put(rs.getInt("id_obat"), rs.getString("nama_obat"));
            }
            
            map_dokter.entrySet().forEach((set) -> {
                cb_dokter.addItem(String.valueOf(set.getValue()));
            });
            map_pasien.entrySet().forEach((set) -> {
                cb_pasien.addItem(String.valueOf(set.getValue()));
            });
            map_obat.entrySet().forEach((set) -> {
                cb_obat.addItem(String.valueOf(set.getValue()));
            });
               
            String sql3 = "SELECT * FROM terapi";
            
            rs = stmt.executeQuery(sql3);
            int n = MenuTerapi.x;
            int i;
            while(rs.next()){
                i = rs.getInt("id_terapi");
                if(i==n){
                    this.cb_dokter.setSelectedItem(map_dokter.get(rs.getInt("id_dokter")));
                    this.cb_pasien.setSelectedItem(map_pasien.get(rs.getInt("id_pasien")));
                    this.cb_obat.setSelectedItem(map_obat.get(rs.getInt("id_obat")));
                    this.jTextField1.setText(rs.getString("nama_terapi"));
                    this.jTextField2.setText(String.valueOf(rs.getInt("biaya_terapi")));
                    
                    String[] arr = rs.getString("tanggal_terapi").split("-",3);
                    this.cb_tahun.setSelectedItem(arr[0]);
                    this.cb_bulan.setSelectedItem(arr[1]);
                    this.cb_tanggal1.setSelectedItem(arr[2]);
                    
                    this.jTextField3.setText(String.valueOf(rs.getInt("durasi_terapi")));

                }
            }
            stmt.close();
            conn.close();
        }catch (SQLException ex) {
            Logger.getLogger(TambahTerapi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public int getKeyByValue(Map<Integer, String> map, String value) {
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            // if give value is equal to value from entry
            // print the corresponding key
            if(entry.getValue() == null ? value == null : entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return -1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        dashboard = new javax.swing.JButton();
        dokter = new javax.swing.JButton();
        pasien = new javax.swing.JButton();
        obat = new javax.swing.JButton();
        btn_terapi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        out = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cb_dokter = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cb_pasien = new javax.swing.JComboBox<>();
        cb_obat = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cb_tanggal1 = new javax.swing.JComboBox<>();
        cb_bulan = new javax.swing.JComboBox<>();
        cb_tahun = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RS IMAM");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(32, 23, 109, 34);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 0, 1000, 70);

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
        jPanel2.add(dashboard);
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
        jPanel2.add(dokter);
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
        jPanel2.add(pasien);
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
        jPanel2.add(obat);
        obat.setBounds(0, 280, 230, 70);

        btn_terapi.setBackground(new java.awt.Color(0, 127, 127));
        btn_terapi.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_terapi.setForeground(new java.awt.Color(255, 255, 255));
        btn_terapi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-examination-40.png"))); // NOI18N
        btn_terapi.setText("     DATA TERAPI");
        btn_terapi.setBorder(null);
        btn_terapi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_terapiActionPerformed(evt);
            }
        });
        jPanel2.add(btn_terapi);
        btn_terapi.setBounds(0, 350, 230, 70);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(out, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 110, Short.MAX_VALUE)
                .addComponent(out, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 420, 230, 180);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("UPDATE TERAPI");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(270, 120, 180, 29);

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
        jPanel2.add(btn_simpan);
        btn_simpan.setBounds(420, 490, 150, 45);

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
        jPanel2.add(btn_batal);
        btn_batal.setBounds(680, 490, 150, 45);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("DOKTER");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(290, 180, 68, 21);

        cb_dokter.setMaximumRowCount(31);
        jPanel2.add(cb_dokter);
        cb_dokter.setBounds(380, 180, 90, 20);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("PASIEN");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(520, 180, 100, 21);

        cb_pasien.setMaximumRowCount(31);
        jPanel2.add(cb_pasien);
        cb_pasien.setBounds(630, 180, 80, 20);

        cb_obat.setMaximumRowCount(31);
        jPanel2.add(cb_obat);
        cb_obat.setBounds(860, 180, 80, 20);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("OBAT");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(750, 180, 100, 21);
        jPanel2.add(jTextField1);
        jTextField1.setBounds(480, 250, 400, 30);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("NAMA TERAPI");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(290, 250, 130, 21);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("BIAYA TERAPI");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(290, 310, 113, 21);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(480, 310, 400, 30);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("TANGGAL TERAPI");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(290, 370, 143, 21);

        cb_tanggal1.setMaximumRowCount(31);
        cb_tanggal1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel2.add(cb_tanggal1);
        cb_tanggal1.setBounds(480, 370, 37, 20);

        cb_bulan.setMaximumRowCount(12);
        cb_bulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cb_bulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_bulanActionPerformed(evt);
            }
        });
        jPanel2.add(cb_bulan);
        cb_bulan.setBounds(550, 370, 37, 20);

        cb_tahun.setMaximumRowCount(30);
        cb_tahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022" }));
        cb_tahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tahunActionPerformed(evt);
            }
        });
        jPanel2.add(cb_tahun);
        cb_tahun.setBounds(620, 370, 80, 20);
        jPanel2.add(jTextField3);
        jTextField3.setBounds(480, 430, 400, 30);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("DURASI TERAPI");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(290, 430, 130, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        dispose();
        MenuObat a = new MenuObat();
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
        } catch (SQLException ex) {
            Logger.getLogger(UpdateTerapi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateTerapi.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setVisible(true);
    }//GEN-LAST:event_pasienActionPerformed

    private void obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obatActionPerformed
        dispose();
        MenuObat a = new MenuObat();
        a.setVisible(true);
    }//GEN-LAST:event_obatActionPerformed

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

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        try {
            int dok = getKeyByValue(map_dokter, cb_dokter.getSelectedItem().toString());
            int pas = getKeyByValue(map_pasien, cb_pasien.getSelectedItem().toString());
            int oba = getKeyByValue(map_obat, cb_obat.getSelectedItem().toString());
            String name = jTextField1.getText();
            String biaya = jTextField2.getText();
            String tgl_terapi = cb_tahun.getSelectedItem().toString() + "-" + (cb_bulan.getSelectedIndex()+1) + "-" +cb_tanggal1.getSelectedItem().toString() ;
            int durasi = Integer.parseInt(jTextField3.getText());
            
            if (name.isEmpty() || biaya.isEmpty() || tgl_terapi.isEmpty() || durasi==NULL || dok==NULL || pas==NULL || oba==NULL) {
                JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
            }else{
                try{
                    //Class.forName("com.mysql.cj.jdbc.Driver");
                    conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                    stmt = conn.createStatement();
                    int Dok = dok, Pas = pas, Oba = oba, Durasi = durasi;
                    String Nama = name, Biaya = biaya, TglTerapi = tgl_terapi;
                    
                    String sql = "UPDATE `terapi` SET `id_pasien`='"+Pas+"', `id_dokter`='"+Dok+"', `id_obat`='"+Oba+"', `durasi_terapi`='"+Durasi+"', `biaya_terapi`='"+Biaya+"', `tanggal_terapi`='"+TglTerapi+"', `nama_terapi`='"+Nama+"' WHERE `id_terapi` ='"+MenuTerapi.x+"'";
                    stmt.executeUpdate(sql);
                    stmt.close();
                    conn.close();
                } catch (SQLException e) {
                }
            }
            dispose();
            MenuTerapi a = new MenuTerapi();
            a.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateTerapi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateTerapi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        dispose();
        MenuTerapi a = null;
        try {
            a = new MenuTerapi();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateTerapi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateTerapi.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setVisible(true);
    }//GEN-LAST:event_btn_batalActionPerformed

    private void cb_bulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_bulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_bulanActionPerformed

    private void cb_tahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_tahunActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateTerapi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateTerapi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateTerapi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateTerapi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateTerapi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_terapi;
    private javax.swing.JComboBox<String> cb_bulan;
    private javax.swing.JComboBox<String> cb_dokter;
    private javax.swing.JComboBox<String> cb_obat;
    private javax.swing.JComboBox<String> cb_pasien;
    private javax.swing.JComboBox<String> cb_tahun;
    private javax.swing.JComboBox<String> cb_tanggal1;
    private javax.swing.JButton dashboard;
    private javax.swing.JButton dokter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton obat;
    private javax.swing.JButton out;
    private javax.swing.JButton pasien;
    // End of variables declaration//GEN-END:variables
}
