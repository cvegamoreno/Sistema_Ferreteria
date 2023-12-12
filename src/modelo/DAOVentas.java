/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class DAOVentas {
    
    Conexion oCon;
    Connection con;
    PreparedStatement pst;

    private final String SQLAGREGAR = "SELECT * FROM productos where nombre = ?";
    private final String SQLEDITAR = "update ventas SET venta_id= ?, nombre =?, descripcion=?, precio_unitario =?, stock =?, medidas =? WHERE venta_id =?";
    private final String SQLELIMINAR = "DELETE FROM ventas WHERE venta_id=?";
    private final String SQLVER = "select * from ventas";

    public DAOVentas() {
        oCon = new Conexion();
        con = oCon.conectar();
    }
    
    public void DatosDelProducto(DTOProducto objeto) {
        try {
            pst = con.prepareStatement(SQLAGREGAR);
            pst.setString(1, objeto.getNombreProd());

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                objeto.setIdProducto(rs.getInt("producto_id"));
                objeto.setNombreProd(rs.getString("nombre"));
                objeto.setDescripcionprod(rs.getString("descripcion"));
                objeto.setStock(rs.getInt("stock"));
                objeto.setPrecioprod(rs.getDouble("precio_unitario"));
            }

        } catch (SQLException e) {
            System.out.println("Error al obtener datos del producto, " + e);
        }
    }
}
