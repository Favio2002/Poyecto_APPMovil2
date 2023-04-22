package com.cibertec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cibertec.model.Producto;
import com.cibertec.interfaces.ProductoInterface;

@SpringBootApplication
public class DawClase04JdbcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DawClase04JdbcApplication.class, args);
		ApplicationContext app = new ClassPathXmlApplicationContext("file:src/main/resources/app-context.xml");
		ProductoInterface dao = app.getBean(ProductoInterface.class);
		
		Producto p = new Producto();
		p.setIdprod("P0022");
		p.setDescripcion("NUEVO PRODUCTO");
		p.setStock(100);
		p.setPrecio(0.99);
		p.setIdtipo(5);
		p.setEstado(1);
		
		dao.registrar(p);
		
		System.out.println(dao.listado());
	}

}
