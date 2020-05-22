
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel Chacon
 */
public class ConsultasAsignacionAlumnos extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultasAsignacionAlumnos
     */
    public ConsultasAsignacionAlumnos() {
        initComponents();
        cboBuscarConsulta();
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
        buttonPrueba1 = new buttonPrueba.buttonPrueba();
        jScrollPane3 = new javax.swing.JScrollPane();
        combo = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        cboBuscar = new javax.swing.JComboBox<>();

        setClosable(true);
        setResizable(true);
        setVisible(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        buttonPrueba1.setText("buttonPrueba1");
        buttonPrueba1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                buttonPrueba1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        buttonPrueba1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPrueba1MouseClicked(evt);
            }
        });

        combo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        combo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carnet", "Nombre", "Curso", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(combo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(buttonPrueba1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(430, 430, 430)
                                .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonPrueba1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_status, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(cboBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPrueba1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPrueba1MouseClicked
        //Codigo que permite consultar registros en la base de datos
       DefaultTableModel modelo = new DefaultTableModel();
       
       try{
           
           Connection cnR = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pstR = cnR.prepareStatement("select * from asignacioncursosalumnos where carnet_alumno = ?");
            pstR.setString(1, cboBuscar.getSelectedItem().toString());
            ResultSet rsR = pstR.executeQuery();
                     
            if(rsR.next()){
                
                
           
           
                try{

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/siu", "root", "jorgito5828H");
            PreparedStatement pst = cn.prepareStatement("select * from asignacioncursosalumnos where carnet_alumno = ?");
            pst.setString(1, cboBuscar.getSelectedItem().toString());
            modelo.addColumn("Carnet");
            modelo.addColumn("Nombre");
            modelo.addColumn("Curso");
            modelo.addColumn("Nota");
            ResultSet rs = pst.executeQuery();   
            
               while(rs.next()){
                             
                String codigo_curso = "", carnet_alumno="";
                float nota = 0;     
                            
                        codigo_curso = String.valueOf(rs.getString("codigo_curso"));
                        carnet_alumno = String.valueOf(rs.getString("carnet_alumno"));   
                        nota = Float.parseFloat(rs.getString("nota_asignacioncursoalumnos"));
                
                        
                        
              PreparedStatement pst1 = cn.prepareStatement("select * from alumnos where carnet_alumno = " + carnet_alumno);
              ResultSet rs1 = pst1.executeQuery();
                
                
                while(rs1.next()){          
                        
                String nombre_alumno = "";                
                nombre_alumno = String.valueOf(rs1.getString("nombre_alumno"));            
                
                PreparedStatement pst2 = cn.prepareStatement("select * from cursos where codigo_curso = " + codigo_curso);
                ResultSet rs2 = pst2.executeQuery();
                
                
            while(rs2.next()){
             
                String nombre_curso = "";
                
                nombre_curso = String.valueOf(rs2.getString("nombre_curso"));
                    
                    Object filas[] = {carnet_alumno,nombre_alumno,nombre_curso,nota};
                    modelo.addRow(filas);
                    
                    combo.setModel(modelo);
                
              }                
                        
            }    
                
         }
            
          
            
        
            
        }catch(Exception e){
              JOptionPane.showMessageDialog(null, "Error");
        }
                
                
                
           
           
           
           
           
       }else{
               
               JOptionPane.showMessageDialog(null, "No estan");
               
               }
            
            
           
       }catch(Exception e){
           
           JOptionPane.showMessageDialog(null, "Error");
           
       }
       
       
           
        
        
          
        
        
    }//GEN-LAST:event_buttonPrueba1MouseClicked

    private void buttonPrueba1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_buttonPrueba1AncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_buttonPrueba1AncestorAdded

    public void cboBuscarConsulta(){
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
    private buttonPrueba.buttonPrueba buttonPrueba1;
    private javax.swing.JComboBox<String> cboBuscar;
    private javax.swing.JTable combo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_status;
    // End of variables declaration//GEN-END:variables
}
