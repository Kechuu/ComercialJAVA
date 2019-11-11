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
public class RolEmpleado {

    private int idRolEmpleado;
    private Rol idRol;
    private Empleado idEmpleado;

    public int getIdRolEmpleado() {
        return idRolEmpleado;
    }

    public void setIdRolEmpleado(int idRolEmpleado) {
        this.idRolEmpleado = idRolEmpleado;
    }

    public Rol getIdRol() {
        return idRol;
    }

    public void setIdRol(Rol idRol) {
        this.idRol = idRol;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
}
