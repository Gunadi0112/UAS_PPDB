
package aplikasi_siswabaru;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 * AHMAD GUNADI 2010010102
 * 
 */
public class Data_Barang extends javax.swing.JFrame {

    /**
     * Creates new form Akun
     */
    public Data_Barang() {
        initComponents();
        tampil();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_akun = new javax.swing.JTable();
        lbl_id = new javax.swing.JLabel();
        txt_cetak = new javax.swing.JTextField();
        btn_cetak = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tbl_akun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_akun.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_akun.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        tbl_akun.setShowHorizontalLines(false);
        tbl_akun.setShowVerticalLines(false);
        tbl_akun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_akunMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_akun);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 90, 890, 290);

        lbl_id.setText("ID");
        getContentPane().add(lbl_id);
        lbl_id.setBounds(514, 259, 11, 14);
        getContentPane().add(txt_cetak);
        txt_cetak.setBounds(420, 50, 270, 30);

        btn_cetak.setBackground(new java.awt.Color(255, 153, 0));
        btn_cetak.setForeground(new java.awt.Color(255, 255, 255));
        btn_cetak.setText("CETAK");
        btn_cetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cetakActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cetak);
        btn_cetak.setBounds(690, 50, 80, 30);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(780, 50, 90, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/BG.jpg"))); // NOI18N
        jLabel7.setText("\n");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 890, 420);

        setSize(new java.awt.Dimension(904, 461));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void refresh(){

        lbl_id.setText("");
        tampil();
    }
    private void tampil(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID BARANG");
        tbl.addColumn("NAMA BARANG");
        tbl.addColumn("JUMLAH");
        tbl.addColumn("TANGGAL");
        
        tbl_akun.setModel(tbl);
        try {
            Statement statement = (Statement) koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM barang");
            int no = 0;
            while (res.next()) {
                tbl.addRow(new Object[]{
                    
                    res.getString("id_barang"),
                    res.getString("nama_barang"),
                    res.getString("jumlah"),
                    res.getString("tanggal"),
                    
                          
                });
                tbl_akun.setModel(tbl);
                no++;   
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane,"Gagal Menampilkan Data");
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        refresh();
        dispose();
        new Menu2().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_akunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_akunMouseClicked
        // TODO add your handling code here:
        int i = tbl_akun.getSelectedRow();
        if (i==-1){
            return;
        }

        
         String id = (String) tbl_akun.getValueAt(i,0);
        lbl_id.setText(id);
        
        
        
     
    }//GEN-LAST:event_tbl_akunMouseClicked

    private void btn_cetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cetakActionPerformed
       
        try {
            String report = ("src/aplikasi_siswabaru/cetak_barang.jrxml");
            HashMap hash = new HashMap();
            hash.put("id_barang", txt_cetak.getText());
            JasperReport JRpt = JasperCompileManager.compileReport(report);
            JasperPrint JPrint = JasperFillManager.fillReport(JRpt, hash, koneksi.getConnection());
            JasperViewer.viewReport(JPrint, false);
        } catch (JRException e) {
            
        }
    }//GEN-LAST:event_btn_cetakActionPerformed

    
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
            java.util.logging.Logger.getLogger(Data_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cetak;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTable tbl_akun;
    private javax.swing.JTextField txt_cetak;
    // End of variables declaration//GEN-END:variables

    private void masuk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
