package com.colegioRegistro.colegioRegistro.aplicacion.servicio;

import com.colegioRegistro.colegioRegistro.aplicacion.mapper.MapperRegistro;
import com.colegioRegistro.colegioRegistro.dominio.dto.RespuestaEstudianteMayorNotaPeriodoDto;
import com.colegioRegistro.colegioRegistro.dominio.dto.RespuestaEstudiantesMayorNotaPorCursoDto;
import com.colegioRegistro.colegioRegistro.dominio.servicio.LogicaRegistroColegio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class IntermediarioServicioRegistro {
    MapperRegistro mapperRegistro;
    LogicaRegistroColegio logicaRegistroColegio;

    public String convertirDeInfraestructuraADominio(){
        return mapperRegistro.conversorDeInfraestructuraADominio();
    }

    public RespuestaEstudiantesMayorNotaPorCursoDto[] transaccionRespuestaConsultaRegistroDeEstudiantesMayorNotaCurso(){
        return logicaRegistroColegio.logicaDeNegocioConsultaRegistroDeEstudiantesMayorNota3();
    }

    public RespuestaEstudianteMayorNotaPeriodoDto[] transaccionRespuestaConsultaRegistroDeEstudiantesMayorNotaPeriodo(){
        return logicaRegistroColegio.logicaDeNegocioConsultaRegistroDeEstudiantesMayorNotaPeriodo();
    }

    public RespuestaEstudianteMayorNotaPeriodoDto transaccionRespuestaConsultaRegistroDeEstudianteMayorNotaPeriodo(){
        return logicaRegistroColegio.logicaDeNegocioConsultaRegistroDeEstudianteMayorNotaPeriodo();
    }
}