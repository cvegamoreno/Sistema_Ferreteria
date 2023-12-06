/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class DTOCliente {

    private int idCliente;
    private String nombreCliente;
    private String direccion;
    private String telefono;
    private int idTipoCliente;
    private String numeroCliente;

    public DTOCliente() {
    }

    public DTOCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public DTOCliente(int idCliente, String nombreCliente, String numeroCliente, String direccion, String telefono, int idTipoCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.direccion = direccion;
        this.telefono = telefono;
        this.idTipoCliente = idTipoCliente;
        this.numeroCliente = numeroCliente;        
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
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

    public int getIdTipoCliente() {
        return idTipoCliente;
    }

    public void setIdTipoCliente(int idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }
    
    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
}
