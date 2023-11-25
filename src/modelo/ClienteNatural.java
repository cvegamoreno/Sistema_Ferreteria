/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author usuario
 */
public class ClienteNatural {
    private int idClienteNatural;
    private String dni;
    private String nombres;
    private String apellidos;

    public ClienteNatural(int idClienteNatural, String dni, String nombres, String apellidos) {
        this.idClienteNatural = idClienteNatural;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public int getIdClienteNatural() {
        return idClienteNatural;
    }

    public void setIdClienteNatural(int idClienteNatural) {
        this.idClienteNatural = idClienteNatural;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}

