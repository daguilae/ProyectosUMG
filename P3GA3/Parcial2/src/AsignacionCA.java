

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ranbr
 */
public class AsignacionCA extends javax.swing.JInternalFrame {

    String Semestre = "Semestre" ;
    String Trimestre = "Trimestre" ;
    String Unidad = "Unidad" ;
    String Item = "";
    String Item2 = "";
    String Parcial_1 = "";
    String Parcial_2 = "";
    float Parcial_Flotante = 0;
    boolean Encontrado;
    boolean EncontradoMayorCero = false;
   
    String[] NombresColumnasAsignacionA = {"codigo_carrera", "codigo_sede", "codigo_jornada", "codigo_seccion", "codigo_aula", "codigo_curso", "carnet_alumno", "nota_asignacioncursoalumnos"};

    public void MostrarDB(String Tabla) {
        String[] columnas = new String[8];
        String query;
        try {

            Connection c = DriverManager.getConnection(Principal.BD,Principal.Usuario,Principal.Contraseña);

            query = "SELECT * FROM " + Tabla;


            PreparedStatement consulta = c.prepareStatement(query);
            ResultSet resultado = consulta.executeQuery();
            DefaultTableModel md = new DefaultTableModel(null, NombresColumnasAsignacionA);

            while (resultado.next()) {
                for (int i = 0; i < 8; i++) {
                    columnas[i] = resultado.getString(NombresColumnasAsignacionA[i]);
                }
                md.addRow(columnas);

            }
            tblAsignacionA.setModel(md);

        } catch (Exception err) {
            err.printStackTrace();
        }

    }

