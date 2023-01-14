
package aplikasi_siswabaru;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * AHMAD GUNADI 2010010102
 *
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    String hak;
    public Login() {
        initComponents();
    }
  
    private void kosong(){
        txt_username.setText("");
        txt_password.setText("");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_username = new javax.swing.JTextField();
        btn_keluar = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txt_username.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_username.setBorder(null);
        txt_username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_username.setMargin(new java.awt.Insets(2, 4, 2, 4));
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_username);
        txt_username.setBounds(370, 240, 190, 40);

        btn_keluar.setBackground(new java.awt.Color(204, 0, 0));
        btn_keluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_keluar.setForeground(new java.awt.Color(255, 255, 255));
        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_keluar);
        btn_keluar.setBounds(320, 330, 80, 30);

        btn_login.setBackground(new java.awt.Color(255, 153, 0));
        btn_login.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login);
        btn_login.setBounds(409, 330, 80, 30);

        txt_password.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(null);
        getContentPane().add(txt_password);
        txt_password.setBounds(370, 290, 190, 30);

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setLabel("Register ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(498, 330, 90, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Login.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 900, 430);

        setSize(new java.awt.Dimension(909, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
            try {
            
            Statement statement = (Statement) koneksi.getConnection().createStatement();
            String READ = "SELECT * FROM akun WHERE username='"+txt_username.getText()+"' and password='"+txt_password.getText()+"'";
            ResultSet res = statement.executeQuery(READ);
            
            if(res.next()){
              
                if(txt_username.getText().equals(res.getString("username")) && txt_password.getText().equals(res.getString("password")) && res.getString("role").equals("Admin")){
                    dispose();
                    new Menu2().setVisible(true);              
                }
                else if(txt_username.getText().equals(res.getString("username")) && txt_password.getText().equals(res.getString("password")) && res.getString("role").equals("Petugas")){
                    dispose();
                    new Menu().setVisible(true); 
                }
                else{
                    JOptionPane.showMessageDialog(null, "Username dan Password salah");
                }
            }
            else{
              JOptionPane.showMessageDialog(null, "Username dan Password salah");
 
            }
              
        } catch (HeadlessException | SQLException e) {
              
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
        dispose();
     
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
       
       
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        dispose();
        new Register_Petugas().setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
