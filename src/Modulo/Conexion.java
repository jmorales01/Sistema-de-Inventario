
package Modulo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {

    Connection con;
    
    private static final String driver="com.mysql.cj.jdbc.Driver";
    private static final String user="root";
    private static final String pass="Mor@le$24";
    private static final String url="jdbc:mysql://localhost:3306/proyectofinal"+"?useUnicode=true&use"
            +"JDBCCompliabtTimezoneShift=true&useLegacyDatetimeCode=false&"+"serverTimezone=UTC";
    
    public Connection Conectar() {
        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(url, user, pass);
            //if (con != null) {JOptionPane.showConfirmDialog(null,"Conexion establecida");}
        } 
        catch (Exception e) {
            JOptionPane.showConfirmDialog(null,"Error de conexion en la BD" + e);
        }
        return con;
    }
}
