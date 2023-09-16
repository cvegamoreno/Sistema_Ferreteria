/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author usuario
 */
public class UsuarioSistema {
    private int idUsuarioSistema;
    private String nombreUsuario;

    public UsuarioSistema(int idUsuarioSistema, String nombreUsuario) {
        this.idUsuarioSistema = idUsuarioSistema;
        this.nombreUsuario = nombreUsuario;
    }

    public int getIdUsuarioSistema() {
        return idUsuarioSistema;
    }

    public void setIdUsuarioSistema(int idUsuarioSistema) {
        this.idUsuarioSistema = idUsuarioSistema;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
}
