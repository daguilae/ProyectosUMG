/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipo2p;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Brayan Cifuentes
 */
public class Facultades extends javax.swing.JInternalFrame {

    /**
     * Creates new form Empleados
     */
    String BD = "jdbc:mysql://localhost/siu";
    String Usuario = "root";
    String Clave = "6182";

    public Facultades() {
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

        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_estatus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Facultades");
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Codigo Facultad:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(204, 255, 255));
        txt_nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 111, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre Facultad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        txt_codigo.setBackground(new java.awt.Color(204, 255, 255));
        txt_codigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 111, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Estatus Facultad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        txt_estatus.setBackground(new java.awt.Color(204, 255, 255));
        txt_estatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_estatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estatusActionPerformed(evt);
            }
        });
        getContentPane().add(txt_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 111, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ingresa el código de facultades: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        txt_buscar.setBackground(new java.awt.Color(204, 255, 255));
        txt_buscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 40, 530, 30));

        jButton4.setBackground(new java.awt.Color(141, 141, 208));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busquedap.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 60, 50));

        jButton1.setBackground(new java.awt.Color(141, 141, 208));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardarp.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 70, 40));

        jButton2.setBackground(new java.awt.Color(141, 141, 208));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 60, 40));

        jButton3.setBackground(new java.awt.Color(141, 141, 208));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 70, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoform.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-370, -300, 1000, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void txt_estatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estatusActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//Codigo que permite consultar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("select * from facultades where codigo_facultad = ?");
            pst.setString(1, txt_buscar.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_codigo.setText(rs.getString("codigo_facultad"));
                txt_nombre.setText(rs.getString("nombre_facultad"));
                txt_estatus.setText(rs.getString("estatus_facultad"));
                //txt_direccion.setText(rs.getString("Direccion"));

            } else {
                JOptionPane.showMessageDialog(null, "Facultad no registrado.");
            }

        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Codigo que permite insertar registros en al base de datos
        try {
            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("insert into facultades values(?,?,?)");

            pst.setString(1, txt_codigo.getText().trim());
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_estatus.getText().trim());

            pst.executeUpdate();

            txt_codigo.setText("");
            txt_nombre.setText("");
            txt_estatus.setText("");

           JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
 JOptionPane.showMessageDialog(this, "Error en registro", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Codigo que permite modificar registros en la base de datos
        try {
            String ID = txt_buscar.getText().trim();

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("update facultades set codigo_facultad = ?, nombre_facultad=?, estatus_facultad=? where codigo_facultad = " + ID);

            pst.setString(1, txt_codigo.getText().trim());
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_estatus.getText().trim());

            pst.executeUpdate();

            txt_codigo.setText("");
            txt_nombre.setText("");
            txt_estatus.setText("");

            JOptionPane.showMessageDialog(this, "¡MODIFICACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
 JOptionPane.showMessageDialog(this, "Error en modificación", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }               
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//Codigo que permite borrar registros en la base de datos
        try {

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("delete from facultades where codigo_facultad = ?");

            pst.setString(1, txt_buscar.getText().trim());
            pst.executeUpdate();

            txt_codigo.setText("");
            txt_nombre.setText("");
            txt_estatus.setText("");
            

           JOptionPane.showMessageDialog(this, "¡ELIMINACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
 JOptionPane.showMessageDialog(this, "Error en eliminación", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }               
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_estatus;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
