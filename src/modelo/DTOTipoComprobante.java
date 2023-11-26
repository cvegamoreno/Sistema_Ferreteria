/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class DTOTipoComprobante {
    private int idTipoComprobante;
    private String tipoComprobante;

    public DTOTipoComprobante() {
    }

    public DTOTipoComprobante(int idTipoComprobante) {
        this.idTipoComprobante = idTipoComprobante;
    }

    public DTOTipoComprobante(int idTipoComprobante, String tipoComprobante) {
        this.idTipoComprobante = idTipoComprobante;
        this.tipoComprobante = tipoComprobante;
    }

    public int getIdTipoComprobante() {
        return idTipoComprobante;
    }

    public void setIdTipoComprobante(int idTipoComprobante) {
        this.idTipoComprobante = idTipoComprobante;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }
    
    
}
