/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class DTOTipoCliente {
    private int idTipoCliente;
    private String tipoCliente;

    public DTOTipoCliente() {
    }

    public DTOTipoCliente(int idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }

    public DTOTipoCliente(int idTipoCliente, String tipoCliente) {
        this.idTipoCliente = idTipoCliente;
        this.tipoCliente = tipoCliente;
    }

    public int getIdTipoCliente() {
        return idTipoCliente;
    }

    public void setIdTipoCliente(int idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    
}

