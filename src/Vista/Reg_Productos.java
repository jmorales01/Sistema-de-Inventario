
package Vista;

import Modulo.Artificios;
import Modulo.EmpleadoDAO;


public class Reg_Productos extends javax.swing.JInternalFrame {

    
    EmpleadoDAO udao = new EmpleadoDAO();
    Artificios ar = new Artificios();
    
    
    public Reg_Productos() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JToggleButton();
        btnLimpiar = new javax.swing.JToggleButton();
        txtEan = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        cbxFraccion = new javax.swing.JComboBox<>();
        txtStock = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox<>();
        txtPrecion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbxProveedor = new javax.swing.JComboBox<>();
        cbxStatus2 = new javax.swing.JComboBox<>();
        cbxEstado = new javax.swing.JComboBox<>();

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

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel2.setText("EAN  :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, -1));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel3.setText("DESCRIP  :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 110, -1));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel4.setText("STATUS  :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 80, -1));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel5.setText("PRECIO  :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, -1));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel6.setText("CATEGORIA  :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, -1));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel7.setText("TIPO  :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 60, -1));

        cbxTipo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "T1", "T2", "T3", "T4" }));
        jPanel2.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 80, -1));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel8.setText("FRACCION  :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, -1));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel9.setText("FECHA  :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 75, -1));

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

        txtEan.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jPanel2.add(txtEan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 220, -1));

        txtDescripcion.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jPanel2.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 220, -1));

        txtFecha.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        txtFecha.setEnabled(false);
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 110, -1));

        cbxFraccion.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        cbxFraccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "N", "Y" }));
        jPanel2.add(cbxFraccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 210, -1));

        txtStock.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jPanel2.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 60, -1));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel12.setText("STOCK  :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 75, -1));

        cbxCategoria.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "NUEVO", "PRUEBA", "TEMPORADA", "MERMA", "DESCONTINU", "BAJA" }));
        jPanel2.add(cbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 200, -1));

        txtPrecion.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jPanel2.add(txtPrecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 70, -1));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel10.setText("PROVEEDOR  :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 120, -1));

        cbxProveedor.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        cbxProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "1000", "1001", "1002", "1003", "1004", "1005", "1006", "1007", "1008", "1009", "1010" }));
        jPanel2.add(cbxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 190, -1));

        cbxStatus2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        cbxStatus2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "AC", "DS", "EL", "PB" }));
        jPanel2.add(cbxStatus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 190, -1));

        cbxEstado.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "AC", "DS", "EL", "PB" }));
        jPanel2.add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 90, -1));

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

        ob[0] = Integer.parseInt(txtEan.getText());
        ob[1] = txtDescripcion.getText();
        ob[2] = cbxCategoria.getSelectedItem().toString();
        ob[3] = Double.parseDouble(txtPrecion.getText());
        ob[4] = Integer.parseInt(txtStock.getText());
        ob[5] = txtFecha.getText();
        ob[6] = cbxFraccion.getSelectedItem().toString();
        ob[7] = 1000;//Integer.parseInt(cbxProveedor.getSelectedItem().toString());
        ob[8] = cbxTipo.getSelectedItem().toString();
        ob[9] = cbxEstado.getSelectedItem().toString();
        udao.agregar(ob);
    }
    
    public void nuevo() {
        txtEan.setText("");
        txtDescripcion.setText("");
        cbxCategoria.setSelectedItem("seleccionar");
        txtPrecion.setText("");
        txtStock.setText("");
        txtFecha.setText("");
        cbxFraccion.setSelectedItem("seleccionar");
        cbxProveedor.setSelectedItem("seleccionar");
        cbxTipo.setSelectedItem("seleccionar");
        cbxEstado.setSelectedItem("seleccionar");
    }
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAgregar;
    private javax.swing.JToggleButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxFraccion;
    private javax.swing.JComboBox<String> cbxProveedor;
    private javax.swing.JComboBox<String> cbxStatus2;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEan;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPrecion;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
