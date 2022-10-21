
package otomation_business;


public class Stock_screen extends javax.swing.JFrame {

 
    public Stock_screen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEkle2 = new javax.swing.JLabel();
        lblEkle3 = new javax.swing.JLabel();
        btnAnasayfa = new javax.swing.JButton();
        btnekle = new javax.swing.JButton();
        txtAdGuncelle = new javax.swing.JTextField();
        txtfiyatguncelle = new javax.swing.JTextField();
        lblEkle5 = new javax.swing.JLabel();
        lblEkle6 = new javax.swing.JLabel();
        btnguncelle = new javax.swing.JButton();
        txtStokEkle = new javax.swing.JTextField();
        lblEkle7 = new javax.swing.JLabel();
        lblEkle8 = new javax.swing.JLabel();
        txtStokGuncelle = new javax.swing.JTextField();
        lblEkle9 = new javax.swing.JLabel();
        txtModelEkle = new javax.swing.JTextField();
        lblEkle10 = new javax.swing.JLabel();
        txtModelGuncelle = new javax.swing.JTextField();
        lblEkle11 = new javax.swing.JLabel();
        lblkod = new java.awt.Label();
        label1 = new java.awt.Label();
        txtAdEkle = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        txtfiyatEkle = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_Stock = new javax.swing.JTable();
        btnSil = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEkle2.setText("Ürün Adı: ");

        lblEkle3.setText("Ürün Fiyatı:");

        btnAnasayfa.setBackground(new java.awt.Color(153, 51, 0));
        btnAnasayfa.setForeground(new java.awt.Color(255, 255, 255));
        btnAnasayfa.setText("Anasayfa");
        btnAnasayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnasayfaActionPerformed(evt);
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

        txtAdGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdGuncelleActionPerformed(evt);
            }
        });

        txtfiyatguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfiyatguncelleActionPerformed(evt);
            }
        });

        lblEkle5.setText("Ürün Adı: ");

        lblEkle6.setText("Ürün Fiyatı");

        btnguncelle.setBackground(new java.awt.Color(0, 102, 102));
        btnguncelle.setForeground(new java.awt.Color(255, 255, 255));
        btnguncelle.setText("Güncelle");
        btnguncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguncelleActionPerformed(evt);
            }
        });

        txtStokEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStokEkleActionPerformed(evt);
            }
        });

        lblEkle7.setText("Ürün Adeti:");

        lblEkle8.setText("Ürün Adeti:");

        txtStokGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStokGuncelleActionPerformed(evt);
            }
        });

        lblEkle9.setText("Ürün Model:");

        txtModelEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelEkleActionPerformed(evt);
            }
        });

        lblEkle10.setText("Ürün Model:");

        txtModelGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelGuncelleActionPerformed(evt);
            }
        });

        lblEkle11.setText("Ürün Kodu: ");

        label1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label1.setText("Ara");

        txtAdEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdEkleActionPerformed(evt);
            }
        });

        txtStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStokActionPerformed(evt);
            }
        });
        txtStok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStokKeyReleased(evt);
            }
        });

        txtfiyatEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfiyatEkleActionPerformed(evt);
            }
        });

        list_Stock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ürün Kodu", "Ürün Ad", "Ürün Model", "Ürün Fiyat", "Ürün Adet"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        list_Stock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_StockMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list_Stock);

        btnSil.setBackground(new java.awt.Color(153, 51, 0));
        btnSil.setForeground(new java.awt.Color(255, 255, 255));
        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtStok))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEkle7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtStokEkle))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblEkle3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lblEkle9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblEkle2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(31, 31, 31)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtAdEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtfiyatEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtModelEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnekle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblEkle6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtfiyatguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnguncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblEkle8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtStokGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEkle11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21)
                                        .addComponent(lblkod, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblEkle10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtModelGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblEkle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAdGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(btnAnasayfa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStok)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSil))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEkle2)
                            .addComponent(txtAdEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEkle3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfiyatEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEkle9)
                            .addComponent(txtModelEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEkle7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStokEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnekle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEkle11)
                            .addComponent(lblkod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEkle5)
                            .addComponent(txtAdGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEkle10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfiyatguncelle, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                            .addComponent(lblEkle6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEkle8)
                            .addComponent(txtStokGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnguncelle)))
                .addGap(31, 31, 31)
                .addComponent(btnAnasayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnasayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnasayfaActionPerformed

    }//GEN-LAST:event_btnAnasayfaActionPerformed

    private void btnekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnekleActionPerformed
 
    }//GEN-LAST:event_btnekleActionPerformed

    private void txtAdGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdGuncelleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdGuncelleActionPerformed

    private void txtfiyatguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfiyatguncelleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfiyatguncelleActionPerformed

    private void btnguncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguncelleActionPerformed

    }//GEN-LAST:event_btnguncelleActionPerformed

    private void txtStokEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStokEkleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStokEkleActionPerformed

    private void txtStokGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStokGuncelleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStokGuncelleActionPerformed

    private void txtModelEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelEkleActionPerformed

    }//GEN-LAST:event_txtModelEkleActionPerformed

    private void txtModelGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelGuncelleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelGuncelleActionPerformed

    private void txtAdEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdEkleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdEkleActionPerformed

    private void txtStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStokActionPerformed

    }//GEN-LAST:event_txtStokActionPerformed

    private void txtStokKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStokKeyReleased

    }//GEN-LAST:event_txtStokKeyReleased

    private void txtfiyatEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfiyatEkleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfiyatEkleActionPerformed

    private void list_StockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_StockMouseClicked

    }//GEN-LAST:event_list_StockMouseClicked

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed

    }//GEN-LAST:event_btnSilActionPerformed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnasayfa;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnekle;
    private javax.swing.JButton btnguncelle;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private javax.swing.JLabel lblEkle10;
    private javax.swing.JLabel lblEkle11;
    private javax.swing.JLabel lblEkle2;
    private javax.swing.JLabel lblEkle3;
    private javax.swing.JLabel lblEkle5;
    private javax.swing.JLabel lblEkle6;
    private javax.swing.JLabel lblEkle7;
    private javax.swing.JLabel lblEkle8;
    private javax.swing.JLabel lblEkle9;
    private java.awt.Label lblkod;
    private javax.swing.JTable list_Stock;
    private javax.swing.JTextField txtAdEkle;
    private javax.swing.JTextField txtAdGuncelle;
    private javax.swing.JTextField txtModelEkle;
    private javax.swing.JTextField txtModelGuncelle;
    private javax.swing.JTextField txtStok;
    private javax.swing.JTextField txtStokEkle;
    private javax.swing.JTextField txtStokGuncelle;
    private javax.swing.JTextField txtfiyatEkle;
    private javax.swing.JTextField txtfiyatguncelle;
    // End of variables declaration//GEN-END:variables
}
