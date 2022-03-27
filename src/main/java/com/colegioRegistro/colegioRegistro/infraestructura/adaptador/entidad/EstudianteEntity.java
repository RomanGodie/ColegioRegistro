package com.colegioRegistro.colegioRegistro.infraestructura.adaptador.entidad;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "estudiante")
public class EstudianteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int idPersona;
    @Column(name = "id_tipodocumento")
    private int id_tipodocumento;
    @Column(name = "numerodocumento")
    private String numerodocumento;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "fecha_nacimiento")
    private String fecha_nacimiento;
    @Column(name = "id_grado")
    private int id_grado;
    @Column(name = "id_dane")
    private int id_dane;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "email")
    private String email;
    @Column(name = "fijo")
    private String fijo;
    @Column(name = "celular")
    private String celular;
}
