
package Modulo;

import Vista.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ClienteDAO implements CRUD {

    Conexion conexion= new Conexion();
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    // ########################### BUSCAR CLIENTE PARA ORDEN ###############################

    public Cliente listarID(String dni){
        Cliente c = new Cliente();
        String sql = "select * from cliente where Dni =?";
        try
        {
            con=conexion.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            rs=ps.executeQuery();
            
            while (rs.next())
            {                
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApllido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCelular(rs.getInt(6));
                c.setSexo(rs.getString(7));
                c.setEdad(rs.getInt(8));
                c.setFechaCreacion(rs.getString(9));
                c.setCorreo(rs.getString(10));
                c.setEstado(rs.getString(11));
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos");
        }
        return c;
    }

    //########################### CRUD PARA EL MANTENIMIENTO DE LA BD ###########################
    
    @Override
    public List listar() {
        List<Cliente> lista = new ArrayList<>();
        String sql= "select * from cliente";
        try
        {
            con = conexion.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next())
            {
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setApllido(rs.getString(4));
                c.setDireccion(rs.getString(5));
                c.setCelular(rs.getInt(6));
                c.setSexo(rs.getString(7));
                c.setEdad(rs.getInt(8));
                c.setFechaCreacion(rs.getString(9));
                c.setCorreo(rs.getString(10));
                c.setEstado(rs.getString(11));
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
        int r=0;
        String sql = "insert into cliente(Dni, Nombre, Apellido, Direccion, Celular, idSexo, Edad, FechaCreacion, Correo, idEstado)values(?,?,?,?,?,?,?,?,?,?)";
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
        String sql = "update cliente set Nombre =?, Direccion=?, Celular=?, Correo=? idEstado=? where idCliente=?";
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
        String sql= "delete from cliente where idCliente =?";
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
