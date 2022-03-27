package com.colegioRegistro.colegioRegistro.infraestructura.adaptador.implementacion;

import com.colegioRegistro.colegioRegistro.dominio.modelo.RegistroConsultaMayorNotaPorCurso;
import com.colegioRegistro.colegioRegistro.dominio.modelo.RegistroConsultaMayorNotaPorPeriodo;
import com.colegioRegistro.colegioRegistro.dominio.puerto.PuertoRegistroColegio;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
@AllArgsConstructor
public class AdaptadorRegistroColegio implements PuertoRegistroColegio {
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<RegistroConsultaMayorNotaPorCurso> readTodosLosRegistrosMayorNotaPorCurso() {
        String consulta = ("SELECT D.nombres, D.apellidos, A.descripcion, E.nombre, E.apellidos, EA.nota " +
                "FROM estudiante_asignatura EA JOIN estudiante E ON EA.id_estudiante = E.id " +
                "JOIN asignatura A ON EA.id_asignatura = A.id JOIN docente D ON A.id_docente = D.id " +
                "WHERE EA.nota >=3.1 ORDER BY EA.nota ASC");
        return jdbcTemplate.query(consulta,(rs, rowNum) ->
                new RegistroConsultaMayorNotaPorCurso(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDouble(6)
                ));
    }

    @Override
    public List<RegistroConsultaMayorNotaPorPeriodo> readTodosLosRegistrosMayorNotaPorPeriodo() {
        String consulta = ("SELECT D.nombres, D.apellidos, A.descripcion, E.nombre, E.apellidos, EA.nota " +
                "FROM estudiante_asignatura EA JOIN estudiante E ON EA.id_estudiante = E.id " +
                "JOIN asignatura A ON EA.id_asignatura = A.id JOIN docente D ON A.id_docente = D.id " +
                "WHERE EA.nota = (SELECT MAX(EA.nota) FROM estudiante_asignatura )");
        return jdbcTemplate.query(consulta,(rs, rowNum) ->
                new RegistroConsultaMayorNotaPorPeriodo(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDouble(6)
                ));
    }

    @Override
    public RegistroConsultaMayorNotaPorPeriodo readUnSoloRegistroConsultaMayorNotaPorPeriodoDirecto(){
        String consulta = ("SELECT D.nombres, D.apellidos, A.descripcion, E.nombre, E.apellidos, MAX(EA.nota) " +
                "FROM estudiante_asignatura EA JOIN estudiante E ON EA.id_estudiante = E.id " +
                "JOIN asignatura A ON EA.id_asignatura = A.id JOIN docente D ON A.id_docente = D.id");
        return jdbcTemplate.queryForObject(consulta,(rs, rowNum) ->
                new RegistroConsultaMayorNotaPorPeriodo(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getDouble(6)
                ));
    }
}
