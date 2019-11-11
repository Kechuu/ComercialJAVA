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
public class CursoAlumno {

    private int idCursoAlumno;
    private CursoDivision idCursoDivision;
    private Alumno idAlumno;
    private Date año;

    public int getIdCursoAlumno() {
        return idCursoAlumno;
    }

    public void setIdCursoAlumno(int idCursoAlumno) {
        this.idCursoAlumno = idCursoAlumno;
    }

    public CursoDivision getIdCursoDivision() {
        return idCursoDivision;
    }

    public void setIdCursoDivision(CursoDivision idCursoDivision) {
        this.idCursoDivision = idCursoDivision;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Date getAño() {
        return año;
    }

    public void setAño(Date año) {
        this.año = año;
    }
    
}
