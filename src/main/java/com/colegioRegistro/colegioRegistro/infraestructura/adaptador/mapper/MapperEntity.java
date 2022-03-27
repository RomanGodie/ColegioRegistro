package com.colegioRegistro.colegioRegistro.infraestructura.adaptador.mapper;

import com.colegioRegistro.colegioRegistro.dominio.modelo.RegistroConsultaMayorNotaPorCurso;
import com.colegioRegistro.colegioRegistro.infraestructura.adaptador.entidad.RegistroConsultaMayorNotaPorCursoEntity;
import org.springframework.stereotype.Component;

@Component
public class MapperEntity {
    public RegistroConsultaMayorNotaPorCursoEntity conversorDeRegistroConsultaMayorNotaPorCursoARegistroConsultaMayorNotaPorCursoEntity(RegistroConsultaMayorNotaPorCurso registroConsultaMayorNotaPorCurso){
        RegistroConsultaMayorNotaPorCursoEntity registroConsultaMayorNotaPorCursoEntity = new RegistroConsultaMayorNotaPorCursoEntity();
        registroConsultaMayorNotaPorCursoEntity.setNombreDocente(registroConsultaMayorNotaPorCurso.getNombreDocente());
        registroConsultaMayorNotaPorCursoEntity.setApellidoDocente(registroConsultaMayorNotaPorCurso.getApellidoDocente());
        registroConsultaMayorNotaPorCursoEntity.setDescripcionCurso(registroConsultaMayorNotaPorCurso.getDescripcionCurso());
        registroConsultaMayorNotaPorCursoEntity.setNombreEstudiante(registroConsultaMayorNotaPorCurso.getNombreEstudiante());
        registroConsultaMayorNotaPorCursoEntity.setApellidoEstudiante(registroConsultaMayorNotaPorCurso.getApellidoEstudiante());
        registroConsultaMayorNotaPorCursoEntity.setNotaEstudiante(registroConsultaMayorNotaPorCurso.getNotaEstudiante());
        return registroConsultaMayorNotaPorCursoEntity;
    }
}

