package com.colegioRegistro.colegioRegistro.dominio.puerto;

import com.colegioRegistro.colegioRegistro.dominio.modelo.RegistroConsultaMayorNotaPorCurso;
import com.colegioRegistro.colegioRegistro.dominio.modelo.RegistroConsultaMayorNotaPorPeriodo;

import java.util.List;

public interface PuertoRegistroColegio {
    List<RegistroConsultaMayorNotaPorCurso> readTodosLosRegistrosMayorNotaPorCurso();
    List<RegistroConsultaMayorNotaPorPeriodo> readTodosLosRegistrosMayorNotaPorPeriodo();
    RegistroConsultaMayorNotaPorPeriodo readUnSoloRegistroConsultaMayorNotaPorPeriodoDirecto();
}
