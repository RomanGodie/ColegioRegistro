package com.colegioRegistro.colegioRegistro.infraestructura.adaptador.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "docente")
public class DocenteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int idPersona;
    @Column(name = "id_tipodocumento")
    private int id_tipodocumento;
    @Column(name = "numerodocumento")
    private String numerodocumento;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "fecha_nacimiento")
    private String fecha_nacimiento;
    @Column(name = "asig_dictadas")
    private int asig_dictadas;
    @Column(name = "grado_escolaridad")
    private String grado_escolaridad;
    @Column(name = "id_gradoresponsable")
    private int id_gradoresponsable;
    @Column(name = "email")
    private String email;
    @Column(name = "fijo")
    private String fijo;
    @Column(name = "celular")
    private String celular;
}
