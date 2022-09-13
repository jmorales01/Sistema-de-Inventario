
package Modulo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class VentasDAO {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r = 0;
    
    
    // ################# CORRELATIVO PARA LA COMANDA ##############
    
    public int corComanda(){
        int serie = 0;
        String sql = "select max(comanda) from orden";
        
        try
        {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next())
            {                
                serie = rs.getInt(1);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Comanda no generada");
        }
        return serie;
    }
    
    
    // ################ CORRELATIVO AUTO INCREMENTABLE PARA EL IDOREDEN ###############
    
    public String corIdOrden(){
        String idv = null;
        String sql = "select max(idOrden) from orden";
        
        try
        {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next())
            {
                idv = rs.getString(1);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Numero de orden no generada");
        }
        return idv;
    }
    
    
    // ################ UPDATE DB ORDEN #####################
    
    public int GuardarVentas(Ventas v){
        //Ventas ventas = new Ventas();
        String sql = "insert into orden(IdCliente, idEmpleado, Comanda, ValorVenta, items, FechaCreacion)values(?,?,?,?,?,?)";
        
        try
        {
           con = cn.Conectar();
           ps = con.prepareStatement(sql);
           
           ps.setInt(1, v.getIdCliente());
           ps.setInt(2, v.getIdEmpleado());
           ps.setInt(3, v.getComanda());
           ps.setDouble(4, v.getMonto());
           ps.setInt(5, v.getItms());
           ps.setString(6, v.getFechaCreacion());
           
           r = ps.executeUpdate();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Orden no guardada");
        }
        return r;
    }
    
    
    // ################# UPDATE DB DETALLE ORDEN ##################
    
    public int GuardarDetalleVentas(DetalleVentas dv){
        String sql = "insert into detalleorden() value(?,?,?,?,?,?)";
        
        try
        {
           con = cn.Conectar();
           ps = con.prepareStatement(sql);
           
           ps.setInt(1, dv.getIdOrden());
           ps.setInt(2, dv.getIdProducto());
           ps.setInt(3, dv.getCorrelativo());
           ps.setInt(4, dv.getCantidad());
           ps.setDouble(5, dv.getIgv());
           ps.setDouble(6, dv.getImporte());
           
           r = ps.executeUpdate();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Detalle orden no guardada");
        }
        return r;
    }
}
