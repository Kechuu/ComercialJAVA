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
public class DetallePlan {

    private int idDetallePlan;
    private PlanEstudio idPlanEstudio;
    private String materia;
    private int curso;
    private String area;

    public int getIdDetallePlan() {
        return idDetallePlan;
    }

    public void setIdDetallePlan(int idDetallePlan) {
        this.idDetallePlan = idDetallePlan;
    }

    public PlanEstudio getIdPlanEstudio() {
        return idPlanEstudio;
    }

    public void setIdPlanEstudio(PlanEstudio idPlanEstudio) {
        this.idPlanEstudio = idPlanEstudio;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
}
