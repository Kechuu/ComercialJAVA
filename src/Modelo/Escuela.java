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
public class Escuela {

    private int idEscuela;
    private String nombre;
    private Empleado director;
    private String direccion;
    private String telefono;
    private String correo;
    private byte[] logo;
    private byte[] fondo;
    private String claveDirector;

    public int getIdEscuela() {
        return idEscuela;
    }

    public void setIdEscuela(int idEscuela) {
        this.idEscuela = idEscuela;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public byte[] getFondo() {
        return fondo;
    }

    public void setFondo(byte[] fondo) {
        this.fondo = fondo;
    }

    public String getClaveDirector() {
        return claveDirector;
    }

    public void setClaveDirector(String claveDirector) {
        this.claveDirector = claveDirector;
    }
    
}
