
package Modulo;

import Vista.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ComprasDAO implements CRUD{

    
    Conexion conexion = new Conexion();

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    // ################# CORRELATIVO PARA LA ORDEN DE COMPRA ##############
    public int corCompra(){
        int serie = 0;
        String sql = "select max(idCompra) from compra";
        
        try
        {
            con = conexion.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next())
            {                
                serie = rs.getInt(1);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Correlativo no generada");
        }
        return serie;
    }
    
    

    // ########################### BUSCAR CLIENTE PARA ORDEN ###############################
    public DetalleCompra listarID(int id) {
        List<DetalleCompra> lista = new ArrayList<>();
        
        String sql = "select d.idCompra, d.idProducto, p.descripcion, d.Cantidad from detallecompra d inner join producto p  on d.idProducto = p.idProducto  where idCompra = ?";
        try
        {
            DetalleCompra dc = new DetalleCompra();
            con = conexion.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next())
            {
                dc.setId(rs.getInt(1));
                dc.setIdProducto(rs.getInt(2));
                dc.setProducto(rs.getString(3));
                dc.setCantidad(rs.getInt(4));
                lista.add(dc);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos");
        }
        return (DetalleCompra) lista;
    }

    //*************** CRUD PARA EL MANTENIMIENTO DE LA BD ******************
    @Override
    public List listar() {
        List<Compras> lista = new ArrayList<>();
        String sql = "select c.idCompra, p.Nombre , c.DireccionEntrega, c.FechaCompra , c.FechaEntrega, c.UsuarioCompra, c.estado from compra c inner join proveedor p on c.idProveedor = p.idProveedor";
        try
        {
            con = conexion.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next())
            {
                Compras c = new Compras();
                c.setId(rs.getInt(1));
                c.setProvvedor(rs.getString(2));
                c.setDireccion(rs.getString(3));
                c.setFechaCompra(rs.getString(4));
                c.setFechaEntrega(rs.getString(5));
                c.setUsuarioCompra(rs.getString(6));
                c.setEstado(rs.getString(7));
                lista.add(c);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos");
        }
        return lista;
    }

    @Override
    public int agregar(Object[] o) {
        int r = 0;
        String sql = "insert into compra (idProveedor, DireccionEntrega, FechaCompra, FechaEntrega, UsuarioCompra, estado)values(?,?,?,?,?,?)";
        try
        {
            con = conexion.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error, no se pudo agregar los datos");
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
//        String sql = "update cliente set Nombre =?, Direccion=?, Celular=?, Correo=? idEstado=? where idCliente=?";
//        try
//        {
//            con = conexion.Conectar();
//            ps = con.prepareStatement(sql);
//            ps.setObject(1, o[0]);
//            ps.setObject(2, o[1]);
//            ps.setObject(3, o[2]);
//            ps.setObject(4, o[3]);
//            ps.setObject(5, o[4]);
//            ps.setObject(6, o[5]);
//            r = ps.executeUpdate();
//        } catch (Exception e)
//        {
//            JOptionPane.showMessageDialog(null, "Error al actualizar [Solicita permiso al administrador de BD]");
//        }
        return r;
    }

    @Override
    public void eliminar(int id) {
//        String sql = "delete from cliente where idCliente =?";
//        try
//        {
//            con = conexion.Conectar();
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, id);
//            ps.executeUpdate();
//        } catch (Exception e)
//        {
//            JOptionPane.showMessageDialog(null, "Error al eliminar [Solicita permiso al administrador de BD]");
//        }
    }
}
