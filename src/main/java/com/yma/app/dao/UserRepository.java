package com.yma.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yma.app.bean.User;

@Repository
public class UserRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void addUser(User user) {
		String sql = "INSERT INTO users(name,email) VALUES(?,?)";
		jdbcTemplate.update(sql, user.getName(), user.getEmail());
	}

	public List<User> findAll(){
		String sql = "SELECT id,name,email FROM users";
		List<User> userList = jdbcTemplate.query(
								sql,
								(rs, rowNo) -> new User(
										rs.getInt("id"), 
										rs.getString("name"), 
										rs.getString("email")
										)
							);
		return userList;		
	}
}
