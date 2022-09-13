
package Modulo;

import Vista.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EmpleadoDAO implements CRUD {

    Conexion conexion = new Conexion();
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    
    // ##################### EXTRAER LOS DATOS DE LA TABLA EMPLEADOS ####################
    
    public Empleado buscarEmpleado(String dni, String user) {
        Empleado em = new Empleado();
        String sql = "select * from empleado where dni =? and users =?";
        
        try
        {
            con = conexion.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                em.setId(rs.getInt(1));
                em.setDni(rs.getString(2));
                em.setNombre(rs.getString(3));
                em.setTelefono(rs.getInt(4));
                em.setEstado(rs.getString(5));
                em.setUsers(rs.getString(6));
            }
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos de usuario");
        }
        
        return em;
    }
    
    
    
    
    //####################### CRUD PARA EL MANTENIMIENTO DE LA BD #######################
    
    @Override
    public List listar() {
        List<Empleado> lista = new ArrayList<>();
        String sql = "select * from empleado";
        try
        {
            con = conexion.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next())
            {
                Empleado ev = new Empleado();
                ev.setId(rs.getInt(1));
                ev.setDni(rs.getString(2));
                ev.setNombre(rs.getString(3));
                ev.setTelefono(rs.getInt(4));
                ev.setDireccion(rs.getString(5));
                ev.setEdad(rs.getInt(6));
                ev.setSexo(rs.getString(7));
                ev.setFechaContrado(rs.getString(8));
                ev.setEstado(rs.getString(9));
                ev.setUsers(rs.getString(10));
                lista.add(ev);
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
        String sql = "insert into empleado(Dni, Nombre, Celular, Direccion, Edad, idSexo, FechaContratacion, idEstado, Users)values(?,?,?,?,?,?,?,?,?)";
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
            ps.setObject(8, o[7]);
            ps.setObject(9, o[8]);
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
        String sql = "update empleado set Dni=?, Nombre=?, Celular=?, Direccion=?, idEstado=? where idEmpleado =?";
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
            JOptionPane.showMessageDialog(null, "Error al actualizar");
        }
        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete from empleado where idEmpleado =?";
        try
        {
            con = conexion.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        }
    }

}
