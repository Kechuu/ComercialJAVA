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
public class EmpleadoLicencia {

    private int idEstadoLicencia;
    private Date inicio;
    private Date fin;
    private Empleado idEmpleado;
    private Licencia idLicencia;

    public int getIdEstadoLicencia() {
        return idEstadoLicencia;
    }

    public void setIdEstadoLicencia(int idEstadoLicencia) {
        this.idEstadoLicencia = idEstadoLicencia;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Licencia getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(Licencia idLicencia) {
        this.idLicencia = idLicencia;
    }
    
}
