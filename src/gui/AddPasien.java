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
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public final class AddPasien extends javax.swing.JFrame {
    static final String DB_URL = "jdbc:mysql://localhost:3306/puskesmas";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    /**
     * Creates new form AddPasien
     */
    public AddPasien() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jPanel1.setPreferredSize(new java.awt.Dimension(741, 554));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("NAMA");

        edt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_nameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("GENDER");

        buttonGroup1.add(rb_lk);
        rb_lk.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        rb_lk.setForeground(new java.awt.Color(0, 153, 153));
        rb_lk.setText("Laki-Laki");
        rb_lk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_lkActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_pr);
        rb_pr.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        rb_pr.setForeground(new java.awt.Color(0, 153, 153));
        rb_pr.setText("Perempuan");
        rb_pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_prActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("KONTAK");

        btn_simpan.setBackground(new java.awt.Color(0, 153, 153));
        btn_simpan.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_simpan1.setBackground(new java.awt.Color(0, 153, 153));
        btn_simpan1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btn_simpan1.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan1.setText("BATAL");
        btn_simpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpan1ActionPerformed(evt);
            }
        });

        edt_kontak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_kontakActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("ALAMAT");

        edt_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_alamatActionPerformed(evt);
            }
        });

        edt_umur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edt_umurActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("UMUR");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("TAMBAH PASIEN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(2, 2, 2)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(btn_simpan1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rb_lk)
                                .addGap(29, 29, 29)
                                .addComponent(rb_pr))
                            .addComponent(edt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edt_kontak, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edt_umur, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(edt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rb_lk)
                    .addComponent(rb_pr))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edt_kontak, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edt_umur, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_simpan1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        try{                                           
            ButtonGroup rbGroup = new ButtonGroup();
            rbGroup.add(rb_lk);
            rbGroup.add(rb_pr);
            String name = edt_name.getText();
            String gender = "";
            String kontak = edt_kontak.getText();
            String alamat = edt_alamat.getText();
            int umur = Integer.parseInt(edt_umur.getText());
            if (rb_lk.isSelected()) {
                gender = "Laki-Laki";
            } else if (rb_pr.isSelected()) {
                gender = "Perempuan";
            }
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mohon untuk mengisi nama terlebih dahulu");
                return;
            }
            if (gender.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mohon untuk mengisi gender terlebih dahulu");
                return;
            }
            if (alamat.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mohon untuk mengisi gender terlebih dahulu");
                return;
            }
            if (kontak.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Mohon untuk mengisi gender terlebih dahulu");
                return;
            }
            if (umur==NULL) {
                JOptionPane.showMessageDialog(this, "Mohon untuk mengisi gender terlebih dahulu");
                return;
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
                int Umur = umur;
                
                String sql = "INSERT INTO `pasien` (`id_pasien`, `nama_pasien`, `gender_pasien`, `alamat_pasien`, `umur_pasien`, `kontak_pasien`) VALUES (NULL, '"+Nama+"','"+Gender+"','"+Alamat+"','"+Umur+"','"+Kontak+"')";
                // INSERT INTO `pasien` (`id_pasien`, `nama_pasien`, `gender_pasien`, `alamat_pasien`, `umur_pasien`, `kontak_pasien`) VALUES ('1', 'as', 'as', 'as', '30', 'as')
                
                stmt.executeUpdate(sql);
                stmt.close();
                conn.close();
            } catch (SQLException e) {
            }
            dispose();
            MenuPasien a;
            a = new MenuPasien();
            a.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AddPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_simpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpan1ActionPerformed
        try {
            // TODO add your handling code here:
            dispose();
            MenuPasien a;
            a = new MenuPasien();
            a.setVisible(true);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(AddPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(AddPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddPasien().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_simpan1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField edt_alamat;
    private javax.swing.JTextField edt_kontak;
    private javax.swing.JTextField edt_name;
    private javax.swing.JTextField edt_umur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rb_lk;
    private javax.swing.JRadioButton rb_pr;
    // End of variables declaration//GEN-END:variables
}
