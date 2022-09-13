
package Modulo;

import Vista.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author josel
 */
public class ProductoDAO implements CRUD {

    //EXTENCION DE CLASES
    Conexion conexion = new Conexion();
    Producto pro = new Producto();
    
    // ATRIBUTOS
    int r;
    
    // ATRIBUTOS DE CONEXION
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    // ################ METODO PARA ACTUALIZAR STOCK ######################
    
    public int actualizarStock(int cant, int idp) {
        String sql = "update producto set Stock =? where IdProducto =?";
        try
        {
            con = conexion.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setInt(2, idp);
            ps.executeUpdate();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al actualizar el stock");
        }
        return r;
    }
    
    
    // ################ METODO PARA LISTAR EN VENTAS ######################
    
    public Producto listarID(int cod){
        Producto p = new Producto();
        String sql = "select * from producto where IdProducto =?";
        try
        {
            con=conexion.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            rs=ps.executeQuery();
            while (rs.next())
            {                
                p.setId(rs.getInt(1));
                p.setDescripcion(rs.getString(2));
                p.setCategoria(rs.getString(3));
                p.setPrecio(rs.getDouble(4));
                p.setStok(rs.getInt(5));
                p.setFechaCreacion(rs.getString(6));
                p.setFraccion(rs.getString(7));
                p.setEstado(rs.getString(10));
            }
        } catch (Exception e)
        {
        }
        return p;
    }
    
    
    
    //####################### CRUD PARA EL MANTENIMIENTO DE LA BD ############################
    
    @Override
    public List listar() {
        List<Producto> lista = new ArrayList<>();
        String sql= "select * from producto";
        try
        {
            con = conexion.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next())
            {
                Producto p = new Producto();
                p.setId(rs.getInt(1));
                p.setDescripcion(rs.getString(2));
                p.setCategoria(rs.getString(3));
                p.setPrecio(rs.getDouble(4));
                p.setStok(rs.getInt(5));
                p.setFechaCreacion(rs.getString(6));
                p.setFraccion(rs.getString(7));
                p.setProveedor(rs.getInt(8));
                p.setTipo(rs.getString(9));
                p.setEstado(rs.getString(10));
                lista.add(p);
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos");
        }
        return lista;
    }
    
    @Override
    public int agregar(Object[] o) {
        int r=0;
        String sql = "insert into producto(idProducto, descripcion, idCategoria, Precio, Stock, FechaCreacion, idFraccion, idProveedor, idTipo, idEstProd) values(?,?,?,?,?,?,?,?,?,?)";
        try
        {
            con = conexion.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            ps.setObject(3,o[2]);
            ps.setObject(4,o[3]);
            ps.setObject(5,o[4]);
            ps.setObject(6,o[5]);
            ps.setObject(7,o[6]);
            ps.setObject(8,o[7]);
            ps.setObject(9,o[8]);
            ps.setObject(10,o[9]);
            r=ps.executeUpdate();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error, no se pudo agregar los datos");
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql = "update producto set descripcion=?, idCategoria=?, idFraccion=?, idTipo=?, idEstProd=? where idProducto=?";
        try
        {
            con = conexion.Conectar();
            ps = con.prepareStatement(sql);
            
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            ps.setObject(3,o[2]);
            ps.setObject(4,o[3]);
            ps.setObject(5,o[4]);
            ps.setObject(6,o[5]);
            
            r=ps.executeUpdate();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al actualizar [Solicita permiso al administrador de BD]");
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql= "delete from producto where idProducto =?";
        try
        {
            con = conexion.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al eliminar [Solicita permiso al administrador de BD]");
        }
    }
     
}
