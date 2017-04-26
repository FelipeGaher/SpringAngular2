package com.felipe.ngspring.persistence.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Clase con la configuración para la persistencia de las distintas base de
 * datos
 * 
 * @author FelipeGaher
 *
 */
@Configuration
@EnableJpaRepositories({ "com.felipe.ngspring.persistence" })
public class PersistenceConfig {

}
