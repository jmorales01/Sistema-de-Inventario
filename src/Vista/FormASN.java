
package Vista;
import Modulo.Artificios;
import Modulo.Compras;
import Modulo.ComprasDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormASN extends javax.swing.JInternalFrame {

    ComprasDAO dao = new ComprasDAO();
    Compras cl = new Compras();
    Artificios ar = new Artificios();
    DefaultTableModel modelo = new DefaultTableModel();
    int id;
    
    public FormASN() {
        initComponents();
        listar();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtEntrega = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnReset = new javax.swing.JLabel();
        btnDelet = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCreada = new javax.swing.JTextField();
        btnCart = new javax.swing.JLabel();
        btnDetalle = new javax.swing.JLabel();
        Search = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaASN = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("ASN's  DE RECEPCION");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel3.setText("ID COMPRA :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 20));

        txtEntrega.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jPanel2.add(txtEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 190, -1));

        txtId.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 110, -1));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel5.setText("FEC ENTREGA :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 110, 20));

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reset-24.png"))); // NOI18N
        btnReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        jPanel2.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 128, -1, 30));

        btnDelet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delet-24.png"))); // NOI18N
        btnDelet.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelet.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnDeletAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(btnDelet, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 128, -1, 30));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel10.setText("FEC CREADA :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 100, 20));

        txtCreada.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jPanel2.add(txtCreada, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 190, -1));

        btnCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cart-24.png"))); // NOI18N
        btnCart.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCartMouseClicked(evt);
            }
        });
        jPanel2.add(btnCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 128, -1, 30));

        btnDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/detail-24.png"))); // NOI18N
        btnDetalle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDetalleMouseClicked(evt);
            }
        });
        jPanel2.add(btnDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 128, -1, 30));

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-24.png"))); // NOI18N
        Search.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO"));

        tablaASN.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tablaASN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PROVEEDOR", "DIRECCION", "FEC_COMPRA", "FEC_RECEPCION", "USUARIO_COMPRA", "ESTADO"
            }
        ));
        tablaASN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaASNMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaASN);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaASNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaASNMouseClicked
        int fila = tablaASN.getSelectedRow();
        
        if (fila == -1)
        {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        } else
        {
            id = Integer.parseInt(tablaASN.getValueAt(fila,0).toString());
            String fecCreada = tablaASN.getValueAt(fila,3).toString();
            String fecEntrega = tablaASN.getValueAt(fila,4).toString();
            
            txtId.setText(id+"");
            txtEntrega.setText(fecCreada);
            txtCreada.setText(fecEntrega);
            
        }
    }//GEN-LAST:event_tablaASNMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        limpiarTabla();
        listar();
        nuevo();
        
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnDeletAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnDeletAncestorAdded
        //eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnDeletAncestorAdded

    private void btnDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDetalleMouseClicked
        if (txtId.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "selecciona un asn");
        } else
        {
            FormDetalleASN dasn = new FormDetalleASN();
            ar.CentrarVentana(dasn);
        }
    }//GEN-LAST:event_btnDetalleMouseClicked

    private void btnCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCartMouseClicked
        FormOrdenCompra oc = new FormOrdenCompra();
        ar.CentrarVentana(oc);
    }//GEN-LAST:event_btnCartMouseClicked

    
    // #########################################################################
    // ################################ METODOS ################################
    
    void listar() {
        List<Compras> lista = dao.listar();
        modelo = (DefaultTableModel) tablaASN.getModel();
        Object[] ob = new Object[7];
        for (int i = 0; i < lista.size(); i++)
        {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getProvvedor();
            ob[2] = lista.get(i).getDireccion();
            ob[3] = lista.get(i).getFechaCompra();
            ob[4] = lista.get(i).getFechaEntrega();
            ob[5] = lista.get(i).getUsuarioCompra();
            ob[6] = lista.get(i).getEstado();
            modelo.addRow(ob);
        }
        tablaASN.setModel(modelo);
    }
    
    
    
    void eliminar(){
        int fila = tablaASN.getSelectedRow();
        int ids = Integer.parseInt(tablaASN.getValueAt(fila, 0).toString());
        if (fila == -1)
        {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }else
        {
            dao.eliminar(ids);
        }
    }
    
    void nuevo(){
        txtId.setText("");
        txtCreada.setText("");
        txtEntrega.setText("");
    }
    
    void limpiarTabla(){
        for (int i = 0; i < modelo.getRowCount(); i++)
        {
            modelo.removeRow(i);
            i=i-1;
        }
    }
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Search;
    private javax.swing.JLabel btnCart;
    private javax.swing.JLabel btnDelet;
    private javax.swing.JLabel btnDetalle;
    private javax.swing.JLabel btnReset;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaASN;
    private javax.swing.JTextField txtCreada;
    private javax.swing.JTextField txtEntrega;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
