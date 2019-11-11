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
public class PlanEstudio {

    private int idPlanEstudio;
    private Date vigenciaDESDE;
    private Date vigenciaHASTA;
    private String titulo;

    public int getIdPlanEstudio() {
        return idPlanEstudio;
    }

    public void setIdPlanEstudio(int idPlanEstudio) {
        this.idPlanEstudio = idPlanEstudio;
    }

    public Date getVigenciaDESDE() {
        return vigenciaDESDE;
    }

    public void setVigenciaDESDE(Date vigenciaDESDE) {
        this.vigenciaDESDE = vigenciaDESDE;
    }

    public Date getVigenciaHASTA() {
        return vigenciaHASTA;
    }

    public void setVigenciaHASTA(Date vigenciaHASTA) {
        this.vigenciaHASTA = vigenciaHASTA;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
