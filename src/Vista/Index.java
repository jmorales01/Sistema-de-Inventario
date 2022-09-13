
package Vista;

import Vista.Rep_ProductosTop;
import Vista.Rep_VendedorDia;
import Vista.Rep_VentasMes;
import Modulo.Artificios;
import java.awt.Image;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author josel
 */
public class Index extends javax.swing.JFrame {

    Artificios ar = new Artificios();
    public Index() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        usuarioMostrar();
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        VentanaPrincipal = new javax.swing.JDesktopPane();
        txtUserss = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuVentas = new javax.swing.JMenu();
        mitmRealizarV = new javax.swing.JMenuItem();
        mitmCliente = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        mnuInventario = new javax.swing.JMenu();
        mitmKardex = new javax.swing.JMenuItem();
        mitmProductos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mnuRecepcion = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        mnuReportes = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnProductoTop = new javax.swing.JMenuItem();
        mnVendedorDia = new javax.swing.JMenuItem();
        mnVentasMes = new javax.swing.JMenuItem();
        mnuUsuario = new javax.swing.JMenu();
        mitmUser = new javax.swing.JMenuItem();
        mitmSalir = new javax.swing.JMenuItem();
        mnuRecursos = new javax.swing.JMenu();
        mitmiReport = new javax.swing.JMenuItem();
        mitmitextPDF = new javax.swing.JMenuItem();
        mitmjFreeChart = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnSoporte = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VentanaPrincipal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtUserss.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        txtUserss.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUserss.setEnabled(false);
        VentanaPrincipal.add(txtUserss);
        txtUserss.setBounds(860, 60, 90, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_64.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        VentanaPrincipal.add(jLabel1);
        jLabel1.setBounds(870, 0, 100, 71);
        VentanaPrincipal.add(jLabel2);
        jLabel2.setBounds(0, 0, 0, 0);

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 255));
        jMenuBar1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 14)); // NOI18N

        mnuVentas.setBackground(new java.awt.Color(0, 153, 255));
        mnuVentas.setText("Ventas");
        mnuVentas.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        mnuVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVentasActionPerformed(evt);
            }
        });

        mitmRealizarV.setText("Realizar Venta");
        mitmRealizarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmRealizarVActionPerformed(evt);
            }
        });
        mnuVentas.add(mitmRealizarV);

        mitmCliente.setText("Cliente");
        mitmCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmClienteActionPerformed(evt);
            }
        });
        mnuVentas.add(mitmCliente);

        jMenuItem9.setText("Enviar EMAIL");
        mnuVentas.add(jMenuItem9);

        jMenuBar1.add(mnuVentas);

        mnuInventario.setBackground(new java.awt.Color(0, 153, 255));
        mnuInventario.setText("Inventario");
        mnuInventario.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        mnuInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInventarioActionPerformed(evt);
            }
        });

        mitmKardex.setText("Kardex");
        mitmKardex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmKardexActionPerformed(evt);
            }
        });
        mnuInventario.add(mitmKardex);

        mitmProductos.setText("Productos");
        mitmProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmProductosActionPerformed(evt);
            }
        });
        mnuInventario.add(mitmProductos);

        jMenu1.setText("Ajustes");
        mnuInventario.add(jMenu1);

        jMenuBar1.add(mnuInventario);

        mnuRecepcion.setBackground(new java.awt.Color(0, 153, 255));
        mnuRecepcion.setText("Recepcion");
        mnuRecepcion.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N

        jMenuItem1.setText("ASN");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuRecepcion.add(jMenuItem1);

        jMenuItem3.setText("Orden Compra");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuRecepcion.add(jMenuItem3);

        jMenuBar1.add(mnuRecepcion);

        mnuReportes.setBackground(new java.awt.Color(0, 153, 255));
        mnuReportes.setText("Reportes");
        mnuReportes.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N

        jMenuItem5.setText("Ventas Hoy");
        mnuReportes.add(jMenuItem5);

        jMenuItem4.setText("Ingresos");
        mnuReportes.add(jMenuItem4);

        mnProductoTop.setText("Producto Top");
        mnProductoTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnProductoTopActionPerformed(evt);
            }
        });
        mnuReportes.add(mnProductoTop);

        mnVendedorDia.setText("Vendedor del Dia");
        mnVendedorDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVendedorDiaActionPerformed(evt);
            }
        });
        mnuReportes.add(mnVendedorDia);

        mnVentasMes.setText("Ventas Mes");
        mnVentasMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVentasMesActionPerformed(evt);
            }
        });
        mnuReportes.add(mnVentasMes);

        jMenuBar1.add(mnuReportes);

        mnuUsuario.setBackground(new java.awt.Color(0, 153, 255));
        mnuUsuario.setText("Usuarios");
        mnuUsuario.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        mnuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUsuarioActionPerformed(evt);
            }
        });

        mitmUser.setText("Usuario");
        mitmUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmUserActionPerformed(evt);
            }
        });
        mnuUsuario.add(mitmUser);

        mitmSalir.setText("Salir");
        mitmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmSalirActionPerformed(evt);
            }
        });
        mnuUsuario.add(mitmSalir);

        jMenuBar1.add(mnuUsuario);

        mnuRecursos.setText("Recursos");
        mnuRecursos.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N

        mitmiReport.setText("iReport");
        mitmiReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmiReportActionPerformed(evt);
            }
        });
        mnuRecursos.add(mitmiReport);

        mitmitextPDF.setText("itextPDF");
        mitmitextPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmitextPDFActionPerformed(evt);
            }
        });
        mnuRecursos.add(mitmitextPDF);

        mitmjFreeChart.setText("jFreeChart");
        mitmjFreeChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitmjFreeChartActionPerformed(evt);
            }
        });
        mnuRecursos.add(mitmjFreeChart);

        jMenuBar1.add(mnuRecursos);

        mnuAyuda.setBackground(new java.awt.Color(0, 153, 255));
        mnuAyuda.setText("Ayuda");
        mnuAyuda.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N

        mnSoporte.setText("Soporte");
        mnSoporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSoporteActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnSoporte);

        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitmProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmProductosActionPerformed
        FormProducto pf = new FormProducto();
        ar.CentrarVentana(pf);
    }//GEN-LAST:event_mitmProductosActionPerformed

    private void mnuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUsuarioActionPerformed
        // MENU PRINCIPAL
    }//GEN-LAST:event_mnuUsuarioActionPerformed

    private void mnuVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVentasActionPerformed
        // MENU PRINCIPAL
    }//GEN-LAST:event_mnuVentasActionPerformed

    private void mitmRealizarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmRealizarVActionPerformed
        FormVentas vf = new FormVentas();
        ar.CentrarVentana(vf);
    }//GEN-LAST:event_mitmRealizarVActionPerformed

    private void mnuInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInventarioActionPerformed
        // MENU PRINCIPAL
    }//GEN-LAST:event_mnuInventarioActionPerformed

    private void mitmUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmUserActionPerformed
        FormVendedor vnf = new FormVendedor();
        ar.CentrarVentana(vnf);
    }//GEN-LAST:event_mitmUserActionPerformed

    private void mitmClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmClienteActionPerformed
        FormCliente cf = new FormCliente();
        ar.CentrarVentana(cf);
    }//GEN-LAST:event_mitmClienteActionPerformed

    private void mnVendedorDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVendedorDiaActionPerformed
        Rep_VendedorDia vd = new Rep_VendedorDia();
        ar.CentrarVentana(vd);
    }//GEN-LAST:event_mnVendedorDiaActionPerformed

    private void mnVentasMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVentasMesActionPerformed
        Rep_VentasMes vm = new Rep_VentasMes();
        ar.CentrarVentana(vm);
    }//GEN-LAST:event_mnVentasMesActionPerformed

    private void mnProductoTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnProductoTopActionPerformed
        Rep_ProductosTop pt = new Rep_ProductosTop();
        ar.CentrarVentana(pt);
    }//GEN-LAST:event_mnProductoTopActionPerformed

    private void mnSoporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSoporteActionPerformed
        Soporte sp = new Soporte();
        ar.CentrarVentana(sp);
    }//GEN-LAST:event_mnSoporteActionPerformed

    private void mitmKardexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmKardexActionPerformed
        FormKardex fk = new FormKardex();
        ar.CentrarVentana(fk);
    }//GEN-LAST:event_mitmKardexActionPerformed

    private void mitmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmSalirActionPerformed
        LogIn in = new LogIn();
        in.setVisible(true);
        String archivo = "src\\Archivos\\Datos1.txt";
        ar.eliminarArchivos(archivo);
        try
        {
            ar.crearArchivos(archivo);
        } catch (FileNotFoundException ex)
        {
            
        }
        
        dispose();
    }//GEN-LAST:event_mitmSalirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FormASN asn = new FormASN();
        ar.CentrarVentana(asn);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FormOrdenCompra oc = new FormOrdenCompra();
        ar.CentrarVentana(oc);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void mitmiReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmiReportActionPerformed
        iReport();
    }//GEN-LAST:event_mitmiReportActionPerformed

    private void mitmitextPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmitextPDFActionPerformed
        itextPDF();
    }//GEN-LAST:event_mitmitextPDFActionPerformed

    private void mitmjFreeChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitmjFreeChartActionPerformed
        jFreeChart();
    }//GEN-LAST:event_mitmjFreeChartActionPerformed

    
    
    
    
    public void usuarioMostrar(){
        Artificios ar = new Artificios();
        String archivo = "src\\Archivos\\Datos1.txt";
        txtUserss.setText(ar.leerArchivo(archivo));
    }
    
    
    public void borrarUsuario(){
        
    }
    
    public void ajustarImagen(JLabel labelName, String ruta){
        ImageIcon image = new ImageIcon(ruta);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    
    
    public void iReport(){
        if (java.awt.Desktop.isDesktopSupported())
        {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE))
            {
                try
                {
                    java.net.URI uri = new java.net.URI("https://sourceforge.net/projects/ireport/");
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex)
                {
                    JOptionPane.showMessageDialog(null, ex);

                }
            }
        }
    }
    
    
    public void itextPDF(){
        if (java.awt.Desktop.isDesktopSupported())
        {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE))
            {
                try
                {
                    java.net.URI uri = new java.net.URI("https://itextpdf.com/en");
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex)
                {
                    JOptionPane.showMessageDialog(null, ex);

                }
            }
        }
    }
    
    
    public void jFreeChart(){
        if (java.awt.Desktop.isDesktopSupported())
        {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();

            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE))
            {
                try
                {
                    java.net.URI uri = new java.net.URI("https://www.jfree.org/jfreechart/");
                    desktop.browse(uri);
                } catch (URISyntaxException | IOException ex)
                {
                    JOptionPane.showMessageDialog(null, ex);

                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem mitmCliente;
    private javax.swing.JMenuItem mitmKardex;
    private javax.swing.JMenuItem mitmProductos;
    private javax.swing.JMenuItem mitmRealizarV;
    private javax.swing.JMenuItem mitmSalir;
    private javax.swing.JMenuItem mitmUser;
    private javax.swing.JMenuItem mitmiReport;
    private javax.swing.JMenuItem mitmitextPDF;
    private javax.swing.JMenuItem mitmjFreeChart;
    private javax.swing.JMenuItem mnProductoTop;
    private javax.swing.JMenuItem mnSoporte;
    private javax.swing.JMenuItem mnVendedorDia;
    private javax.swing.JMenuItem mnVentasMes;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenu mnuInventario;
    private javax.swing.JMenu mnuRecepcion;
    private javax.swing.JMenu mnuRecursos;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JMenu mnuUsuario;
    private javax.swing.JMenu mnuVentas;
    private javax.swing.JTextField txtUserss;
    // End of variables declaration//GEN-END:variables
}
