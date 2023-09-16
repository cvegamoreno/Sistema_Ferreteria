/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author usuario
 */
import java.util.Date;

public class Venta {
    private int idVentas;
    private int idCodigoCliente;
    private int idEmpleados;
    private int idTipoComprobante;
    private String numeroComprobante;
    private Date fechaEmision;
    private String horaEmision;

    public Venta(int idVentas, int idCodigoCliente, int idEmpleados, int idTipoComprobante, String numeroComprobante, Date fechaEmision, String horaEmision) {
        this.idVentas = idVentas;
        this.idCodigoCliente = idCodigoCliente;
        this.idEmpleados = idEmpleados;
        this.idTipoComprobante = idTipoComprobante;
        this.numeroComprobante = numeroComprobante;
        this.fechaEmision = fechaEmision;
        this.horaEmision = horaEmision;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public int getIdCodigoCliente() {
        return idCodigoCliente;
    }

    public void setIdCodigoCliente(int idCodigoCliente) {
        this.idCodigoCliente = idCodigoCliente;
    }

    public int getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public int getIdTipoComprobante() {
        return idTipoComprobante;
    }

    public void setIdTipoComprobante(int idTipoComprobante) {
        this.idTipoComprobante = idTipoComprobante;
    }

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getHoraEmision() {
        return horaEmision;
    }

    public void setHoraEmision(String horaEmision) {
        this.horaEmision = horaEmision;
    }
}

