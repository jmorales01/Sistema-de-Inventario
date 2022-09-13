
package Vista;

import Modulo.Artificios;
import Modulo.Cliente;
import Modulo.ClienteDAO;
import Modulo.DetalleVentas;
import Modulo.Kardex;
import Modulo.KardexDAO;
import Modulo.Producto;
import Modulo.ProductoDAO;
import Modulo.Ventas;
import Modulo.VentasDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormVentas extends javax.swing.JInternalFrame {

    // INSTANCIANDO CLASES
    VentasDAO vdao = new VentasDAO();
    ClienteDAO cdao = new ClienteDAO();
    ProductoDAO pdao = new ProductoDAO();
    Producto p = new Producto();
    Ventas v = new Ventas();
    DetalleVentas dv = new DetalleVentas();
    Cliente cliente = new Cliente();
    Kardex k = new Kardex();
    KardexDAO kdao = new KardexDAO();
    Artificios ar = new Artificios();
    
    DefaultTableModel modelo = new DefaultTableModel();
     
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
    
    public FormVentas() {
        initComponents();
        generarSerie();
        txtFecha.setText(ar.Fecha());
        usuarioMostrar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtComanda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        spnCantidad = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        txtCOD_PROD = new javax.swing.JTextField();
        btnBuscarCL = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnBuscarPR = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtIGV = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnGenerarVenta = new javax.swing.JButton();
        txtFecha = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("MODULO DE VENTAS");

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CABECERA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtComanda.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        txtComanda.setEnabled(false);
        jPanel2.add(txtComanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, 176, 30));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel5.setText("PUNTO DE VENTA BAZAR \"MARTHA\"");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 500, -1));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel7.setText("S/.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 30, 20));

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel8.setText("CLIENTE :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 90, 20));

        txtDescripcion.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        txtDescripcion.setEnabled(false);
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        jPanel2.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 370, 30));

        txtDNI.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        jPanel2.add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 110, -1));

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel9.setText("COD_PROD :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 20));

        txtPrecio.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        txtPrecio.setEnabled(false);
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 120, 70, -1));

        txtCliente.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        txtCliente.setEnabled(false);
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        jPanel2.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 300, -1));

        spnCantidad.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        jPanel2.add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 60, -1));

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel10.setText("DNI :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 40, 20));

        txtCOD_PROD.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 14)); // NOI18N
        txtCOD_PROD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCOD_PRODActionPerformed(evt);
            }
        });
        jPanel2.add(txtCOD_PROD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 110, -1));

        btnBuscarCL.setBackground(new java.awt.Color(153, 0, 0));
        btnBuscarCL.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        btnBuscarCL.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCL.setText("BUSCAR");
        btnBuscarCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCLActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarCL, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel11.setText("CANT :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 60, 20));

        btnBuscarPR.setBackground(new java.awt.Color(153, 0, 0));
        btnBuscarPR.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 11)); // NOI18N
        btnBuscarPR.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPR.setText("BUSCAR");
        btnBuscarPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPRActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscarPR, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

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
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 90, 40));

        txtUser.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        txtUser.setEnabled(false);
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DETALLE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Copperplate Gothic Bold", 0, 12))); // NOI18N

        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUM", "CODIGO", "PRODUCTO", "CANTIDAD", "UM", "P. UNIDAD", "IMPORTE"
            }
        ));
        jScrollPane1.setViewportView(TablaVentas);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 13)); // NOI18N
        jLabel1.setText("SUB TOTAL");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 18, 90, -1));

        txtSubTotal.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        txtSubTotal.setEnabled(false);
        jPanel3.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 12, 168, 27));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 13)); // NOI18N
        jLabel2.setText("IGV 18%");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 51, 90, -1));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 13)); // NOI18N
        jLabel3.setText("TOTAL");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 96, 90, -1));

        txtTotal.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        txtTotal.setEnabled(false);
        jPanel3.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 168, 27));

        txtIGV.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        txtIGV.setEnabled(false);
        jPanel3.add(txtIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 45, 168, 27));

        btnCancelar.setBackground(new java.awt.Color(102, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 220, 40));

        btnGenerarVenta.setBackground(new java.awt.Color(102, 0, 0));
        btnGenerarVenta.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        btnGenerarVenta.setText("GENERAR VENTA");
        btnGenerarVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarVentaActionPerformed(evt);
            }
        });
        jPanel3.add(btnGenerarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 220, 40));

        txtFecha.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        txtFecha.setEnabled(false);
        jPanel3.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 120, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtCOD_PRODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCOD_PRODActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCOD_PRODActionPerformed

    private void btnBuscarCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCLActionPerformed
        buscarCliente();
    }//GEN-LAST:event_btnBuscarCLActionPerformed

    private void btnBuscarPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPRActionPerformed
        buscarProducto();
    }//GEN-LAST:event_btnBuscarPRActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregarProducto();
        calcularTotales();
        limpiarProducto();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGenerarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarVentaActionPerformed
        if (txtTotal.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Debe ingresar una venta");
        }else
        {
            guardarVentas();
            guardarDetalle();
            guardarKardex();
            actualizarStock();
            limpiarTablaVentas();
            nuevaVenta();
            generarSerie();
            JOptionPane.showMessageDialog(this, "Se genero la venta exitosamente");
        }    
    }//GEN-LAST:event_btnGenerarVentaActionPerformed

    
    
    // #########################################################################
    // ################################ METODOS ################################
    
    void guardarVentas(){
        int idv = 1000;                // validar el funcionamiento de id empleado
        int idc = cliente.getId();
        
        // falta realizar un forr
        
        int comanda = Integer.parseInt(txtComanda.getText());
        double valVenta = tPagar;
        int items = TablaVentas.getRowCount();                  // Tamaño de la tabla vertical    
        String fecha = txtFecha.getText();          
                           
        v.setIdCliente(idc);
        v.setIdEmpleado(idv);
        v.setComanda(comanda);
        v.setMonto(valVenta);
        v.setItms(items);
        v.setFechaCreacion(fecha);
        
        vdao.GuardarVentas(v);
    }
    
    
    void guardarDetalle(){
        int idv = Integer.parseInt(vdao.corIdOrden());     // es la ultima numero ingresado por incremento
        
        //int idve = Integer.parseInt(idv);                                               // corIdOrden
        for (int i = 0; i < TablaVentas.getRowCount(); i++)
        {
            int cor = Integer.parseInt(TablaVentas.getValueAt(i, 0).toString());
            int idp = Integer.parseInt(TablaVentas.getValueAt(i, 1).toString());
            int cant = Integer.parseInt(TablaVentas.getValueAt(i, 3).toString());
            double pre = Double.parseDouble(TablaVentas.getValueAt(i, 5).toString());
            double igv = pre * 0.18;
            
            dv.setIdOrden(idv);
            dv.setIdProducto(idp);
            dv.setCorrelativo(cor);
            dv.setCantidad(cant);
            dv.setIgv(igv);
            dv.setImporte(pre);
            
            vdao.GuardarDetalleVentas(dv);
        }
        item = 0;
    }
    
    
    void guardarKardex(){
                                                    
        for (int i = 0; i < TablaVentas.getRowCount(); i++)
        {
            int documento = Integer.parseInt(txtComanda.getText());
            String motivo = "Venta";
            int producto = Integer.parseInt(TablaVentas.getValueAt(i, 1).toString());
            String descripcion = TablaVentas.getValueAt(i, 2).toString();
            int cantidad = Integer.parseInt(TablaVentas.getValueAt(i, 3).toString())*-1;
            String umv = TablaVentas.getValueAt(i, 4).toString();
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
    }
   
    
    void agregarProducto(){
        double importe;
        
        modelo = (DefaultTableModel)TablaVentas.getModel();
        item = item+1;
        idp = Integer.parseInt(txtCOD_PROD.getText());
        String nomp = txtDescripcion.getText();
        pre = Double.parseDouble(txtPrecio.getText());
        cant = Integer.parseInt(spnCantidad.getValue().toString());
        ump = ump;
        int stock = stk;
        importe = ar.formato(cant * pre);
        
        ArrayList lista = new ArrayList();
        if (stock > 0)
        {
            lista.add(item);
            lista.add(idp);
            lista.add(nomp);
            lista.add(cant);
            lista.add(ump);
            lista.add(pre);
            lista.add(importe);
            
            Object[] ob = new Object[7];
            ob[0] = lista.get(0);
            ob[1] = lista.get(1);
            ob[2] = lista.get(2);
            ob[3] = lista.get(3);
            ob[4] = lista.get(4);
            ob[5] = lista.get(5);
            ob[6] = lista.get(6);
            modelo.addRow(ob);
            TablaVentas.setModel(modelo);
            
        } else
        {
            JOptionPane.showMessageDialog(this,"En este momento cuenta con "+stock+" stock");
        }
    }
    
    
    void actualizarStock() {
        for (int i = 0; i < modelo.getRowCount(); i++)
        {
            Producto prd = new Producto();
            idp = Integer.parseInt(TablaVentas.getValueAt(i, 1).toString());
            cant = Integer.parseInt(TablaVentas.getValueAt(i, 3).toString());
            prd = pdao.listarID(idp);
            int sa = prd.getStok() - cant;
            pdao.actualizarStock(sa, idp);
        }
    }
    
    // ################################ CALCULAR EL TOTAL EL SUBTOTAL Y EL IGV ##################################
    
    void calcularTotales(){
        subTotal = 0;
        for (int i = 0; i < TablaVentas.getRowCount(); i++)
        {
            cant = Integer.parseInt(TablaVentas.getValueAt(i, 3).toString());
            pre = Double.parseDouble(TablaVentas.getValueAt(i, 5).toString());
            subTotal = subTotal + (cant*pre);
        }
        igv = subTotal*0.18;
        tPagar = subTotal+igv;
            
        txtSubTotal.setText(""+ar.formato(subTotal));   
        txtIGV.setText(""+ar.formato(igv));
        txtTotal.setText(""+ar.formato(tPagar));
    }
    
    
    
    // ########################### BUSCAR LOS DATOS DEL PRODUCTO ####################################
    
    void buscarProducto(){
        int id =  Integer.parseInt(txtCOD_PROD.getText());
        
        if (txtCOD_PROD.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Ingresa codigo producto");
        } else
        {
            Producto p  = pdao.listarID(id);
            if (p.getId() != 0)
            {
                txtDescripcion.setText(p.getDescripcion());
                txtPrecio.setText(" "+p.getPrecio());
                stk = p.getStok();
                ump = p.getFraccion();
            } else
            {
                JOptionPane.showMessageDialog(this,"Producto no encontrado");
                txtCOD_PROD.requestFocus();
            }
        }
       
    }
    
    
    
    // ################################## BUSCAR LOS DATOS DEL CLIENTE ################################

    void  buscarCliente(){
        int r;
        
        String cod = txtDNI.getText();
        
        if (txtDNI.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Ingresa DNI cliente");
        } else
        {
            cliente = cdao.listarID(cod);
            
            if (cliente.getDni() != null)
            {
                txtCliente.setText(cliente.getNombre()+", "+cliente.getApllido());
                txtCOD_PROD.requestFocus();
            } else
            {
                r = JOptionPane.showConfirmDialog(this,"Cliente no registrado, decea registrar?");
                if (r == 0)
                {
                    FormCliente cf = new FormCliente();
                    Index.VentanaPrincipal.add(cf);
                    cf.setVisible(true);
                }
            }
            
        }
    }
    
    
    
    
    // ################################ GENERA SERIE DE N° DE PEDIDO ###################################
    public void generarSerie(){
        int serie = vdao.corComanda();
        if (serie == 0)
        {
            txtComanda.setText("100000000");
        }else
        {
           int increment = serie;
           increment = increment + 1;
           txtComanda.setText(""+increment);
        }
    }
    
    
    public void usuarioMostrar(){
        Artificios ar = new Artificios();
        String archivo = "src\\Archivos\\Datos1.txt";
        txtUser.setText(ar.leerArchivo(archivo));
    }
    
    public void nuevaVenta() {
        txtCliente.setText("");
        txtDNI.setText("");
        txtCOD_PROD.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
        spnCantidad.setValue(0);
        txtCliente.requestFocus();
    }
    
    public void limpiarProducto(){
        txtCOD_PROD.setText("");
        txtDescripcion.setText("");
        spnCantidad.setValue(0);
        txtPrecio.setText("");
        txtCOD_PROD.requestFocus();
    }

    public void limpiarTablaVentas() {
        for (int i = 0; i < modelo.getRowCount(); i++)
        {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVentas;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarCL;
    private javax.swing.JButton btnBuscarPR;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTextField txtCOD_PROD;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtComanda;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIGV;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
