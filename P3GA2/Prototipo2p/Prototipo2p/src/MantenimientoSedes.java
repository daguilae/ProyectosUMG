
/**
 *
 * @author jorgi
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class MantenimientoSedes extends javax.swing.JInternalFrame {

    /**
     * Creates new form MantenimientoSedes
     */
    public MantenimientoSedes() {
        initComponents();
        buscarSedes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new buttonPrueba.buttonPrueba();
        jLabel1 = new javax.swing.JLabel();
        txt_codigosede = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombresede = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_estadosede = new javax.swing.JTextField();
        btnGuardar = new BottonGuardar.buttonG();
        btnEditar = new BottonEditar.buttonEditar();
        btnEliminr = new BottonEliminar.buttonEliminar();
        cboBuscar = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento de Sedes");
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscar.setText("buttonPrueba1");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Código de la Sede:");

        txt_codigosede.setBackground(new java.awt.Color(227, 227, 227));
        txt_codigosede.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_codigosede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigosedeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Nombre de la Sede:");

        txt_nombresede.setBackground(new java.awt.Color(227, 227, 227));
        txt_nombresede.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_nombresede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombresedeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Esatdo de la Sede:");

        txt_estadosede.setBackground(new java.awt.Color(227, 227, 227));
        txt_estadosede.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txt_estadosede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_estadosedeActionPerformed(evt);
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

        btnEliminr.setText("buttonEliminar1");
        btnEliminr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminrMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnEliminr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_codigosede, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txt_nombresede)
                            .addComponent(txt_estadosede)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_codigosede, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nombresede, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_estadosede, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigosedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigosedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigosedeActionPerformed

    private void txt_nombresedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombresedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombresedeActionPerformed

    private void txt_estadosedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_estadosedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estadosedeActionPerformed


    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        //Codigo que permite consultar registros en la base de datos
        if (cboBuscar.getSelectedItem().toString()=="Seleccione una opción") {
            JOptionPane.showMessageDialog(this, "NO SE INGRESO NINGUNA SEDE DE BUSQUEDA", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
                PreparedStatement pst = cn.prepareStatement("select * from sedes where codigo_sede = ?");
                pst.setString(1, cboBuscar.getSelectedItem().toString());

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    txt_codigosede.setText(rs.getString("codigo_sede"));
                    txt_nombresede.setText(rs.getString("nombre_sede"));
                    txt_estadosede.setText(rs.getString("estatus_sede"));
                    JOptionPane.showMessageDialog(this, "Se encontró el registro.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Registro no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Registro no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnEliminrMouseClicked(java.awt.event.MouseEvent evt) {                                        
        //Codigo que permite borrar registros en la base de datos
        if (cboBuscar.getSelectedItem().toString()=="Seleccione una opción") {
            JOptionPane.showMessageDialog(this, "NO SE INGRESO NINGUNA SEDE A ELIMINAR", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
                PreparedStatement pst = cn.prepareStatement("delete from sedes where codigo_sede = ?");


                pst.setString(1, cboBuscar.getSelectedItem().toString());
                pst.executeUpdate();

                txt_codigosede.setText("");
                txt_nombresede.setText("");
                txt_estadosede.setText("");

                JOptionPane.showMessageDialog(this, "Se elimonó el registro.", "Notificación", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Registro no eliminado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }                                       

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {                                       
        //Codigo que permite actualizar registros en la base de datos
        if (txt_codigosede.getText().trim().isEmpty() || txt_nombresede.getText().trim().isEmpty()
                || txt_estadosede.getText().trim().isEmpty() || cboBuscar.getSelectedItem().toString()=="Seleccione una opción") {
            JOptionPane.showMessageDialog(this, "NO PUEDEN HABER CAMPOS VACIOS", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                String ID = cboBuscar.getSelectedItem().toString();
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
                PreparedStatement pst = cn.prepareStatement("update sedes set codigo_sede = ?, nombre_sede=?, estatus_sede=?  where codigo_sede = " + ID);

                pst.setString(1, txt_codigosede.getText().trim());
                pst.setString(2, txt_nombresede.getText().trim());
                pst.setString(3, txt_estadosede.getText().trim());
                pst.executeUpdate();
                txt_codigosede.setText("");
                txt_nombresede.setText("");
                txt_estadosede.setText("");
          JOptionPane.showMessageDialog(this, "Modificación exitosa.", "Notificación", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error en modificación.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } 
     
    private void buttonG1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonG1MouseClicked
  
    }//GEN-LAST:event_buttonG1MouseClicked

                                           

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        //Codigo que permite insertar registros en al base de datos
        if (txt_codigosede.getText().trim().isEmpty() || txt_nombresede.getText().trim().isEmpty()
                || txt_estadosede.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "NO PUEDEN HABER CAMPOS VACIOS", "WARNING", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
                PreparedStatement pst = cn.prepareStatement("insert into sedes values(?,?,?)");

                pst.setString(1, txt_codigosede.getText().trim());
                pst.setString(2, txt_nombresede.getText().trim());
                pst.setString(3, txt_estadosede.getText().trim());
                pst.executeUpdate();

                txt_codigosede.setText("");
                txt_nombresede.setText("");
                txt_estadosede.setText("");

                JOptionPane.showMessageDialog(this, "Registro exitoso.", "Notificación", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error en registro.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    public void buscarSedes(){
        try{
          
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
        PreparedStatement pst = cn.prepareStatement("select codigo_sede from sedes");
            ResultSet rs = pst.executeQuery();

            cboBuscar.addItem("Seleccione una opción");
            while (rs.next()) {
                cboBuscar.addItem(rs.getString("codigo_sede"));
            }  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private buttonPrueba.buttonPrueba btnBuscar;
    private BottonEditar.buttonEditar btnEditar;
    private BottonEliminar.buttonEliminar btnEliminr;
    private BottonGuardar.buttonG btnGuardar;
    private javax.swing.JComboBox<String> cboBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_codigosede;
    private javax.swing.JTextField txt_estadosede;
    private javax.swing.JTextField txt_nombresede;
    // End of variables declaration//GEN-END:variables
}
