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
public class Empleado {

    private int idEmpleado;
    private Persona idPersona;
    private Date fechaIngreso;
    private Date fechaBaja;
    private String legajo;
    private EstadoEmpleado idEstado;
    private Gremio idGremio;
    private boolean borrado;

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public EstadoEmpleado getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(EstadoEmpleado idEstado) {
        this.idEstado = idEstado;
    }

    public Gremio getIdGremio() {
        return idGremio;
    }

    public void setIdGremio(Gremio idGremio) {
        this.idGremio = idGremio;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    
}
