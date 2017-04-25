package com.felipe.ngspring.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Clase de configuración del contexto de servicios
 * 
 * @author FelipeGaher
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.felipe.ngspring.service" })
public class ServiceConfig {

}
