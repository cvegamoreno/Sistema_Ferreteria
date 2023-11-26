/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class DAOCliente {

    Conexion oCon;
    Connection con;
    PreparedStatement pst;

    private final String SQLINSERTAR = "insert into clientes(cliente_id, nombre, direccion, telefono, tipo_cliente_id, numerocli) values(?,?,?,?,?,?)";
    private final String SQLEDITAR = "update clientes SET producto_id= ?, nombre =?, descripcion=?, precio_unitario =?, stock =?, medidas =? WHERE producto_id =?";
    private final String SQLELIMINAR = "DELETE FROM clientes WHERE producto_id=?";
    private final String SQLVER = "select * from clientes";

    public DAOCliente() {
        oCon = new Conexion();
        con = oCon.conectar();
    }

    public void agregar(DTOCliente objeto) {
        try {

            pst = con.prepareStatement(SQLINSERTAR);
            pst.setInt(1, objeto.getIdCliente());
            pst.setString(2, objeto.getNombreCliente());
            pst.setString(3, objeto.getDireccion());
            pst.setString(4, objeto.getTelefono());
            pst.setInt(5, objeto.getIdTipoCliente());
            pst.setInt(6, objeto.getNumeroCliente());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            oCon.cerrarConexion();
        }
    }
    
    public DefaultTableModel verCliente() {
        DefaultTableModel modeloCliente = new DefaultTableModel();

        try {

            ResultSet rs;
            pst = con.prepareStatement(SQLVER);
            rs = pst.executeQuery();
            String[] datos = new String[6];
            String[] titulo = {"ID", "NOMBRE / RAZON SOCIAL", "RUC", "DNI", "DIRECCION", "TELEFONO"};
            modeloCliente.setColumnIdentifiers(titulo);
            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt(1));
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                modeloCliente.addRow(datos);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            oCon.cerrarConexion();
        }

        return modeloCliente;
    }
}
