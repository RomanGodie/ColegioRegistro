package com.colegioRegistro.colegioRegistro.infraestructura.adaptador.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Setter
@Getter
public class RegistroConsultaMayorNotaPorCursoEntity {
    @Column(name = "nombres")
    private String nombreDocente;
    @Column(name = "apellidos")
    private String apellidoDocente;
    @Column(name = "descripcion")
    private String descripcionCurso;
    @Column(name = "nombre")
    private String nombreEstudiante;
    @Column(name = "apellidos")
    private String apellidoEstudiante;
    @Column(name = "nota")
    private double notaEstudiante;
}
