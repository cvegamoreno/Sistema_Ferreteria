
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    Connection con=null;
    private final String DB="bd_ferreteria";
    private final String URL = "jdbc:mysql://localhost:3306/"+DB;
    private final String USER = "root";
    private final String PASSWORD  = "";
    
    public Connection conectar(){
         try {
            con =DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
     
    public void cerrarConexion(){
        try {
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
