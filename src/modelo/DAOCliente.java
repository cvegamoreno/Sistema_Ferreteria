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
 * @author Carlos
 */
public class DAOCliente {

    Conexion oCon;
    Connection con;
    PreparedStatement pst;

    private final String SQLINSERTAR = "INSERT INTO clientes(cliente_id, nombre, direccion, telefono, tipo_cliente_id, numerocli) values(?,?,?,?,?,?)";
    private final String SQLEDITAR = "UPDATE clientes SET cliente_id= ?, nombre =?, direccion=?, telefono =?, tipo_cliente_id =?, numerocli =? WHERE cliente_id =?";
    private final String SQLELIMINAR = "DELETE FROM clientes WHERE cliente_id=?";
    private final String SQLVER = "SELECT cliente_id, nombre, direccion, telefono, tipocli, numerocli FROM clientes, tipocliente WHERE tipocliente.tipo_cliente_id = clientes.tipo_cliente_id";

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
            pst.setString(6, objeto.getNumeroCliente());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            oCon.cerrarConexion();
        }
    }
    
    public void editar(DTOCliente objeto) {
        try {

            pst = con.prepareStatement(SQLEDITAR);
            pst.setInt(1, objeto.getIdCliente());
            pst.setString(2, objeto.getNombreCliente());
            pst.setString(3, objeto.getDireccion());
            pst.setString(4, objeto.getTelefono());
            pst.setInt(5, objeto.getIdTipoCliente());
            pst.setString(6, objeto.getNumeroCliente());
            pst.setInt(7, objeto.getIdCliente());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            oCon.cerrarConexion();
        }
    }
    
    public void eliminar(DTOCliente objeto) {

        try {

            pst = con.prepareStatement(SQLELIMINAR);
            pst.setInt(1, objeto.getIdCliente());
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
            String[] titulo = {"ID", "NOMBRE / RAZON SOCIAL", "DIRECCION", "TELEFONO", "TIPO CLIENTE", "NUMERO DOCUMENTO"};
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
