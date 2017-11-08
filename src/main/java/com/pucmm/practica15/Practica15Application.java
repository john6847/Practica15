package com.pucmm.practica15;

import com.pucmm.practica15.Entidades.Customer;
import com.pucmm.practica15.Servicios.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Practica15Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(Practica15Application.class, args);

		CustomerService customerService= (CustomerService) applicationContext.getBean("customerService");

		customerService.guardar(new Customer("John","Bien","Birthday","JohnBien@.com"));
	}
}
