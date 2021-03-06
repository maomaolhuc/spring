package com.tz.spring.jdbctemplate.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.tz.spring.jdbctemplate.dao.UserDao;
import com.tz.spring.jdbctemplate.entity.User;

public class UserDaoImpl implements UserDao{
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String addsql = "insert into user(name, account) values(?, ?)";
		int rows = this.jdbcTemplate.update(addsql, user.getName(), user.getAccount());
		if(rows > 0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean deleteUser(Integer id) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String delsql = "delete from user where id = ?";
		int rows = this.jdbcTemplate.update(delsql, id);
		if(rows > 0){
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String uptsql = "update user set name=?,account=? where id=?";
		int rows = this.jdbcTemplate.update(uptsql, user.getName(), user.getAccount(), user.getId());
		if(rows > 0){
			flag = true;
		}
		return flag;
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		String querysql = "select id,name,account from user";
		return this.jdbcTemplate.query(querysql, new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setAccount(rs.getBigDecimal("account"));
				return user;
			}
			
		});
	}

}
