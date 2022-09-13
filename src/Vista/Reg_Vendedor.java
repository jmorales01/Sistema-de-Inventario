
package Vista;

import Modulo.Artificios;
import Modulo.EmpleadoDAO;


public class Reg_Vendedor extends javax.swing.JInternalFrame {

    
    EmpleadoDAO udao = new EmpleadoDAO();
    Artificios ar = new Artificios();
    
    
    public Reg_Vendedor() {
        initComponents();
        txtFecha.setText(ar.FechaHora());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtDireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxStatus = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JToggleButton();
        btnLimpiar = new javax.swing.JToggleButton();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        cbxSexo = new javax.swing.JComboBox<>();
        txtEdad = new javax.swing.JTextField();
        btnGenerarUsuario = new javax.swing.JToggleButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setTitle("REGISTRO");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icono-Martha.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 132));

        jPanel2.setBackground(new java.awt.Color(78, 125, 125));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDireccion.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 220, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel2.setText("DNI  :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, -1));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE  :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel4.setText("STATUS  :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 80, -1));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel5.setText("EDAD  :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 75, -1));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel6.setText("CELULAR  :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, -1));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel7.setText("DIREC  :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, -1));

        cbxStatus.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        cbxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "CN", "DS", "RC" }));
        jPanel2.add(cbxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 90, -1));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel8.setText("SEXO  :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 75, -1));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel9.setText("FECHA  :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 75, -1));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel10.setText("USUARIO  :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 120, 20));

        btnAgregar.setBackground(new java.awt.Color(153, 0, 0));
        btnAgregar.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 142, 38));

        btnLimpiar.setBackground(new java.awt.Color(153, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 142, 38));

        txtDni.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 220, -1));

        txtNombre.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 220, -1));

        txtCelular.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jPanel2.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 220, -1));

        txtFecha.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        txtFecha.setEnabled(false);
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 110, -1));

        txtUsuario.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 120, 30));

        cbxSexo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "M", "F" }));
        jPanel2.add(cbxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 80, -1));

        txtEdad.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jPanel2.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 60, -1));

        btnGenerarUsuario.setBackground(new java.awt.Color(0, 0, 102));
        btnGenerarUsuario.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        btnGenerarUsuario.setText("Generar Usuario");
        btnGenerarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(btnGenerarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 40, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 370, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        nuevo();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGenerarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarUsuarioActionPerformed
        generarUsua();
    }//GEN-LAST:event_btnGenerarUsuarioActionPerformed

    // ################### METODOS ######################
    
    public void agregar() {
        Object[] ob = new Object[9];

        ob[0] = txtDni.getText();
        ob[1] = txtNombre.getText();
        ob[2] = Integer.parseInt(txtCelular.getText());
        ob[3] = txtDireccion.getText();
        ob[4] = Integer.parseInt(txtEdad.getText());
        ob[5] = cbxSexo.getSelectedItem().toString();
        ob[6] = txtFecha.getText();
        ob[7] = cbxStatus.getSelectedItem().toString();
        ob[8] = txtUsuario.getText();
        udao.agregar(ob);
    }
    
    public void nuevo() {
        txtDni.setText("");
        txtNombre.setText("");
        txtCelular.setText("");
        txtDireccion.setText("");
        txtEdad.setText("");
        cbxSexo.setSelectedItem("seleccionar");
        txtFecha.setText("");
        cbxStatus.setSelectedItem("seleccionar");
        txtUsuario.setText("");
    }
    
    public String generarUsua(){
        String user;
        
        user = "Falta";
        
        txtUsuario.setText(user);
        return user;
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAgregar;
    private javax.swing.JToggleButton btnGenerarUsuario;
    private javax.swing.JToggleButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JComboBox<String> cbxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
