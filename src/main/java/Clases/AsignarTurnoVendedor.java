/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author usuario
 */
public class AsignarTurnoVendedor {
    private int idAsignarTurnoVendedor;
    private int idTurno;
    private int idEmpleados;

    public AsignarTurnoVendedor(int idAsignarTurnoVendedor, int idTurno, int idEmpleados) {
        this.idAsignarTurnoVendedor = idAsignarTurnoVendedor;
        this.idTurno = idTurno;
        this.idEmpleados = idEmpleados;
    }

    public int getIdAsignarTurnoVendedor() {
        return idAsignarTurnoVendedor;
    }

    public void setIdAsignarTurnoVendedor(int idAsignarTurnoVendedor) {
        this.idAsignarTurnoVendedor = idAsignarTurnoVendedor;
    }

    public int getIdTurno() {
        return idTurno;
    }

    public void setIdTurno(int idTurno) {
        this.idTurno = idTurno;
    }

    public int getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }
}

