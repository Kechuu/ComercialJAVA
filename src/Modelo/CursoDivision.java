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
public class CursoDivision {

    private int idCursoDivision;
    private int curso;
    private int division;
    private String idioma;
    private String deporte;

    public int getIdCursoDivision() {
        return idCursoDivision;
    }

    public void setIdCursoDivision(int idCursoDivision) {
        this.idCursoDivision = idCursoDivision;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
}
