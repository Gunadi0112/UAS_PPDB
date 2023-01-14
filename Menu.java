
package aplikasi_siswabaru;

public class Menu extends javax.swing.JFrame {

    /**
     * AHMAD GUNADI 2010010102
     */
    public Menu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_daftar = new javax.swing.JButton();
        btn_laporan = new javax.swing.JButton();
        btn_laporan1 = new javax.swing.JButton();
        lbl_menu = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btn_daftar.setBackground(new java.awt.Color(0, 153, 255));
        btn_daftar.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btn_daftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/DF SISWA.png"))); // NOI18N
        btn_daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_daftarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_daftar);
        btn_daftar.setBounds(250, 130, 180, 170);

        btn_laporan.setBackground(new java.awt.Color(0, 153, 255));
        btn_laporan.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btn_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/L SISAWA.png"))); // NOI18N
        btn_laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_laporanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_laporan);
        btn_laporan.setBounds(490, 130, 180, 170);

        btn_laporan1.setBackground(new java.awt.Color(204, 0, 0));
        btn_laporan1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_laporan1.setForeground(new java.awt.Color(255, 255, 255));
        btn_laporan1.setText("KELUAR");
        btn_laporan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_laporan1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_laporan1);
        btn_laporan1.setBounds(400, 310, 121, 31);

        lbl_menu.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbl_menu.setText("PETUGAS INPUT");
        getContentPane().add(lbl_menu);
        lbl_menu.setBounds(730, 10, 150, 30);

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/BG.jpg"))); // NOI18N
        getContentPane().add(BG);
        BG.setBounds(0, 0, 893, 420);

        setSize(new java.awt.Dimension(910, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_daftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_daftarActionPerformed
        // TODO add your handling code here:
        dispose();
        new Daftar().setVisible(true);
    }//GEN-LAST:event_btn_daftarActionPerformed

    private void btn_laporan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_laporan1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_laporan1ActionPerformed

    private void btn_laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_laporanActionPerformed
        // TODO add your handling code here:
        dispose();
        String isi = lbl_menu.getText();
        Laporan lbl_hak = new Laporan(isi);
        lbl_hak.setVisible(true);
        
    }//GEN-LAST:event_btn_laporanActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton btn_daftar;
    private javax.swing.JButton btn_laporan;
    private javax.swing.JButton btn_laporan1;
    private javax.swing.JLabel lbl_menu;
    // End of variables declaration//GEN-END:variables
}
