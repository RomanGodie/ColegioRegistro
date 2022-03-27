package com.colegioRegistro.colegioRegistro.dominio.modelo;

public class RegistroConsultaMayorNotaPorPeriodo {
    private String nombreDocente;
    private String apellidoDocente;
    private String descripcionCurso;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private double notaEstudiante;

    public RegistroConsultaMayorNotaPorPeriodo(String nombreDocente, String apellidoDocente, String descripcionCurso, String nombreEstudiante, String apellidoEstudiante, double notaEstudiante) {
        this.nombreDocente = nombreDocente;
        this.apellidoDocente = apellidoDocente;
        this.descripcionCurso = descripcionCurso;
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.notaEstudiante = notaEstudiante;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String getApellidoDocente() {
        return apellidoDocente;
    }

    public void setApellidoDocente(String apellidoDocente) {
        this.apellidoDocente = apellidoDocente;
    }

    public String getDescripcionCurso() {
        return descripcionCurso;
    }

    public void setDescripcionCurso(String descripcionCurso) {
        this.descripcionCurso = descripcionCurso;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public double getNotaEstudiante() {
        return notaEstudiante;
    }

    public void setNotaEstudiante(double notaEstudiante) {
        this.notaEstudiante = notaEstudiante;
    }
}
