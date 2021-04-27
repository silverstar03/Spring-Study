package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.LoginDTO;

//DAO: 실제 디비에 접속ㅎㅐ서 건들이는

@Component
public class LoginDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private mapperClass mapper;
	//추가
	public void insert_data(LoginDTO dto) {
		String sql = "insert into login values(?, ?)";
		jdbcTemplate.update(sql, dto.getUserid(), dto.getUserpass());
	}
	
	//수정 id가 kim인 애의 비밀번호를 2222로 변경
	public void update_data(LoginDTO dto) {
		String sql = "update login set userpass=? where userid=?";
		jdbcTemplate.update(sql, dto.getUserpass(), dto.getUserid());
	}
	
	public void delete_data(LoginDTO dto) {
		String sql = "delete from login where userid=?";
		jdbcTemplate.update(sql, dto.getUserid());
	}
	
	public List<LoginDTO> select_data(){
		String sql = "select * from login";
		List<LoginDTO> list = jdbcTemplate.query(sql, mapper);
		return list;
	}
}
