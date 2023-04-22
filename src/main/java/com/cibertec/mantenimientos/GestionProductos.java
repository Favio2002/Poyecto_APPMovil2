package com.cibertec.mantenimientos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cibertec.interfaces.ProductoInterface;
import com.cibertec.model.*;
@Repository
public class GestionProductos implements ProductoInterface{
	@Autowired
	private JdbcTemplate jdbcTemp;
	
	@Override
	public int registrar(Producto p) {
		return jdbcTemp.update("INSERT INTO tb_productos values (?, ?, ?, ?, ?, ?, 1)",
				p.getIdprod(), p.getDescripcion(), p.getStock(), p.getPrecio(), p.getIdtipo(),
				p.getEstado());
	}

	@Override
	public int borrar(Producto p) {
		// TODO Auto-generated method stub
		return jdbcTemp.update("DELETE FROM tb_productos WHERE id_prod=?", p.getIdprod());
	}

	@Override
	public List<Producto> listado() {
		return jdbcTemp.query("SELECT * FROM tb_productos", new ProductoMapper());
	}

}
