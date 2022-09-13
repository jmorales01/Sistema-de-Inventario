
package Vista;

import Modulo.Artificios;
import Modulo.ClienteDAO;



public class Reg_Cliente extends javax.swing.JInternalFrame {

    
    ClienteDAO cdao = new ClienteDAO();
    Artificios ar = new Artificios();
    
    public Reg_Cliente() {
        initComponents();
        txtFecha.setText(ar.FechaHora());
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Imagen = new javax.swing.JLabel();
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
        btnAgregar = new javax.swing.JToggleButton();
        btnLimpiar = new javax.swing.JToggleButton();
        txtCorreo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        cbxSexo = new javax.swing.JComboBox<>();
        txtEdad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setTitle("REGISTRO");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Imagen.setBackground(new java.awt.Color(255, 255, 255));
        Imagen.setForeground(new java.awt.Color(255, 255, 255));
        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Icono-Martha.png"))); // NOI18N
        Imagen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 132));

        jPanel2.setBackground(new java.awt.Color(78, 125, 125));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDireccion.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 220, -1));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel2.setText("CORREO  :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 100, -1));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel3.setText("NOMBRE  :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel4.setText("STATUS  :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 80, 20));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel5.setText("EDAD  :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 75, -1));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel6.setText("APELLIDO  :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, -1));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel7.setText("DIRECION  :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, -1));

        cbxStatus.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        cbxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "CN", "DS", "RC" }));
        jPanel2.add(cbxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 90, -1));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel8.setText("SEXO  :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 75, -1));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel9.setText("FECHA  :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 75, -1));

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

        txtCorreo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 220, -1));

        txtNombre.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 220, -1));

        txtApellido.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 220, -1));

        txtFecha.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        txtFecha.setEnabled(false);
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 110, -1));

        cbxSexo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "M", "F" }));
        jPanel2.add(cbxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 80, -1));

        txtEdad.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jPanel2.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 60, -1));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel12.setText("CELULAR  :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 100, -1));

        txtCelular.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jPanel2.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 220, -1));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel10.setText("DNI  :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, -1));

        txtDni.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 220, -1));

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

    // ################### METODOS ######################
    
    public void agregar() {
        Object[] ob = new Object[10];

        ob[0] = Integer.parseInt(txtDni.getText());
        ob[1] = txtNombre.getText();
        ob[2] = txtApellido.getText();
        ob[3] = txtDireccion.getText();
        ob[4] = Integer.parseInt(txtCelular.getText());
        ob[5] = cbxSexo.getSelectedItem().toString();
        ob[6] = Integer.parseInt(txtEdad.getText());
        ob[7] = txtFecha.getText();
        ob[8] = txtCorreo.getText();
        ob[9] = cbxStatus.getSelectedItem().toString();
        cdao.agregar(ob);
    }
    
    public void nuevo() {
        txtCorreo.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtEdad.setText("");
        cbxSexo.setSelectedItem("seleccionar");
        txtFecha.setText("");
        cbxStatus.setSelectedItem("seleccionar");
        txtDni.setText("");
        txtCelular.setText("");
        txtDni.requestFocus();
    }
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imagen;
    private javax.swing.JToggleButton btnAgregar;
    private javax.swing.JToggleButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JComboBox<String> cbxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
