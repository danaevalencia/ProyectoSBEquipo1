package org.lhdmi.ecommerce.misb;

import org.lhdmi.ecommerce.misb.config.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MisbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MisbApplication.class, args);
	}//main
	
	@Bean
	public FilterRegistrationBean<JwtFilter> jwtFilter(){
		FilterRegistrationBean<JwtFilter> registrationBean = 
							new FilterRegistrationBean<>();
		registrationBean.setFilter(new JwtFilter());
		//a donde vas a filtrar
		registrationBean.addUrlPatterns("/api/autoras/*");
		registrationBean.addUrlPatterns("/api/galeria/*");
		registrationBean.addUrlPatterns("/api/secciones/*");
		registrationBean.addUrlPatterns("/api/usuarios/*");
		registrationBean.addUrlPatterns("/api/ventas/*");
		return registrationBean;
	}//jwtFilter
	
}//classMisbApplication
