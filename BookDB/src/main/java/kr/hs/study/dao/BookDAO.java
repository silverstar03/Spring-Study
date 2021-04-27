package kr.hs.study.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.BookDTO;

@Component
public class BookDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private mapperClass mapper;
	
	public void insert_data(BookDTO dto) {
		String sql = "insert into book2 values(?, ?, ?, ?)";
		jdbcTemplate.update(sql, dto.getTitle(), dto.getAuthor(), dto.getPrice(), dto.getEmail());
	}
	
	public void update_data(BookDTO dto) {
		String sql = "update book2 set price=? where title=?";
		jdbcTemplate.update(sql, dto.getPrice(), dto.getTitle());
	}
	
	public void delete_data(BookDTO dto) {
		String sql = "delete from book2 where title=?";
		jdbcTemplate.update(sql, dto.getTitle());
	}
	
	public List<BookDTO> select_data(){
		String sql = "select * from book2";
		List<BookDTO> list = jdbcTemplate.query(sql, mapper);
		return list;
	}
	
	
	
}
