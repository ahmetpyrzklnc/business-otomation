
package otomation_business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Register_screen extends javax.swing.JFrame {

  
    public Register_screen() {
        initComponents();
    }
    
        public void Insert() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;

        try {
            connection = helper.getConnection();
            String sql = "INSERT INTO `business_otomation`.`login` (`login_name`, `login_surname`, `login_user`, `login_password`)"
                    + " VALUES (?,?,?,?);";

            statement = connection.prepareStatement(sql);
            statement.setString(1, txtAdiniz.getText());
            statement.setString(2, txtSoyAdiniz.getText());
            statement.setString(3, txtKullaniciAdi.getText());
            statement.setString(4, txtSifre.getText());

            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Kayıt Başarılıyla oluşturuldu...");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();;
            connection.close();;
        }

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSoyAdiniz = new javax.swing.JTextField();
        lblKullaniciAdi2 = new javax.swing.JLabel();
        txtSifre = new javax.swing.JTextField();
        lblKullaniciAdi = new javax.swing.JLabel();
        txtKullaniciAdi = new javax.swing.JTextField();
        lblKullaniciSifre = new javax.swing.JLabel();
        btnKayit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAnasayfa = new javax.swing.JButton();
        lblKullaniciAdi1 = new javax.swing.JLabel();
        txtAdiniz = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");

        txtSoyAdiniz.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoyAdiniz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoyAdinizActionPerformed(evt);
            }
        });

        lblKullaniciAdi2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblKullaniciAdi2.setText("Soyadınız:");

        txtSifre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSifre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSifreActionPerformed(evt);
            }
        });

        lblKullaniciAdi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblKullaniciAdi.setText("Kullanıcı Adı:");

        txtKullaniciAdi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtKullaniciAdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKullaniciAdiActionPerformed(evt);
            }
        });

        lblKullaniciSifre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblKullaniciSifre.setText("Şifre:");

        btnKayit.setBackground(new java.awt.Color(0, 102, 102));
        btnKayit.setForeground(new java.awt.Color(255, 255, 255));
        btnKayit.setText("Kayıt");
        btnKayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKayitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("     Kayıt Ekranı");

        btnAnasayfa.setBackground(new java.awt.Color(102, 0, 0));
        btnAnasayfa.setForeground(new java.awt.Color(255, 255, 255));
        btnAnasayfa.setText("Giriş Ekranı");
        btnAnasayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnasayfaActionPerformed(evt);
            }
        });

        lblKullaniciAdi1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblKullaniciAdi1.setText("Adınız:");

        txtAdiniz.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAdiniz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdinizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKullaniciAdi2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblKullaniciAdi1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAdiniz, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoyAdiniz, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKullaniciAdi))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblKullaniciSifre, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnKayit)
                                    .addComponent(txtSifre)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnAnasayfa)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciAdi1)
                    .addComponent(txtAdiniz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciAdi2)
                    .addComponent(txtSoyAdiniz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciAdi)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKullaniciSifre)
                    .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnKayit)
                .addGap(41, 41, 41)
                .addComponent(btnAnasayfa)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSoyAdinizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoyAdinizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoyAdinizActionPerformed

    private void txtSifreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSifreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSifreActionPerformed

    private void txtKullaniciAdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKullaniciAdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKullaniciAdiActionPerformed

    private void btnKayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKayitActionPerformed
        try {
            Insert();
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_btnKayitActionPerformed

    private void btnAnasayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnasayfaActionPerformed
        Login_screen screen = new Login_screen();
        screen.setVisible(true);
    }//GEN-LAST:event_btnAnasayfaActionPerformed

    private void txtAdinizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdinizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdinizActionPerformed


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
            java.util.logging.Logger.getLogger(Register_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnasayfa;
    private javax.swing.JButton btnKayit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblKullaniciAdi;
    private javax.swing.JLabel lblKullaniciAdi1;
    private javax.swing.JLabel lblKullaniciAdi2;
    private javax.swing.JLabel lblKullaniciSifre;
    private javax.swing.JTextField txtAdiniz;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JTextField txtSifre;
    private javax.swing.JTextField txtSoyAdiniz;
    // End of variables declaration//GEN-END:variables
}
