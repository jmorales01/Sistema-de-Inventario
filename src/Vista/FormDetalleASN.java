
package Vista;
import Modulo.Artificios;
import Modulo.Compras;
import Modulo.ComprasDAO;
import Modulo.DetalleCompra;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormDetalleASN extends javax.swing.JInternalFrame {

    ComprasDAO dao = new ComprasDAO();
    Compras cl = new Compras();
    Artificios ar = new Artificios();
    DefaultTableModel modelo = new DefaultTableModel();
    int id;
    
    public FormDetalleASN() {
        initComponents();
        //listarId();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalleASN = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("DETALLE ASN");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel3.setText("PRODUCTO :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, 20));

        txtDNI.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jPanel2.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 170, -1));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel6.setText("CELULAR :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 80, 20));

        txtCelular.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        jPanel2.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 200, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reset-24.png"))); // NOI18N
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search-24.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("REGISTRO"));

        tablaDetalleASN.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tablaDetalleASN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "COD", "PRODUCTO", "CANTIDAD"
            }
        ));
        tablaDetalleASN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDetalleASNMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDetalleASN);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaDetalleASNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDetalleASNMouseClicked
        int fila = tablaDetalleASN.getSelectedRow();
        
        if (fila == -1)
        {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        } else
        {
            id = Integer.parseInt(tablaDetalleASN.getValueAt(fila,0).toString());
            String dni = tablaDetalleASN.getValueAt(fila,1).toString();
            String nom = tablaDetalleASN.getValueAt(fila,2).toString();
            String dir = tablaDetalleASN.getValueAt(fila,4).toString();
            String cel = tablaDetalleASN.getValueAt(fila,5).toString();
            String corr = tablaDetalleASN.getValueAt(fila,8).toString();
            String es = tablaDetalleASN.getValueAt(fila,9).toString();
            
            txtDNI.setText(dni);
            txtCelular.setText(cel);
            
        }
    }//GEN-LAST:event_tablaDetalleASNMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        limpiarTabla();
        listarId();
    }//GEN-LAST:event_jLabel8MouseClicked

    
    // #########################################################################
    // ################################ METODOS ################################
    
    void listarId() {
        int id = 100000;
        List<DetalleCompra> lista = (List<DetalleCompra>) dao.listarID(id);
        modelo = (DefaultTableModel) tablaDetalleASN.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < 5; i++)
        {
            ob[0] = lista.get(i).getId();
            ob[1] = lista.get(i).getIdProducto();
            ob[2] = lista.get(i).getProducto();
            ob[3] = lista.get(i).getCantidad();
            modelo.addRow(ob);
        }
        tablaDetalleASN.setModel(modelo);
    }
    
//    void actualizar(){
//        int fila = tablaASN.getSelectedRow();
//        if (fila == -1)
//        {
//            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
//        } else
//        {
//            Object[] ob = new Object[5];
//
//            ob[0] = txtNombre.getText();
//            ob[1] = txtDireccion.getText();
//            ob[2] = txtCelular.getText();
//            ob[2] = txtCorreo.getText();
//            ob[3] = cbxEstado.getSelectedItem().toString();
//            ob[4] = id;
//            dao.actualizar(ob);
//        } 
//    }
//    
//    void eliminar(){
//        int fila = tablaASN.getSelectedRow();
//        int ids = Integer.parseInt(tablaASN.getValueAt(fila, 0).toString());
//        if (fila == -1)
//        {
//            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
//        }else
//        {
//            dao.eliminar(ids);
//        }
//    }
//    
//    void nuevo(){
//        txtDNI.setText("");
//        txtNombre.setText("");
//        txtDireccion.setText("");
//        txtCelular.setText("");
//        txtCorreo.setText("");
//        cbxEstado.setSelectedItem("seleccionar");
//        txtDNI.requestFocus();
//    }
//    
    void limpiarTabla(){
        for (int i = 0; i < modelo.getRowCount(); i++)
        {
            modelo.removeRow(i);
            i=i-1;
        }
    }
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDetalleASN;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDNI;
    // End of variables declaration//GEN-END:variables
}
