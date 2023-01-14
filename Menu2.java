
package aplikasi_siswabaru;

/**
 * AHMAD GUNADI 2010010102
 */
public class Menu2 extends javax.swing.JFrame {

    /**
     * Creates new form Menu2
     */
    
     public Menu2() {
        initComponents();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Guru = new javax.swing.JButton();
        btn_akun1 = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        btnSiswaBaru = new javax.swing.JButton();
        btn_laporan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_menu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 327));
        getContentPane().setLayout(null);

        btn_Guru.setBackground(new java.awt.Color(0, 153, 255));
        btn_Guru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Data Guru Pengajar.png"))); // NOI18N
        btn_Guru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuruActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Guru);
        btn_Guru.setBounds(240, 90, 200, 200);

        btn_akun1.setBackground(new java.awt.Color(0, 153, 255));
        btn_akun1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btn_akun1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Kelola Akun.png"))); // NOI18N
        btn_akun1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_akun1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_akun1);
        btn_akun1.setBounds(30, 90, 200, 200);

        btn_keluar.setBackground(new java.awt.Color(204, 0, 0));
        btn_keluar.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        btn_keluar.setForeground(new java.awt.Color(255, 255, 255));
        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_keluar);
        btn_keluar.setBounds(360, 330, 180, 29);

        btnSiswaBaru.setBackground(new java.awt.Color(0, 153, 255));
        btnSiswaBaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/DF Barang Sekolah.png"))); // NOI18N
        btnSiswaBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiswaBaruActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiswaBaru);
        btnSiswaBaru.setBounds(660, 90, 200, 200);

        btn_laporan.setBackground(new java.awt.Color(0, 153, 255));
        btn_laporan.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        btn_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/L SISAWA.png"))); // NOI18N
        btn_laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_laporanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_laporan);
        btn_laporan.setBounds(450, 90, 200, 200);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/BG.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 890, 427);

        lbl_menu.setText("Admin");
        getContentPane().add(lbl_menu);
        lbl_menu.setBounds(10, 214, 29, 14);

        setSize(new java.awt.Dimension(904, 463));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_akun1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_akun1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Akun ().setVisible(true);
    }//GEN-LAST:event_btn_akun1ActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
        dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_laporanActionPerformed
        // TODO add your handling code here:
      dispose();
        new Data_SiswaBaru().setVisible(true);
        
    }//GEN-LAST:event_btn_laporanActionPerformed

    private void btn_GuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuruActionPerformed
        dispose();
        new Data_Guru().setVisible(true);
    }//GEN-LAST:event_btn_GuruActionPerformed

    private void btnSiswaBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiswaBaruActionPerformed
       dispose();
        new Data_Barang().setVisible(true);
    }//GEN-LAST:event_btnSiswaBaruActionPerformed

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
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSiswaBaru;
    private javax.swing.JButton btn_Guru;
    private javax.swing.JButton btn_akun1;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_laporan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_menu;
    // End of variables declaration//GEN-END:variables
}
