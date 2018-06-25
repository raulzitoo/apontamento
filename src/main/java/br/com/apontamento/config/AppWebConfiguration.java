package br.com.apontamento.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.apontamento.controllers.ApontamentoController;

@EnableWebMvc
@ComponentScan(basePackageClasses= {ApontamentoController.class})
public class AppWebConfiguration {

	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
		
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/"); //Prefix é o local onde estão minhas Views.
		resolver.setSuffix(".jsp"); // Suffix é a extenção dos meus arquivos de front end.
		
		return resolver;
	}
	
}