    public AsignacionCA() {
        initComponents();
        
        Busqueda();

            

        jComboBox_Parcial.addItem("Ingrese Una Opcion");
        jComboBox_Parcial.addItem(Semestre);
        jComboBox_Parcial.addItem(Trimestre);
        jComboBox_Parcial.addItem(Unidad);
            
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select nombre_carrera from carreras");
            ResultSet rs = pst.executeQuery();

            PreparedStatement pst2 = cn.prepareStatement("select nombre_sede from sedes");
            ResultSet rs2 = pst2.executeQuery();

            PreparedStatement pst3 = cn.prepareStatement("select nombre_jornada from jornadas");
            ResultSet rs3 = pst3.executeQuery();

            PreparedStatement pst4 = cn.prepareStatement("select nombre_seccion from secciones");
            ResultSet rs4 = pst4.executeQuery();

            PreparedStatement pst5 = cn.prepareStatement("select nombre_aula from aulas");
            ResultSet rs5 = pst5.executeQuery();

           

            PreparedStatement pst7 = cn.prepareStatement("select nombre_alumno from alumnos");
            ResultSet rs7 = pst7.executeQuery();

            cbox_carrera.addItem("Seleccione una opción");
            while (rs.next()) {
                cbox_carrera.addItem(rs.getString("nombre_carrera"));
            }

            cbox_sede.addItem("Seleccione una opción");
            while (rs2.next()) {
                cbox_sede.addItem(rs2.getString("nombre_sede"));
            }

            cbox_j.addItem("Seleccione una opción");
            while (rs3.next()) {
                cbox_j.addItem(rs3.getString("nombre_jornada"));
            }

            cbox_sec.addItem("Seleccione una opción");
            while (rs4.next()) {
                cbox_sec.addItem(rs4.getString("nombre_seccion"));
            }

            cbox_aula.addItem("Seleccione una opción");
            while (rs5.next()) {
                cbox_aula.addItem(rs5.getString("nombre_aula"));
            }

            cbox_curso.addItem("Seleccione una opción");
            

            cbox_alum.addItem("Seleccione una opción");
            while (rs7.next()) {
                cbox_alum.addItem(rs7.getString("nombre_alumno"));
            }
            
            jComboBox_Parcial.addItem("Seleccione una opción");
            jComboBox_Parcial.addItem("Parcial 1");
            jComboBox_Parcial.addItem("Parcial 2");
            jComboBox_Parcial.addItem("Parcial 3");
            jComboBox_Parcial.addItem("Extraordinario");
            jComboBox_Parcial.addItem("Privado");
            jComboBox_Parcial.addItem("Trimestre");
            jComboBox_Parcial.addItem("Semestre");
            jComboBox_Parcial.addItem("Bimestre");
            jComboBox_Parcial.addItem("Zona");
            

        } catch (Exception e) 
        {

        }
       // MostrarDB("asignacioncursosalumnos");
    }
    
    public String[]datos(String datos)
    {
        Item = jComboBox_Parcial.getSelectedItem().toString();
        int i = 0, j = 0, suma = j+1;
        
        if(Item == "Semestre")
        {
            i = 3;
        }
        else if(Item == "Trimestre")
        {
            i = 4;
        }
        else if(Item == "Unidad")
        {
            i=10;
        }
        
        String[] informacion = new String[i];
        
    
        if(datos.equalsIgnoreCase("Semestre"))
        {
            /*while(j<i)
            {
                informacion[j] = "Parcial " + suma;
                j++;
                suma++;
            }*/
            
            informacion[0] = "Parcial 1";
            informacion[1] = "Parcial 2";
            informacion[2] = "Parcial 3";
        }
        
        if(datos.equalsIgnoreCase("Trimestre"))
        {
           /* while(j<i)
            {
                informacion[j] = "Parcial " + suma;
                j++;
                suma++;
            }*/
            informacion[0] = "Parcial 1";
            informacion[1] = "Parcial 2";
            informacion[2] = "Parcial 3"; 
            informacion[3] = "Parcial 4"; 
        }
        
        if(datos.equalsIgnoreCase("Unidad"))
        {
            
           /* while(j<i)
            {
                informacion[j] = "Unidad " + suma;
                j++;
                suma++;
            }*/
            
            informacion[0] = "Unidad 1";
            informacion[1] = "Unidad 2";
            informacion[2] = "Unidad 3"; 
            informacion[3] = "Unidad 4"; 
            informacion[4] = "Unidad 5"; 
            informacion[5] = "Unidad 6"; 
            informacion[6] = "Unidad 7"; 
            informacion[7] = "Unidad 8"; 
            informacion[8] = "Unidad 9"; 
            informacion[9] = "Unidad 10"; 
        }
            
         
        
        return informacion;
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbox_carrera = new javax.swing.JComboBox<>();
        cbox_sede = new javax.swing.JComboBox<>();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbox_j = new javax.swing.JComboBox<>();
        cbox_sec = new javax.swing.JComboBox<>();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbox_aula = new javax.swing.JComboBox<>();
        cbox_curso = new javax.swing.JComboBox<>();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbox_alum = new javax.swing.JComboBox<>();
        lb7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Nota = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtbuscado = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_Codigo = new javax.swing.JTextField();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAsignacionA = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_Parcial = new javax.swing.JComboBox<>();
        txt_Nuevo = new javax.swing.JTextField();
        jComboBox_Parcial2 = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Asignacion cursos alumnos");
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbox_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_carreraActionPerformed(evt);
            }
        });
        getContentPane().add(cbox_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 36, 219, -1));

        cbox_sede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_sedeActionPerformed(evt);
            }
        });
        getContentPane().add(cbox_sede, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 68, 219, -1));

        lb1.setText("...");
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 41, -1, -1));

        lb2.setText("...");
        getContentPane().add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 73, -1, -1));

        jLabel5.setText("Carrera");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 41, -1, -1));

        jLabel6.setText("Sede");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 73, -1, -1));

        jLabel7.setText("Seccion");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 137, -1, -1));

        cbox_j.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_jActionPerformed(evt);
            }
        });
        getContentPane().add(cbox_j, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 100, 219, -1));

        cbox_sec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_secActionPerformed(evt);
            }
        });
        getContentPane().add(cbox_sec, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 132, 219, -1));

        lb3.setText("...");
        getContentPane().add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 105, -1, -1));

        lb4.setText("...");
        getContentPane().add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 137, -1, -1));

        jLabel8.setText("Jornada");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 105, -1, -1));

        jLabel9.setText("Curso");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 207, -1, -1));

        cbox_aula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_aulaActionPerformed(evt);
            }
        });
        getContentPane().add(cbox_aula, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 170, 219, -1));

        cbox_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_cursoActionPerformed(evt);
            }
        });
        getContentPane().add(cbox_curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 202, 219, -1));

        lb5.setText("...");
        getContentPane().add(lb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 175, -1, -1));

        lb6.setText("...");
        getContentPane().add(lb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 207, -1, -1));

        jLabel10.setText("Aula");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 175, -1, -1));

        cbox_alum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_alumActionPerformed(evt);
            }
        });
        getContentPane().add(cbox_alum, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 240, 220, -1));

        lb7.setText("...");
        getContentPane().add(lb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 245, -1, -1));

        jLabel11.setText("Alumno");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 245, -1, -1));

        jLabel3.setText("Nota");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        txt_Nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NotaActionPerformed(evt);
            }
        });
        txt_Nota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NotaKeyTyped(evt);
            }
        });
        getContentPane().add(txt_Nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 220, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 95, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 95, -1));
        getContentPane().add(txtbuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 102, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 95, -1));

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 95, -1));

        jLabel4.setText("Codigo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 10, -1, -1));

        txt_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 6, 219, -1));

        jTabbedPane3.setBackground(new java.awt.Color(255, 255, 255));

        tblAsignacionA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblAsignacionA.setGridColor(new java.awt.Color(255, 255, 255));
        tblAsignacionA.setSelectionBackground(new java.awt.Color(102, 204, 255));
        jScrollPane3.setViewportView(tblAsignacionA);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Datos", jPanel3);

        getContentPane().add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 6, -1, -1));

        jLabel1.setText("Tipo de Nota");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 283, -1, -1));

        jComboBox_Parcial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_ParcialItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox_Parcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 278, 221, -1));
        getContentPane().add(txt_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 88, -1));

        jComboBox_Parcial2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        getContentPane().add(jComboBox_Parcial2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 220, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbox_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_carreraActionPerformed
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select codigo_carrera from carreras where nombre_carrera= ?");
            pst.setString(1, cbox_carrera.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lb1.setText(rs.getString("codigo_carrera"));

            } else {

            }
            
            cbox_curso.removeAllItems();
            cbox_curso.addItem("Seleccione una opción");
            PreparedStatement pst6 = cn.prepareStatement("select nombre_curso from cursos where codigo_carrera=?");
            pst6.setString(1, lb1.getText());
            ResultSet rs6 = pst6.executeQuery();
            
           
            while (rs6.next()) {
                cbox_curso.addItem(rs6.getString("nombre_curso"));
            }

        } catch (Exception e) {

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_carreraActionPerformed

    private void cbox_sedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_sedeActionPerformed

        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select codigo_sede from sedes where nombre_sede= ?");
            pst.setString(1, cbox_sede.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lb2.setText(rs.getString("codigo_sede"));

            } else {

            }

        } catch (Exception e) {

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_sedeActionPerformed

    private void cbox_jActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_jActionPerformed
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select codigo_jornada from jornadas where nombre_jornada= ?");
            pst.setString(1, cbox_j.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lb3.setText(rs.getString("codigo_jornada"));

            } else {

            }

        } catch (Exception e) {

        }        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_jActionPerformed

    private void cbox_secActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_secActionPerformed
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select codigo_seccion from secciones where nombre_seccion= ?");
            pst.setString(1, cbox_sec.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lb4.setText(rs.getString("codigo_seccion"));

            } else {

            }

        } catch (Exception e) {

        }  // TODO add your handling code here:
    }//GEN-LAST:event_cbox_secActionPerformed

    private void cbox_aulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_aulaActionPerformed
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select codigo_aula from aulas where nombre_aula= ?");
            pst.setString(1, cbox_aula.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lb5.setText(rs.getString("codigo_aula"));

            } else {

            }

        } catch (Exception e) {

        }

