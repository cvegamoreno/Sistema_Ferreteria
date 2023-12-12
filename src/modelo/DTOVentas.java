/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author Carlos
 */
public class DTOVentas {
   int idVenta, idCliente, idComprobante, idUsuario;
   String fecha;
   double total;

    public DTOVentas() {
    }

    public DTOVentas(int idVenta) {
        this.idVenta = idVenta;
    }

    public DTOVentas(int idVenta, int idCliente, int idComprobante, int idUsuario, String fecha, double total) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.idComprobante = idComprobante;
        this.idUsuario = idUsuario;
        this.fecha = fecha;
        this.total = total;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(int idComprobante) {
        this.idComprobante = idComprobante;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
   
   
}
