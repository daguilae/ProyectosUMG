
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
        buscarMaestro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        btnBuscar = new buttonPrueba.buttonPrueba();
        jLabel2 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_estado = new javax.swing.JTextField();
        btnGuardar = new BottonGuardar.buttonG();
        btnEditar = new BottonEditar.buttonEditar();
        btnEliminar = new BottonEliminar.buttonEliminar();
        cboBuscar = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimento de Maestros");
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
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

        btnGuardar.setText("buttonG1");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        btnEditar.setText("buttonEditar1");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnEliminar.setText("buttonEliminar1");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
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
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)))
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboBuscar))
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
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        
    }//GEN-LAST:event_buttonPrueba1MouseClicked

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        //Codigo que permite consultar registros en la base de datos
         if (cboBuscar.getSelectedItem().toString()=="Seleccione una opción") {
            JOptionPane.showMessageDialog(this, "NO SE INGRESO NINGUN MAESTRO DE BUSQUEDA");
        } else {
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("select * from maestros where codigo_maestro = ?");
            pst.setString(1, cboBuscar.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_codigo.setText(rs.getString("codigo_maestro"));
                txt_nombre.setText(rs.getString("nombre_maestro"));
                txt_direccion.setText(rs.getString("direccion_maestro"));
                txt_telefono.setText(rs.getString("telefono_maetro"));
                txt_correo.setText(rs.getString("email_maestro"));
                txt_estado.setText(rs.getString("estatus_maestro"));
                JOptionPane.showMessageDialog(this, "Se encontró el registro.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Registro no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Registro no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
         }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {                                         

        //Codigo que permite borrar registros en la base de datos
        if (cboBuscar.getSelectedItem().toString()=="Seleccione una opción") {
            JOptionPane.showMessageDialog(this, "NO SE INGRESO NINGUN MAESTRO A ELIMINAR");
        } else {

            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
                PreparedStatement pst = cn.prepareStatement("delete from maestros where codigo_maestro = ?");

                pst.setString(1, cboBuscar.getSelectedItem().toString());
                pst.executeUpdate();

                txt_codigo.setText("");
                txt_nombre.setText("");
                txt_direccion.setText("");
                txt_telefono.setText("");
                txt_correo.setText("");
                txt_estado.setText("");

          JOptionPane.showMessageDialog(this, "Registro eliminado.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Registro no eeliminado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }                                            

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {                                           
        //Codigo que permite actualizar registros en la base de datos
        if (cboBuscar.getSelectedItem().toString()=="Seleccione una opción" || txt_codigo.getText().trim().isEmpty() || txt_nombre.getText().trim().isEmpty()
                || txt_direccion.getText().trim().isEmpty() || txt_telefono.getText().trim().isEmpty()
                || txt_correo.getText().trim().isEmpty() || txt_estado.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "NO PUEDE HABER CAMPOS VACIOS","WARNING",JOptionPane.WARNING_MESSAGE);
        } else {
           try {
            String ID = cboBuscar.getSelectedItem().toString();

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

            JOptionPane.showMessageDialog(this, "Modificación exitosa.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en modificación.", "Error", JOptionPane.ERROR_MESSAGE);
        }
         }
    }                                      

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {                                        

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

              JOptionPane.showMessageDialog(this, "Registro exitoso.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en registro.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }                                       

        public void buscarMaestro(){
            try{
          
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
        PreparedStatement pst = cn.prepareStatement("select codigo_maestro from maestros");
            ResultSet rs = pst.executeQuery();

            cboBuscar.addItem("Seleccione una opción");
            while (rs.next()) {
                cboBuscar.addItem(rs.getString("codigo_maestro"));
            }  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private buttonPrueba.buttonPrueba btnBuscar;
    private BottonEditar.buttonEditar btnEditar;
    private BottonEliminar.buttonEliminar btnEliminar;
    private BottonGuardar.buttonG btnGuardar;
    private javax.swing.JComboBox<String> cboBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_estado;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
