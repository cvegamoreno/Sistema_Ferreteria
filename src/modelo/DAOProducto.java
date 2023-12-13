/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class DAOProducto {

    Conexion oCon;
    Connection con;
    PreparedStatement pst;

    private final String SQLINSERTAR = "insert into productos(producto_id, nombre, descripcion, precio_unitario, stock) values(?,?,?,?,?)";
    private final String SQLEDITAR = "update productos SET producto_id= ?, nombre =?, descripcion=?, precio_unitario =?, stock =? WHERE producto_id =?";
    private final String SQLELIMINAR = "DELETE FROM productos WHERE producto_id=?";
    private final String SQLVER = "select * from productos";
    private final String SQLBUSCAR = "SELECT nombre, stock FROM productos where nombre = ?";

    public DAOProducto() {
        oCon = new Conexion();
        con = oCon.conectar();
    }

    public void agregarProducto(DTOProducto objeto) {
        try {
            // Verificar que no haya campos vacíos
            if (objeto.getNombreProd().isEmpty() || objeto.getDescripcionprod().isEmpty() || objeto.getPrecioprod() <= 0 || objeto.getStock() < 0) {
                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Sale del método si hay campos vacíos
            }

            pst = con.prepareStatement(SQLINSERTAR);
            pst.setInt(1, objeto.getIdProducto());
            pst.setString(2, objeto.getNombreProd());
            pst.setString(3, objeto.getDescripcionprod());
            pst.setDouble(4, objeto.getPrecioprod());
            pst.setInt(5, objeto.getStock());
            pst.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            oCon.cerrarConexion();
        }
    }

    public void editarProducto(DTOProducto objeto) {
        try {

            // Verificar que no haya campos vacíos
            if (objeto.getNombreProd().isEmpty() || objeto.getDescripcionprod().isEmpty() || objeto.getPrecioprod() <= 0 || objeto.getStock() < 0) {
                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Sale del método si hay campos vacíos
            }
            pst = con.prepareStatement(SQLEDITAR);
            pst.setInt(1, objeto.getIdProducto());
            pst.setString(2, objeto.getNombreProd());
            pst.setString(3, objeto.getDescripcionprod());
            pst.setDouble(4, objeto.getPrecioprod());
            pst.setInt(5, objeto.getStock());
            pst.setInt(6, objeto.getIdProducto());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            oCon.cerrarConexion();
        }
    }

    public void eliminarProducto(DTOProducto objeto) {

        try {

            pst = con.prepareStatement(SQLELIMINAR);
            pst.setInt(1, objeto.getIdProducto());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            oCon.cerrarConexion();
        }
    }
    
    public void buscar(DTOProducto objeto) {
        try {
            pst = con.prepareStatement(SQLBUSCAR);
            pst.setString(1, objeto.getNombreProd());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                objeto.setNombreProd(rs.getString("nombre"));
                objeto.setStock(rs.getInt("stock"));
                objeto.setResultadoEncontrado(true);
            } else {
                objeto.setResultadoEncontrado(false);
            }
        } catch (SQLException e) {
            System.out.println("¡Error al buscar producto!, " + e);
        } finally {
            
        }
    }

    public DefaultTableModel verProducto() {
        DefaultTableModel modeloProducto = new DefaultTableModel();

        try {

            ResultSet rs;
            pst = con.prepareStatement(SQLVER);
            rs = pst.executeQuery();
            String[] datos = new String[5];
            String[] titulo = {"ID", "NOMBRE PRODUCTO", "DESCRIPCION", "PRECIO UNITARIO", "STOCK"};
            modeloProducto.setColumnIdentifiers(titulo);
            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt(1));
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = String.valueOf(rs.getDouble(4));
                datos[4] = String.valueOf(rs.getInt(5));
                modeloProducto.addRow(datos);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOProducto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            oCon.cerrarConexion();
        }

        return modeloProducto;
    }
}
