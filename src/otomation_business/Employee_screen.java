package otomation_business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Employee_screen extends javax.swing.JFrame {

    DefaultTableModel model;

    public Employee_screen() {
        initComponents();
        populateTable();
    }

    public void populateTable() {

        model = (DefaultTableModel) list_calisan.getModel();
        model.setRowCount(0);
        try {
            ArrayList<EmployeeManager> employee = getEmployee();
            for (EmployeeManager employe : employee) {
                Object[] row = {employe.getId(), employe.getName(), employe.getSurname(), employe.getDepartman(), employe.getSalary()};

                model.addRow(row);
            }
        } catch (SQLException ex) {

        }
    }

    public ArrayList<EmployeeManager> getEmployee() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<EmployeeManager> employee = null;

        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM business_otomation.employee;");
            employee = new ArrayList<EmployeeManager>();
            while (resultSet.next()) {
                employee.add(new EmployeeManager(resultSet.getInt("employee_id"),
                        resultSet.getString("employee_name"),
                        resultSet.getString("employee_lastname"),
                        resultSet.getString("employee_departmant"),
                        resultSet.getInt("employee_salary")
                ));
            }
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }

        return employee;
    }

    public void Insert() {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;

        try {
            connection = helper.getConnection();
            String sql = "INSERT INTO `business_otomation`.`employee` (`employee_name`, `employee_lastname`, `employee_departmant`, `employee_salary`)"
                    + "VALUES (?,?,?,?);";
            statement = connection.prepareStatement(sql);
            statement.setString(1, txtAdEkle.getText());
            statement.setString(2, txtSoyadEkle.getText());
            statement.setString(3, txtDepartmanEkle.getText());
            statement.setInt(4, Integer.valueOf(txtmaasEkle.getText()));
            int result = statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Kayıt Başarıyla Oluştu.");
            populateTable();

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {

            }
        }
    }

    public void Uptade() {
        String id, name, surname, departmant, salary;

        id = lblidGuncelle.getText();
        name = txtAdGuncelle.getText();
        surname = txtSoyadGuncelle.getText();
        departmant = txtDepartmanGuncelle.getText();
        salary = txtmaasGuncelle.getText();

        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;

        try {
            connection = helper.getConnection();
            String sql = ("UPDATE `business_otomation`.`employee` SET `employee_name` = '" + name + "', `employee_lastname` = '" + surname + "', `employee_departmant` = '" + departmant + "', `employee_salary` = '" + salary + "' WHERE (`employee_id` = '" + id + "');");
            statement = connection.prepareStatement(sql);

            int result = statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Kayıt Başarıyla Güncellendi");
            populateTable();

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {

            }
        }
    }

    public void Delete() {
        String id;

        id = lblidGuncelle.getText();

        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;

        try {
            connection = helper.getConnection();
            String sql = ("DELETE FROM `business_otomation`.`employee` WHERE `employee_id` = '" + id + "'");
            statement = connection.prepareStatement(sql);

            int result = statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Kayıt Başarıyla Silindi.");
            populateTable();

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {

            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEkle6 = new javax.swing.JLabel();
        txtDepartmanGuncelle = new javax.swing.JTextField();
        lblEkle8 = new javax.swing.JLabel();
        lblEkle9 = new javax.swing.JLabel();
        lblEkle10 = new javax.swing.JLabel();
        txtAdGuncelle = new javax.swing.JTextField();
        txtCalisan = new javax.swing.JTextField();
        txtSoyadGuncelle = new javax.swing.JTextField();
        txtmaasGuncelle = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_calisan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblEkle11 = new javax.swing.JLabel();
        btnSil = new javax.swing.JButton();
        lblidGuncelle = new java.awt.Label();
        btnekle = new javax.swing.JButton();
        lblEkle1 = new javax.swing.JLabel();
        lblEkle2 = new javax.swing.JLabel();
        lblEkle3 = new javax.swing.JLabel();
        txtAdEkle = new javax.swing.JTextField();
        txtSoyadEkle = new javax.swing.JTextField();
        txtmaasEkle = new javax.swing.JTextField();
        btguncelle = new javax.swing.JButton();
        lblEkle4 = new javax.swing.JLabel();
        txtDepartmanEkle = new javax.swing.JTextField();
        btnAnasayfa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee");

        lblEkle6.setText("Departman:");

        lblEkle8.setText("Ad:");
        lblEkle8.setToolTipText("");

        lblEkle9.setText("Soyad: ");

        lblEkle10.setText("Maaş:");

        txtCalisan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCalisanActionPerformed(evt);
            }
        });
        txtCalisan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCalisanKeyReleased(evt);
            }
        });

        list_calisan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Çalışan ID", "Ad", "Soyad", "Departman", "Maaş"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        list_calisan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_calisanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list_calisan);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Ara");

        lblEkle11.setText("ID:");
        lblEkle11.setToolTipText("");

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

        lblEkle1.setText("Ad:");
        lblEkle1.setToolTipText("");

        lblEkle2.setText("Soyad: ");

        lblEkle3.setText("Maaş:");

        btguncelle.setBackground(new java.awt.Color(0, 102, 102));
        btguncelle.setForeground(new java.awt.Color(255, 255, 255));
        btguncelle.setText("Güncelle");
        btguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btguncelleActionPerformed(evt);
            }
        });

        lblEkle4.setText("Departman:");

        btnAnasayfa.setBackground(new java.awt.Color(153, 0, 0));
        btnAnasayfa.setForeground(new java.awt.Color(255, 255, 255));
        btnAnasayfa.setText("Anasayfa");
        btnAnasayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnasayfaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnekle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEkle3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtmaasEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblEkle2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSoyadEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblEkle1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(txtAdEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblEkle4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDepartmanEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEkle10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtmaasGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblEkle9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSoyadGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEkle6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDepartmanGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEkle8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblEkle11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtAdGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblidGuncelle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btguncelle)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtCalisan, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)))
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(btnAnasayfa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(44, 44, 44)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                    .addGap(18, 18, 18)
                    .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCalisan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnekle)
                            .addComponent(btguncelle))
                        .addGap(0, 53, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEkle1)
                                    .addComponent(txtAdEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEkle2)
                                    .addComponent(txtSoyadEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEkle4)
                                    .addComponent(txtDepartmanEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEkle3)
                                    .addComponent(txtmaasEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEkle11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblidGuncelle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEkle8)
                                    .addComponent(txtAdGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEkle9)
                                    .addComponent(txtSoyadGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEkle6)
                                    .addComponent(txtDepartmanGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEkle10)
                                    .addComponent(txtmaasGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)))
                        .addComponent(btnAnasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSil))
                    .addContainerGap(273, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCalisanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCalisanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCalisanActionPerformed

    private void txtCalisanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalisanKeyReleased
        String arama = txtCalisan.getText();
        TableRowSorter<DefaultTableModel> tableRowSorter = new TableRowSorter<DefaultTableModel>(model);
        list_calisan.setRowSorter(tableRowSorter);
        tableRowSorter.setRowFilter(RowFilter.regexFilter(arama));
    }//GEN-LAST:event_txtCalisanKeyReleased

    private void list_calisanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_calisanMouseClicked
        lblidGuncelle.setText(model.getValueAt(list_calisan.getSelectedRow(), 0).toString());
        txtAdGuncelle.setText(model.getValueAt(list_calisan.getSelectedRow(), 1).toString());
        txtSoyadGuncelle.setText(model.getValueAt(list_calisan.getSelectedRow(), 2).toString());
        txtDepartmanGuncelle.setText(model.getValueAt(list_calisan.getSelectedRow(), 3).toString());
        txtmaasGuncelle.setText(model.getValueAt(list_calisan.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_list_calisanMouseClicked

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        Delete();
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnekleActionPerformed
        Insert();
    }//GEN-LAST:event_btnekleActionPerformed

    private void btguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btguncelleActionPerformed
        Uptade();
    }//GEN-LAST:event_btguncelleActionPerformed

    private void btnAnasayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnasayfaActionPerformed
        Home_page page = new Home_page();
        page.setVisible(true);
    }//GEN-LAST:event_btnAnasayfaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btguncelle;
    private javax.swing.JButton btnAnasayfa;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnekle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEkle1;
    private javax.swing.JLabel lblEkle10;
    private javax.swing.JLabel lblEkle11;
    private javax.swing.JLabel lblEkle2;
    private javax.swing.JLabel lblEkle3;
    private javax.swing.JLabel lblEkle4;
    private javax.swing.JLabel lblEkle6;
    private javax.swing.JLabel lblEkle8;
    private javax.swing.JLabel lblEkle9;
    private java.awt.Label lblidGuncelle;
    private javax.swing.JTable list_calisan;
    private javax.swing.JTextField txtAdEkle;
    private javax.swing.JTextField txtAdGuncelle;
    private javax.swing.JTextField txtCalisan;
    private javax.swing.JTextField txtDepartmanEkle;
    private javax.swing.JTextField txtDepartmanGuncelle;
    private javax.swing.JTextField txtSoyadEkle;
    private javax.swing.JTextField txtSoyadGuncelle;
    private javax.swing.JTextField txtmaasEkle;
    private javax.swing.JTextField txtmaasGuncelle;
    // End of variables declaration//GEN-END:variables
}