// TODO add your handling code here:
    }//GEN-LAST:event_cbox_aulaActionPerformed

    private void cbox_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_cursoActionPerformed
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select codigo_curso from cursos where nombre_curso= ?");
            pst.setString(1, cbox_curso.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lb6.setText(rs.getString("codigo_curso"));

            } else {

            }

        } catch (Exception e) {

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_cursoActionPerformed

    private void cbox_alumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_alumActionPerformed
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select carnet_alumno from alumnos where nombre_alumno= ?");
            pst.setString(1, cbox_alum.getSelectedItem().toString());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                lb7.setText(rs.getString("carnet_alumno"));

            } else {

            }

        } catch (Exception e) {

        }    // TODO add your handling code here:
    }//GEN-LAST:event_cbox_alumActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

                Busqueda();
        
            if(Encontrado == true)
            {
                try
                {
         
                Item = jComboBox_Parcial.getSelectedItem().toString();
                Item2 = jComboBox_Parcial2.getSelectedItem().toString();
                //System.out.println(Item2);
            
                String ID = txt_Codigo.getText().trim();
            
                Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
                PreparedStatement pst = cn.prepareStatement("update asignacioncursosalumnos set  id_Alumno = ?, codigo_carrera = ?,codigo_sede = ?,codigo_jornada = ?, codigo_seccion = ?,codigo_aula=?,codigo_curso=?,carnet_alumno=?,Tipo_Nota=?,Parcial_1=?,Parcial_2=?,Parcial_3=?,Parcial_4=?,Parcial_5=?,Extraordinario=?,Privado=?,Zona=?,nota_asignacioncursoalumnos=? where id_Alumno = " + ID);
            
                pst.setString(1, txt_Codigo.getText().trim());
                pst.setString(2, lb1.getText().trim());
                pst.setString(3, lb2.getText().trim());
                pst.setString(4, lb3.getText().trim());
                pst.setString(5, lb4.getText().trim());
                pst.setString(6, lb5.getText().trim());
                pst.setString(7, lb6.getText().trim());
                pst.setString(8, lb7.getText().trim());
                
            
                if(Item == "Semestre")
                {
                    pst.setString(9,Item);
                    if(Item2 == "Parcial 1")
                    {
                    BusquedaMayor("Parcial_1");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(10,txt_Nota.getText().trim());
                    }
                    else
                    {
                    System.out.println("Ya ingresado");
                    }
                    BusquedaMayor("Parcial_2");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(11,txt_Nuevo.getText().trim());
                    }
                    BusquedaMayor("Parcial_3");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(12,txt_Nuevo.getText().trim());
                    }
                    
                    BusquedaMayor("Parcial_4");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(13,txt_Nuevo.getText().trim());
                    }
                    
                    BusquedaMayor("Parcial_5");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(14,txt_Nuevo.getText().trim());
                    }
                    
                    BusquedaMayor("Extraordinario");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(15,txt_Nuevo.getText().trim());
                    }
                    
                    BusquedaMayor("Privado");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(16,txt_Nuevo.getText().trim());
                    }
                    BusquedaMayor("Zona");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(17,txt_Nuevo.getText().trim());
                    }
     
                    pst.setString(18, txt_Nota.getText().trim());
                    pst.executeUpdate();
            
                    System.out.println("Registrado");
                    }
                }

                if(Item == "Semestre")
                {
                    pst.setString(9,Item);
                    if(Item2 == "Parcial 2")
                    {
                    BusquedaMayor("Parcial_1");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(10,txt_Nuevo.getText().trim());
                    }
                    else
                    {
                    System.out.println("Ya ingresado");
                    }
                    BusquedaMayor("Parcial_2");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(11,txt_Nota.getText().trim());
                    }
                    BusquedaMayor("Parcial_3");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(12,txt_Nuevo.getText().trim());
                    }
                    
                    BusquedaMayor("Parcial_4");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(13,txt_Nuevo.getText().trim());
                    }
                    
                    BusquedaMayor("Parcial_5");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(14,txt_Nuevo.getText().trim());
                    }
                    
                    BusquedaMayor("Extraordinario");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(15,txt_Nuevo.getText().trim());
                    }
                    
                    BusquedaMayor("Privado");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(16,txt_Nuevo.getText().trim());
                    }
                    BusquedaMayor("Zona");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(17,txt_Nuevo.getText().trim());
                    }
     
                    pst.setString(18, txt_Nota.getText().trim());
                    pst.executeUpdate();
            
                    System.out.println("Registrado");
                    }
                }

                if(Item == "Semestre")
                {
                    pst.setString(9,Item);
                    if(Item2 == "Parcial 3")
                    {
                    BusquedaMayor("Parcial_1");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(10,txt_Nuevo.getText().trim());
                    }
                    else
                    {
                    System.out.println("Ya ingresado");
                    }
                    BusquedaMayor("Parcial_2");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(11,txt_Nuevo.getText().trim());
                    }
                    BusquedaMayor("Parcial_3");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(12,txt_Nota.getText().trim());
                    }
                    
                    BusquedaMayor("Parcial_4");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(13,txt_Nuevo.getText().trim());
                    }
                    
                    BusquedaMayor("Parcial_5");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(14,txt_Nuevo.getText().trim());
                    }
                    
                    BusquedaMayor("Extraordinario");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(15,txt_Nuevo.getText().trim());
                    }
                    
                    BusquedaMayor("Privado");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(16,txt_Nuevo.getText().trim());
                    }
                    BusquedaMayor("Zona");
                    txt_Nuevo.setText(Parcial_1);
                    if(Parcial_Flotante >= 0)
                    {
                    pst.setString(17,txt_Nuevo.getText().trim());
                    }
     
                    pst.setString(18, txt_Nota.getText().trim());
                    pst.executeUpdate();
            
                    System.out.println("Registrado");
                    }
                }


                }catch(Exception e)
                {
                System.out.println(e);
                }
            }     
            else if(Encontrado == false)
        {
            Item = jComboBox_Parcial.getSelectedItem().toString();
            Item2 = jComboBox_Parcial2.getSelectedItem().toString();
            
           
            try
            {

                System.out.println(Item);
                System.out.println(Item2);
            
            
                if(Item == "Semestre" && Item2 == "Parcial 1")
                {
                   IngresarMA(Item,Item2,10);
                }
                else if(Item == "Semestre" && Item2 == "Parcial 2")
                {
                    IngresarMA(Item,Item2,11);
                }
                else if(Item == "Semestre" && Item2 == "Parcial 3")
                {
                   IngresarMA(Item,Item2,12);
                }
            
            
            }catch(Exception e)
            {
            System.out.println(e);
            }  
        }
       /* try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("insert into asignacioncursosalumnos values(?,?,?,?,?,?,?,?,?)");
            pst.setString(1, txt_id.getText().trim());
            pst.setString(2, lb1.getText().trim());
            pst.setString(3, lb2.getText().trim());
            pst.setString(4, lb3.getText().trim());
            pst.setString(5, lb4.getText().trim());
            pst.setString(6, lb5.getText().trim());
            pst.setString(7, lb6.getText().trim());
            pst.setString(8, lb7.getText().trim());
            pst.setString(9, txt_n.getText().trim());

            pst.executeUpdate();
            MostrarDB("asignacioncursosalumnos");
            JOptionPane.showMessageDialog(this, "¡REGISTRO EXITOSO!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);

            txt_n.setText("");
            txt_id.setText("");
            lb1.setText("");
            lb2.setText("");
            lb3.setText("");
            lb4.setText("");
            lb5.setText("");
            lb6.setText("");
            lb7.setText("");
            cbox_j.setSelectedIndex(0);
            cbox_curso.setSelectedIndex(0);
            cbox_sede.setSelectedIndex(0);
            cbox_carrera.setSelectedIndex(0);
            cbox_alum.setSelectedIndex(0);
            cbox_sec.setSelectedIndex(0);
            cbox_aula.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "¡REGITRO FALLIDO!", "Error", JOptionPane.ERROR_MESSAGE);

        }*/

        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public void IngresarMA(String ItemMA,String Item2MA,int Lugar)
    {
         try
            {
                String cero = "0";
                if(Item == ItemMA && Item2 == Item2MA)
                {
                    boolean prueba = true;
                    System.out.println(prueba);
                    if(prueba == true)
                    {
                        Connection cn4 = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
                        PreparedStatement pst4 = cn4.prepareStatement("insert into asignacioncursosalumnos values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    
                        pst4.setString(1, txt_Codigo.getText().trim());
                        pst4.setString(2, lb1.getText().trim());
                        pst4.setString(3, lb2.getText().trim());
                        pst4.setString(4, lb3.getText().trim());
                        pst4.setString(5, lb4.getText().trim());
                        pst4.setString(6, lb5.getText().trim());
                        pst4.setString(7, lb6.getText().trim());
                        pst4.setString(8, lb7.getText().trim());
                        pst4.setString(9,Item);
                        for(int i = 10;i<=18;i++)
                        {
                            if(i == Lugar)
                            {
                                pst4.setString(i,txt_Nota.getText().trim());
                            }
                            else
                            {
                                pst4.setString(i,"0");
                            }    
                        }

                        pst4.executeUpdate();
                        txt_Codigo.setText("");

                        System.out.println("Registrado");
                    }
                }
            }catch(Exception e)
            {
            System.out.println(e);
            }  
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String buscar = txtbuscado.getText().trim();
        if (buscar.isEmpty()) {
            JOptionPane.showMessageDialog(this, "¡No se ingreso el campo de busqueda!", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select * from asignacioncursosalumnos where id_Alumno = ?");
            pst.setString(1, txtbuscado.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_Codigo.setText(rs.getString("id_Alumno"));
                lb1.setText(rs.getString("codigo_carrera"));
                lb2.setText(rs.getString("codigo_sede"));
                lb3.setText(rs.getString("codigo_jornada"));
                lb4.setText(rs.getString("codigo_seccion"));
                lb5.setText(rs.getString("codigo_aula"));
                lb6.setText(rs.getString("codigo_curso"));
                lb7.setText(rs.getString("carnet_alumno"));
                txt_Nota.setText(rs.getString("nota_asignacioncursoalumnos"));

                btnEliminar.setEnabled(true);
                btnModificar.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, " no registrado.");
            }

        } catch (Exception err) {
            err.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("delete from asignacioncursosalumnos where id_Alumno = ?");

            pst.setString(1, txtbuscado.getText().trim());
            pst.executeUpdate();
            //MostrarDB("asignacioncursosalumnos");
            txtbuscado.setText("");

            JOptionPane.showMessageDialog(this, "REGISTRO ELIMINADO.", "Exito", JOptionPane.INFORMATION_MESSAGE);
            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);

            txt_Codigo.setText("");
            txt_Nota.setText("");
            lb1.setText("");
            lb2.setText("");
            lb3.setText("");
            lb4.setText("");
            lb5.setText("");
            lb6.setText("");
            lb7.setText("");
            cbox_carrera.setSelectedIndex(0);
            cbox_j.setSelectedIndex(0);
            cbox_aula.setSelectedIndex(0);
            cbox_alum.setSelectedIndex(0);
            cbox_sec.setSelectedIndex(0);
            cbox_sede.setSelectedIndex(0);
            cbox_curso.setSelectedIndex(0);
            txtbuscado.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error en la eliminación de registros.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            String codigo = txtbuscado.getText().trim();

            Connection cn = DriverManager.getConnection(Principal.BD, Principal.Usuario, Principal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("update asignacioncursosalumnos set id_Alumno =?,codigo_carrera = ? , codigo_sede= ? , codigo_jornada=? , codigo_seccion= ?, codigo_aula= ?,codigo_curso= ?,carnet_alumno= ?,nota_asignacioncursoalumnos=? where id_Alumno = " + codigo);

            pst.setString(1, txt_Codigo.getText().trim());
            pst.setString(2, lb1.getText().trim());
            pst.setString(3, lb2.getText().trim());
            pst.setString(4, lb3.getText().trim());
            pst.setString(5, lb4.getText().trim());
            pst.setString(6, lb5.getText().trim());
            pst.setString(7, lb6.getText().trim());
            pst.setString(8, lb7.getText().trim());
            pst.setString(9, txt_Nota.getText().trim());
            pst.executeUpdate();
           // MostrarDB("asignacioncursosalumnos");
            JOptionPane.showMessageDialog(this, "MODIFICACION EXITOSA.", "Exito", JOptionPane.INFORMATION_MESSAGE);

            btnEliminar.setEnabled(false);
            btnModificar.setEnabled(false);
            txt_Codigo.setText("");
            txt_Nota.setText("");
            lb1.setText("");
            lb2.setText("");
            lb3.setText("");
            lb4.setText("");
            lb5.setText("");
            lb6.setText("");
            lb7.setText("");
            cbox_carrera.setSelectedIndex(0);
            cbox_j.setSelectedIndex(0);
            cbox_aula.setSelectedIndex(0);
            cbox_alum.setSelectedIndex(0);
            cbox_sec.setSelectedIndex(0);
            cbox_sede.setSelectedIndex(0);
            cbox_curso.setSelectedIndex(0);
            txtbuscado.setText("");

        } catch (Exception e) {
            System.out.println(e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

        public boolean Busqueda()
    {
        try
        {
            Connection cnB = DriverManager.getConnection(Principal.BD,Principal.Usuario,Principal.Contraseña);
            PreparedStatement pstB = cnB.prepareStatement("select * from asignacioncursosalumnos where id_Alumno = ?");
            
            pstB.setString(1,txt_Codigo.getText().trim());
            ResultSet rsB = pstB.executeQuery();
           
            
            if(rsB.next())
            {
                Encontrado = true;
                
            }
            else
            {
                Encontrado = false;
               
            }
            
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        return Encontrado;
    }
        
        
    public void BusquedaMayor(String Parcial)
    {
        try
        {
            Connection cnB = DriverManager.getConnection(Principal.BD,Principal.Usuario,Principal.Contraseña);
            PreparedStatement pstB = cnB.prepareStatement("select * from asignacioncursosalumnos where id_Alumno = ?");
            
            pstB.setString(1,txt_Codigo.getText().trim());
            ResultSet rsB = pstB.executeQuery();
           
            
            if(rsB.next())
            {
                Parcial_1 = rsB.getString(Parcial);
                Parcial_Flotante = Float.parseFloat(Parcial_1);
                
                
                if(Parcial_Flotante > 0  && Parcial_Flotante !=0)
                {
                    EncontradoMayorCero = true;
                    System.out.println(Parcial_Flotante);
                  // Lugar(cnB,pstB,rsB,Parcial,Lugar);
                }
                else
                {
                EncontradoMayorCero = false;
                System.out.println(EncontradoMayorCero);
                }
                
            }

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
        
    private void txt_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CodigoActionPerformed

    private void txt_NotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NotaActionPerformed

    private void jComboBox_ParcialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_ParcialItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            if(this.jComboBox_Parcial.getSelectedIndex() >0)
            {
                this.jComboBox_Parcial2.setModel(new DefaultComboBoxModel(this.datos(this.jComboBox_Parcial.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_jComboBox_ParcialItemStateChanged

    private void txt_NotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NotaKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NotaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbox_alum;
    private javax.swing.JComboBox<String> cbox_aula;
    private javax.swing.JComboBox<String> cbox_carrera;
    private javax.swing.JComboBox<String> cbox_curso;
    private javax.swing.JComboBox<String> cbox_j;
    private javax.swing.JComboBox<String> cbox_sec;
    private javax.swing.JComboBox<String> cbox_sede;
    private javax.swing.JComboBox<String> jComboBox_Parcial;
    private javax.swing.JComboBox<String> jComboBox_Parcial2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JTable tblAsignacionA;
    private javax.swing.JTextField txt_Codigo;
    private javax.swing.JTextField txt_Nota;
    private javax.swing.JTextField txt_Nuevo;
    private javax.swing.JTextField txtbuscado;
    // End of variables declaration//GEN-END:variables
}
