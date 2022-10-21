
package otomation_business;


public class Home_page extends javax.swing.JFrame {

    public Home_page() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHosgeldiniz = new java.awt.Label();
        lblhangiislem = new java.awt.Label();
        btnStok = new javax.swing.JButton();
        btncalisan = new javax.swing.JButton();
        btnMüsteri = new javax.swing.JButton();
        btnsatici = new javax.swing.JButton();
        btncikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHosgeldiniz.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblHosgeldiniz.setForeground(new java.awt.Color(102, 51, 0));
        lblHosgeldiniz.setText("Hoş Geldiniz!");

        lblhangiislem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblhangiislem.setForeground(new java.awt.Color(102, 51, 0));
        lblhangiislem.setText("Hangi işlemi yapmak istiyorsunuz ?");

        btnStok.setBackground(new java.awt.Color(0, 102, 102));
        btnStok.setForeground(new java.awt.Color(255, 255, 255));
        btnStok.setText("Stokları Göster");
        btnStok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStokActionPerformed(evt);
            }
        });

        btncalisan.setBackground(new java.awt.Color(0, 102, 102));
        btncalisan.setForeground(new java.awt.Color(255, 255, 255));
        btncalisan.setText("Çalışanları Göster");
        btncalisan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalisanActionPerformed(evt);
            }
        });

        btnMüsteri.setBackground(new java.awt.Color(0, 102, 102));
        btnMüsteri.setForeground(new java.awt.Color(255, 255, 255));
        btnMüsteri.setText("Müşterileri Göster");
        btnMüsteri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMüsteriActionPerformed(evt);
            }
        });

        btnsatici.setBackground(new java.awt.Color(0, 102, 102));
        btnsatici.setForeground(new java.awt.Color(255, 255, 255));
        btnsatici.setText("Satıcıları Göster");
        btnsatici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaticiActionPerformed(evt);
            }
        });

        btncikis.setBackground(new java.awt.Color(153, 0, 0));
        btncikis.setForeground(new java.awt.Color(255, 255, 255));
        btncikis.setText("Çıkış");
        btncikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btncalisan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnsatici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnStok, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(btnMüsteri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(btncikis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblhangiislem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblHosgeldiniz, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblHosgeldiniz, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblhangiislem, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStok)
                    .addComponent(btncalisan))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMüsteri)
                    .addComponent(btnsatici))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btncikis)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStokActionPerformed
        Stock_screen screen = new Stock_screen();
        screen.setVisible(true);
    }//GEN-LAST:event_btnStokActionPerformed

    private void btncalisanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalisanActionPerformed
        Employee_screen screen = new Employee_screen();
        screen.setVisible(true);
    }//GEN-LAST:event_btncalisanActionPerformed

    private void btnMüsteriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMüsteriActionPerformed

    }//GEN-LAST:event_btnMüsteriActionPerformed

    private void btnsaticiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaticiActionPerformed
       Distrubutor_screen screen = new Distrubutor_screen();
       screen.setVisible(true);
    }//GEN-LAST:event_btnsaticiActionPerformed

    private void btncikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncikisActionPerformed

    }//GEN-LAST:event_btncikisActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMüsteri;
    private javax.swing.JButton btnStok;
    private javax.swing.JButton btncalisan;
    private javax.swing.JButton btncikis;
    private javax.swing.JButton btnsatici;
    private java.awt.Label lblHosgeldiniz;
    private java.awt.Label lblhangiislem;
    // End of variables declaration//GEN-END:variables
}
