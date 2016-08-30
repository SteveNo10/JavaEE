package com.ifnoelse.struts2.bbs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ifnoelse.struts2.bbs.dao.util.SqlHelper;
import com.ifnoelse.struts2.bbs.entity.Category;

public class CategoryDAO {
	private Connection conn;
	public CategoryDAO() {
		conn = SqlHelper.Connect();
	}
	
	public List<Category> getAllCategory() {
		List<Category> list = new ArrayList<Category>();
		try {
			PreparedStatement preparedStatement = conn.prepareStatement("select * from Category");
			ResultSet rs = SqlHelper.query(preparedStatement);
			while (rs.next()) {
				Category category = new Category();
				category.setId(rs.getInt("id"));
				category.setSubject(rs.getString("subject"));
				category.setContent(rs.getString("content"));
				list.add(category);
			}
			rs.close();
			preparedStatement.close();
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			return list;
		}
	}
	
	public Category getCategory(int id) {
		Category category = null;
		try {
			PreparedStatement preparedStatement = conn.prepareStatement("select * from Category where id=?");
			preparedStatement.setInt(1, id);
			ResultSet rs = SqlHelper.query(preparedStatement);
			while (rs.next()) {
				category = new Category();
				category.setId(rs.getInt("id"));
				category.setSubject(rs.getString("subject"));
				category.setContent(rs.getString("content"));
			}
			rs.close();
			preparedStatement.close();
			return category;
		} catch (SQLException e) {
			e.printStackTrace();
			return category;
		}
	}
	
	public int AddCategory(Category category) {
		int result = 0;
		try {
			PreparedStatement preparedStatement = conn.prepareStatement("insert into Category(subject,content) values(?,?)");
			preparedStatement.setString(1, category.getSubject());
			preparedStatement.setString(2, category.getContent());
			result = SqlHelper.executeUpdate(preparedStatement);
			preparedStatement.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return result;
		}
	}
	
	public int UpdateCategory(Category category) {
		int result = 0;
		try {
			PreparedStatement preparedStatement = conn.prepareStatement("update Category set subject=?, content=? where id=?");
			preparedStatement.setString(1, category.getSubject());
			preparedStatement.setString(2, category.getContent());
			preparedStatement.setInt(3, category.getId());
			result = SqlHelper.executeUpdate(preparedStatement);
			preparedStatement.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return result;
		}
	}
	
	public int DeleteCategory(int id) {
		int result = 0;
		try {
			PreparedStatement preparedStatement = conn.prepareStatement("delete from Category where id=?");
			preparedStatement.setInt(1, id);
			result = SqlHelper.executeUpdate(preparedStatement);
			preparedStatement.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return result;
		}
	}
	
	public int DeleteCategory(Category category) {
		return DeleteCategory(category.getId());
	}
}
