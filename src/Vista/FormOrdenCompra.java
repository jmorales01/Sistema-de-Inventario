
package Vista;

import Modulo.Artificios;
import Modulo.ComprasDAO;
import Modulo.Producto;
import Modulo.ProductoDAO;
import javax.swing.JOptionPane;



public class FormOrdenCompra extends javax.swing.JInternalFrame {

    ProductoDAO pdao = new ProductoDAO();
    ComprasDAO cdao = new ComprasDAO();
    
    public FormOrdenCompra() {
        initComponents();
        usuarioMostrar();
        generarSerie();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtComanda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        btnBuscarCL = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDNI1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDNI2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("MODULO DE COMPRAS");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CABECERA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtComanda.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        txtComanda.setEnabled(false);
        jPanel2.add(txtComanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 130, 30));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel5.setText("ORDEN DE COMPRA \"MARTHA\"");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 440, -1));

        txtCodigo.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 160, -1));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel9.setText("DESCRIPCION :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 130, 20));

        spnCantidad.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        jPanel2.add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 80, -1));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel10.setText("PRODUCT O:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 110, 20));

        txtDescripcion.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        txtDescripcion.setEnabled(false);
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel2.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 290, -1));

        btnBuscarCL.setBackground(new java.awt.Color(153, 0, 0));
        btnBuscarCL.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        btnBuscarCL.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCL.setText("BUSCAR");
        btnBuscarCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCLActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarCL, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 70, 90, -1));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel11.setText("CANT :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 60, 20));

        btnAgregar.setBackground(new java.awt.Color(0, 0, 153));
        btnAgregar.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("AGREGAR");
        btnAgregar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 80, 30));

        txtUser.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        txtUser.setEnabled(false);
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save-36.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 50, 50));

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel12.setText("PROVEEDOR:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 110, 20));

        txtDNI1.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        txtDNI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNI1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtDNI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 120, -1));

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel13.setText("Fc.ENTREGA:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, 120, 20));

        txtDNI2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        txtDNI2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNI2ActionPerformed(evt);
            }
        });
        jPanel2.add(txtDNI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delet-24.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/list-24.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reset-24.png"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DETALLE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12))); // NOI18N

        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUM", "CODIGO", "PRODUCTO", "CANTIDAD", "UM", "P. UNIDAD", "IMPORTE"
            }
        ));
        jScrollPane1.setViewportView(TablaVentas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void btnBuscarCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCLActionPerformed
        buscarProducto();
    }//GEN-LAST:event_btnBuscarCLActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtDNI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNI1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNI1ActionPerformed

    private void txtDNI2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNI2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNI2ActionPerformed

    
    
    
    public void buscarProducto(){
        int id =  Integer.parseInt(txtCodigo.getText());
        
        if (txtCodigo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Ingresa codigo producto");
        } else
        {
            Producto p  = pdao.listarID(id);
            if (p.getId() != 0)
            {
                txtDescripcion.setText(p.getDescripcion());
            } else
            {
                JOptionPane.showMessageDialog(this,"Producto no encontrado");
                txtCodigo.requestFocus();
            }
        }
       
    }
    
    public void generarSerie(){
        int serie = cdao.corCompra();
        if (serie == 0)
        {
            txtComanda.setText("100000");
        }else
        {
           int increment = serie;
           increment = increment + 1;
           txtComanda.setText(""+increment);
        }
    }
    
    
    
    void usuarioMostrar(){
        Artificios ar = new Artificios();
        String archivo = "C:\\Users\\josel\\Documents\\NetBeansProjects\\POO_ProyectoMARTA_v2.0\\src\\Archivos\\Datos1.txt";
        txtUser.setText(ar.leerArchivo(archivo));
    }
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVentas;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComanda;
    private javax.swing.JTextField txtDNI1;
    private javax.swing.JTextField txtDNI2;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
