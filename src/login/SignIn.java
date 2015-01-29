/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author islamic
 */
public class SignIn extends javax.swing.JFrame {

    Connection Con;
    ResultSet Rs;
    Statement Sta;
    public SignIn() {
        initComponents();
        open_form();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblPwd = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        login = new javax.swing.JButton();
        textUser = new javax.swing.JTextField();
        textPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 255));

        jPanel2.setBackground(new java.awt.Color(0, 255, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(0));

        lblUser.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblUser.setText("Username");

        lblPwd.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        lblPwd.setText("Password");

        cancel.setBackground(new java.awt.Color(255, 0, 204));
        cancel.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cancel.setText("BATAL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(255, 0, 204));
        login.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        login.setText("MASUK");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        textUser.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        textUser.setForeground(new java.awt.Color(0, 0, 255));
        textUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUserActionPerformed(evt);
            }
        });

        textPassword.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        textPassword.setForeground(new java.awt.Color(0, 0, 255));
        textPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPasswordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 204));
        jLabel1.setText("Form Login Apotik");

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 204));
        jLabel2.setText("Copyright@kelompok_1 :)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(login))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textUser, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                        .addComponent(textPassword)))
                .addGap(0, 99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(textUser))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPwd, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(cancel))
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void open_form(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Login_Apotik","root","");      //tempat penyimpanan data username & password yaitu pada my sql(database)
            System.out.println("Koneksi Berhasil");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "gagal koneksi");
            System.out.println("gagal koneksi "+e);
        }
    }
    
    private void textUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUserActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        try{
            String password;
            password = new String(textPassword.getPassword());
            String user = textUser.getText();
            
            Sta = Con.createStatement();
            Rs = Sta.executeQuery("select * from t_fromlogin where username ="
                    +"'"+user+"'"+"and Password='"+password+"'");
            
            int baris = 0;
            while (Rs.next()){
                baris = Rs.getRow();
            }
            if (textUser.getText().equals("") && textPassword.getPassword().equals("")){
                JOptionPane.showMessageDialog(null, "Username dan Password belum diisi");
                textPassword.requestFocus();
            }
            if (baris==1){
                JOptionPane.showMessageDialog(null, "Berhasil");                        // apabila username & password benar maka jalankan perintah ini dan lanjut ke menu selanjutnya
                new TampilanUtama().show();
            }else{
                JOptionPane.showMessageDialog(null, "Login Gagal");                          // apabila username & password salah maka jalankan perintah ini dan tetap di menu awal
                textPassword.setText("");
                textUser.setText("");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_loginActionPerformed

    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        System.exit(0);                                                                      // apabila di klik tombol cancel, maka akan keluar dari menu
    }//GEN-LAST:event_cancelActionPerformed

    private void textPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPwd;
    private javax.swing.JLabel lblUser;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}
