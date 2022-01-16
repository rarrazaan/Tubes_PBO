/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
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
 * @author DELL
 */
public final class TambahPasien extends javax.swing.JFrame {
    static final String DB_URL = "jdbc:mysql://localhost:3306/puskesmas";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    public static String nama;
    
    /**
     * Creates new form AddPasien
     */
    public TambahPasien() {
        initComponents();
//        jLabel9.setVisible(false);
//        jComboBox2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        edt_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rb_lk = new javax.swing.JRadioButton();
        rb_pr = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        btn_batal = new javax.swing.JButton();
        edt_kontak = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        edt_alamat = new javax.swing.JTextField();
        edt_umur = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        out = new javax.swing.JButton();
        obat = new javax.swing.JButton();
        pasien = new javax.swing.JButton();
        dokter = new javax.swing.JButton();
        dashborad = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        emp_login = new javax.swing.JLabel();
        btn_darurat = new javax.swing.JButton();
        btn_normal = new javax.swing.JButton();
        btn_terapi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel1.setPreferredSize(new java.awt.Dimension(741, 554));
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
        edt_name.setBounds(420, 140, 500, 30);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("GENDER");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(280, 200, 67, 21);

        buttonGroup1.add(rb_lk);
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

        buttonGroup1.add(rb_pr);
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
        btn_batal.setBounds(520, 510, 150, 45);

        edt_kontak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_kontakActionPerformed(evt);
            }
        });
        jPanel1.add(edt_kontak);
        edt_kontak.setBounds(420, 250, 500, 30);

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
        edt_alamat.setBounds(420, 300, 500, 50);

        edt_umur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_umurActionPerformed(evt);
            }
        });
        jPanel1.add(edt_umur);
        edt_umur.setBounds(420, 370, 500, 30);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("UMUR");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(280, 370, 48, 21);

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

        dashborad.setBackground(new java.awt.Color(0, 127, 127));
        dashborad.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        dashborad.setForeground(new java.awt.Color(255, 255, 255));
        dashborad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-information-40 (2).png"))); // NOI18N
        dashborad.setText("     DASHBOARD");
        dashborad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboradActionPerformed(evt);
            }
        });
        jPanel1.add(dashborad);
        dashborad.setBounds(0, 70, 230, 70);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("RS IMAM");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(32, 23, 109, 34);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(-1, 1, 1000, 70);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("TIPE PASIEN");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(280, 440, 100, 21);

        emp_login.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        emp_login.setForeground(new java.awt.Color(0, 153, 153));
        emp_login.setText("TAMBAH PASIEN");
        jPanel1.add(emp_login);
        emp_login.setBounds(280, 90, 178, 29);

        btn_darurat.setBackground(new java.awt.Color(0, 153, 153));
        btn_darurat.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn_darurat.setForeground(new java.awt.Color(255, 255, 255));
        btn_darurat.setText("DARURAT");
        btn_darurat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_daruratActionPerformed(evt);
            }
        });
        jPanel1.add(btn_darurat);
        btn_darurat.setBounds(630, 430, 140, 40);

        btn_normal.setBackground(new java.awt.Color(0, 153, 153));
        btn_normal.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        btn_normal.setForeground(new java.awt.Color(255, 255, 255));
        btn_normal.setText("NORMAL");
        btn_normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_normalActionPerformed(evt);
            }
        });
        jPanel1.add(btn_normal);
        btn_normal.setBounds(420, 430, 140, 40);

        btn_terapi.setBackground(new java.awt.Color(0, 127, 127));
        btn_terapi.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btn_terapi.setForeground(new java.awt.Color(255, 255, 255));
        btn_terapi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-examination-40 (1).png"))); // NOI18N
        btn_terapi.setText("     DATA TERAPI");
        btn_terapi.setBorder(null);
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
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

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
       dispose();
        MenuPasien a = null;
        try {
            a = new MenuPasien();
        } catch (SQLException ex) {
            Logger.getLogger(TambahPasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TambahPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
        a.setVisible(true);
    }//GEN-LAST:event_btn_batalActionPerformed

    private void edt_kontakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_kontakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_kontakActionPerformed

    private void edt_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_alamatActionPerformed

    private void edt_umurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edt_umurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edt_umurActionPerformed

    private void obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obatActionPerformed
       dispose();
        MenuObat a = new MenuObat();
        a.setVisible(true);
    }//GEN-LAST:event_obatActionPerformed

    private void pasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasienActionPerformed
        try {
            // TODO add your handling code here:
            dispose();
            MenuPasien a;
            a = new MenuPasien();
            a.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(TambahPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pasienActionPerformed

    private void dokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dokterActionPerformed
        dispose();
        MenuDokter a = new MenuDokter();
        a.setVisible(true);
    }//GEN-LAST:event_dokterActionPerformed

    private void dashboradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboradActionPerformed
        dispose();
        MenuManage a = new MenuManage();
        a.setVisible(true);
    }//GEN-LAST:event_dashboradActionPerformed

    private void btn_daruratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_daruratActionPerformed
        String name = edt_name.getText();
        TambahPasien.nama = name;
        String gender = ""; String jenis = "Darurat";
        String kontak = edt_kontak.getText();
        String alamat = edt_alamat.getText();
        int umur = Integer.parseInt(edt_umur.getText());
        if (rb_lk.isSelected()) {
            gender = "Laki-Laki";
        } else if (rb_pr.isSelected()) {
            gender = "Perempuan";
        }
        if (name.isEmpty() || gender.isEmpty() || alamat.isEmpty() || kontak.isEmpty() || umur==NULL) {
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
                String Jenis = jenis;
                int Umur = umur;

                String sql = "INSERT INTO `pasien` (`id_pasien`, `nama_pasien`, `gender_pasien`, `alamat_pasien`, `umur_pasien`, `kontak_pasien`, `jenis_pasien`) VALUES (NULL, '"+Nama+"','"+Gender+"','"+Alamat+"','"+Umur+"','"+Kontak+"','"+Jenis+"')";
                // INSERT INTO `pasien` (`id_pasien`, `nama_pasien`, `gender_pasien`, `alamat_pasien`, `umur_pasien`, `kontak_pasien`) VALUES ('1', 'as', 'as', 'as', '30', 'as')

                stmt.executeUpdate(sql);
                stmt.close();
                conn.close();
            } catch (SQLException e) {
            }
        }
        dispose(); 
        //System.out.println(TambahPasien.nama);
        PasienDarurat a = new PasienDarurat();
        a.setVisible(true);
    }//GEN-LAST:event_btn_daruratActionPerformed

    private void btn_normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_normalActionPerformed
        String name = edt_name.getText();
        TambahPasien.nama = name;
        String gender = ""; String jenis = "Normal";
        String kontak = edt_kontak.getText();
        String alamat = edt_alamat.getText();
        int umur = Integer.parseInt(edt_umur.getText());
        if (rb_lk.isSelected()) {
            gender = "Laki-Laki";
        } else if (rb_pr.isSelected()) {
            gender = "Perempuan";
        }
        if (name.isEmpty() || gender.isEmpty() || alamat.isEmpty() || kontak.isEmpty() || umur==NULL) {
            JOptionPane.showMessageDialog(this, "Data isian ada yang kosong");
        }
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            System.out.println("\nconn");
            stmt = conn.createStatement();
            String Nama = name;
            String Gender = gender;
            String Kontak = kontak;
            String Alamat = alamat;
            String Jenis = jenis;
            int Umur = umur;

            String sql = "INSERT INTO `pasien` (`id_pasien`, `nama_pasien`, `gender_pasien`, `alamat_pasien`, `umur_pasien`, `kontak_pasien`, `jenis_pasien`) VALUES (NULL, '"+Nama+"','"+Gender+"','"+Alamat+"','"+Umur+"','"+Kontak+"','"+Jenis+"')";
            // INSERT INTO `pasien` (`id_pasien`, `nama_pasien`, `gender_pasien`, `alamat_pasien`, `umur_pasien`, `kontak_pasien`) VALUES ('1', 'as', 'as', 'as', '30', 'as')

            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
        } catch (SQLException e) {
        }
        dispose();
        PasienNormal a = new PasienNormal();
        a.setVisible(true);
    }//GEN-LAST:event_btn_normalActionPerformed

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
            java.util.logging.Logger.getLogger(TambahPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TambahPasien().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_darurat;
    private javax.swing.JButton btn_normal;
    private javax.swing.JButton btn_terapi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton dashborad;
    private javax.swing.JButton dokter;
    private javax.swing.JTextField edt_alamat;
    private javax.swing.JTextField edt_kontak;
    private javax.swing.JTextField edt_name;
    private javax.swing.JTextField edt_umur;
    private javax.swing.JLabel emp_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton obat;
    private javax.swing.JButton out;
    private javax.swing.JButton pasien;
    private javax.swing.JRadioButton rb_lk;
    private javax.swing.JRadioButton rb_pr;
    // End of variables declaration//GEN-END:variables
}
