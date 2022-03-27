package com.colegioRegistro.colegioRegistro.infraestructura.configuracion;


import com.colegioRegistro.colegioRegistro.dominio.puerto.PuertoRegistroColegio;
import com.colegioRegistro.colegioRegistro.dominio.servicio.LogicaRegistroColegio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguracion {
    @Bean
    public LogicaRegistroColegio inyeccionLogicaRegistroColegio(PuertoRegistroColegio puertoRegistroColegio){
        return new LogicaRegistroColegio(puertoRegistroColegio);
    }
}
