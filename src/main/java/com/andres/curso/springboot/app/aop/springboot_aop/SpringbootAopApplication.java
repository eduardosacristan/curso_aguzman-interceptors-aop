package com.andres.curso.springboot.app.aop.springboot_aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;

//@EnableAspectJAutoProxy esta anotación no es necesaria en esta versión de Springboot
@SpringBootApplication
public class SpringbootAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAopApplication.class, args);
	}

}
