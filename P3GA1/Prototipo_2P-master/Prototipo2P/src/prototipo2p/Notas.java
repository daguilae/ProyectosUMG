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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Brayan Cifuentes
 */
public class Notas extends javax.swing.JInternalFrame {

    /**
     * Creates new form Empleados
     */
    String BD = "jdbc:mysql://localhost/siu";
    String Usuario = "root";
    String Clave = "admin";

    public Notas() {
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

        txt_codigocurso = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_codigoalumno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_nombrecurso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_tiponota = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_nota = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbl_estatus = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_notas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbl_incremento = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Notas");
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_codigocurso.setBackground(new java.awt.Color(204, 255, 255));
        txt_codigocurso.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_codigocurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigocursoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_codigocurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 85, 111, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Codigo Curso:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 84, -1, -1));

        txt_codigoalumno.setBackground(new java.awt.Color(204, 255, 255));
        txt_codigoalumno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_codigoalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoalumnoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_codigoalumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 48, 111, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre Curso:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 121, -1, -1));

        txt_nombrecurso.setBackground(new java.awt.Color(204, 255, 255));
        txt_nombrecurso.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_nombrecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombrecursoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombrecurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 122, 111, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Tipo Nota: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 151, -1, -1));

        txt_tiponota.setBackground(new java.awt.Color(204, 255, 255));
        txt_tiponota.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_tiponota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tiponotaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tiponota, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 152, 111, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Nota (pts) : ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 192, -1, -1));

        txt_nota.setBackground(new java.awt.Color(204, 255, 255));
        txt_nota.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_notaActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 193, 111, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(141, 141, 208));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 20, 50, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Ingrese el Carnet alumno: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txt_buscar.setBackground(new java.awt.Color(204, 255, 255));
        txt_buscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        jPanel1.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 106, 31));

        jButton4.setBackground(new java.awt.Color(141, 141, 208));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busquedap.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 50, 40));

        jButton1.setBackground(new java.awt.Color(141, 141, 208));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardarp.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 20, 50, 40));

        jButton2.setBackground(new java.awt.Color(141, 141, 208));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 20, 50, 40));

        lbl_estatus.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jPanel1.add(lbl_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 138, 240, 29));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 240, -1, -1));

        jButton5.setBackground(new java.awt.Color(141, 141, 208));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busquedap.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 66, 55, 40));

        Tbl_notas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo Nota", "Carnet Alumno", "Codigo Curso", "Nombre Curso", "Tipo Nota", "Nota"
            }
        ));
        Tbl_notas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_notasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_notas);
        if (Tbl_notas.getColumnModel().getColumnCount() > 0) {
            Tbl_notas.getColumnModel().getColumn(0).setHeaderValue("Codigo Nota");
            Tbl_notas.getColumnModel().getColumn(1).setHeaderValue("Carnet Alumno");
            Tbl_notas.getColumnModel().getColumn(2).setHeaderValue("Codigo Curso");
            Tbl_notas.getColumnModel().getColumn(3).setHeaderValue("Nombre Curso");
            Tbl_notas.getColumnModel().getColumn(4).setHeaderValue("Tipo Nota");
            Tbl_notas.getColumnModel().getColumn(5).setHeaderValue("Nota");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 58, 550, 130));

        jLabel1.setText("Buscar Curso");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));
        getContentPane().add(lbl_incremento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 100, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Carnet Alumno:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 47, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("                        Para modificar:\n1. Debe buscar el carnet del alumno\n2. Luego seleccionar la fila de la tabla \n3. Modificar los campos necesarios\n4. Darle click al boton Modificar (Icono del \n    Lápiz).");
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 350, 120));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoform.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -340, 970, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigocursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigocursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigocursoActionPerformed

    private void txt_codigoalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoalumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoalumnoActionPerformed

    private void txt_nombrecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombrecursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombrecursoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);

            PreparedStatement pstt4 = cn.prepareStatement("select * from notas where carnet_alumno=?");
            pstt4.setString(1, txt_buscar.getText().trim());

            ResultSet rss4 = pstt4.executeQuery();

            // hacer la copia del query para que la tabla empiece desde 1
            PreparedStatement ps = cn.prepareStatement("select * from notas where carnet_alumno=?");
            ps.setString(1, txt_buscar.getText().trim());

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                
                DefaultTableModel modelo = new DefaultTableModel();
                
                modelo.addColumn("codigo_notas");
                modelo.addColumn("carnet_alumno");
                modelo.addColumn("codigo_curso");
                modelo.addColumn("nombre_curso");
                modelo.addColumn("tipo_nota");
                modelo.addColumn("nota");

                Tbl_notas.setModel(modelo);
                
                String[] dato = new String[6];

                while (rss4.next()) {
                    dato[0] = rss4.getString(1);
                    dato[1] = rss4.getString(2);
                    dato[2] = rss4.getString(3);
                    dato[3] = rss4.getString(4);
                    dato[4] = rss4.getString(5);
                    dato[5] = rss4.getString(6);

                    modelo.addRow(dato);

                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Alumno no RegistradoBray");
            }

        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//Codigo que permite insertar registros en al base de datos
        try {

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("insert into notas values(?,?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, txt_codigoalumno.getText().trim());
            pst.setString(3, txt_codigocurso.getText().trim());
            pst.setString(4, txt_nombrecurso.getText().trim());
            pst.setString(5, txt_tiponota.getText().trim());
            pst.setString(6, txt_nota.getText().trim());

            pst.executeUpdate();

            lbl_incremento.setText("");
            txt_codigoalumno.setText("");
            txt_codigocurso.setText("");
            txt_nombrecurso.setText("");
            txt_tiponota.setText("");
            txt_nota.setText("");

            lbl_estatus.setText("Registro exitoso.");
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//Codigo que permite modificar registros en la base de datos
        try {
            String ID = lbl_incremento.getText().trim();

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("update notas set codigo_notas=?, carnet_alumno= ?, codigo_curso=?, nombre_curso=?, tipo_nota=?, nota=? where codigo_notas = " + ID);

            pst.setString(1, lbl_incremento.getText().trim());
            pst.setString(2, txt_codigoalumno.getText().trim());
            pst.setString(3, txt_codigocurso.getText().trim());
            pst.setString(4, txt_nombrecurso.getText().trim());

            pst.setString(5, txt_tiponota.getText().trim());
            pst.setString(6, txt_nota.getText().trim());

            pst.executeUpdate();

            lbl_incremento.setText("");
            txt_codigoalumno.setText("");
            txt_codigocurso.setText("");
            txt_nombrecurso.setText("");
            txt_tiponota.setText("");
            txt_nota.setText("");
            txt_buscar.setText("");

            lbl_estatus.setText("Modificación Exitosa.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//Codigo que permite borrar registros en la base de datos
        try {

            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("delete from notas where codigo_notas = ?");

            pst.setString(1, lbl_incremento.getText().trim());
            pst.executeUpdate();

            lbl_incremento.setText("");
            txt_codigoalumno.setText("");
            txt_codigocurso.setText("");
            txt_nombrecurso.setText("");
            txt_tiponota.setText("");
            txt_nota.setText("");
            txt_buscar.setText("");

            JOptionPane.showMessageDialog(this, "¡ELIMINACION EXITOSA!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en eliminación", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_tiponotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tiponotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tiponotaActionPerformed

    private void txt_notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_notaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_notaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// buscar curso

        try {
            Connection cn = DriverManager.getConnection(BD, Usuario, Clave);
            PreparedStatement pst = cn.prepareStatement("select * from cursos where codigo_curso = ?");
            pst.setString(1, txt_codigocurso.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_nombrecurso.setText(rs.getString("nombre_curso"));

            } else {
                JOptionPane.showMessageDialog(null, "Curso no registrado.");
            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Tbl_notasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_notasMouseClicked
        //para seleccionar el dato y mostrarlo en los txt
        int seleccionar = Tbl_notas.rowAtPoint(evt.getPoint());
        lbl_incremento.setText(String.valueOf(Tbl_notas.getValueAt(seleccionar, 0)));
        txt_codigoalumno.setText(String.valueOf(Tbl_notas.getValueAt(seleccionar, 1)));
        txt_codigocurso.setText(String.valueOf(Tbl_notas.getValueAt(seleccionar, 2)));
        txt_nombrecurso.setText(String.valueOf(Tbl_notas.getValueAt(seleccionar, 3)));
        txt_tiponota.setText(String.valueOf(Tbl_notas.getValueAt(seleccionar, 4)));
        txt_nota.setText(String.valueOf(Tbl_notas.getValueAt(seleccionar, 5)));

    }//GEN-LAST:event_Tbl_notasMouseClicked

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tbl_notas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbl_estatus;
    private javax.swing.JLabel lbl_incremento;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_codigoalumno;
    private javax.swing.JTextField txt_codigocurso;
    private javax.swing.JTextField txt_nombrecurso;
    private javax.swing.JTextField txt_nota;
    private javax.swing.JTextField txt_tiponota;
    // End of variables declaration//GEN-END:variables
}
