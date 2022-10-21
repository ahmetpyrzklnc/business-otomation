package otomation_business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Distrubutor_screen extends javax.swing.JFrame {

    DefaultTableModel model;

    public Distrubutor_screen() {
        initComponents();
        populateTable();
    }

    public void populateTable() {
        model = (DefaultTableModel) list_distrubutor.getModel();
        model.setRowCount(0);

        try {
            ArrayList<DistrubutorManager> distrubutor = getDistrubutor();
            for (DistrubutorManager distrubutors : distrubutor) {
                Object[] row = {distrubutors.getDistrubutor_id(), distrubutors.getDistrubutor_name(), distrubutors.getDistrubutor_city(), distrubutors.getDistrubutor_gsm()};

                model.addRow(row);
            }
        } catch (SQLException exception) {

        }
    }

    public ArrayList<DistrubutorManager> getDistrubutor() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<DistrubutorManager> distrubutor = null;

        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM business_otomation.distrubutor;");
            distrubutor = new ArrayList<DistrubutorManager>();

            while (resultSet.next()) {
                distrubutor.add(new DistrubutorManager(resultSet.getInt("distrubutor_id"),
                        resultSet.getString("distrubutor_name"),
                        resultSet.getString("distrubutor_city"),
                        resultSet.getInt("distrubutor_gsm")
                ));
            }
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }

        return distrubutor;
    }

    public void Insert() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;

        try {
            connection = helper.getConnection();
            String sql = "INSERT INTO `business_otomation`.`distrubutor` (`distrubutor_name`, `distrubutor_city`, `distrubutor_gsm`)"
                    + " VALUES (?,?,?);";

            statement = connection.prepareStatement(sql);
            statement.setString(1, txtSirketEkle.getText());
            statement.setString(2, txtSehirEkle.getText());
            statement.setInt(3, Integer.valueOf(txtGsmEkle.getText()));

            int result = statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Kayıt Başarıyla Oluştu...");
            populateTable();
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    public void Uptade() throws SQLException {
        String id, name, city, gsm;

        id = lblidGuncelle.getText();
        name = txtSirketGuncelle.getText();
        city = txtSehirGuncelle.getText();
        gsm = txtGsmGuncelle.getText();

        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;

        try {
            connection = helper.getConnection();
            String sql = ("UPDATE `business_otomation`.`distrubutor` SET `distrubutor_name` = '" + name + "', `distrubutor_city` = '" + city + "', `distrubutor_gsm` = '" + gsm + "' WHERE (`distrubutor_id` = '" + id + "');");
            statement = connection.prepareStatement(sql);

            int result = statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Kayıt Başarıyla Güncellendi.");
            populateTable();

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSehirGuncelle = new javax.swing.JTextField();
        txtSirketEkle = new javax.swing.JTextField();
        lblEkle4 = new javax.swing.JLabel();
        txtDistrubutor = new javax.swing.JTextField();
        lblEkle5 = new javax.swing.JLabel();
        txtSehirEkle = new javax.swing.JTextField();
        lblEkle6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_distrubutor = new javax.swing.JTable();
        txtGsmGuncelle = new javax.swing.JTextField();
        txtSirketGuncelle = new javax.swing.JTextField();
        btnSil = new javax.swing.JButton();
        lblidGuncelle = new java.awt.Label();
        btnekle = new javax.swing.JButton();
        lblEkle7 = new javax.swing.JLabel();
        lblEkle1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        lblEkle3 = new javax.swing.JLabel();
        btguncelle = new javax.swing.JButton();
        btnAnasayfa = new javax.swing.JButton();
        lblEkle2 = new javax.swing.JLabel();
        txtGsmEkle = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Distrubutor");

        lblEkle4.setText("GSM:");
        lblEkle4.setToolTipText("");

        txtDistrubutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDistrubutorKeyReleased(evt);
            }
        });

        lblEkle5.setText("Şirket İsmi:");

        lblEkle6.setText("Şehir:");

        list_distrubutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Şirket ID", "Şirket İsmi", "Şehir", "GSM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        list_distrubutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_distrubutorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list_distrubutor);

        btnSil.setBackground(new java.awt.Color(153, 0, 0));
        btnSil.setForeground(new java.awt.Color(255, 255, 255));
        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        btnekle.setBackground(new java.awt.Color(0, 102, 102));
        btnekle.setForeground(new java.awt.Color(255, 255, 255));
        btnekle.setText("Ekle");
        btnekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnekleActionPerformed(evt);
            }
        });

        lblEkle7.setText("Şirket ID:");

        lblEkle1.setText("GSM:");
        lblEkle1.setToolTipText("");

        label1.setText("Ara: ");

        lblEkle3.setText("Şehir:");

        btguncelle.setBackground(new java.awt.Color(0, 102, 102));
        btguncelle.setForeground(new java.awt.Color(255, 255, 255));
        btguncelle.setText("Güncelle");
        btguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguncelleActionPerformed(evt);
            }
        });

        btnAnasayfa.setBackground(new java.awt.Color(153, 51, 0));
        btnAnasayfa.setForeground(new java.awt.Color(255, 255, 255));
        btnAnasayfa.setText("Anasayfa");
        btnAnasayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnasayfaActionPerformed(evt);
            }
        });

        lblEkle2.setText("Şirket İsmi:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(txtDistrubutor))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(btnekle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEkle3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtSehirEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblEkle2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSirketEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblEkle1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtGsmEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btguncelle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEkle6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                        .addComponent(txtSehirGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblEkle5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblEkle7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblidGuncelle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtSirketGuncelle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblEkle4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtGsmGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(btnAnasayfa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDistrubutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSil))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblidGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEkle7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEkle5)
                            .addComponent(txtSirketGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEkle6)
                            .addComponent(txtSehirGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEkle4)
                            .addComponent(txtGsmGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btguncelle))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEkle2)
                            .addComponent(txtSirketEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEkle3)
                            .addComponent(txtSehirEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEkle1)
                            .addComponent(txtGsmEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnekle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnAnasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDistrubutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDistrubutorKeyReleased

    }//GEN-LAST:event_txtDistrubutorKeyReleased

    private void list_distrubutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_distrubutorMouseClicked
        lblidGuncelle.setText(model.getValueAt(list_distrubutor.getSelectedRow(), 0).toString());
        txtSirketGuncelle.setText(model.getValueAt(list_distrubutor.getSelectedRow(), 1).toString());
        txtSehirGuncelle.setText(model.getValueAt(list_distrubutor.getSelectedRow(), 2).toString());
        txtGsmGuncelle.setText(model.getValueAt(list_distrubutor.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_list_distrubutorMouseClicked

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed

    }//GEN-LAST:event_btnSilActionPerformed

    private void btnekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnekleActionPerformed
        try {
            Insert();
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_btnekleActionPerformed

    private void btguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguncelleActionPerformed
        try {
            Uptade();
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_btguncelleActionPerformed

    private void btnAnasayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnasayfaActionPerformed
        Home_page page = new Home_page();
        page.setVisible(true);
    }//GEN-LAST:event_btnAnasayfaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Distrubutor_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btguncelle;
    private javax.swing.JButton btnAnasayfa;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnekle;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private javax.swing.JLabel lblEkle1;
    private javax.swing.JLabel lblEkle2;
    private javax.swing.JLabel lblEkle3;
    private javax.swing.JLabel lblEkle4;
    private javax.swing.JLabel lblEkle5;
    private javax.swing.JLabel lblEkle6;
    private javax.swing.JLabel lblEkle7;
    private java.awt.Label lblidGuncelle;
    private javax.swing.JTable list_distrubutor;
    private javax.swing.JTextField txtDistrubutor;
    private javax.swing.JTextField txtGsmEkle;
    private javax.swing.JTextField txtGsmGuncelle;
    private javax.swing.JTextField txtSehirEkle;
    private javax.swing.JTextField txtSehirGuncelle;
    private javax.swing.JTextField txtSirketEkle;
    private javax.swing.JTextField txtSirketGuncelle;
    // End of variables declaration//GEN-END:variables
}
