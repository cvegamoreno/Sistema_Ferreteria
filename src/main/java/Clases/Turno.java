/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author usuario
 */
public class Turno {
    private int idTurnos;
    private String nombreTurno;

    public Turno(int idTurnos, String nombreTurno) {
        this.idTurnos = idTurnos;
        this.nombreTurno = nombreTurno;
    }

    public int getIdTurnos() {
        return idTurnos;
    }

    public void setIdTurnos(int idTurnos) {
        this.idTurnos = idTurnos;
    }

    public String getNombreTurno() {
        return nombreTurno;
    }

    public void setNombreTurno(String nombreTurno) {
        this.nombreTurno = nombreTurno;
    }
}

