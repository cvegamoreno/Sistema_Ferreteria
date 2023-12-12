/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class DTODetalleVenta {

    private int idDetalleVenta;
    private int idCabecera;
    private int idProducto;
    private String nombreProducto;
    private String descripcionProd;
    private int cantidad;
    private double precioUnitario;
    private double totalPagar;
    private int estado;

    public DTODetalleVenta() {
    }

    public DTODetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public DTODetalleVenta(int idDetalleVenta, int idCabecera, int idProducto, String nombreProducto, String descripcionProd, int cantidad, double precioUnitario, double totalPagar, int estado) {
        this.idDetalleVenta = idDetalleVenta;
        this.idCabecera = idCabecera;
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProd = descripcionProd;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.totalPagar = totalPagar;
        this.estado = estado;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getIdCabecera() {
        return idCabecera;
    }

    public void setIdCabecera(int idCabecera) {
        this.idCabecera = idCabecera;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProd() {
        return descripcionProd;
    }

    public void setDescripcionProd(String descripcionProd) {
        this.descripcionProd = descripcionProd;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
