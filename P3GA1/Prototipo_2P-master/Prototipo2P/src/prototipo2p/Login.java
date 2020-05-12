/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo2p;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import prototipo2p.Inicio;

/**
 *
 * @author Sucely Alvarez
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        rootPane.setDefaultButton(btnIniciar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pass = new javax.swing.JLabel();
        contra = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        contra.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(java.awt.Color.white);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipo2p/userp.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipo2p/keyp.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(25, 71, 86));
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 97, -1));

        txtContraseña.setBackground(new java.awt.Color(11, 112, 112));
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.setBorder(null);
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 97, -1));

        btnIniciar.setBackground(new java.awt.Color(0, 153, 153));
        btnIniciar.setForeground(new java.awt.Color(0, 153, 153));
        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipo2p/flechap.png"))); // NOI18N
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 86, 77, -1));

        btnRegistro.setBackground(new java.awt.Color(153, 255, 204));
        btnRegistro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistro.setText("Registrarse");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 39));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prototipo2p/fondologin.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "6182");
            PreparedStatement pst = cn.prepareStatement("select * from usuarios where Usuario = ?");
            
            pst.setString(1, txtUsuario.getText().trim());
            //pst.setString(2,txtContraseña.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                pass.setText(rs.getString("Contraseña"));
                
            } else {
                
            }
            
            String password=pass.getText().trim();
            String contrasenia=txtContraseña.getText().trim();
                    
            int c1=Integer.valueOf(password);
            int c2=Integer.valueOf(contrasenia);
                    
            if(c1==c2){
                    new Inicio().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrecta", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Usuario no registrado", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        // TODO add your handling code here:
        Registro registro= new Registro();
        registro.setVisible(true);
        this.setVisible(false);
             
    }//GEN-LAST:event_btnRegistroActionPerformed

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
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel contra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
