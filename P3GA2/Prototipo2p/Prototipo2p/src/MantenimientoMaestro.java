/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorgi
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class MantenimientoMaestro extends javax.swing.JInternalFrame {

    /**
     * Creates new form MantenimientoMaestro
     */
    public MantenimientoMaestro() {
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

        jPanel1 = new javax.swing.JPanel();
        label_status = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        buttonPrueba1 = new buttonPrueba.buttonPrueba();
        jLabel2 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_estado = new javax.swing.JTextField();
        buttonG1 = new BottonGuardar.buttonG();
        buttonEditar1 = new BottonEditar.buttonEditar();
        buttonEliminar1 = new BottonEliminar.buttonEliminar();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimento de Maestros");
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txt_buscar.setBackground(new java.awt.Color(227, 227, 227));
        txt_buscar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Código de Maestro:");

        txt_codigo.setBackground(new java.awt.Color(227, 227, 227));
        txt_codigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Nombre del Maestro:");

        txt_nombre.setBackground(new java.awt.Color(227, 227, 227));
        txt_nombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Teléfono del Maestro:");

        txt_telefono.setBackground(new java.awt.Color(227, 227, 227));
        txt_telefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });

        buttonPrueba1.setText("buttonPrueba1");
        buttonPrueba1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPrueba1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Dirección del Maestro:");

        txt_direccion.setBackground(new java.awt.Color(227, 227, 227));
        txt_direccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Email del Maestro:");

        txt_correo.setBackground(new java.awt.Color(227, 227, 227));
        txt_correo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Estado del Maestro:");

        txt_estado.setBackground(new java.awt.Color(227, 227, 227));
        txt_estado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        buttonG1.setText("buttonG1");
        buttonG1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonG1MouseClicked(evt);
            }
        });

        buttonEditar1.setText("buttonEditar1");
        buttonEditar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEditar1MouseClicked(evt);
            }
        });

        buttonEliminar1.setText("buttonEliminar1");
        buttonEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEliminar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre)
                            .addComponent(txt_telefono)
                            .addComponent(txt_direccion)
                            .addComponent(txt_correo)
                            .addComponent(txt_estado)
                            .addComponent(txt_codigo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(89, Short.MAX_VALUE)
                        .addComponent(buttonPrueba1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)))
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(buttonG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(buttonEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(buttonEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonPrueba1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_correo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_estado, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void buttonPrueba1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPrueba1MouseClicked
        //Codigo que permite consultar registros en la base de datos\
        if (txt_buscar.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "NO SE INGRESO NINGUN MAESTRO DE BUSQUEDA");
        } else {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
                PreparedStatement pst = cn.prepareStatement("select * from maestros where codigo_maestro = ?");
                pst.setString(1, txt_buscar.getText().trim());

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    txt_codigo.setText(rs.getString("codigo_maestro"));
                    txt_nombre.setText(rs.getString("nombre_maestro"));
                    txt_direccion.setText(rs.getString("direccion_maestro"));
                    txt_telefono.setText(rs.getString("telefono_maetro"));
                    txt_correo.setText(rs.getString("email_maestro"));
                    txt_estado.setText(rs.getString("estatus_maestro"));
                } else {
                    JOptionPane.showMessageDialog(null, "Alumno no registrado.");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "ERROR AL REGISTRAR", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonPrueba1MouseClicked

    private void buttonEliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminar1MouseClicked
        //Codigo que permite borrar registros en la base de datos
        if (txt_buscar.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "NO SE INGRESO NINGUN MAESTRO A ELIMINAR");
        } else {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
                PreparedStatement pst = cn.prepareStatement("delete from maestros where codigo_maestro = ?");

                pst.setString(1, txt_buscar.getText().trim());
                pst.executeUpdate();

                txt_codigo.setText("");
                txt_nombre.setText("");
                txt_direccion.setText("");
                txt_telefono.setText("");
                txt_correo.setText("");
                txt_estado.setText("");

                label_status.setText("Registro eliminado.");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "ERROR AL ELIMINAR", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonEliminar1MouseClicked

    private void buttonEditar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditar1MouseClicked
        //Codigo que permite actualizar registros en la base de datos
        if (txt_buscar.getText().trim().isEmpty() || txt_codigo.getText().trim().isEmpty() || txt_nombre.getText().trim().isEmpty()
                || txt_direccion.getText().trim().isEmpty() || txt_telefono.getText().trim().isEmpty()
                || txt_correo.getText().trim().isEmpty() || txt_estado.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "NO PUEDE HABER CAMPOS VACIOS","WARNING",JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                String ID = txt_buscar.getText().trim();

                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
                PreparedStatement pst = cn.prepareStatement("update maestros set codigo_maestro = ?, nombre_maestro=?, direccion_maestro=?, telefono_maetro=?, email_maestro=?, estatus_maestro=?  where codigo_maestro = " + ID);

                pst.setString(1, txt_codigo.getText().trim());
                pst.setString(2, txt_nombre.getText().trim());
                pst.setString(3, txt_direccion.getText().trim());
                pst.setString(4, txt_telefono.getText().trim());
                pst.setString(5, txt_correo.getText().trim());
                pst.setString(6, txt_estado.getText().trim());
                pst.executeUpdate();

                txt_codigo.setText("");
                txt_nombre.setText("");
                txt_direccion.setText("");
                txt_telefono.setText("");
                txt_correo.setText("");
                txt_estado.setText("");
                label_status.setText("Modificación exitosa.");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "NO PUEDE HABER CAMPOS VACIOS","ERROR",JOptionPane.ERROR_MESSAGE);
            }}
    }//GEN-LAST:event_buttonEditar1MouseClicked

    private void buttonG1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonG1MouseClicked
        //Codigo que permite insertar registros en al base de datos
        if (txt_codigo.getText().trim().isEmpty() || txt_nombre.getText().trim().isEmpty()
                || txt_direccion.getText().trim().isEmpty() || txt_telefono.getText().trim().isEmpty()
                || txt_correo.getText().trim().isEmpty() || txt_estado.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "NO PUEDE HABER CAMPOS VACIOS","WARNING",JOptionPane.WARNING_MESSAGE);
        } else {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("insert into maestros values(?,?,?,?,?,?)");

            pst.setString(1, txt_codigo.getText().trim());
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_direccion.getText().trim());
            pst.setString(4, txt_telefono.getText().trim());
            pst.setString(5, txt_correo.getText().trim());
            pst.setString(6, txt_estado.getText().trim());
            pst.executeUpdate();

            txt_codigo.setText("");
            txt_nombre.setText("");
            txt_direccion.setText("");
            txt_telefono.setText("");
            txt_correo.setText("");
            txt_estado.setText("");
            label_status.setText("Registro exitoso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR AL INSERTAR","ERROR",JOptionPane.ERROR_MESSAGE);
        }}
    }//GEN-LAST:event_buttonG1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BottonEditar.buttonEditar buttonEditar1;
    private BottonEliminar.buttonEliminar buttonEliminar1;
    private BottonGuardar.buttonG buttonG1;
    private buttonPrueba.buttonPrueba buttonPrueba1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
