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

    private final String SQLVER = "SELECT * FROM tipocliente";
    private final String SQLVER1 = "SELECT tipocli FROM tipocliente";
    private final String SQLCODIGO = "SELECT tipo_cliente_id FROM tipocliente WHERE tipocli = ?";

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
            
            while (rs.next()) {
                DTOTipoCliente objeto = new DTOTipoCliente();
                objeto.setTipoCliente(rs.getString(1));
                modeloTipoCliente.addElement(objeto.getTipoCliente());
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOTipoCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            oCon.cerrarConexion();
        }
        return modeloTipoCliente;
    }
    
    public int recuperarCodigo(DTOTipoCliente objeto){
        int codigo=-1;
        
        try {
            ResultSet rs;
            pst = con.prepareStatement(SQLCODIGO);
            pst.setString(1, objeto.getTipoCliente());
            rs = pst.executeQuery();
            
            while (rs.next()) {
                codigo = rs.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOTipoCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            oCon.cerrarConexion();
        }
        return codigo;
    }
}
