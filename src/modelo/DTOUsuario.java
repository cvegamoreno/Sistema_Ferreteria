/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class DTOUsuario {
    private int idUsuario;
    private String nombreUsu;
    private String contraseñaUsu;

    public DTOUsuario() {
    }

    public DTOUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public DTOUsuario(int idUsuario, String nombreUsu, String contraseñaUsu) {
        this.idUsuario = idUsuario;
        this.nombreUsu = nombreUsu;
        this.contraseñaUsu = contraseñaUsu;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsu() {
        return nombreUsu;
    }

    public void setNombreUsu(String nombreUsu) {
        this.nombreUsu = nombreUsu;
    }

    public String getContraseñaUsu() {
        return contraseñaUsu;
    }

    public void setContraseñaUsu(String contraseñaUsu) {
        this.contraseñaUsu = contraseñaUsu;
    }

    
    
    
}
