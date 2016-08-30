package com.ifnoelse.spring.jdbc.dao.mysql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

import com.ifnoelse.spring.jdbc.idao.IUserDAO;
import com.ifnoelse.spring.jdbc.model.User;

@Component
public class UserDAOMySQL implements IUserDAO {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
		return namedParameterJdbcTemplate;
	}

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	@Override
	public void add(User user) {
		String insertSql = "insert into user(username, password) values (:username, :password)";
//		Map<String, Object> param = new HashMap<String, Object>();
//		param.put("username", user.getUsername());
//		param.put("password", user.getPassword());
//		namedParameterJdbcTemplate.update(insertSql, param);
		
		SqlParameterSource sqlParameterSource = new BeanPropertySqlParameterSource(user);
		namedParameterJdbcTemplate.update(insertSql, sqlParameterSource);
	}

	@Override
	public void update(User user) {
		String updateSql = "update user set username=:username, password=:password where id=:id";
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("username", user.getUsername());
		param.put("password", user.getPassword());
		param.put("id", user.getId());
		namedParameterJdbcTemplate.update(updateSql, param);
	}
	
	@Override
	public List<String> queryAllUsername() {
		String querySql = "select username from user";
		Map<String, Object> param = new HashMap<String, Object>();
		List<String> usernames = namedParameterJdbcTemplate.queryForList(querySql, param, String.class);
		return usernames;
	}
	
	@Override
	public String queryUsernameById(int id) {
		String sql = "select username from user where id=:id";
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("id", id);
		String username = namedParameterJdbcTemplate.queryForObject(sql, param, String.class);
		return username;
	}
	
	@Override
	public List<User> queryUsersByIds(List<Integer> ids) {
		String sql = "select * from user where id in (:ids)";
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("ids", ids);
		List<User> users = new ArrayList<User>();
		namedParameterJdbcTemplate.query(sql, param,
				new RowCallbackHandler() {
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				users.add(user);
			}
		});
		return users;
	}
	
	@Override
	public Integer queryTotalCount() {
		String sql = "select count(*) from user";
		Map<String, Object> param = new HashMap<String, Object>();
		return namedParameterJdbcTemplate.queryForObject(sql, param, Integer.class);
	}

	@Override
	public User query(String username) {
		String querySql = "select * from user where username=:username";
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("username", username);
		List<Map<String, Object>> users = namedParameterJdbcTemplate.queryForList(querySql, param);
		if (users.isEmpty()) {
			return null;
		}
		else {
			Map<String, Object> row = users.get(0);
			User user = new User();
			user.setId(Integer.parseInt(row.get("id").toString()));
			user.setUsername(row.get("username").toString());
			user.setPassword(row.get("password").toString());
			return user;
		}
		
	}
	
}
