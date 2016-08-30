package com.ifnoelse.struts2.bbs.action;

import java.util.List;

import com.ifnoelse.struts2.bbs.biz.CategoryBiz;
import com.ifnoelse.struts2.bbs.entity.Category;
import com.opensymphony.xwork2.ActionSupport;

public class CategoryAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CategoryBiz categoryBiz = new CategoryBiz();
	private List<Category> categorys;
	private Category category;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Category> getCategorys() {
		return categorys;
	}

	public void setCategorys(List<Category> categorys) {
		this.categorys = categorys;
	}

	public String list() {
		categorys = categoryBiz.getAllCategory();
		return SUCCESS;
	}
	
	public String add() {
		categoryBiz.AddCategory(category);
		return SUCCESS;
	}
	
	public String delete() {
		categoryBiz.DeleteCategory(id);
		return SUCCESS;
	}
	
	public String update() {
		categoryBiz.UpdateCategory(category);
		return SUCCESS;
	}
	
	public String updateInput() {
		category = categoryBiz.GetCategory(id);
		return INPUT;
	}
	
}
