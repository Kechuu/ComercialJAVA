/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Time;

/**
 *
 * @author jesus
 */
public class DocenteCurso {

    private int idDocenteCurso;
    private Empleado idEmpleado;
    private DetallePlan idDetallePlan;
    private CursoDivision idCursoDivision;
    private Caracter idCaracter;
    private Time desde;
    private Time hasta;

    public int getIdDocenteCurso() {
        return idDocenteCurso;
    }

    public void setIdDocenteCurso(int idDocenteCurso) {
        this.idDocenteCurso = idDocenteCurso;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public DetallePlan getIdDetallePlan() {
        return idDetallePlan;
    }

    public void setIdDetallePlan(DetallePlan idDetallePlan) {
        this.idDetallePlan = idDetallePlan;
    }

    public CursoDivision getIdCursoDivision() {
        return idCursoDivision;
    }

    public void setIdCursoDivision(CursoDivision idCursoDivision) {
        this.idCursoDivision = idCursoDivision;
    }

    public Caracter getIdCaracter() {
        return idCaracter;
    }

    public void setIdCaracter(Caracter idCaracter) {
        this.idCaracter = idCaracter;
    }

    public Time getDesde() {
        return desde;
    }

    public void setDesde(Time desde) {
        this.desde = desde;
    }

    public Time getHasta() {
        return hasta;
    }

    public void setHasta(Time hasta) {
        this.hasta = hasta;
    }
    
}
