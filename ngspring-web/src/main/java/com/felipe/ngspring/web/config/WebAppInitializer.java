package com.felipe.ngspring.web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.felipe.ngspring.persistence.config.PersistenceConfig;
import com.felipe.ngspring.service.config.ServiceConfig;

/**
 * @author fmontiel
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

   @Override
   protected Class<?>[] getRootConfigClasses() {
      return new Class[] {};
   }

   @Override
   protected Class<?>[] getServletConfigClasses() {
      return new Class[] { WebMvcConfiguration.class, ServiceConfig.class, PersistenceConfig.class };
   }

   @Override
   protected String[] getServletMappings() {
      return new String[] { "/" };
   }
}
