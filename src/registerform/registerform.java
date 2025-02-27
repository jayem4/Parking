/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerform;

import dbConnect.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import login.LoginForm;
import parking.admin;

/**
 *
 * @author Gwapo ko
 */
public class registerform extends javax.swing.JFrame {

    /**
     * Creates new form registerform
     */
    public registerform() {
        initComponents();
    }

    public static String em, usname;
    public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
        
       try{
           String query = "SELECT * FROM user  WHERE u_username = '" +username.getText()+ "' OR u_email = '" + license.getText()+ "'";
            ResultSet resultSet = dbc.getData(query);
     if (resultSet.next()) {
    usname = resultSet.getString("u_username");
    if (usname.equals(username.getText())) {
        JOptionPane.showMessageDialog(null, "Username is Already Used! ");
        username.setText("");
        return true;
    }
} else {
    return false;
}
} catch (SQLException ex) {
    System.out.println("" + ex);
    return false;
}
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        license = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        password1 = new javax.swing.JTextField();
        type1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        time = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("First Name: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 70, 20));

        jLabel2.setText("Last Name: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 70, 20));

        jLabel3.setText("License num:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 80, 20));

        jLabel4.setText("Username: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 60, 20));

        jLabel5.setText("Type of Vehicle:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 100, 20));

        jLabel7.setText("Type: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 60, 20));
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 140, 30));
        getContentPane().add(license, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 140, 30));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 140, 30));
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 140, 30));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 135, -1));

        jButton1.setText("Register");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, 110, 30));

        jLabel8.setText("Click here! Login Form.");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 250, 20));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel10.setText("REGISTRATION FORM");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 530, 60));

        jLabel11.setText("Password: ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 60, 20));

        password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password1ActionPerformed(evt);
            }
        });
        getContentPane().add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 140, 30));
        getContentPane().add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 150, 30));

        jButton3.setText("Admin");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 80, 30));

        jLabel6.setText("TIME:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 320, 130, -1));

        jPanel3.setBackground(new java.awt.Color(0, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/registerform/images (1).png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed

    }//GEN-LAST:event_typeActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(fname.getText().isEmpty()|| lname.getText().isEmpty()|| license.getText().isEmpty()
            ||username.getText().isEmpty()||password1.getText().isEmpty()|| type1.getText().isEmpty()|| time.getText().isEmpty()|| license.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required! ");
        }else if(password1.getText().length()<8){
            JOptionPane.showMessageDialog(null, "Password character should be 8 above.");
            password1.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exit! ");
        }else{
            dbConnector dbc = new dbConnector();
            if(dbc.insertData("INSERT INTO user(u_fname,u_lname,u_lnum,u_username,u_password,u_type,u_typeofvehicle,u_time, status)"
                + "VALUES('"+fname.getText()+"','"+lname.getText()+"','"+license.getText()+"','"+username.getText()+"',"
                + "'"+password1.getText()+"','"+type.getSelectedItem()+"','"+type1.getText()+"','"+time.getText()+"','Pending')")){
            JOptionPane.showMessageDialog(null, "Inserted Successfully");
        }else{
            JOptionPane.showMessageDialog(null, "Connection Error!");
        }
        }
        LoginForm lgf = new LoginForm();
        lgf.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        LoginForm lf = new LoginForm();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        admin ad = new admin();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField license;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField password1;
    private javax.swing.JTextField time;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField type1;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
