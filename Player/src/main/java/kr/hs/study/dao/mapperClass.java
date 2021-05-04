package kr.hs.study.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.PlayerDTO;

@Component
public class mapperClass implements RowMapper<PlayerDTO> {
	
	public PlayerDTO mapRow(ResultSet rs, int rowNum) throws SQLException{
		PlayerDTO bean = new PlayerDTO();
		bean.setNum(rs.getInt("num"));
		bean.setName(rs.getString("name"));
		bean.setPosition(rs.getString("position"));
		bean.setHeight(rs.getInt("height"));
		bean.setWeight(rs.getInt("weight"));
		bean.setFoot(rs.getString("foot"));
		
		return bean;
	}

}
