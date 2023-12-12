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
public class DAOTipoComprobante {
    
    Conexion oCon;
    Connection con;
    PreparedStatement pst;

    private final String SQLVER = "SELECT * FROM tipocomprobante";
    private final String SQLVER1 = "SELECT tipocom FROM tipocomprobante";
    private final String SQLCODIGO = "SELECT tipo_comprobante_id FROM tipocomprobante WHERE tipocom = ?";

    public DAOTipoComprobante() {
        oCon = new Conexion();
        con = oCon.conectar();
    }

    public DefaultTableModel verTipoComprobante() {
        DefaultTableModel modeloTipoComprobante = new DefaultTableModel();

        try {

            ResultSet rs;
            pst = con.prepareStatement(SQLVER);
            rs = pst.executeQuery();
            String[] datos = new String[2];
            String[] titulo = {"Tipo Comprobante", "Nombre Tipo"};
            modeloTipoComprobante.setColumnIdentifiers(titulo);
            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt(1));
                datos[1] = rs.getString(2);
                modeloTipoComprobante.addRow(datos);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOTipoCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            oCon.cerrarConexion();
        }

        return modeloTipoComprobante;
    }
    public DefaultComboBoxModel verTipoCom() {
        DefaultComboBoxModel modeloTipoComprobante = new DefaultComboBoxModel();

        try {

            ResultSet rs;
            pst = con.prepareStatement(SQLVER1);
            rs = pst.executeQuery();
            
            while (rs.next()) {
                DTOTipoComprobante objeto = new DTOTipoComprobante();
                objeto.setTipoComprobante(rs.getString(1));
                modeloTipoComprobante.addElement(objeto.getTipoComprobante());
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOTipoCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            oCon.cerrarConexion();
        }
        return modeloTipoComprobante;
    }
    
    public int recuperarCodigo(DTOTipoComprobante objeto){
        int codigo=-1;
        
        try {
            ResultSet rs;
            pst = con.prepareStatement(SQLCODIGO);
            pst.setString(1, objeto.getTipoComprobante());
            rs = pst.executeQuery();
            
            while (rs.next()) {
                codigo = rs.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOTipoComprobante.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            oCon.cerrarConexion();
        }
        return codigo;
    }
}
