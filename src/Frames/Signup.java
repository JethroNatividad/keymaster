package Frames;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Util.DBConnection;
import Util.Validator;
import java.awt.event.KeyEvent;

//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jet
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Signup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        TextLabel = new javax.swing.JLabel();
        inputLabel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        EmailTextField = new javax.swing.JTextField();
        inputLabel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        inputLabel3 = new javax.swing.JPanel();
        SignupBtn = new javax.swing.JButton();
        inputLabel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LoginBtn = new javax.swing.JLabel();
        inputLabel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        RepeatPasswordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(549, 549));

        MainPanel.setBackground(new java.awt.Color(246, 247, 249));
        MainPanel.setForeground(new java.awt.Color(13, 15, 18));

        titlePanel.setBackground(new java.awt.Color(246, 247, 249));
        titlePanel.setLayout(new java.awt.BorderLayout(0, 10));

        TitleLabel.setFont(TitleLabel.getFont().deriveFont(TitleLabel.getFont().getStyle() | java.awt.Font.BOLD));
        TitleLabel.setForeground(new java.awt.Color(13, 15, 18));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-key-60.png"))); // NOI18N
        TitleLabel.setText("<html><p style='font-size:40px'><span style='font-weight:bold'>Key</span><span style='font-weight:thin'>master</span></p></html>\n");
        titlePanel.add(TitleLabel, java.awt.BorderLayout.CENTER);

        TextLabel.setFont(TextLabel.getFont().deriveFont(TextLabel.getFont().getSize()+3f));
        TextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextLabel.setText("Create a new vault to securely store your passwords.");
        titlePanel.add(TextLabel, java.awt.BorderLayout.PAGE_END);

        inputLabel.setBackground(new java.awt.Color(246, 247, 249));
        inputLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 30, 1, 30));
        inputLabel.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getSize()+1f));
        jLabel3.setText("Email Address");
        inputLabel.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        EmailTextField.setBackground(new java.awt.Color(216, 221, 228));
        EmailTextField.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        EmailTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        EmailTextField.setMargin(new java.awt.Insets(2, 10, 2, 6));
        EmailTextField.setPreferredSize(new java.awt.Dimension(78, 38));
        EmailTextField.setSize(new java.awt.Dimension(78, 38));
        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });
        inputLabel.add(EmailTextField, java.awt.BorderLayout.PAGE_END);

        inputLabel1.setBackground(new java.awt.Color(246, 247, 249));
        inputLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 30, 1, 30));
        inputLabel1.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getSize()+1f));
        jLabel4.setText("Master Password");
        inputLabel1.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        PasswordField.setBackground(new java.awt.Color(216, 221, 228));
        PasswordField.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        PasswordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        PasswordField.setPreferredSize(new java.awt.Dimension(90, 38));
        inputLabel1.add(PasswordField, java.awt.BorderLayout.CENTER);

        inputLabel3.setBackground(new java.awt.Color(246, 247, 249));
        inputLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 30, 1, 30));
        inputLabel3.setLayout(new java.awt.BorderLayout(0, 5));

        SignupBtn.setBackground(new java.awt.Color(56, 68, 81));
        SignupBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        SignupBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignupBtn.setText("Create Vault");
        SignupBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        SignupBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignupBtn.setPreferredSize(new java.awt.Dimension(78, 38));
        SignupBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupBtnMouseClicked(evt);
            }
        });
        SignupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupBtnActionPerformed(evt);
            }
        });
        inputLabel3.add(SignupBtn, java.awt.BorderLayout.CENTER);

        inputLabel4.setBackground(new java.awt.Color(246, 247, 249));
        inputLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 30, 1, 30));
        inputLabel4.setLayout(new java.awt.BorderLayout(0, 5));
        inputLabel4.add(jSeparator1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(246, 247, 249));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 15, 18));
        jLabel1.setText("Already have a vault?");

        LoginBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(98, 118, 141));
        LoginBtn.setText("Unlock here");
        LoginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginBtn)
                .addGap(0, 306, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LoginBtn))
                .addGap(37, 37, 37))
        );

        inputLabel4.add(jPanel1, java.awt.BorderLayout.CENTER);

        inputLabel5.setBackground(new java.awt.Color(246, 247, 249));
        inputLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 30, 1, 30));
        inputLabel5.setLayout(new java.awt.BorderLayout(0, 5));

        jLabel5.setFont(jLabel5.getFont().deriveFont(jLabel5.getFont().getSize()+1f));
        jLabel5.setText("Repeat Master Password");
        inputLabel5.add(jLabel5, java.awt.BorderLayout.PAGE_START);

        RepeatPasswordField.setBackground(new java.awt.Color(216, 221, 228));
        RepeatPasswordField.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        RepeatPasswordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        RepeatPasswordField.setPreferredSize(new java.awt.Dimension(90, 38));
        RepeatPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                RepeatPasswordFieldKeyPressed(evt);
            }
        });
        inputLabel5.add(RepeatPasswordField, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(titlePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inputLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inputLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inputLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inputLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(inputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void SignupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignupBtnActionPerformed

    private void LoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseClicked
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_LoginBtnMouseClicked

    private void SignupWithEmailAndPassword(){
        try {
            Connection con = (new DBConnection()).getConnection();
            Validator validator = new Validator();
            
            // Search for existing emails
            String email = EmailTextField.getText();
            if(!validator.isEmail(email)){
                JOptionPane.showMessageDialog(rootPane, "Invalid Email Address");
                return;
            }
            
            String password = new String(PasswordField.getPassword());
            if(password.length() < 8) {
                JOptionPane.showMessageDialog(rootPane, "The password should be at least 8 characters long");
                return;
            }
            
            String repeatPassword = new String(RepeatPasswordField.getPassword());
            if(!password.equals(repeatPassword)){
                JOptionPane.showMessageDialog(rootPane, "Passwords does not match");
                return;
            }
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("SELECT * FROM users WHERE email = ?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                // Alert email already taken
                System.err.println("Found");
                JOptionPane.showMessageDialog(rootPane, "An account with that email already exists.");

            } else {
                // continue
                ps = (PreparedStatement) con.prepareStatement("INSERT INTO `users` (`email`, `password`) VALUES (?,?);");
                ps.setString(1, email);
                // TODO: Hash password
//                PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

                // Example: Encoding a password
//                String rawPassword = "user123";
//                String encodedPassword = passwordEncoder.encode(rawPassword);
//                System.out.println("Encoded Password: " + encodedPassword);

                // Example: Verifying a password
//                boolean isPasswordMatch = passwordEncoder.matches(rawPassword, encodedPassword);
//                System.out.println("Password Match: " + isPasswordMatch);
                ps.setString(2, password);
                
                ps.execute();
                System.out.println("Created account");
                JOptionPane.showMessageDialog(rootPane, "Account created! Please Login");
                Login login = new Login();
                login.setVisible(true);
                dispose();
            }
            
          
        } catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
        

    private void SignupBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupBtnMouseClicked
        // TODO add your handling code here:
        SignupWithEmailAndPassword();
    }//GEN-LAST:event_SignupBtnMouseClicked

    private void RepeatPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RepeatPasswordFieldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            System.out.println("Enter key pressed");
            SignupWithEmailAndPassword();

        }
    }//GEN-LAST:event_RepeatPasswordFieldKeyPressed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JLabel LoginBtn;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JPasswordField RepeatPasswordField;
    private javax.swing.JButton SignupBtn;
    private javax.swing.JLabel TextLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel inputLabel;
    private javax.swing.JPanel inputLabel1;
    private javax.swing.JPanel inputLabel3;
    private javax.swing.JPanel inputLabel4;
    private javax.swing.JPanel inputLabel5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
