/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author jesus
 */
public class Inasistencia {

    private int idInasistencia;
    private Date fecha;
    private Justificacion idJustificacion;
    private Alumno idAlumno;
    private Empleado preceptor;

    public int getIdInasistencia() {
        return idInasistencia;
    }

    public void setIdInasistencia(int idInasistencia) {
        this.idInasistencia = idInasistencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Justificacion getIdJustificacion() {
        return idJustificacion;
    }

    public void setIdJustificacion(Justificacion idJustificacion) {
        this.idJustificacion = idJustificacion;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Empleado getPreceptor() {
        return preceptor;
    }

    public void setPreceptor(Empleado preceptor) {
        this.preceptor = preceptor;
    }
    
}
