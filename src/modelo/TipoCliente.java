/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author usuario
 */
public class TipoCliente {
    private int idTipoCliente;
    private String nombreTipoCliente;
    private int idClienteNatural;
    private int idClienteJuridico;

    public TipoCliente(int idTipoCliente, String nombreTipoCliente, int idClienteNatural, int idClienteJuridico) {
        this.idTipoCliente = idTipoCliente;
        this.nombreTipoCliente = nombreTipoCliente;
        this.idClienteNatural = idClienteNatural;
        this.idClienteJuridico = idClienteJuridico;
    }

    public int getIdTipoCliente() {
        return idTipoCliente;
    }

    public void setIdTipoCliente(int idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }

    public String getNombreTipoCliente() {
        return nombreTipoCliente;
    }

    public void setNombreTipoCliente(String nombreTipoCliente) {
        this.nombreTipoCliente = nombreTipoCliente;
    }

    public int getIdClienteNatural() {
        return idClienteNatural;
    }

    public void setIdClienteNatural(int idClienteNatural) {
        this.idClienteNatural = idClienteNatural;
    }

    public int getIdClienteJuridico() {
        return idClienteJuridico;
    }

    public void setIdClienteJuridico(int idClienteJuridico) {
        this.idClienteJuridico = idClienteJuridico;
    }
}
