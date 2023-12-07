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
public class DAOUsuario {

    Conexion oCon;
    Connection con;
    PreparedStatement pst;

    private final String SQLINSERTAR = "INSERT INTO usuario(usuario_id, nombre_usuario, contrasena) values(?,?,?,?)";
    private final String SQLEDITAR = "UPDATE usuario SET usuario_id= ?, nombre_usuario =?, contrasena=? WHERE nombre_usuario =?";
    private final String SQLELIMINAR = "DELETE FROM usuario WHERE nombre_usuario =?";
    private final String SQLVER = "SELECT * from usuario";
    private final String SQLLOGIN = "SELECT contrasena FROM usuario WHERE nombre_usuario = ?";

    public DAOUsuario() {
        oCon = new Conexion();
        con = oCon.conectar();
    }

    public void agregar(DTOUsuario objeto) {
        try {
            // Verificar que no haya campos vacíos
            if (objeto.getNombreUsu().isEmpty() || objeto.getContrasenaUsu().isEmpty() || objeto.getIdUsuario() <= -1) {
                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Sale del método si hay campos vacíos
            }
            pst = con.prepareStatement(SQLINSERTAR);
            pst.setInt(1, objeto.getIdUsuario());
            pst.setString(2, objeto.getNombreUsu());
            pst.setString(3, objeto.getContrasenaUsu());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            oCon.cerrarConexion();
        }
    }

    public void editar(DTOUsuario objeto) {
        try {
            // Verificar que no haya campos vacíos
            if (objeto.getNombreUsu().isEmpty() || objeto.getContrasenaUsu().isEmpty() || objeto.getIdUsuario() <= -1) {
                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Sale del método si hay campos vacíos
            }
            pst = con.prepareStatement(SQLEDITAR);
            pst.setInt(1, objeto.getIdUsuario());
            pst.setString(2, objeto.getNombreUsu());
            pst.setString(3, objeto.getContrasenaUsu());
            pst.setString(4, objeto.getNombreUsu());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            oCon.cerrarConexion();
        }
    }

    public void eliminar(DTOUsuario objeto) {

        try {

            pst = con.prepareStatement(SQLELIMINAR);
            pst.setString(1, objeto.getNombreUsu());
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            oCon.cerrarConexion();
        }
    }

    public DefaultTableModel verUsuario() {
        DefaultTableModel modelo = new DefaultTableModel();

        try {

            ResultSet rs;
            pst = con.prepareStatement(SQLVER);
            rs = pst.executeQuery();
            String[] datos = new String[3];
            String[] titulo = {"ID", "NOMBRE USUARIO", "CONTRASEÑA"};
            modelo.setColumnIdentifiers(titulo);
            while (rs.next()) {
                datos[0] = String.valueOf(rs.getInt(1));
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            oCon.cerrarConexion();
        }
        return modelo;
    }

    public boolean verificarCredenciales(DTOUsuario objeto) {
        try {
            // Verificar que no haya campos vacíos
            if (objeto.getNombreUsu().isEmpty() || objeto.getContrasenaUsu().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            pst = con.prepareStatement(SQLLOGIN);
            pst.setString(1, objeto.getNombreUsu());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String contrasena = rs.getString("contrasena");
                return contrasena.equals(objeto.getContrasenaUsu());
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            oCon.cerrarConexion();
        }
    }
}
