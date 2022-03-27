package com.colegioRegistro.colegioRegistro.infraestructura.controlador;


import com.colegioRegistro.colegioRegistro.aplicacion.servicio.IntermediarioServicioRegistro;
import com.colegioRegistro.colegioRegistro.dominio.dto.RespuestaEstudianteMayorNotaPeriodoDto;
import com.colegioRegistro.colegioRegistro.dominio.dto.RespuestaEstudiantesMayorNotaPorCursoDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registro")
@AllArgsConstructor
public class ControladorRegistro {
    private IntermediarioServicioRegistro intermediarioServicioRegistro;

    @PostMapping()
    public String registroPersona(){
        return intermediarioServicioRegistro.convertirDeInfraestructuraADominio();
    }

    @GetMapping("/estudiantesCurso")
    public RespuestaEstudiantesMayorNotaPorCursoDto[] leerTodosLosRegistrosDeEstudiantesConMayorNotaCurso(){
        return intermediarioServicioRegistro.transaccionRespuestaConsultaRegistroDeEstudiantesMayorNotaCurso();
    }

    @GetMapping("/estudiantesPeriodo")
    public RespuestaEstudianteMayorNotaPeriodoDto[] leerTodosLosRegistrosDeEstudiantesConMayorNotaPeriodo(){
        return intermediarioServicioRegistro.transaccionRespuestaConsultaRegistroDeEstudiantesMayorNotaPeriodo();
    }

    @GetMapping("/estudiantePeriodoMayor")
    public RespuestaEstudianteMayorNotaPeriodoDto leerEstudianteConMayorNotaPeriodo(){
        return intermediarioServicioRegistro.transaccionRespuestaConsultaRegistroDeEstudianteMayorNotaPeriodo();
    }
}