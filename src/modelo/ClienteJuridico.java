/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author usuario
 */
public class ClienteJuridico {
    private int idClienteJuridico;
    private String numeroRUC;
    private String nombreEmpresa;

    public ClienteJuridico(int idClienteJuridico, String numeroRUC, String nombreEmpresa) {
        this.idClienteJuridico = idClienteJuridico;
        this.numeroRUC = numeroRUC;
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getIdClienteJuridico() {
        return idClienteJuridico;
    }

    public void setIdClienteJuridico(int idClienteJuridico) {
        this.idClienteJuridico = idClienteJuridico;
    }

    public String getNumeroRUC() {
        return numeroRUC;
    }

    public void setNumeroRUC(String numeroRUC) {
        this.numeroRUC = numeroRUC;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
}

