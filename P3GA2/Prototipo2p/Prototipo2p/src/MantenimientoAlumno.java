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
public class MantenimientoAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form MantenimientoAlumno
     */
    public MantenimientoAlumno() {
        initComponents();
        cboBuscarAlumno();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_carnet = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        txt_estado = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttonPrueba1 = new buttonPrueba.buttonPrueba();
        buttonEliminar1 = new BottonEliminar.buttonEliminar();
        label_status = new javax.swing.JLabel();
        buttonG1 = new BottonGuardar.buttonG();
        buttonEditar1 = new BottonEditar.buttonEditar();
        cboBuscar = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento de Alumno");
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Nombre Alumno:");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Carnet Alumno:");

        txt_nombre.setBackground(new java.awt.Color(227, 227, 227));
        txt_nombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txt_carnet.setBackground(new java.awt.Color(227, 227, 227));
        txt_carnet.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_carnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_carnetActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Direccion Alumno:");

        txt_direccion.setBackground(new java.awt.Color(227, 227, 227));
        txt_direccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Email Alumno:");

        txt_correo.setBackground(new java.awt.Color(227, 227, 227));
        txt_correo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txt_estado.setBackground(new java.awt.Color(227, 227, 227));
        txt_estado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        txt_telefono.setBackground(new java.awt.Color(227, 227, 227));
        txt_telefono.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Estado Alumno:");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Telefono Alumno:");

        buttonPrueba1.setText("buttonPrueba1");
        buttonPrueba1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPrueba1MouseClicked(evt);
            }
        });

        buttonEliminar1.setText("buttonEliminar1");
        buttonEliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonEliminar1MouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(buttonG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(buttonEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(buttonEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(txt_nombre)
                            .addComponent(txt_carnet)
                            .addComponent(txt_direccion)
                            .addComponent(txt_correo)
                            .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(buttonPrueba1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(cboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPrueba1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_carnet, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txt_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
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

    private void txt_carnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_carnetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_carnetActionPerformed

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void buttonPrueba1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPrueba1MouseClicked
     //Codigo que permite consultar registros en la base de datos
        if ( cboBuscar.getSelectedItem().toString() == "Seleccione Una Opcion"){

            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR El CAMPO VACIO");

            cboBuscar.setSelectedItem(0);
            
        }else{
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("select * from alumnos where carnet_alumno = ?");
            pst.setString(1, cboBuscar.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txt_carnet.setText(rs.getString("carnet_alumno"));
                txt_nombre.setText(rs.getString("nombre_alumno"));
                txt_direccion.setText(rs.getString("direccion_alumno"));
                txt_telefono.setText(rs.getString("telefono_alumno"));
                txt_correo.setText(rs.getString("email_alumno"));
                txt_estado.setText(rs.getString("estatus_alumno"));
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no registrado.");
            }

        }catch (Exception e){
        JOptionPane.showMessageDialog(null, "Error al buscar");
        }
      }
   
    }//GEN-LAST:event_buttonPrueba1MouseClicked

    private void buttonEliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEliminar1MouseClicked
         //Codigo que permite borrar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("delete from alumnos where carnet_alumno = ?");

            pst.setString(1, cboBuscar.getSelectedItem().toString());
            pst.executeUpdate();

            txt_carnet.setText("");
            txt_nombre.setText("");
            txt_direccion.setText("");
            txt_telefono.setText("");
            txt_correo.setText("");
            txt_estado.setText("");

            JOptionPane.showMessageDialog(this, "Registro Eliminado","MENSAJE",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al Eliminar","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_buttonEliminar1MouseClicked

    private void buttonG1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonG1MouseClicked
          //Codigo que permite insertar registros en al base de datos
        if ( txt_carnet.getText().isEmpty() || txt_nombre.getText().isEmpty() || txt_direccion.getText().isEmpty() || txt_telefono.getText().isEmpty() || txt_correo.getText().isEmpty() || txt_estado.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR CAMPOS VACIOS");

            txt_carnet.setText("");
            txt_nombre.setText("");
            txt_direccion.setText("");
            txt_telefono.setText("");
            txt_correo.setText("");
            txt_estado.setText("");
            
        }else{
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("insert into alumnos values(?,?,?,?,?,?)");

            pst.setString(1, txt_carnet.getText().trim());
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_direccion.getText().trim());
            pst.setString(4, txt_telefono.getText().trim());
            pst.setString(5, txt_correo.getText().trim());
            pst.setString(6, txt_estado.getText().trim());
            pst.executeUpdate();

            txt_carnet.setText("");
            txt_nombre.setText("");
            txt_direccion.setText("");
            txt_telefono.setText("");
            txt_correo.setText("");
            txt_estado.setText("");
            JOptionPane.showMessageDialog(this, "Registro Exitoso","MENSAJE",JOptionPane.INFORMATION_MESSAGE);
        }catch (Exception e){
        JOptionPane.showMessageDialog(this, "Error al Registrar","ERROR",JOptionPane.ERROR_MESSAGE);;
        }
      }
       
    }//GEN-LAST:event_buttonG1MouseClicked

    private void buttonEditar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditar1MouseClicked
       //Codigo que permite actualizar registros en la base de datos
        if ( txt_carnet.getText().isEmpty() || txt_nombre.getText().isEmpty() || txt_direccion.getText().isEmpty() || txt_telefono.getText().isEmpty() || txt_correo.getText().isEmpty() || txt_estado.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "NO SE PUEDE DEJAR CAMPOS VACIOS");

            txt_carnet.setText("");
            txt_nombre.setText("");
            txt_direccion.setText("");
            txt_telefono.setText("");
            txt_correo.setText("");
            txt_estado.setText("");
            
        }else{
        try {
            String ID = cboBuscar.getSelectedItem().toString();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("update alumnos set carnet_alumno = ?, nombre_alumno=?, direccion_alumno=?, telefono_alumno=?, email_alumno=?, estatus_alumno=?  where carnet_alumno = " + ID);

            pst.setString(1, txt_carnet.getText().trim());
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_direccion.getText().trim());
            pst.setString(4, txt_telefono.getText().trim());
            pst.setString(5, txt_correo.getText().trim());
            pst.setString(6, txt_estado.getText().trim());
            pst.executeUpdate();

            txt_carnet.setText("");
            txt_nombre.setText("");
            txt_direccion.setText("");
            txt_telefono.setText("");
            txt_correo.setText("");
            txt_estado.setText("");
            JOptionPane.showMessageDialog(this, "Modificacion Exitosa","MENSAJE",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al Modificar","ERROR",JOptionPane.ERROR_MESSAGE);
        }
      }
    }//GEN-LAST:event_buttonEditar1MouseClicked

    public void cboBuscarAlumno(){
        try{
          
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
        PreparedStatement pst = cn.prepareStatement("select carnet_alumno from alumnos");
            ResultSet rs = pst.executeQuery();

            cboBuscar.addItem("Seleccione una opción");
            while (rs.next()) {
                cboBuscar.addItem(rs.getString("carnet_alumno"));
            }  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private BottonEditar.buttonEditar buttonEditar1;
    private BottonEliminar.buttonEliminar buttonEliminar1;
    private BottonGuardar.buttonG buttonG1;
    private buttonPrueba.buttonPrueba buttonPrueba1;
    private javax.swing.JComboBox<String> cboBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_carnet;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
