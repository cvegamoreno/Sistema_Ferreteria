/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author usuario
 */
public class Empleado {
    private int idEmpleados;
    private String dni;
    private String nombres;
    private String apellidos;
    private String genero;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private int idUsuarioSistema;

    // Constructor
    public Empleado(int idEmpleados, String dni, String nombres, String apellidos, String genero, String direccion, String telefono, String correoElectronico, int idUsuarioSistema) {
        this.idEmpleados = idEmpleados;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.idUsuarioSistema = idUsuarioSistema;
    }

    // Métodos getters
    public int getIdEmpleados() {
        return idEmpleados;
    }

    public String getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public int getIdUsuarioSistema() {
        return idUsuarioSistema;
    }

    // Métodos setters
    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setIdUsuarioSistema(int idUsuarioSistema) {
        this.idUsuarioSistema = idUsuarioSistema;
    }
}
