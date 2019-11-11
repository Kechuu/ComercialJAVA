/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jesus
 */
public class Alumno {

    private int idAlumno;
    private Persona idPersona;
    private EstadoAlumno idEstadoAlumno;

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public EstadoAlumno getIdEstadoAlumno() {
        return idEstadoAlumno;
    }

    public void setIdEstadoAlumno(EstadoAlumno idEstadoAlumno) {
        this.idEstadoAlumno = idEstadoAlumno;
    }
    
}
