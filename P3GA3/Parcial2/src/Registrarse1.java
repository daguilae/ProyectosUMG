/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import keeptoo.Drag;


/**
 *
 * @author Langas
 */
public class Registrarse1 extends javax.swing.JFrame {

       
    /**
     * Creates new form Registrarse
     */
    public Registrarse1() {
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        btnIniciarSecion = new keeptoo.KButton();
        kButton4 = new keeptoo.KButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Usuario = new javax.swing.JTextField();
        txt_Contraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 0));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 0, 51));
        kGradientPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                kGradientPanel1MouseDragged(evt);
            }
        });
        kGradientPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                kGradientPanel1MousePressed(evt);
            }
        });
        kGradientPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                kGradientPanel1KeyPressed(evt);
            }
        });
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Contraseña");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        btnIniciarSecion.setText("Iniciar Sesion");
        btnIniciarSecion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnIniciarSecion.setkBorderRadius(30);
        btnIniciarSecion.setkFillButton(false);
        btnIniciarSecion.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnIniciarSecion.setkHoverStartColor(new java.awt.Color(0, 51, 51));
        btnIniciarSecion.setkStartColor(new java.awt.Color(255, 255, 255));
        btnIniciarSecion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSecionMouseClicked(evt);
            }
        });
        btnIniciarSecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSecionActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnIniciarSecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 110, 40));

        kButton4.setText("Registrase");
        kButton4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        kButton4.setkBorderRadius(30);
        kButton4.setkFillButton(false);
        kButton4.setkForeGround(new java.awt.Color(204, 204, 204));
        kButton4.setkHoverForeGround(new java.awt.Color(204, 204, 204));
        kButton4.setkHoverStartColor(new java.awt.Color(0, 51, 51));
        kButton4.setkStartColor(new java.awt.Color(255, 255, 255));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 110, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("x");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, 10, 20));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Geovani\\Desktop\\LABORATORIO12MAYO\\P3GA3\\Parcial2\\src\\Imagenes\\Mariano.png")); // NOI18N
        jLabel4.setText("LOGIN");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 80));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Admin.png"))); // NOI18N
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 50, 70));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Usuario");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        txt_Usuario.setBackground(new Color(0,0,0,0));
        txt_Usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_Usuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_Usuario.setOpaque(false);
        txt_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsuarioActionPerformed(evt);
            }
        });
        kGradientPanel1.add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 290, 30));

        txt_Contraseña.setBackground(new Color(0,0,0,0));
        txt_Contraseña.setForeground(new java.awt.Color(255, 255, 255));
        txt_Contraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txt_Contraseña.setOpaque(false);
        kGradientPanel1.add(txt_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 290, 30));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 995, 574));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kGradientPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kGradientPanel1KeyPressed
        // TODO add your handling code here:   new Drag(kGradientPanel1).moveWindow(evt);
    }//GEN-LAST:event_kGradientPanel1KeyPressed

    private void kGradientPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MouseDragged
        // TODO add your handling code here:
        //Drag
        new Drag(kGradientPanel1).moveWindow(evt);
       
    }//GEN-LAST:event_kGradientPanel1MouseDragged

    private void kGradientPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel1MousePressed
        // TODO add your handling code here:
        //Aveces cuando pasa el mosue
        new Drag(kGradientPanel1).onPress(evt);
        
    }//GEN-LAST:event_kGradientPanel1MousePressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
  
       NUEVO_REGISTRO1 ventana = new NUEVO_REGISTRO1();
       ventana.setVisible(true);
       this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_kButton4ActionPerformed

    private void txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsuarioActionPerformed

    private void btnIniciarSecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSecionActionPerformed

        if ( txt_Usuario.getText().isEmpty() || txt_Contraseña.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, " NO SE PUEDE DEJAR CAMPOS VACIOS");

            txt_Usuario.setText("");
            txt_Contraseña.setText("");
        }
        else {

            try{

        Connection cn = DriverManager.getConnection(Principal.BD,Principal.Usuario,Principal.Contraseña);

                PreparedStatement pst = cn.prepareStatement("select * from usuarios  where NombreUsuario = ?");

                pst.setString(1, txt_Usuario.getText().trim());
                ResultSet rs = pst.executeQuery();

                PreparedStatement pst2 = cn.prepareStatement("select * from usuarios  where Pass = ?");

                pst2.setString(1, txt_Contraseña.getText().trim());
                ResultSet rs2 = pst2.executeQuery();

                if(rs.next()){

                    if(rs2.next()){
                        JOptionPane.showMessageDialog(null, "Bienvenido" + "    " + rs.getString("NombreUsuario"));

                        Principal ventana = new  Principal();
                        ventana.setVisible(true);
                        this.dispose();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "No registrado.");
                    txt_Usuario.setText("");
                    txt_Contraseña.setText("");

                }

            }catch(Exception e){

            }
        
        }                // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarSecionActionPerformed

    private void btnIniciarSecionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSecionMouseClicked

       




// TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarSecionMouseClicked

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
            java.util.logging.Logger.getLogger(Registrarse1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnIniciarSecion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private keeptoo.KButton kButton4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPasswordField txt_Contraseña;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
