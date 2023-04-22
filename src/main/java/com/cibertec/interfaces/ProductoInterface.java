package com.cibertec.interfaces;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cibertec.model.Producto;

public interface ProductoInterface {
	public int registrar(Producto p);

	public int borrar(Producto p);

	public List<Producto> listado();
}
