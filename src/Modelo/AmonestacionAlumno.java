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
public class AmonestacionAlumno {

    private int idAmonestacionAlumno;
    private Amonestaciones idAmonestaciones;
    private Alumno idAlumno;

    public int getIdAmonestacionAlumno() {
        return idAmonestacionAlumno;
    }

    public void setIdAmonestacionAlumno(int idAmonestacionAlumno) {
        this.idAmonestacionAlumno = idAmonestacionAlumno;
    }

    public Amonestaciones getIdAmonestaciones() {
        return idAmonestaciones;
    }

    public void setIdAmonestaciones(Amonestaciones idAmonestaciones) {
        this.idAmonestaciones = idAmonestaciones;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }
    
}
