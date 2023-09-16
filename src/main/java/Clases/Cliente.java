/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author usuario
 */
public class Cliente {
    private int idCodigoCliente;
    private int idTiposCliente;
    private String direccion;
    private String telefono;
    private String correoElectronico;

    public Cliente(int idCodigoCliente, int idTiposCliente, String direccion, String telefono, String correoElectronico) {
        this.idCodigoCliente = idCodigoCliente;
        this.idTiposCliente = idTiposCliente;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public int getIdCodigoCliente() {
        return idCodigoCliente;
    }

    public void setIdCodigoCliente(int idCodigoCliente) {
        this.idCodigoCliente = idCodigoCliente;
    }

    public int getIdTiposCliente() {
        return idTiposCliente;
    }

    public void setIdTiposCliente(int idTiposCliente) {
        this.idTiposCliente = idTiposCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
