package com.universityscreaning.RowMappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.universityscreaning.DaoImpl.UserDaoImpl;
import com.universityscreaning.model.Review;

public class ReviewRowMapper implements RowMapper<Review> {

	
	@Override
	public Review mapRow(ResultSet res, int arg1) throws SQLException {
	
		
		Review review=new Review(res.getInt(1),res.getInt(2),res.getInt(3),res.getString(4),res.getInt(5));
		return review;
	}

}
