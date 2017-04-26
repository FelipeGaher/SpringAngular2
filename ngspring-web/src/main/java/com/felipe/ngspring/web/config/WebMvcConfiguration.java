package com.felipe.ngspring.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.util.UrlPathHelper;

/**
 * @author fmontiel
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.felipe.ngspring.web.controller" })
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

   @Bean
   public InternalResourceViewResolver resolver() {
      InternalResourceViewResolver resolver = new InternalResourceViewResolver();
      resolver.setViewClass(JstlView.class);
      resolver.setPrefix("/WEB-INF/");
      resolver.setSuffix(".jsp");
      return resolver;
   }

   @Override
   public void configurePathMatch(PathMatchConfigurer configurer) {
      UrlPathHelper pathHelper = new UrlPathHelper();
      //Enable matrix variable
      pathHelper.setRemoveSemicolonContent(false);
      configurer.setUrlPathHelper(pathHelper);
   }

}
