
package Modulo;

import Vista.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class KardexDAO implements CRUD{

    //EXTENCION DE CLASES
    Conexion conexion = new Conexion();
    Producto pro = new Producto();
    
    // ATRIBUTOS DE CONEXION
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int aux = 0;
    
    // ################ METODO PARA LISTAR EN VENTAS ######################
    public Kardex listarProd(int cod) {
        Kardex k = new Kardex();
        String sql = "select * from kardex where idProducto =?";
        try
        {
            con = conexion.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            rs = ps.executeQuery();
            while (rs.next())
            {
                k.setId(rs.getInt(1));
                k.setDocumento(rs.getInt(2));
                k.setMotivo(rs.getString(3));
                k.setProducto(rs.getInt(4));
                k.setDescripcion(rs.getString(5));
                k.setCantidad(rs.getInt(6));
                k.setUmv(rs.getString(7));
                k.setUsuario(rs.getString(8));
                k.setFecha(rs.getString(9));
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al cargar kardex");
        }
        return k;
    }
    
    
    public int guardarKardex(Kardex k) {
        String sql = "insert into kardex(Documento, Motivo, idProducto, Descripcion, Cantidad, UMV, usuario) values(?,?,?,?,?,?,?)";

        try
        {
            con = conexion.Conectar();
            ps = con.prepareStatement(sql);

            ps.setInt(1, k.getDocumento());
            ps.setString(2, k.getMotivo());
            ps.setInt(3, k.getProducto());
            ps.setString(4, k.getDescripcion());
            ps.setInt(5, k.getCantidad());
            ps.setString(6, k.getUmv());
            ps.setString(7, k.getUsuario());

            aux = ps.executeUpdate();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al guardar kardex");
        }
        return aux;
    }

    @Override
    public List listar() {
        List<Kardex> lista = new ArrayList<>();
        String sql = "select * from kardex order by fecha desc";
        try
        {
            con = conexion.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next())
            {
                Kardex k = new Kardex();
                k.setId(rs.getInt(1));
                k.setDocumento(rs.getInt(2));
                k.setMotivo(rs.getString(3));
                k.setProducto(rs.getInt(4));
                k.setDescripcion(rs.getString(5));
                k.setCantidad(rs.getInt(6));
                k.setUmv(rs.getString(7));
                k.setUsuario(rs.getString(8));
                k.setFecha(rs.getString(9));
                lista.add(k);
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
        String sql = "insert into kardex(Documento, Motivo, idProducto, Descripcion, Cantidad, UMV, usuario) values(?,?,?,?,?,?,?)";
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
            ps.setObject(7, o[6]);
            r = ps.executeUpdate();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error, no se pudo agregar los datos");
        }
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
