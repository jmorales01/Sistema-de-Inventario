
package Vista;

import Modulo.Artificios;
import Modulo.Kardex;
import Modulo.KardexDAO;
import Modulo.Producto;
import Modulo.ProductoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormKardex extends javax.swing.JInternalFrame {

    // INSTANCIANDO CLASES
    KardexDAO kdao = new KardexDAO();
    Kardex k = new Kardex();
    Artificios ar = new Artificios();
    DefaultTableModel modelo = new DefaultTableModel();
    ProductoDAO pdao = new ProductoDAO();
     
    // ATRIBUTOS DE LA CLASE
     int idp;
     String ump;
     int stk;
     int item = 0;
     double pre;
     int cant;
     double subTotal;
     double igv;
     double tPagar;
    
    public FormKardex() {
        initComponents();
        listar();
        usuarioMostrar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtReal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnAjustar = new javax.swing.JButton();
        cbxMotivo = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Reset = new javax.swing.JLabel();
        txtActual = new javax.swing.JTextField();
        txtUMV = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaKardex = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("KARDEX");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CABECERA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel8.setText("producto :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 90, 20));

        txtCodigo.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 110, -1));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel9.setText("COD :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 60, 20));

        txtReal.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        txtReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRealActionPerformed(evt);
            }
        });
        jPanel2.add(txtReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 80, -1));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel11.setText("CANT Real :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 110, 20));

        btnAjustar.setBackground(new java.awt.Color(0, 0, 153));
        btnAjustar.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        btnAjustar.setForeground(new java.awt.Color(255, 255, 255));
        btnAjustar.setText("AJUSTAR");
        btnAjustar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAjustar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjustarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAjustar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 100, 40));

        cbxMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Merma", "Inventario", "Robo", "Politica", "Uso Local", "Otros" }));
        jPanel2.add(cbxMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 110, -1));

        jLabel13.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel13.setText("CANT ACTUAL :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 140, 20));

        jLabel14.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel14.setText("UMV :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 80, 20));

        txtProducto.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        txtProducto.setEnabled(false);
        txtProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductoActionPerformed(evt);
            }
        });
        jPanel2.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 310, -1));

        btnBuscar.setBackground(new java.awt.Color(153, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventory.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, 140, 140));

        Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reset-24.png"))); // NOI18N
        Reset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetMouseClicked(evt);
            }
        });
        jPanel2.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtActual.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        txtActual.setEnabled(false);
        txtActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualActionPerformed(evt);
            }
        });
        jPanel2.add(txtActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 80, -1));

        txtUMV.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        txtUMV.setEnabled(false);
        txtUMV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUMVActionPerformed(evt);
            }
        });
        jPanel2.add(txtUMV, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 110, -1));

        txtUser.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        txtUser.setEnabled(false);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 90, -1));

        jLabel15.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel15.setText("MOTIVO :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 80, 20));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DETALLE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12))); // NOI18N

        TablaKardex.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DOCUMENTO", "MOTIVO", "CODIGO", "DESCRIPCION", "CANTIDAD", "UMV", "USUARIO", "FECHA"
            }
        ));
        jScrollPane1.setViewportView(TablaKardex);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRealActionPerformed

    private void btnAjustarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjustarActionPerformed
        actualizarStock();
        guardarKardex();
        limpiarTablaVentas();
        listar();
        JOptionPane.showMessageDialog(this,"ajuste exitoso");
    }//GEN-LAST:event_btnAjustarActionPerformed

    private void txtProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       buscarProductos();
       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void ResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetMouseClicked
        limpiarTablaVentas();
        listar();
    }//GEN-LAST:event_ResetMouseClicked

    private void txtActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualActionPerformed

    private void txtUMVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUMVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUMVActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    
    // #########################################################################
    // ################################ METODOS ################################
    
    public void listar() {
        List<Kardex> lista = kdao.listar();
        modelo = (DefaultTableModel) TablaKardex.getModel();
        Object[] ob = new Object[9];
        for (int i = 0; i < lista.size(); i++)
        {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getDocumento();
            ob[2] = lista.get(i).getMotivo();
            ob[3] = lista.get(i).getProducto();
            ob[4] = lista.get(i).getDescripcion();
            ob[5] = lista.get(i).getCantidad();
            ob[6] = lista.get(i).getUmv();
            ob[7] = lista.get(i).getUsuario();
            ob[8] = lista.get(i).getFecha();
            modelo.addRow(ob);
        }
        TablaKardex.setModel(modelo);
    }
     
    // #################### BUSCAR LOS DATOS DEL PRODUCTO ######################
    void buscarProducto(){
        int id =  Integer.parseInt(txtCodigo.getText());
        
        if (txtCodigo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Ingresa codigo producto");
        } else
        {
            Kardex k  = kdao.listarProd(id);
            if (k.getId() != 0)
            {
                List<Kardex> lista = (List<Kardex>) kdao.listarProd(id);
                modelo = (DefaultTableModel) TablaKardex.getModel();
                Object[] ob = new Object[9];
                for (int i = 0; i < lista.size(); i++)
                {
                    ob[0] = lista.get(i).getId();
                    ob[1] = lista.get(i).getDocumento();
                    ob[2] = lista.get(i).getMotivo();
                    ob[3] = lista.get(i).getProducto();
                    ob[4] = lista.get(i).getDescripcion();
                    ob[5] = lista.get(i).getCantidad();
                    ob[6] = lista.get(i).getUmv();
                    ob[7] = lista.get(i).getUsuario();
                    ob[8] = lista.get(i).getFecha();
                    modelo.addRow(ob);
                }
                TablaKardex.setModel(modelo);
            } else
            {
                JOptionPane.showMessageDialog(this,"Producto no encontrado");
                txtCodigo.requestFocus();
            }
        }
       
    }
    
    void limpiarTablaVentas() {
        for (int i = 0; i < modelo.getRowCount(); i++)
        {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    
    void actualizarStock() {
        Producto prd = new Producto();
        idp = Integer.parseInt(txtCodigo.getText());
        cant = Integer.parseInt(txtReal.getText());
        pdao.actualizarStock(cant, idp);

    }
    
    void guardarKardex(){                                       
            int documento = 11111111;
            String motivo = cbxMotivo.getSelectedItem().toString();
            int producto = Integer.parseInt(txtCodigo.getText());
            String descripcion = txtProducto.getText();
            int cantidad = Integer.parseInt(txtReal.getText()) - Integer.parseInt(txtActual.getText());
            String umv = txtUMV.getText();
            String usuario = txtUser.getText();
            
            k.setDocumento(documento);
            k.setMotivo(motivo);
            k.setProducto(producto);
            k.setDescripcion(descripcion);
            k.setCantidad(cantidad);
            k.setUmv(umv);
            k.setUsuario(usuario);
            kdao.guardarKardex(k);

    }
    
    public void buscarProductos(){
        int id =  Integer.parseInt(txtCodigo.getText());
        
        if (txtCodigo.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Ingresa codigo producto");
        } else
        {
            Producto p  = pdao.listarID(id);
            if (p.getId() != 0)
            {
                txtProducto.setText(p.getDescripcion());
                txtUMV.setText(""+p.getFraccion());
                txtActual.setText(""+ p.getStok());
            } else
            {
                JOptionPane.showMessageDialog(this,"Producto no encontrado");
                txtCodigo.requestFocus();
            }
        }
       
    }
    
    void usuarioMostrar(){
        Artificios ar = new Artificios();
        String archivo = "src\\Archivos\\Datos1.txt";
        txtUser.setText(ar.leerArchivo(archivo));
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Reset;
    private javax.swing.JTable TablaKardex;
    private javax.swing.JButton btnAjustar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbxMotivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtActual;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtReal;
    private javax.swing.JTextField txtUMV;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
