/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naskraft.main;

/**
 *
 * @author shaha
 */
public class MasterHome extends javax.swing.JFrame {

    /**
     * Creates new form MasterHome
     */
    public MasterHome() {
        initComponents();
         getContentPane().setBackground(new java.awt.Color(161, 191, 240));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_registerUser = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_addPatient = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_searchpatient = new javax.swing.JButton();
        btn_doctormodule = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo-agies.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn_registerUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_registerUser.setText("Register User");
        btn_registerUser.setBorderPainted(false);
        btn_registerUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerUserActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Back to login");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_addPatient.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_addPatient.setText("Patient Module");
        btn_addPatient.setBorderPainted(false);
        btn_addPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addPatientActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Exit");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_searchpatient.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_searchpatient.setText("Search Patient");
        btn_searchpatient.setBorderPainted(false);
        btn_searchpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchpatientActionPerformed(evt);
            }
        });

        btn_doctormodule.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_doctormodule.setText("Doctor Module");
        btn_doctormodule.setBorderPainted(false);
        btn_doctormodule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_doctormoduleActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Home");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo-agies.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btn_addPatient))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btn_searchpatient, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btn_doctormodule))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(100, 100, 100)
                        .addComponent(btn_registerUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btn_addPatient)
                .addGap(24, 24, 24)
                .addComponent(btn_searchpatient)
                .addGap(24, 24, 24)
                .addComponent(btn_doctormodule)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addComponent(btn_registerUser))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         if(GlobalClass.USERTYPE.equals("Doctor"))
        {
        btn_registerUser.setVisible(false);
        btn_doctormodule.setVisible(false);
        }
        if(GlobalClass.USERTYPE.equals("Super Admin"))
        {
        btn_registerUser.setVisible(true);
        }
         if(GlobalClass.USERTYPE.equals(""))
        {
        LoginPage obj = new LoginPage();
        this.setVisible(false);
        obj.setVisible(true);
        }
          if(GlobalClass.USERTYPE.equals("Admin"))
        {
        btn_registerUser.setVisible(false);
        
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         GlobalClass.USERTYPE="";
        LoginPage obj = new LoginPage();
        this.setVisible(false);
        obj.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_addPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addPatientActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Patient().setVisible(true);
    }//GEN-LAST:event_btn_addPatientActionPerformed

    private void btn_registerUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerUserActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new UserModule().setVisible(true);
    }//GEN-LAST:event_btn_registerUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GlobalClass.USERTYPE="";
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_searchpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchpatientActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SearchPatient().setVisible(true);
    }//GEN-LAST:event_btn_searchpatientActionPerformed

    private void btn_doctormoduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_doctormoduleActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new DoctorModule().setVisible(true);
    }//GEN-LAST:event_btn_doctormoduleActionPerformed

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
            java.util.logging.Logger.getLogger(MasterHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addPatient;
    private javax.swing.JButton btn_doctormodule;
    private javax.swing.JButton btn_registerUser;
    private javax.swing.JButton btn_searchpatient;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
