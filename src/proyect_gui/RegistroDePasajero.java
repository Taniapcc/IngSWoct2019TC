package proyect_gui;

import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyect_metodos.Metodos;
import proyect_clases.Pasajero;
import java.awt.event.KeyEvent;
import Validaciones.Validaciones;

public class RegistroDePasajero extends javax.swing.JFrame {

    Pasajero pasajero = new Pasajero();
    Metodos metodos = new Metodos();
    DefaultTableModel mdlTabla;
    Vector vCabeceras = new Vector();
    Validaciones validar=new Validaciones ();
    
    
    public RegistroDePasajero() {
        initComponents();
        
        vCabeceras.addElement("NOMBRE");
        vCabeceras.addElement("APELLIDO");
        vCabeceras.addElement("TIPO");
        vCabeceras.addElement("CEDULA");
        vCabeceras.addElement("EDAD");
        mdlTabla = new DefaultTableModel(vCabeceras,0);
        table_pasajero.setModel(mdlTabla);
        table_pasajero.setModel(metodos.listaPasajero());             
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_p_nombre = new javax.swing.JTextField();
        txt_p_apellido = new javax.swing.JTextField();
        txt_p_cedula = new javax.swing.JTextField();
        txt_p_edad = new javax.swing.JTextField();
        txt_p_pasajero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_pasajero = new javax.swing.JTable();
        btn_p_guardar = new javax.swing.JButton();
        btn_p_mostar = new javax.swing.JButton();
        btn_p_salir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Cedula");

        jLabel4.setText("Edad");

        jLabel5.setText("Pasajero");

        txt_p_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_p_nombreActionPerformed(evt);
            }
        });
        txt_p_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_p_nombreKeyTyped(evt);
            }
        });

        txt_p_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_p_apellidoKeyTyped(evt);
            }
        });

        txt_p_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_p_cedulaKeyTyped(evt);
            }
        });

        txt_p_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_p_edadActionPerformed(evt);
            }
        });
        txt_p_edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_p_edadKeyTyped(evt);
            }
        });

        txt_p_pasajero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_p_pasajeroKeyTyped(evt);
            }
        });

        table_pasajero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "APELLIDO", "TIPO", "CEDULA", "EDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_pasajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_pasajeroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_pasajero);

        btn_p_guardar.setText("Guardar");
        btn_p_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_guardarActionPerformed(evt);
            }
        });

        btn_p_mostar.setText("Mostrar");
        btn_p_mostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_mostarActionPerformed(evt);
            }
        });

        btn_p_salir.setText("Salir");
        btn_p_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_p_salirActionPerformed(evt);
            }
        });

        jButton1.setText("Nuevo");

        jButton2.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(48, 48, 48)
                                .addComponent(btn_p_guardar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(41, 41, 41)
                                    .addComponent(txt_p_pasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(46, 46, 46)
                                        .addComponent(txt_p_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(59, 59, 59)
                                        .addComponent(txt_p_edad)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_p_mostar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jButton2)
                                .addGap(37, 37, 37)
                                .addComponent(btn_p_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(35, 35, 35)
                                    .addComponent(txt_p_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_p_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txt_p_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_p_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_p_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_p_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_p_pasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_p_guardar)
                    .addComponent(btn_p_mostar)
                    .addComponent(btn_p_salir)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDePasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegistroDePasajero().setVisible(true);
        });
    }
    
    private void btn_p_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_guardarActionPerformed
       // TODO add your handling code here:
        mdlTabla = new DefaultTableModel();
        
        String nombre_p = txt_p_nombre.getText();
        String apellido_p = txt_p_apellido.getText();
        String pasajero_p = txt_p_pasajero.getText();
        int cedula_p = Integer.parseInt(txt_p_cedula.getText());
        int edad_p = Integer.parseInt(txt_p_edad.getText());
        
        if( nombre_p.isEmpty())
            {
            JOptionPane.showMessageDialog(null, "Ingrese Nombre");
            }
        
        pasajero.setNombre_pasajero(nombre_p);
        pasajero.setApellido_pasajero(apellido_p);
        pasajero.setTipo_pasajero(pasajero_p);
        pasajero.setCedula_pasajero(cedula_p);
        pasajero.setEdad_pasajero(edad_p);
        
        
        metodos.guardar(pasajero);
        metodos.guardarArchivo(pasajero);
        table_pasajero.setModel(metodos.listaPasajero());       
    }//GEN-LAST:event_btn_p_guardarActionPerformed

    private void btn_p_mostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_mostarActionPerformed
        // Boton mostar pasajeros en tabla:
        table_pasajero.setModel(metodos.listaPasajero());
        
    }//GEN-LAST:event_btn_p_mostarActionPerformed

    private void txt_p_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_p_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_p_edadActionPerformed

    private void txt_p_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_p_cedulaKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (c <'0' || c >'9' ) evt.consume();
    }//GEN-LAST:event_txt_p_cedulaKeyTyped

    private void btn_p_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_p_salirActionPerformed
        // TODO add your handling code here:
        GUI_Principal b = new GUI_Principal();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_p_salirActionPerformed

    private void txt_p_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_p_nombreActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt_p_nombreActionPerformed

    private void txt_p_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_p_apellidoKeyTyped
        // TODO add your handling code here:
        validar.ValidarCaracteres(evt);
    }//GEN-LAST:event_txt_p_apellidoKeyTyped

    private void txt_p_pasajeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_p_pasajeroKeyTyped
        // TODO add your handling code here:
        validar.ValidarCaracteres(evt);
    }//GEN-LAST:event_txt_p_pasajeroKeyTyped

    private void txt_p_edadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_p_edadKeyTyped
        // TODO add your handling code here:
        validar.ValidarNumeros(evt);
    }//GEN-LAST:event_txt_p_edadKeyTyped

    private void txt_p_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_p_nombreKeyTyped
        // TODO add your handling code here:
        validar.ValidarCaracteres(evt);
    }//GEN-LAST:event_txt_p_nombreKeyTyped

    private void table_pasajeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_pasajeroMouseClicked
        // TODO add your handling code here:
        
        int row = (int)  table_pasajero.getSelectedRow();
      String nombre_p = (String) table_pasajero.getModel().getValueAt(row, 0);
        String apellido_p = (String) table_pasajero.getModel().getValueAt(row, 1);
        String pasajero_p = (String) table_pasajero.getModel().getValueAt(row, 2);
        String cedula_p= (String) table_pasajero.getModel().getValueAt(row, 3);
        String edad_p = (String) table_pasajero.getModel().getValueAt(row, 4);
        
               
        txt_p_nombre.setText(nombre_p);
        txt_p_apellido.setText(apellido_p);
        txt_p_pasajero.setText(pasajero_p);
        txt_p_cedula.setText(cedula_p);
        txt_p_edad.setText(edad_p);
        
             
        
        
        
        
    }//GEN-LAST:event_table_pasajeroMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_p_guardar;
    private javax.swing.JButton btn_p_mostar;
    private javax.swing.JButton btn_p_salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_pasajero;
    private javax.swing.JTextField txt_p_apellido;
    private javax.swing.JTextField txt_p_cedula;
    private javax.swing.JTextField txt_p_edad;
    private javax.swing.JTextField txt_p_nombre;
    private javax.swing.JTextField txt_p_pasajero;
    // End of variables declaration//GEN-END:variables

    
}
