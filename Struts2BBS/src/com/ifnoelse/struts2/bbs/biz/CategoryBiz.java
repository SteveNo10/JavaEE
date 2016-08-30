package com.ifnoelse.struts2.bbs.biz;

import java.util.List;

import com.ifnoelse.struts2.bbs.dao.CategoryDAO;
import com.ifnoelse.struts2.bbs.entity.Category;

public class CategoryBiz {
	private CategoryDAO categoryDAO = new CategoryDAO();
	
	public List<Category> getAllCategory() {
		return categoryDAO.getAllCategory();
	}
	
	public int AddCategory(Category category) {
		return categoryDAO.AddCategory(category);
	}
	
	public int DeleteCategory(int id) {
		return categoryDAO.DeleteCategory(id);
	}
	
	public int UpdateCategory(Category category) {
		return categoryDAO.UpdateCategory(category);
	}
	
	public Category GetCategory(int id) {
		return categoryDAO.getCategory(id);
	}
}
