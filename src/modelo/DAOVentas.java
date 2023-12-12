/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

    private final String SQLINSERTAR = "insert into ventas(venta_id, cliente_id, fecha, total_venta, tipo_comprobante_id, usuario_id) values(?,?,?,?,?,?)";
    private final String SQLEDITAR = "update ventas SET venta_id= ?, nombre =?, descripcion=?, precio_unitario =?, stock =?, medidas =? WHERE venta_id =?";
    private final String SQLELIMINAR = "DELETE FROM ventas WHERE venta_id=?";
    private final String SQLVER = "select * from ventas";

    public DAOVentas() {
        oCon = new Conexion();
        con = oCon.conectar();
    }
    
    public void agregar (DTOVentas objeto){
        
    }
    
    
    
}
