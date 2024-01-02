package com.rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean					//It is used to represent this class as a spring bean
	public Docket customerApi() {	//Docket it has used for which class it has used
		return new Docket(DocumentationType.SWAGGER_2)
				//.groupName("Public-API")
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.rest.controller"))
				.paths(PathSelectors.any())
				.build();
			}
}
