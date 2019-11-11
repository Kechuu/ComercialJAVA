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
public class Errores {

    private int idErrores;
    private Empleado idEmpleado;
    private Time hora;
    private String detalle;

    public int getIdErrores() {
        return idErrores;
    }

    public void setIdErrores(int idErrores) {
        this.idErrores = idErrores;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
}
