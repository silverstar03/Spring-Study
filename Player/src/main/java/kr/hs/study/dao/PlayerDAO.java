package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.PlayerDTO;

@Component
public class PlayerDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private mapperClass mapper;
	
	public void insert_player(PlayerDTO dto) {
		String sql = "insert into player values(?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, dto.getNum(), dto.getName(), dto.getPosition(), dto.getHeight(), dto.getWeight(), dto.getFoot());
	}
	
	public void update_data(PlayerDTO dto) {
		String sql = "update player set position=? where num=?";
		jdbcTemplate.update(sql, dto.getPosition(), dto.getNum());
	}
	
	public void delete_data(PlayerDTO dto) {
		String sql = "delete from player where name=?";
		jdbcTemplate.update(sql, dto.getName());
	}
	
	public List<PlayerDTO> select_data(){
		String sql = "select * from player";
		List<PlayerDTO> list = jdbcTemplate.query(sql, mapper);
		return list;
	}
}
