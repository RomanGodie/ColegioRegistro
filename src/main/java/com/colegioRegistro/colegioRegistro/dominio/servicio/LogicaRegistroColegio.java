package com.colegioRegistro.colegioRegistro.dominio.servicio;

import com.colegioRegistro.colegioRegistro.dominio.dto.RespuestaEstudianteMayorNotaPeriodoDto;
import com.colegioRegistro.colegioRegistro.dominio.dto.RespuestaEstudiantesMayorNotaPorCursoDto;
import com.colegioRegistro.colegioRegistro.dominio.modelo.RegistroConsultaMayorNotaPorCurso;
import com.colegioRegistro.colegioRegistro.dominio.modelo.RegistroConsultaMayorNotaPorPeriodo;
import com.colegioRegistro.colegioRegistro.dominio.puerto.PuertoRegistroColegio;

public class LogicaRegistroColegio {
    private PuertoRegistroColegio puertoRegistroColegio;

    public LogicaRegistroColegio(PuertoRegistroColegio puertoRegistroColegio) {
        this.puertoRegistroColegio = puertoRegistroColegio;
    }

    public RespuestaEstudiantesMayorNotaPorCursoDto[] logicaDeNegocioConsultaRegistroDeEstudiantesMayorNota3(){
        RespuestaEstudiantesMayorNotaPorCursoDto[] respuestaEstudiantesMayorNotaPorCursoDtos =
                new RespuestaEstudiantesMayorNotaPorCursoDto[puertoRegistroColegio.readTodosLosRegistrosMayorNotaPorCurso().size()];
        RegistroConsultaMayorNotaPorCurso registroConsultaMayorNotaPorCurso;
        for(int i = 0; i < puertoRegistroColegio.readTodosLosRegistrosMayorNotaPorCurso().size(); i++){
            registroConsultaMayorNotaPorCurso = puertoRegistroColegio.readTodosLosRegistrosMayorNotaPorCurso().get(i);
            respuestaEstudiantesMayorNotaPorCursoDtos[i] = new RespuestaEstudiantesMayorNotaPorCursoDto(registroConsultaMayorNotaPorCurso.getNombreDocente(),
                    registroConsultaMayorNotaPorCurso.getApellidoDocente(),
                    registroConsultaMayorNotaPorCurso.getDescripcionCurso(),
                    registroConsultaMayorNotaPorCurso.getNombreEstudiante(),
                    registroConsultaMayorNotaPorCurso.getApellidoEstudiante(),
                    registroConsultaMayorNotaPorCurso.getNotaEstudiante());
        }
        return respuestaEstudiantesMayorNotaPorCursoDtos;
    }

    public RespuestaEstudianteMayorNotaPeriodoDto[] logicaDeNegocioConsultaRegistroDeEstudiantesMayorNotaPeriodo(){
        RespuestaEstudianteMayorNotaPeriodoDto[] respuestaEstudianteMayorNotaPeriodoDtos =
                new RespuestaEstudianteMayorNotaPeriodoDto[puertoRegistroColegio.readTodosLosRegistrosMayorNotaPorPeriodo().size()];
        RegistroConsultaMayorNotaPorPeriodo registroConsultaMayorNotaPorPeriodo;
        for(int i = 0; i < puertoRegistroColegio.readTodosLosRegistrosMayorNotaPorCurso().size(); i++){
            registroConsultaMayorNotaPorPeriodo = puertoRegistroColegio.readTodosLosRegistrosMayorNotaPorPeriodo().get(i);
            respuestaEstudianteMayorNotaPeriodoDtos[i] = new RespuestaEstudianteMayorNotaPeriodoDto(registroConsultaMayorNotaPorPeriodo.getNombreDocente(),
                    registroConsultaMayorNotaPorPeriodo.getApellidoDocente(),
                    registroConsultaMayorNotaPorPeriodo.getDescripcionCurso(),
                    registroConsultaMayorNotaPorPeriodo.getNombreEstudiante(),
                    registroConsultaMayorNotaPorPeriodo.getApellidoEstudiante(),
                    registroConsultaMayorNotaPorPeriodo.getNotaEstudiante());
        }
        return respuestaEstudianteMayorNotaPeriodoDtos;
    }

    public RespuestaEstudianteMayorNotaPeriodoDto logicaDeNegocioConsultaRegistroDeEstudianteMayorNotaPeriodo(){
        RespuestaEstudianteMayorNotaPeriodoDto respuestaEstudianteMayorNotaPeriodoDto;
        respuestaEstudianteMayorNotaPeriodoDto =new RespuestaEstudianteMayorNotaPeriodoDto(puertoRegistroColegio.
                readUnSoloRegistroConsultaMayorNotaPorPeriodoDirecto().getNombreDocente(),
                puertoRegistroColegio.readUnSoloRegistroConsultaMayorNotaPorPeriodoDirecto().getApellidoDocente(),
                puertoRegistroColegio.readUnSoloRegistroConsultaMayorNotaPorPeriodoDirecto().getDescripcionCurso(),
                puertoRegistroColegio.readUnSoloRegistroConsultaMayorNotaPorPeriodoDirecto().getNombreEstudiante(),
                puertoRegistroColegio.readUnSoloRegistroConsultaMayorNotaPorPeriodoDirecto().getApellidoEstudiante(),
                puertoRegistroColegio.readUnSoloRegistroConsultaMayorNotaPorPeriodoDirecto().getNotaEstudiante());
        return respuestaEstudianteMayorNotaPeriodoDto;
    }
}
