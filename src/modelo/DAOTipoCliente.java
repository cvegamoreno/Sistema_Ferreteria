/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;
import java.util.logging.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class DAOTipoCliente {
    
    Conexion oCon;
    Connection con;
    PreparedStatement pst;

    private final String SQLVER = "select * from tipocliente";
    private final String SQLVER1 = "select numerocli from tipocliente";

    public DAOTipoCliente() {
        oCon = new Conexion();
        con = oCon.conectar();
    }

    public DefaultTableModel verTipoCliente() {
        DefaultTableModel modeloTipoCliente = new DefaultTableModel();

        try {

            ResultSet rs;
            pst = con.prepareStatement(SQLVER);
            rs = pst.executeQuery();
            String[] datos = new String[2];
            String[] titulo = {"Tipo Cliente", "Nombre Tipo"};
            modeloTipoCliente.setColumnIdentifiers(titulo);
            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt(1));
                datos[1] = rs.getString(2);
                modeloTipoCliente.addRow(datos);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOTipoCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            oCon.cerrarConexion();
        }

        return modeloTipoCliente;
    }
    public DefaultComboBoxModel verTipoCl() {
        DefaultComboBoxModel modeloTipoCliente = new DefaultComboBoxModel();

        try {

            ResultSet rs;
            pst = con.prepareStatement(SQLVER1);
            rs = pst.executeQuery();
            String[] datos = new String[1];
            while (rs.next()) {
                datos[0] = rs.getString(1);
                modeloTipoCliente.addElement(datos);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOTipoCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            oCon.cerrarConexion();
        }

        return modeloTipoCliente;
    }
}
