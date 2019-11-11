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
public class NotaAlumno {
    
    private int idNotaAlumno;
    private CursoAlumno idCursoAlumno;
    private DetallePlan idDetallePlan;
    private Concepto idConcepto;
    private Empleado docente;
    private float nota;
    private Date fecha;

    public int getIdNotaAlumno() {
        return idNotaAlumno;
    }

    public void setIdNotaAlumno(int idNotaAlumno) {
        this.idNotaAlumno = idNotaAlumno;
    }

    public CursoAlumno getIdCursoAlumno() {
        return idCursoAlumno;
    }

    public void setIdCursoAlumno(CursoAlumno idCursoAlumno) {
        this.idCursoAlumno = idCursoAlumno;
    }

    public DetallePlan getIdDetallePlan() {
        return idDetallePlan;
    }

    public void setIdDetallePlan(DetallePlan idDetallePlan) {
        this.idDetallePlan = idDetallePlan;
    }

    public Concepto getIdConcepto() {
        return idConcepto;
    }

    public void setIdConcepto(Concepto idConcepto) {
        this.idConcepto = idConcepto;
    }

    public Empleado getDocente() {
        return docente;
    }

    public void setDocente(Empleado docente) {
        this.docente = docente;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
}
