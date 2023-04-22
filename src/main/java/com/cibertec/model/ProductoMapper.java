package com.cibertec.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductoMapper implements RowMapper<Producto> {

	@Override
	public Producto mapRow(ResultSet rs, int rowNum) throws SQLException {
		Producto p = new Producto();
		p.setIdprod(rs.getString("id_prod"));
		p.setDescripcion(rs.getString("des_prod"));
		p.setStock(rs.getInt("stk_prod"));
		p.setPrecio(rs.getDouble("pre_prod"));
		p.setIdtipo(rs.getInt("idcategoria"));
		p.setEstado(rs.getInt("est_prod"));
		return p;
	}

}