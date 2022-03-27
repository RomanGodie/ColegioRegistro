package com.colegioRegistro.colegioRegistro.infraestructura.adaptador.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Entity
@Table(name = "estudiante_asignatura")
public class EstudianteAsignaturaEntity implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nota")
    private double nota;
    @Column(name = "periodo")
    private int periodo;
    @Column(name = "id_estudiante")
    private int id_estudiante;
    @Column(name = "id_asignatura")
    private int id_asignatura;
}
