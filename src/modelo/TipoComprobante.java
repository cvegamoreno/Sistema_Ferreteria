/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author usuario
 */
public class TipoComprobante {
    private int idTipoComprobante;
    private String nombreTipoComprobante;

    public TipoComprobante(int idTipoComprobante, String nombreTipoComprobante) {
        this.idTipoComprobante = idTipoComprobante;
        this.nombreTipoComprobante = nombreTipoComprobante;
    }

    public int getIdTipoComprobante() {
        return idTipoComprobante;
    }

    public void setIdTipoComprobante(int idTipoComprobante) {
        this.idTipoComprobante = idTipoComprobante;
    }

    public String getNombreTipoComprobante() {
        return nombreTipoComprobante;
    }

    public void setNombreTipoComprobante(String nombreTipoComprobante) {
        this.nombreTipoComprobante = nombreTipoComprobante;
    }
}
