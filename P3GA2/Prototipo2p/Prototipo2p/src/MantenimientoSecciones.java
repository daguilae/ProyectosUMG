
/**
 *
 * @author jorgi
 */
import java.awt.event.MouseEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class MantenimientoSecciones extends javax.swing.JInternalFrame {

    /**
     * Creates new form MantenimientoSecciones
     */
    public MantenimientoSecciones() {
        initComponents();
        buscarSecciones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new buttonPrueba.buttonPrueba();
        jLabel1 = new javax.swing.JLabel();
        txt_codseccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombreseccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_estadoseccion = new javax.swing.JTextField();
        btnGuardar = new BottonGuardar.buttonG();
        btnEditar = new BottonEditar.buttonEditar();
        btnEliminar = new BottonEliminar.buttonEliminar();
        cboBuscar = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento de Secciones ");
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Código de Sección:");

        txt_codseccion.setBackground(new java.awt.Color(227, 227, 227));
        txt_codseccion.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_codseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codseccionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Nombre de la Sección:");

        txt_nombreseccion.setBackground(new java.awt.Color(227, 227, 227));
        txt_nombreseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreseccionActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Estado de la Sección:");

        txt_estadoseccion.setBackground(new java.awt.Color(227, 227, 227));
        txt_estadoseccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estadoseccionActionPerformed(evt);
            }
        });

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombreseccion)
                            .addComponent(txt_estadoseccion)
                            .addComponent(txt_codseccion)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(90, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(cboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboBuscar))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_codseccion, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nombreseccion, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_estadoseccion, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(165, 165, 165))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codseccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codseccionActionPerformed

    private void txt_estadoseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estadoseccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estadoseccionActionPerformed

    private void txt_nombreseccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreseccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreseccionActionPerformed


    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        //Codigo que permite consultar registros en la base de datos
        if (cboBuscar.getSelectedItem().toString()=="Seleccione una opción") {
            JOptionPane.showMessageDialog(this, "NO SE INGRESO NINGUNA SECCION DE BUSQUEDA", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
                PreparedStatement pst = cn.prepareStatement("select * from secciones where codigo_seccion = ?");
                pst.setString(1, cboBuscar.getSelectedItem().toString());

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    txt_codseccion.setText(rs.getString("codigo_seccion"));
                    txt_nombreseccion.setText(rs.getString("nombre_seccion"));
                    txt_estadoseccion.setText(rs.getString("estatus_seccion"));

                    JOptionPane.showMessageDialog(this, "Se encontró el registro.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Registro no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Registro no encontrado", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_btnBuscarMouseClicked


    private void buttonEditar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditar1MouseClicked

    }//GEN-LAST:event_buttonEditar1MouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        //Codigo que permite actualizar registros en la base de datos
        if (txt_codseccion.getText().trim().isEmpty() || txt_nombreseccion.getText().trim().isEmpty()
                || txt_estadoseccion.getText().trim().isEmpty() || cboBuscar.getSelectedItem().toString()=="Seleccione una opción") {
            JOptionPane.showMessageDialog(this, "NO PUEDE HABER CAMPOS VACIOS", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                String ID = cboBuscar.getSelectedItem().toString();

                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
                PreparedStatement pst = cn.prepareStatement("update secciones set codigo_seccion = ?, nombre_seccion=?, estatus_seccion=?  where codigo_seccion = " + ID);

                pst.setString(1, txt_codseccion.getText().trim());
                pst.setString(2, txt_nombreseccion.getText().trim());
                pst.setString(3, txt_estadoseccion.getText().trim());
                pst.executeUpdate();

                txt_codseccion.setText("");
                txt_nombreseccion.setText("");
                txt_estadoseccion.setText("");

                JOptionPane.showMessageDialog(this, "Modificación exitosa.", "Notificación", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error en modificación.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
     //Codigo que permite borrar registros en la base de datos
        if (cboBuscar.getSelectedItem().toString()=="Seleccione una opción") {
            JOptionPane.showMessageDialog(this, "NO SE INGRESO NINGUNA SECCION A ELIMINAR", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
                PreparedStatement pst = cn.prepareStatement("delete from secciones where codigo_seccion = ?");

                pst.setString(1, cboBuscar.getSelectedItem().toString());
                pst.executeUpdate();

                txt_codseccion.setText("");
                txt_nombreseccion.setText("");
                txt_estadoseccion.setText("");

             JOptionPane.showMessageDialog(this, "Registro eliminado.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
             JOptionPane.showMessageDialog(this, "Registro no eeliminado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        
        }
                                            

      
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {

        //Codigo que permite insertar registros en al base de datos
        if (txt_codseccion.getText().trim().isEmpty() || txt_nombreseccion.getText().trim().isEmpty()
                || txt_estadoseccion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "NO PUEDE HABER CAMPOS VACIOS", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
                PreparedStatement pst = cn.prepareStatement("insert into secciones values(?,?,?)");

                pst.setString(1, txt_codseccion.getText().trim());
                pst.setString(2, txt_nombreseccion.getText().trim());
                pst.setString(3, txt_estadoseccion.getText().trim());
                pst.executeUpdate();

                txt_codseccion.setText("");
                txt_nombreseccion.setText("");
                txt_estadoseccion.setText("");

                JOptionPane.showMessageDialog(this, "Registro exitoso.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error en registro.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
    public void buscarSecciones(){
        try{
          
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
        PreparedStatement pst = cn.prepareStatement("select codigo_seccion from secciones");
            ResultSet rs = pst.executeQuery();

            cboBuscar.addItem("Seleccione una opción");
            while (rs.next()) {
                cboBuscar.addItem(rs.getString("codigo_seccion"));
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_codseccion;
    private javax.swing.JTextField txt_estadoseccion;
    private javax.swing.JTextField txt_nombreseccion;
    // End of variables declaration//GEN-END:variables
}
