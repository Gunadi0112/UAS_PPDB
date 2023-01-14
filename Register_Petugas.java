
package aplikasi_siswabaru;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * AHMAD GUNADI 2010010102
 * 
 */
public class Register_Petugas extends javax.swing.JFrame {

    /**
     * Creates new form Akun
     */
    public Register_Petugas() {
        initComponents();
        tampil();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_akun = new javax.swing.JTable();
        txt_nama = new javax.swing.JTextField();
        cmb_role = new javax.swing.JComboBox<>();
        txt_user = new javax.swing.JTextField();
        txt_pass = new javax.swing.JPasswordField();
        btn_refresh = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txt_nama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nama.setBorder(null);
        getContentPane().add(txt_nama);
        txt_nama.setBounds(360, 196, 210, 20);

        cmb_role.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmb_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- PILIH --", "Petugas" }));
        getContentPane().add(cmb_role);
        cmb_role.setBounds(320, 280, 270, 30);

        txt_user.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_user.setBorder(null);
        getContentPane().add(txt_user);
        txt_user.setBounds(360, 224, 210, 20);

        txt_pass.setBorder(null);
        getContentPane().add(txt_pass);
        txt_pass.setBounds(360, 254, 210, 20);

        btn_refresh.setBackground(new java.awt.Color(255, 153, 0));
        btn_refresh.setForeground(new java.awt.Color(255, 255, 255));
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        getContentPane().add(btn_refresh);
        btn_refresh.setBounds(510, 320, 80, 23);

        btn_simpan.setBackground(new java.awt.Color(255, 153, 0));
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_simpan);
        btn_simpan.setBounds(310, 320, 100, 23);

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(423, 320, 74, 23);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/REGISTER.jpg"))); // NOI18N
        jLabel7.setText("\n");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 890, 420);

        lbl_id.setText("ID");
        getContentPane().add(lbl_id);
        lbl_id.setBounds(670, 370, 11, 14);

        setSize(new java.awt.Dimension(904, 461));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void refresh(){
        txt_nama.setText("");
        txt_user.setText("");
        txt_pass.setText("");
        cmb_role.setSelectedIndex(0);
        lbl_id.setText("");
        tampil();
    }
    private void tampil(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("ID");
        tbl.addColumn("Nama");
        tbl.addColumn("Username");
        tbl.addColumn("Password");
        tbl.addColumn("Role");
        tbl_akun.setModel(tbl);
        try {
            Statement statement = (Statement) koneksi.getConnection().createStatement();
            ResultSet res = statement.executeQuery("SELECT * FROM akun");
            int no = 0;
            while (res.next()) {
                tbl.addRow(new Object[]{
                    
                    res.getString("id"),
                    res.getString("nama"),
                    res.getString("username"),
                    res.getString("password"),
                    res.getString("role"),
                          
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
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void tbl_akunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_akunMouseClicked
        // TODO add your handling code here:
        int i = tbl_akun.getSelectedRow();
        if (i==-1){
            return;
        }

        
         String id = (String) tbl_akun.getValueAt(i,0);
        lbl_id.setText(id);
        
        String nama = (String) tbl_akun.getValueAt(i,1);
        txt_nama.setText(nama);

        String user = (String) tbl_akun.getValueAt(i,2);
        txt_user.setText(user);
         String pass = (String) tbl_akun.getValueAt(i,3);
        txt_pass.setText(pass);
        
        String role =(String) tbl_akun.getValueAt(i,4);
        if (role.equals("Admin")) {
            cmb_role.setSelectedIndex(1);
        } else if (role.equals("Petugas")) {
            cmb_role.setSelectedIndex(2);
        }

 

        
    }//GEN-LAST:event_tbl_akunMouseClicked

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        String nama, username, password, role, INSERT;

        nama = txt_nama.getText();
        username = txt_user.getText();
        password = txt_pass.getText();
        role = (String) cmb_role.getSelectedItem();
        
        try {
            Statement statement;
            statement = (Statement) koneksi.getConnection().createStatement();
            INSERT = "INSERT INTO akun VALUES (null,'"+nama+"','"+username+"','"+password+"','"+role+"')";
            statement.executeUpdate(INSERT);
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
            refresh();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Data Gagal Disimpan"+e.getMessage());
        }

    }//GEN-LAST:event_btn_simpanActionPerformed

    
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
            java.util.logging.Logger.getLogger(Register_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_Petugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox<String> cmb_role;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTable tbl_akun;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

    private void masuk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
