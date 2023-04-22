package com.cibertec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cibertec.model.Producto;
import com.cibertec.interfaces.ProductoInterface;

@SpringBootApplication
public class DawClase04JdbcApplicationList {

	public static void main(String[] args) {
		//SpringApplication.run(DawClase04JdbcApplication.class, args);
		ApplicationContext app = new ClassPathXmlApplicationContext("file:src/main/resources/app-context.xml");
		ProductoInterface dao = app.getBean(ProductoInterface.class);
		
		System.out.println(dao.listado());
	}

}
